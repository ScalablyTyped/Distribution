package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationOutput extends StObject {
  
  /**
    * The output from validating an application.
    */
  var appValidationOutput: js.UndefOr[AppValidationOutput] = js.undefined
  
  /**
    * The latest time that the validation was performed.
    */
  var latestValidationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the validation.
    */
  var name: js.UndefOr[NonEmptyStringWithMaxLen255] = js.undefined
  
  /**
    * The output from validation an instance.
    */
  var serverValidationOutput: js.UndefOr[ServerValidationOutput] = js.undefined
  
  /**
    * The status of the validation.
    */
  var status: js.UndefOr[ValidationStatus] = js.undefined
  
  /**
    * The status message.
    */
  var statusMessage: js.UndefOr[ValidationStatusMessage] = js.undefined
  
  /**
    * The ID of the validation.
    */
  var validationId: js.UndefOr[ValidationId] = js.undefined
}
object ValidationOutput {
  
  @scala.inline
  def apply(): ValidationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationOutput]
  }
  
  @scala.inline
  implicit class ValidationOutputMutableBuilder[Self <: ValidationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppValidationOutput(value: AppValidationOutput): Self = StObject.set(x, "appValidationOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppValidationOutputUndefined: Self = StObject.set(x, "appValidationOutput", js.undefined)
    
    @scala.inline
    def setLatestValidationTime(value: Timestamp): Self = StObject.set(x, "latestValidationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestValidationTimeUndefined: Self = StObject.set(x, "latestValidationTime", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyStringWithMaxLen255): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setServerValidationOutput(value: ServerValidationOutput): Self = StObject.set(x, "serverValidationOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerValidationOutputUndefined: Self = StObject.set(x, "serverValidationOutput", js.undefined)
    
    @scala.inline
    def setStatus(value: ValidationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: ValidationStatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setValidationId(value: ValidationId): Self = StObject.set(x, "validationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationIdUndefined: Self = StObject.set(x, "validationId", js.undefined)
  }
}
