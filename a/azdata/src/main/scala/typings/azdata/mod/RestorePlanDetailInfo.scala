package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestorePlanDetailInfo extends StObject {
  
  var currentValue: js.Any
  
  var defaultValue: js.Any
  
  var isReadOnly: Boolean
  
  var isVisible: Boolean
  
  var name: String
}
object RestorePlanDetailInfo {
  
  inline def apply(currentValue: js.Any, defaultValue: js.Any, isReadOnly: Boolean, isVisible: Boolean, name: String): RestorePlanDetailInfo = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestorePlanDetailInfo]
  }
  
  extension [Self <: RestorePlanDetailInfo](x: Self) {
    
    inline def setCurrentValue(value: js.Any): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
