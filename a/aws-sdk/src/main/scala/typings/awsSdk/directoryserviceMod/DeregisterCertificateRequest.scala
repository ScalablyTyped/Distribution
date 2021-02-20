package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterCertificateRequest extends StObject {
  
  /**
    * The identifier of the certificate.
    */
  var CertificateId: typings.awsSdk.directoryserviceMod.CertificateId = js.native
  
  /**
    * The identifier of the directory.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
}
object DeregisterCertificateRequest {
  
  @scala.inline
  def apply(CertificateId: CertificateId, DirectoryId: DirectoryId): DeregisterCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateId = CertificateId.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterCertificateRequest]
  }
  
  @scala.inline
  implicit class DeregisterCertificateRequestMutableBuilder[Self <: DeregisterCertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateId(value: CertificateId): Self = StObject.set(x, "CertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
  }
}
