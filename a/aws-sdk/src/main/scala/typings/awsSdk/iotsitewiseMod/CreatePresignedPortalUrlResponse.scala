package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePresignedPortalUrlResponse extends StObject {
  
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
  implicit class CreatePresignedPortalUrlResponseMutableBuilder[Self <: CreatePresignedPortalUrlResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPresignedPortalUrl(value: Url): Self = StObject.set(x, "presignedPortalUrl", value.asInstanceOf[js.Any])
  }
}
