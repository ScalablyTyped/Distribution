package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateHITReviewStatusRequest extends js.Object {
  
  /**
    *  The ID of the HIT to update. 
    */
  var HITId: EntityId = js.native
  
  /**
    *  Specifies how to update the HIT status. Default is False.     Setting this to false will only transition a HIT from Reviewable to Reviewing     Setting this to true will only transition a HIT from Reviewing to Reviewable   
    */
  var Revert: js.UndefOr[Boolean] = js.native
}
object UpdateHITReviewStatusRequest {
  
  @scala.inline
  def apply(HITId: EntityId): UpdateHITReviewStatusRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateHITReviewStatusRequest]
  }
  
  @scala.inline
  implicit class UpdateHITReviewStatusRequestOps[Self <: UpdateHITReviewStatusRequest] (val x: Self) extends AnyVal {
    
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
    def setHITId(value: EntityId): Self = this.set("HITId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevert(value: Boolean): Self = this.set("Revert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevert: Self = this.set("Revert", js.undefined)
  }
}
