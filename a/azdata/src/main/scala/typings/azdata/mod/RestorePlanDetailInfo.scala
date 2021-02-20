package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestorePlanDetailInfo extends StObject {
  
  var currentValue: js.Any = js.native
  
  var defaultValue: js.Any = js.native
  
  var isReadOnly: Boolean = js.native
  
  var isVisible: Boolean = js.native
  
  var name: String = js.native
}
object RestorePlanDetailInfo {
  
  @scala.inline
  def apply(currentValue: js.Any, defaultValue: js.Any, isReadOnly: Boolean, isVisible: Boolean, name: String): RestorePlanDetailInfo = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestorePlanDetailInfo]
  }
  
  @scala.inline
  implicit class RestorePlanDetailInfoMutableBuilder[Self <: RestorePlanDetailInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentValue(value: js.Any): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
