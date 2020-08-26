package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCopyProductStatusOutput extends js.Object {
  /**
    * The status of the copy product operation.
    */
  var CopyProductStatus: js.UndefOr[typings.awsSdk.servicecatalogMod.CopyProductStatus] = js.native
  /**
    * The status message.
    */
  var StatusDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.StatusDetail] = js.native
  /**
    * The identifier of the copied product.
    */
  var TargetProductId: js.UndefOr[Id] = js.native
}

object DescribeCopyProductStatusOutput {
  @scala.inline
  def apply(): DescribeCopyProductStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCopyProductStatusOutput]
  }
  @scala.inline
  implicit class DescribeCopyProductStatusOutputOps[Self <: DescribeCopyProductStatusOutput] (val x: Self) extends AnyVal {
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
    def setCopyProductStatus(value: CopyProductStatus): Self = this.set("CopyProductStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyProductStatus: Self = this.set("CopyProductStatus", js.undefined)
    @scala.inline
    def setStatusDetail(value: StatusDetail): Self = this.set("StatusDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusDetail: Self = this.set("StatusDetail", js.undefined)
    @scala.inline
    def setTargetProductId(value: Id): Self = this.set("TargetProductId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetProductId: Self = this.set("TargetProductId", js.undefined)
  }
  
}

