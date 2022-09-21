package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerCertificateMetadata extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) specifying the server certificate. For more information about ARNs and how to use them in policies, see IAM identifiers in the IAM User Guide. 
    */
  var Arn: arnType
  
  /**
    * The date on which the certificate is set to expire.
    */
  var Expiration: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The path to the server certificate. For more information about paths, see IAM identifiers in the IAM User Guide. 
    */
  var Path: pathType
  
  /**
    *  The stable and unique string identifying the server certificate. For more information about IDs, see IAM identifiers in the IAM User Guide. 
    */
  var ServerCertificateId: idType
  
  /**
    * The name that identifies the server certificate.
    */
  var ServerCertificateName: serverCertificateNameType
  
  /**
    * The date when the server certificate was uploaded.
    */
  var UploadDate: js.UndefOr[js.Date] = js.undefined
}
object ServerCertificateMetadata {
  
  inline def apply(
    Arn: arnType,
    Path: pathType,
    ServerCertificateId: idType,
    ServerCertificateName: serverCertificateNameType
  ): ServerCertificateMetadata = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], ServerCertificateId = ServerCertificateId.asInstanceOf[js.Any], ServerCertificateName = ServerCertificateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerCertificateMetadata]
  }
  
  extension [Self <: ServerCertificateMetadata](x: Self) {
    
    inline def setArn(value: arnType): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setExpiration(value: js.Date): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
    
    inline def setPath(value: pathType): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setServerCertificateId(value: idType): Self = StObject.set(x, "ServerCertificateId", value.asInstanceOf[js.Any])
    
    inline def setServerCertificateName(value: serverCertificateNameType): Self = StObject.set(x, "ServerCertificateName", value.asInstanceOf[js.Any])
    
    inline def setUploadDate(value: js.Date): Self = StObject.set(x, "UploadDate", value.asInstanceOf[js.Any])
    
    inline def setUploadDateUndefined: Self = StObject.set(x, "UploadDate", js.undefined)
  }
}
