package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SigningCertificate extends StObject {
  
  /**
    * The contents of the signing certificate.
    */
  var CertificateBody: certificateBodyType
  
  /**
    * The ID for the signing certificate.
    */
  var CertificateId: certificateIdType
  
  /**
    * The status of the signing certificate. Active means that the key is valid for API calls, while Inactive means it is not.
    */
  var Status: statusType
  
  /**
    * The date when the signing certificate was uploaded.
    */
  var UploadDate: js.UndefOr[dateType] = js.undefined
  
  /**
    * The name of the user the signing certificate is associated with.
    */
  var UserName: userNameType
}
object SigningCertificate {
  
  inline def apply(
    CertificateBody: certificateBodyType,
    CertificateId: certificateIdType,
    Status: statusType,
    UserName: userNameType
  ): SigningCertificate = {
    val __obj = js.Dynamic.literal(CertificateBody = CertificateBody.asInstanceOf[js.Any], CertificateId = CertificateId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigningCertificate]
  }
  
  extension [Self <: SigningCertificate](x: Self) {
    
    inline def setCertificateBody(value: certificateBodyType): Self = StObject.set(x, "CertificateBody", value.asInstanceOf[js.Any])
    
    inline def setCertificateId(value: certificateIdType): Self = StObject.set(x, "CertificateId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: statusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setUploadDate(value: dateType): Self = StObject.set(x, "UploadDate", value.asInstanceOf[js.Any])
    
    inline def setUploadDateUndefined: Self = StObject.set(x, "UploadDate", js.undefined)
    
    inline def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
