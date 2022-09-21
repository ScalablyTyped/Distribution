package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaskFilterFactory extends StObject {
  
  /**
    * Create a blur maskfilter
    * @param style
    * @param sigma - Standard deviation of the Gaussian blur to apply. Must be > 0.
    * @param respectCTM - if true the blur's sigma is modified by the CTM.
    */
  def MakeBlur(style: BlurStyle, sigma: Double, respectCTM: Boolean): MaskFilter
}
object MaskFilterFactory {
  
  inline def apply(MakeBlur: (BlurStyle, Double, Boolean) => MaskFilter): MaskFilterFactory = {
    val __obj = js.Dynamic.literal(MakeBlur = js.Any.fromFunction3(MakeBlur))
    __obj.asInstanceOf[MaskFilterFactory]
  }
  
  extension [Self <: MaskFilterFactory](x: Self) {
    
    inline def setMakeBlur(value: (BlurStyle, Double, Boolean) => MaskFilter): Self = StObject.set(x, "MakeBlur", js.Any.fromFunction3(value))
  }
}
