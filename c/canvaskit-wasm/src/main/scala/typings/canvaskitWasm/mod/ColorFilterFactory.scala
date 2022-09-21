package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorFilterFactory extends StObject {
  
  /**
    * Makes a color filter with the given color, blend mode, and colorSpace.
    * @param color
    * @param mode
    * @param colorSpace - If omitted, will use SRGB
    */
  def MakeBlend(color: InputColor, mode: BlendMode): ColorFilter = js.native
  def MakeBlend(color: InputColor, mode: BlendMode, colorSpace: ColorSpace): ColorFilter = js.native
  
  /**
    * Makes a color filter composing two color filters.
    * @param outer
    * @param inner
    */
  def MakeCompose(outer: ColorFilter, inner: ColorFilter): ColorFilter = js.native
  
  /**
    * Makes a color filter that is linearly interpolated between two other color filters.
    * @param t - a float in the range of 0.0 to 1.0.
    * @param dst
    * @param src
    */
  def MakeLerp(t: Double, dst: ColorFilter, src: ColorFilter): ColorFilter = js.native
  
  /**
    * Makes a color filter that converts between linear colors and sRGB colors.
    */
  def MakeLinearToSRGBGamma(): ColorFilter = js.native
  
  /**
    * Makes a color filter that multiplies the luma of its input into the alpha channel,
    * and sets the red, green, and blue channels to zero.
    */
  def MakeLuma(): ColorFilter = js.native
  
  /**
    * Creates a color filter using the provided color matrix.
    * @param cMatrix
    */
  def MakeMatrix(cMatrix: InputColorMatrix): ColorFilter = js.native
  
  /**
    * Makes a color filter that converts between sRGB colors and linear colors.
    */
  def MakeSRGBToLinearGamma(): ColorFilter = js.native
}
