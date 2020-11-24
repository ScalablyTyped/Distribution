package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePresignedPortalUrlResponse extends js.Object {
  
  /**
    * The pre-signed URL to the portal. The URL contains the portal ID and a session token that lets you access the portal. The URL has the following format.  https://&lt;portal-id&gt;.app.iotsitewise.aws/auth?token=&lt;encrypted-token&gt; 
    */
  var presignedPortalUrl: Url = js.native
}
object CreatePresignedPortalUrlResponse {
  
  @scala.inline
  def apply(presignedPortalUrl: Url): CreatePresignedPortalUrlResponse = {
    val __obj = js.Dynamic.literal(presignedPortalUrl = presignedPortalUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePresignedPortalUrlResponse]
  }
  
  @scala.inline
  implicit class CreatePresignedPortalUrlResponseOps[Self <: CreatePresignedPortalUrlResponse] (val x: Self) extends AnyVal {
    
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
    def setPresignedPortalUrl(value: Url): Self = this.set("presignedPortalUrl", value.asInstanceOf[js.Any])
  }
}
