package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteProvisionedProductPlanOutput extends js.Object {
  /**
    * Information about the result of provisioning the product.
    */
  var RecordDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.RecordDetail] = js.native
}

object ExecuteProvisionedProductPlanOutput {
  @scala.inline
  def apply(RecordDetail: RecordDetail = null): ExecuteProvisionedProductPlanOutput = {
    val __obj = js.Dynamic.literal()
    if (RecordDetail != null) __obj.updateDynamic("RecordDetail")(RecordDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteProvisionedProductPlanOutput]
  }
}

