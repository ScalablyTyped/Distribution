package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppValidationConfiguration extends js.Object {
  
  /**
    * The validation strategy.
    */
  var appValidationStrategy: js.UndefOr[AppValidationStrategy] = js.native
  
  /**
    * The name of the configuration.
    */
  var name: js.UndefOr[NonEmptyStringWithMaxLen255] = js.native
  
  /**
    * The validation parameters.
    */
  var ssmValidationParameters: js.UndefOr[SSMValidationParameters] = js.native
  
  /**
    * The ID of the validation.
    */
  var validationId: js.UndefOr[ValidationId] = js.native
}
object AppValidationConfiguration {
  
  @scala.inline
  def apply(): AppValidationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppValidationConfiguration]
  }
  
  @scala.inline
  implicit class AppValidationConfigurationOps[Self <: AppValidationConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAppValidationStrategy(value: AppValidationStrategy): Self = this.set("appValidationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppValidationStrategy: Self = this.set("appValidationStrategy", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyStringWithMaxLen255): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSsmValidationParameters(value: SSMValidationParameters): Self = this.set("ssmValidationParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsmValidationParameters: Self = this.set("ssmValidationParameters", js.undefined)
    
    @scala.inline
    def setValidationId(value: ValidationId): Self = this.set("validationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationId: Self = this.set("validationId", js.undefined)
  }
}
