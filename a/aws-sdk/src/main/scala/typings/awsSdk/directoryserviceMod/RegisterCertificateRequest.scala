package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterCertificateRequest extends StObject {
  
  /**
    * The certificate PEM string that needs to be registered.
    */
  var CertificateData: typings.awsSdk.directoryserviceMod.CertificateData
  
  /**
    * The identifier of the directory.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId
}
object RegisterCertificateRequest {
  
  inline def apply(CertificateData: CertificateData, DirectoryId: DirectoryId): RegisterCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateData = CertificateData.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCertificateRequest]
  }
  
  extension [Self <: RegisterCertificateRequest](x: Self) {
    
    inline def setCertificateData(value: CertificateData): Self = StObject.set(x, "CertificateData", value.asInstanceOf[js.Any])
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
  }
}
