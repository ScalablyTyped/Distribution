package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkColorFilterFactory extends StObject {
  
  /**
    * Makes a color filter with the given color and blend mode.
    * @param color
    * @param mode
    */
  def MakeBlend(color: InputColor, mode: BlendMode): SkColorFilter = js.native
  
  /**
    * Makes a color filter composing two color filters.
    * @param outer
    * @param inner
    */
  def MakeCompose(outer: SkColorFilter, inner: SkColorFilter): SkColorFilter = js.native
  
  /**
    * Makes a color filter that is linearly interpolated between two other color filters.
    * @param t - a float in the range of 0.0 to 1.0.
    * @param dst
    * @param src
    */
  def MakeLerp(t: Double, dst: SkColorFilter, src: SkColorFilter): SkColorFilter = js.native
  
  /**
    * Makes a color filter that converts between linear colors and sRGB colors.
    */
  def MakeLinearToSRGBGamma(): SkColorFilter = js.native
  
  /**
    * Creates a color filter using the provided color matrix.
    * @param cMatrix
    */
  def MakeMatrix(cMatrix: InputColorMatrix): SkColorFilter = js.native
  
  /**
    * Makes a color filter that converts between sRGB colors and linear colors.
    */
  def MakeSRGBToLinearGamma(): SkColorFilter = js.native
}
object SkColorFilterFactory {
  
  @scala.inline
  def apply(
    MakeBlend: (InputColor, BlendMode) => SkColorFilter,
    MakeCompose: (SkColorFilter, SkColorFilter) => SkColorFilter,
    MakeLerp: (Double, SkColorFilter, SkColorFilter) => SkColorFilter,
    MakeLinearToSRGBGamma: () => SkColorFilter,
    MakeMatrix: InputColorMatrix => SkColorFilter,
    MakeSRGBToLinearGamma: () => SkColorFilter
  ): SkColorFilterFactory = {
    val __obj = js.Dynamic.literal(MakeBlend = js.Any.fromFunction2(MakeBlend), MakeCompose = js.Any.fromFunction2(MakeCompose), MakeLerp = js.Any.fromFunction3(MakeLerp), MakeLinearToSRGBGamma = js.Any.fromFunction0(MakeLinearToSRGBGamma), MakeMatrix = js.Any.fromFunction1(MakeMatrix), MakeSRGBToLinearGamma = js.Any.fromFunction0(MakeSRGBToLinearGamma))
    __obj.asInstanceOf[SkColorFilterFactory]
  }
  
  @scala.inline
  implicit class SkColorFilterFactoryMutableBuilder[Self <: SkColorFilterFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMakeBlend(value: (InputColor, BlendMode) => SkColorFilter): Self = StObject.set(x, "MakeBlend", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMakeCompose(value: (SkColorFilter, SkColorFilter) => SkColorFilter): Self = StObject.set(x, "MakeCompose", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMakeLerp(value: (Double, SkColorFilter, SkColorFilter) => SkColorFilter): Self = StObject.set(x, "MakeLerp", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMakeLinearToSRGBGamma(value: () => SkColorFilter): Self = StObject.set(x, "MakeLinearToSRGBGamma", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMakeMatrix(value: InputColorMatrix => SkColorFilter): Self = StObject.set(x, "MakeMatrix", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMakeSRGBToLinearGamma(value: () => SkColorFilter): Self = StObject.set(x, "MakeSRGBToLinearGamma", js.Any.fromFunction0(value))
  }
}
