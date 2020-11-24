package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePresignedPortalUrlRequest extends js.Object {
  
  /**
    * The ID of the portal to access.
    */
  var portalId: ID = js.native
  
  /**
    * The duration (in seconds) for which the session at the URL is valid. Default: 900 seconds (15 minutes)
    */
  var sessionDurationSeconds: js.UndefOr[SessionDurationSeconds] = js.native
}
object CreatePresignedPortalUrlRequest {
  
  @scala.inline
  def apply(portalId: ID): CreatePresignedPortalUrlRequest = {
    val __obj = js.Dynamic.literal(portalId = portalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePresignedPortalUrlRequest]
  }
  
  @scala.inline
  implicit class CreatePresignedPortalUrlRequestOps[Self <: CreatePresignedPortalUrlRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPortalId(value: ID): Self = this.set("portalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionDurationSeconds(value: SessionDurationSeconds): Self = this.set("sessionDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionDurationSeconds: Self = this.set("sessionDurationSeconds", js.undefined)
  }
}
