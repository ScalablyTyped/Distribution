package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIPSetResponse extends js.Object {
  /**
    * The ID of the IPSet resource.
    */
  var IpSetId: String = js.native
}

object CreateIPSetResponse {
  @scala.inline
  def apply(IpSetId: String): CreateIPSetResponse = {
    val __obj = js.Dynamic.literal(IpSetId = IpSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIPSetResponse]
  }
}

