package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelInputConfiguration extends js.Object {
  
  /**
    *  Template for constructing the CSV input-data sent to SageMaker. At event-evaluation, the placeholders for variable-names in the template will be replaced with the variable values before being sent to SageMaker. 
    */
  var csvInputTemplate: js.UndefOr[String] = js.native
  
  /**
    * The event type name.
    */
  var eventTypeName: js.UndefOr[identifier] = js.native
  
  /**
    *  The format of the model input configuration. The format differs depending on if it is passed through to SageMaker or constructed by Amazon Fraud Detector.
    */
  var format: js.UndefOr[ModelInputDataFormat] = js.native
  
  /**
    *  Template for constructing the JSON input-data sent to SageMaker. At event-evaluation, the placeholders for variable names in the template will be replaced with the variable values before being sent to SageMaker. 
    */
  var jsonInputTemplate: js.UndefOr[String] = js.native
  
  /**
    * The event variables.
    */
  var useEventVariables: UseEventVariables = js.native
}
object ModelInputConfiguration {
  
  @scala.inline
  def apply(useEventVariables: UseEventVariables): ModelInputConfiguration = {
    val __obj = js.Dynamic.literal(useEventVariables = useEventVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelInputConfiguration]
  }
  
  @scala.inline
  implicit class ModelInputConfigurationOps[Self <: ModelInputConfiguration] (val x: Self) extends AnyVal {
    
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
    def setUseEventVariables(value: UseEventVariables): Self = this.set("useEventVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvInputTemplate(value: String): Self = this.set("csvInputTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsvInputTemplate: Self = this.set("csvInputTemplate", js.undefined)
    
    @scala.inline
    def setEventTypeName(value: identifier): Self = this.set("eventTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTypeName: Self = this.set("eventTypeName", js.undefined)
    
    @scala.inline
    def setFormat(value: ModelInputDataFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setJsonInputTemplate(value: String): Self = this.set("jsonInputTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonInputTemplate: Self = this.set("jsonInputTemplate", js.undefined)
  }
}
