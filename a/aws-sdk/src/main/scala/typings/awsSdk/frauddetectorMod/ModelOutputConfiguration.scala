package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    format: ModelOutputDataFormat,
    csvIndexToVariableMap: CsvIndexToVariableMap = null,
    jsonKeyToVariableMap: JsonKeyToVariableMap = null
  ): ModelOutputConfiguration = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    if (csvIndexToVariableMap != null) __obj.updateDynamic("csvIndexToVariableMap")(csvIndexToVariableMap.asInstanceOf[js.Any])
    if (jsonKeyToVariableMap != null) __obj.updateDynamic("jsonKeyToVariableMap")(jsonKeyToVariableMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelOutputConfiguration]
  }
}

