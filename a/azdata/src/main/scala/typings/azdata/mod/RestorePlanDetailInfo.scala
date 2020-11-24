package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestorePlanDetailInfo extends js.Object {
  
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
  implicit class RestorePlanDetailInfoOps[Self <: RestorePlanDetailInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurrentValue(value: js.Any): Self = this.set("currentValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = this.set("isReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
