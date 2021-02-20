package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePresignedDomainUrlResponse extends StObject {
  
  /**
    * The presigned URL.
    */
  var AuthorizedUrl: js.UndefOr[PresignedDomainUrl] = js.native
}
object CreatePresignedDomainUrlResponse {
  
  @scala.inline
  def apply(): CreatePresignedDomainUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePresignedDomainUrlResponse]
  }
  
  @scala.inline
  implicit class CreatePresignedDomainUrlResponseMutableBuilder[Self <: CreatePresignedDomainUrlResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizedUrl(value: PresignedDomainUrl): Self = StObject.set(x, "AuthorizedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizedUrlUndefined: Self = StObject.set(x, "AuthorizedUrl", js.undefined)
  }
}
