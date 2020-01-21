package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionProductOutput extends js.Object {
  /**
    * Information about the result of provisioning the product.
    */
  var RecordDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.RecordDetail] = js.native
}

object ProvisionProductOutput {
  @scala.inline
  def apply(RecordDetail: RecordDetail = null): ProvisionProductOutput = {
    val __obj = js.Dynamic.literal()
    if (RecordDetail != null) __obj.updateDynamic("RecordDetail")(RecordDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionProductOutput]
  }
}

