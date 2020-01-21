package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProtectionRequest extends js.Object {
  /**
    * The unique identifier (ID) for the Protection object to be deleted.
    */
  var ProtectionId: typings.awsSdk.shieldMod.ProtectionId = js.native
}

object DeleteProtectionRequest {
  @scala.inline
  def apply(ProtectionId: ProtectionId): DeleteProtectionRequest = {
    val __obj = js.Dynamic.literal(ProtectionId = ProtectionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteProtectionRequest]
  }
}

