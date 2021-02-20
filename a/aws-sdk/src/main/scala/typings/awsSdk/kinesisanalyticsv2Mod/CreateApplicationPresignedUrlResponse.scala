package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateApplicationPresignedUrlResponse extends StObject {
  
  /**
    * The URL of the extension.
    */
  var AuthorizedUrl: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.AuthorizedUrl] = js.native
}
object CreateApplicationPresignedUrlResponse {
  
  @scala.inline
  def apply(): CreateApplicationPresignedUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApplicationPresignedUrlResponse]
  }
  
  @scala.inline
  implicit class CreateApplicationPresignedUrlResponseMutableBuilder[Self <: CreateApplicationPresignedUrlResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizedUrl(value: AuthorizedUrl): Self = StObject.set(x, "AuthorizedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizedUrlUndefined: Self = StObject.set(x, "AuthorizedUrl", js.undefined)
  }
}
