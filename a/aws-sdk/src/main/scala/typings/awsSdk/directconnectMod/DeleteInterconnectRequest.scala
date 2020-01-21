package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInterconnectRequest extends js.Object {
  /**
    * The ID of the interconnect.
    */
  var interconnectId: InterconnectId = js.native
}

object DeleteInterconnectRequest {
  @scala.inline
  def apply(interconnectId: InterconnectId): DeleteInterconnectRequest = {
    val __obj = js.Dynamic.literal(interconnectId = interconnectId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteInterconnectRequest]
  }
}

