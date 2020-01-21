package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteProvisionedProductServiceActionOutput extends js.Object {
  /**
    * An object containing detailed information about the result of provisioning the product.
    */
  var RecordDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.RecordDetail] = js.native
}

object ExecuteProvisionedProductServiceActionOutput {
  @scala.inline
  def apply(RecordDetail: RecordDetail = null): ExecuteProvisionedProductServiceActionOutput = {
    val __obj = js.Dynamic.literal()
    if (RecordDetail != null) __obj.updateDynamic("RecordDetail")(RecordDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteProvisionedProductServiceActionOutput]
  }
}

