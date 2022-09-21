package typings.awsSdk.connectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAttachmentResponse extends StObject {
  
  /**
    * This is the pre-signed URL that can be used for uploading the file to Amazon S3 when used in response to StartAttachmentUpload.
    */
  var Url: js.UndefOr[PreSignedAttachmentUrl] = js.undefined
  
  /**
    * The expiration time of the URL in ISO timestamp. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
    */
  var UrlExpiry: js.UndefOr[ISO8601Datetime] = js.undefined
}
object GetAttachmentResponse {
  
  inline def apply(): GetAttachmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAttachmentResponse]
  }
  
  extension [Self <: GetAttachmentResponse](x: Self) {
    
    inline def setUrl(value: PreSignedAttachmentUrl): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlExpiry(value: ISO8601Datetime): Self = StObject.set(x, "UrlExpiry", value.asInstanceOf[js.Any])
    
    inline def setUrlExpiryUndefined: Self = StObject.set(x, "UrlExpiry", js.undefined)
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
