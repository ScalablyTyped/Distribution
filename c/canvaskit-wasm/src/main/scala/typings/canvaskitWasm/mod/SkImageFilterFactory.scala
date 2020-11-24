package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkImageFilterFactory extends js.Object {
  
  /**
    * Create a filter that blurs its input by the separate X and Y sigmas. The provided tile mode
    * is used when the blur kernel goes outside the input image.
    *
    * @param sigmaX - The Gaussian sigma value for blurring along the X axis.
    * @param sigmaY - The Gaussian sigma value for blurring along the Y axis.
    * @param mode
    * @param input - if null, it will use the dynamic source image (e.g. a saved layer)
    */
  def MakeBlur(sigmaX: Double, sigmaY: Double, mode: TileMode): SkImageFilter = js.native
  def MakeBlur(sigmaX: Double, sigmaY: Double, mode: TileMode, input: SkImageFilter): SkImageFilter = js.native
  
  /**
    * Create a filter that applies the color filter to the input filter results.
    * @param cf
    * @param input - if null, it will use the dynamic source image (e.g. a saved layer)
    */
  def MakeColorFilter(cf: SkColorFilter): SkImageFilter = js.native
  def MakeColorFilter(cf: SkColorFilter, input: SkImageFilter): SkImageFilter = js.native
  
  /**
    * Create a filter that composes 'inner' with 'outer', such that the results of 'inner' are
    * treated as the source bitmap passed to 'outer'.
    * If either param is null, the other param will be returned.
    * @param outer
    * @param inner - if null, it will use the dynamic source image (e.g. a saved layer)
    */
  def MakeCompose(): SkImageFilter = js.native
  def MakeCompose(outer: Null, inner: SkImageFilter): SkImageFilter = js.native
  def MakeCompose(outer: SkImageFilter): SkImageFilter = js.native
  def MakeCompose(outer: SkImageFilter, inner: SkImageFilter): SkImageFilter = js.native
  
  /**
    * Create a filter that transforms the input image by 'matrix'. This matrix transforms the
    * local space, which means it effectively happens prior to any transformation coming from the
    * SkCanvas initiating the filtering.
    * @param matr
    * @param fq
    * @param input - if null, it will use the dynamic source image (e.g. a saved layer)
    */
  def MakeMatrixTransform(matr: InputMatrix, fq: FilterQuality): SkImageFilter = js.native
  def MakeMatrixTransform(matr: InputMatrix, fq: FilterQuality, input: SkImageFilter): SkImageFilter = js.native
}
