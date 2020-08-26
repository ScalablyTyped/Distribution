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
  def apply(name: VariableName): Variable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variable]
  }
  @scala.inline
  implicit class VariableOps[Self <: Variable] (val x: Self) extends AnyVal {
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
    def setName(value: VariableName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatasetContentVersionValue(value: DatasetContentVersionValue): Self = this.set("datasetContentVersionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetContentVersionValue: Self = this.set("datasetContentVersionValue", js.undefined)
    @scala.inline
    def setDoubleValue(value: DoubleValue): Self = this.set("doubleValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubleValue: Self = this.set("doubleValue", js.undefined)
    @scala.inline
    def setOutputFileUriValue(value: OutputFileUriValue): Self = this.set("outputFileUriValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputFileUriValue: Self = this.set("outputFileUriValue", js.undefined)
    @scala.inline
    def setStringValue(value: StringValue): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
  }
  
}

