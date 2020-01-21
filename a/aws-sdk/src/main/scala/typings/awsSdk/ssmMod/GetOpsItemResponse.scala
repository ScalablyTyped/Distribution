package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOpsItemResponse extends js.Object {
  /**
    * The OpsItem.
    */
  var OpsItem: js.UndefOr[typings.awsSdk.ssmMod.OpsItem] = js.native
}

object GetOpsItemResponse {
  @scala.inline
  def apply(OpsItem: OpsItem = null): GetOpsItemResponse = {
    val __obj = js.Dynamic.literal()
    if (OpsItem != null) __obj.updateDynamic("OpsItem")(OpsItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOpsItemResponse]
  }
}

