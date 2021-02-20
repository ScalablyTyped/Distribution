package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelOutputConfiguration extends StObject {
  
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
  implicit class ModelOutputConfigurationMutableBuilder[Self <: ModelOutputConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCsvIndexToVariableMap(value: CsvIndexToVariableMap): Self = StObject.set(x, "csvIndexToVariableMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvIndexToVariableMapUndefined: Self = StObject.set(x, "csvIndexToVariableMap", js.undefined)
    
    @scala.inline
    def setFormat(value: ModelOutputDataFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonKeyToVariableMap(value: JsonKeyToVariableMap): Self = StObject.set(x, "jsonKeyToVariableMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonKeyToVariableMapUndefined: Self = StObject.set(x, "jsonKeyToVariableMap", js.undefined)
  }
}
