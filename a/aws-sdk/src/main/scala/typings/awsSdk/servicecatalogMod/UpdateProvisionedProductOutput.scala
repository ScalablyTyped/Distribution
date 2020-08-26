package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProvisionedProductOutput extends js.Object {
  /**
    * Information about the result of the request.
    */
  var RecordDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.RecordDetail] = js.native
}

object UpdateProvisionedProductOutput {
  @scala.inline
  def apply(): UpdateProvisionedProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProvisionedProductOutput]
  }
  @scala.inline
  implicit class UpdateProvisionedProductOutputOps[Self <: UpdateProvisionedProductOutput] (val x: Self) extends AnyVal {
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
    def setRecordDetail(value: RecordDetail): Self = this.set("RecordDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordDetail: Self = this.set("RecordDetail", js.undefined)
  }
  
}

