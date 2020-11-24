package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelOutputConfiguration extends js.Object {
  
  /**
    * A map of CSV index values in the SageMaker response to the Amazon Fraud Detector variables. 
    */
  var csvIndexToVariableMap: js.UndefOr[CsvIndexToVariableMap] = js.native
  
  /**
    * The format of the model output configuration.
    */
  var format: ModelOutputDataFormat = js.native
  
  /**
    * A map of JSON keys in response from SageMaker to the Amazon Fraud Detector variables. 
    */
  var jsonKeyToVariableMap: js.UndefOr[JsonKeyToVariableMap] = js.native
}
object ModelOutputConfiguration {
  
  @scala.inline
  def apply(format: ModelOutputDataFormat): ModelOutputConfiguration = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelOutputConfiguration]
  }
  
  @scala.inline
  implicit class ModelOutputConfigurationOps[Self <: ModelOutputConfiguration] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: ModelOutputDataFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvIndexToVariableMap(value: CsvIndexToVariableMap): Self = this.set("csvIndexToVariableMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsvIndexToVariableMap: Self = this.set("csvIndexToVariableMap", js.undefined)
    
    @scala.inline
    def setJsonKeyToVariableMap(value: JsonKeyToVariableMap): Self = this.set("jsonKeyToVariableMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonKeyToVariableMap: Self = this.set("jsonKeyToVariableMap", js.undefined)
  }
}
