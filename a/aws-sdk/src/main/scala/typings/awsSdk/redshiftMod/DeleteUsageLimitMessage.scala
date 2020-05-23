package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUsageLimitMessage extends js.Object {
  /**
    * The identifier of the usage limit to delete.
    */
  var UsageLimitId: String = js.native
}

object DeleteUsageLimitMessage {
  @scala.inline
  def apply(UsageLimitId: String): DeleteUsageLimitMessage = {
    val __obj = js.Dynamic.literal(UsageLimitId = UsageLimitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUsageLimitMessage]
  }
}

