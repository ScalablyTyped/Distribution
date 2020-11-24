package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerValidationConfiguration extends js.Object {
  
  /**
    * The name of the configuration.
    */
  var name: js.UndefOr[NonEmptyStringWithMaxLen255] = js.native
  
  var server: js.UndefOr[Server] = js.native
  
  /**
    * The validation strategy.
    */
  var serverValidationStrategy: js.UndefOr[ServerValidationStrategy] = js.native
  
  /**
    * The validation parameters.
    */
  var userDataValidationParameters: js.UndefOr[UserDataValidationParameters] = js.native
  
  /**
    * The ID of the validation.
    */
  var validationId: js.UndefOr[ValidationId] = js.native
}
object ServerValidationConfiguration {
  
  @scala.inline
  def apply(): ServerValidationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerValidationConfiguration]
  }
  
  @scala.inline
  implicit class ServerValidationConfigurationOps[Self <: ServerValidationConfiguration] (val x: Self) extends AnyVal {
    
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
    def setName(value: NonEmptyStringWithMaxLen255): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setServer(value: Server): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
    
    @scala.inline
    def setServerValidationStrategy(value: ServerValidationStrategy): Self = this.set("serverValidationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerValidationStrategy: Self = this.set("serverValidationStrategy", js.undefined)
    
    @scala.inline
    def setUserDataValidationParameters(value: UserDataValidationParameters): Self = this.set("userDataValidationParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserDataValidationParameters: Self = this.set("userDataValidationParameters", js.undefined)
    
    @scala.inline
    def setValidationId(value: ValidationId): Self = this.set("validationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationId: Self = this.set("validationId", js.undefined)
  }
}
