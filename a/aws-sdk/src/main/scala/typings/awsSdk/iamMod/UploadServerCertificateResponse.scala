package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadServerCertificateResponse extends StObject {
  
  /**
    * The meta information of the uploaded server certificate without its certificate body, certificate chain, and private key.
    */
  var ServerCertificateMetadata: js.UndefOr[typings.awsSdk.iamMod.ServerCertificateMetadata] = js.undefined
}
object UploadServerCertificateResponse {
  
  inline def apply(): UploadServerCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadServerCertificateResponse]
  }
  
  extension [Self <: UploadServerCertificateResponse](x: Self) {
    
    inline def setServerCertificateMetadata(value: ServerCertificateMetadata): Self = StObject.set(x, "ServerCertificateMetadata", value.asInstanceOf[js.Any])
    
    inline def setServerCertificateMetadataUndefined: Self = StObject.set(x, "ServerCertificateMetadata", js.undefined)
  }
}
