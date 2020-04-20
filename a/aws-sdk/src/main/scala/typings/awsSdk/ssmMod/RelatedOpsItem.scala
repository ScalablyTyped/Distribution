package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelatedOpsItem extends js.Object {
  /**
    * The ID of an OpsItem related to the current OpsItem.
    */
  var OpsItemId: String = js.native
}

object RelatedOpsItem {
  @scala.inline
  def apply(OpsItemId: String): RelatedOpsItem = {
    val __obj = js.Dynamic.literal(OpsItemId = OpsItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedOpsItem]
  }
}

