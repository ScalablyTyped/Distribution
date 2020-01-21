package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateProvisionedProductOutput extends js.Object {
  /**
    * Information about the result of this request.
    */
  var RecordDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.RecordDetail] = js.native
}

object TerminateProvisionedProductOutput {
  @scala.inline
  def apply(RecordDetail: RecordDetail = null): TerminateProvisionedProductOutput = {
    val __obj = js.Dynamic.literal()
    if (RecordDetail != null) __obj.updateDynamic("RecordDetail")(RecordDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateProvisionedProductOutput]
  }
}

