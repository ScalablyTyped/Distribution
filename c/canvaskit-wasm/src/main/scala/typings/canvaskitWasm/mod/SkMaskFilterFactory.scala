package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkMaskFilterFactory extends StObject {
  
  /**
    * Create a blur maskfilter
    * @param style
    * @param sigma - Standard deviation of the Gaussian blur to apply. Must be > 0.
    * @param respectCTM - if true the blur's sigma is modified by the CTM.
    */
  def MakeBlur(style: BlurStyle, sigma: Double, respectCTM: Boolean): SkMaskFilter
}
object SkMaskFilterFactory {
  
  @scala.inline
  def apply(MakeBlur: (BlurStyle, Double, Boolean) => SkMaskFilter): SkMaskFilterFactory = {
    val __obj = js.Dynamic.literal(MakeBlur = js.Any.fromFunction3(MakeBlur))
    __obj.asInstanceOf[SkMaskFilterFactory]
  }
  
  @scala.inline
  implicit class SkMaskFilterFactoryMutableBuilder[Self <: SkMaskFilterFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMakeBlur(value: (BlurStyle, Double, Boolean) => SkMaskFilter): Self = StObject.set(x, "MakeBlur", js.Any.fromFunction3(value))
  }
}
