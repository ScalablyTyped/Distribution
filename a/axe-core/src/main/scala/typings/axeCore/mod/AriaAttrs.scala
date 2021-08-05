package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaAttrs extends StObject {
  
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  
  var global: js.UndefOr[Boolean] = js.undefined
  
  var `type`: AriaAttrsType
  
  var unsupported: js.UndefOr[Boolean] = js.undefined
  
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object AriaAttrs {
  
  inline def apply(`type`: AriaAttrsType): AriaAttrs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaAttrs]
  }
  
  extension [Self <: AriaAttrs](x: Self) {
    
    inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
    
    inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
    
    inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def setType(value: AriaAttrsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnsupported(value: Boolean): Self = StObject.set(x, "unsupported", value.asInstanceOf[js.Any])
    
    inline def setUnsupportedUndefined: Self = StObject.set(x, "unsupported", js.undefined)
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
