package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationOutput extends js.Object {
  
  /**
    * The output from validating an application.
    */
  var appValidationOutput: js.UndefOr[AppValidationOutput] = js.native
  
  /**
    * The latest time that the validation was performed.
    */
  var latestValidationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the validation.
    */
  var name: js.UndefOr[NonEmptyStringWithMaxLen255] = js.native
  
  /**
    * The output from validation an instance.
    */
  var serverValidationOutput: js.UndefOr[ServerValidationOutput] = js.native
  
  /**
    * The status of the validation.
    */
  var status: js.UndefOr[ValidationStatus] = js.native
  
  /**
    * The status message.
    */
  var statusMessage: js.UndefOr[ValidationStatusMessage] = js.native
  
  /**
    * The ID of the validation.
    */
  var validationId: js.UndefOr[ValidationId] = js.native
}
object ValidationOutput {
  
  @scala.inline
  def apply(): ValidationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationOutput]
  }
  
  @scala.inline
  implicit class ValidationOutputOps[Self <: ValidationOutput] (val x: Self) extends AnyVal {
    
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
    def setAppValidationOutput(value: AppValidationOutput): Self = this.set("appValidationOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppValidationOutput: Self = this.set("appValidationOutput", js.undefined)
    
    @scala.inline
    def setLatestValidationTime(value: Timestamp): Self = this.set("latestValidationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestValidationTime: Self = this.set("latestValidationTime", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyStringWithMaxLen255): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setServerValidationOutput(value: ServerValidationOutput): Self = this.set("serverValidationOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerValidationOutput: Self = this.set("serverValidationOutput", js.undefined)
    
    @scala.inline
    def setStatus(value: ValidationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: ValidationStatusMessage): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
    
    @scala.inline
    def setValidationId(value: ValidationId): Self = this.set("validationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationId: Self = this.set("validationId", js.undefined)
  }
}
