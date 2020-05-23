package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Variable extends js.Object {
  /**
    * The value of the variable as a structure that specifies a data set content version.
    */
  var datasetContentVersionValue: js.UndefOr[DatasetContentVersionValue] = js.native
  /**
    * The value of the variable as a double (numeric).
    */
  var doubleValue: js.UndefOr[DoubleValue] = js.native
  /**
    * The name of the variable.
    */
  var name: VariableName = js.native
  /**
    * The value of the variable as a structure that specifies an output file URI.
    */
  var outputFileUriValue: js.UndefOr[OutputFileUriValue] = js.native
  /**
    * The value of the variable as a string.
    */
  var stringValue: js.UndefOr[StringValue] = js.native
}

object Variable {
  @scala.inline
  def apply(
    name: VariableName,
    datasetContentVersionValue: DatasetContentVersionValue = null,
    doubleValue: js.UndefOr[DoubleValue] = js.undefined,
    outputFileUriValue: OutputFileUriValue = null,
    stringValue: StringValue = null
  ): Variable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (datasetContentVersionValue != null) __obj.updateDynamic("datasetContentVersionValue")(datasetContentVersionValue.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleValue)) __obj.updateDynamic("doubleValue")(doubleValue.get.asInstanceOf[js.Any])
    if (outputFileUriValue != null) __obj.updateDynamic("outputFileUriValue")(outputFileUriValue.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variable]
  }
}

