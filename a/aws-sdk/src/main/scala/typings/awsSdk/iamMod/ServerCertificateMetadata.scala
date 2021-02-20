package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerCertificateMetadata extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) specifying the server certificate. For more information about ARNs and how to use them in policies, see IAM Identifiers in the IAM User Guide. 
    */
  var Arn: arnType = js.native
  
  /**
    * The date on which the certificate is set to expire.
    */
  var Expiration: js.UndefOr[dateType] = js.native
  
  /**
    *  The path to the server certificate. For more information about paths, see IAM Identifiers in the IAM User Guide. 
    */
  var Path: pathType = js.native
  
  /**
    *  The stable and unique string identifying the server certificate. For more information about IDs, see IAM Identifiers in the IAM User Guide. 
    */
  var ServerCertificateId: idType = js.native
  
  /**
    * The name that identifies the server certificate.
    */
  var ServerCertificateName: serverCertificateNameType = js.native
  
  /**
    * The date when the server certificate was uploaded.
    */
  var UploadDate: js.UndefOr[dateType] = js.native
}
object ServerCertificateMetadata {
  
  @scala.inline
  def apply(
    Arn: arnType,
    Path: pathType,
    ServerCertificateId: idType,
    ServerCertificateName: serverCertificateNameType
  ): ServerCertificateMetadata = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], ServerCertificateId = ServerCertificateId.asInstanceOf[js.Any], ServerCertificateName = ServerCertificateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerCertificateMetadata]
  }
  
  @scala.inline
  implicit class ServerCertificateMetadataMutableBuilder[Self <: ServerCertificateMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: arnType): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiration(value: dateType): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
    
    @scala.inline
    def setPath(value: pathType): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCertificateId(value: idType): Self = StObject.set(x, "ServerCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCertificateName(value: serverCertificateNameType): Self = StObject.set(x, "ServerCertificateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadDate(value: dateType): Self = StObject.set(x, "UploadDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadDateUndefined: Self = StObject.set(x, "UploadDate", js.undefined)
  }
}
