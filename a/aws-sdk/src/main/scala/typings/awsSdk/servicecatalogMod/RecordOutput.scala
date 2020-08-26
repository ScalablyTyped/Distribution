package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordOutput extends js.Object {
  /**
    * The description of the output.
    */
  var Description: js.UndefOr[typings.awsSdk.servicecatalogMod.Description] = js.native
  /**
    * The output key.
    */
  var OutputKey: js.UndefOr[typings.awsSdk.servicecatalogMod.OutputKey] = js.native
  /**
    * The output value.
    */
  var OutputValue: js.UndefOr[typings.awsSdk.servicecatalogMod.OutputValue] = js.native
}

object RecordOutput {
  @scala.inline
  def apply(): RecordOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordOutput]
  }
  @scala.inline
  implicit class RecordOutputOps[Self <: RecordOutput] (val x: Self) extends AnyVal {
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
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setOutputKey(value: OutputKey): Self = this.set("OutputKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputKey: Self = this.set("OutputKey", js.undefined)
    @scala.inline
    def setOutputValue(value: OutputValue): Self = this.set("OutputValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputValue: Self = this.set("OutputValue", js.undefined)
  }
  
}

