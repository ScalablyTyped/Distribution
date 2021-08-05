package typings.baseui.inputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaskedInputProps
  extends StObject
     with InputProps {
  
  var mask: js.UndefOr[String] = js.undefined
  
  var maskChar: js.UndefOr[String] = js.undefined
}
object MaskedInputProps {
  
  inline def apply(): MaskedInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskedInputProps]
  }
  
  extension [Self <: MaskedInputProps](x: Self) {
    
    inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskChar(value: String): Self = StObject.set(x, "maskChar", value.asInstanceOf[js.Any])
    
    inline def setMaskCharUndefined: Self = StObject.set(x, "maskChar", js.undefined)
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
  }
}
