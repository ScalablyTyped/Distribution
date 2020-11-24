package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationOptionsConfiguration extends js.Object {
  
  var validateOnAttach: js.UndefOr[Boolean] = js.native
  
  var validateOnPropertyChange: js.UndefOr[Boolean] = js.native
  
  var validateOnQuery: js.UndefOr[Boolean] = js.native
  
  var validateOnSave: js.UndefOr[Boolean] = js.native
}
object ValidationOptionsConfiguration {
  
  @scala.inline
  def apply(): ValidationOptionsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationOptionsConfiguration]
  }
  
  @scala.inline
  implicit class ValidationOptionsConfigurationOps[Self <: ValidationOptionsConfiguration] (val x: Self) extends AnyVal {
    
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
    def setValidateOnAttach(value: Boolean): Self = this.set("validateOnAttach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateOnAttach: Self = this.set("validateOnAttach", js.undefined)
    
    @scala.inline
    def setValidateOnPropertyChange(value: Boolean): Self = this.set("validateOnPropertyChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateOnPropertyChange: Self = this.set("validateOnPropertyChange", js.undefined)
    
    @scala.inline
    def setValidateOnQuery(value: Boolean): Self = this.set("validateOnQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateOnQuery: Self = this.set("validateOnQuery", js.undefined)
    
    @scala.inline
    def setValidateOnSave(value: Boolean): Self = this.set("validateOnSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateOnSave: Self = this.set("validateOnSave", js.undefined)
  }
}
