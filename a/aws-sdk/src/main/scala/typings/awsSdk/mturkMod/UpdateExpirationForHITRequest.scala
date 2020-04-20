package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateExpirationForHITRequest extends js.Object {
  /**
    *  The date and time at which you want the HIT to expire 
    */
  var ExpireAt: Timestamp = js.native
  /**
    *  The HIT to update. 
    */
  var HITId: EntityId = js.native
}

object UpdateExpirationForHITRequest {
  @scala.inline
  def apply(ExpireAt: Timestamp, HITId: EntityId): UpdateExpirationForHITRequest = {
    val __obj = js.Dynamic.literal(ExpireAt = ExpireAt.asInstanceOf[js.Any], HITId = HITId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateExpirationForHITRequest]
  }
}

