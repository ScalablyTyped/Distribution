package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCertificateMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the deleted certificate.
    */
  var CertificateArn: String
}
object DeleteCertificateMessage {
  
  @scala.inline
  def apply(CertificateArn: String): DeleteCertificateMessage = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCertificateMessage]
  }
  
  @scala.inline
  implicit class DeleteCertificateMessageMutableBuilder[Self <: DeleteCertificateMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: String): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
  }
}
