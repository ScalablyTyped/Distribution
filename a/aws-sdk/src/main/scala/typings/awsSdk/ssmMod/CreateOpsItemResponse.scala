package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOpsItemResponse extends js.Object {
  /**
    * The ID of the OpsItem.
    */
  var OpsItemId: js.UndefOr[String] = js.native
}

object CreateOpsItemResponse {
  @scala.inline
  def apply(OpsItemId: String = null): CreateOpsItemResponse = {
    val __obj = js.Dynamic.literal()
    if (OpsItemId != null) __obj.updateDynamic("OpsItemId")(OpsItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOpsItemResponse]
  }
}

