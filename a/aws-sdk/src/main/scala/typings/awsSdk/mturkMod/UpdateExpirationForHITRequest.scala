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
  @scala.inline
  implicit class UpdateExpirationForHITRequestOps[Self <: UpdateExpirationForHITRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpireAt(value: Timestamp): Self = this.set("ExpireAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setHITId(value: EntityId): Self = this.set("HITId", value.asInstanceOf[js.Any])
  }
  
}

