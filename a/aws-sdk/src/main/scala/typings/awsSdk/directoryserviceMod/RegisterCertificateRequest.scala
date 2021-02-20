package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterCertificateRequest extends StObject {
  
  /**
    * The certificate PEM string that needs to be registered.
    */
  var CertificateData: typings.awsSdk.directoryserviceMod.CertificateData = js.native
  
  /**
    * The identifier of the directory.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
}
object RegisterCertificateRequest {
  
  @scala.inline
  def apply(CertificateData: CertificateData, DirectoryId: DirectoryId): RegisterCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateData = CertificateData.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCertificateRequest]
  }
  
  @scala.inline
  implicit class RegisterCertificateRequestMutableBuilder[Self <: RegisterCertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateData(value: CertificateData): Self = StObject.set(x, "CertificateData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
  }
}
