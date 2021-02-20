package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteHsmClientCertificateMessage extends StObject {
  
  /**
    * The identifier of the HSM client certificate to be deleted.
    */
  var HsmClientCertificateIdentifier: String = js.native
}
object DeleteHsmClientCertificateMessage {
  
  @scala.inline
  def apply(HsmClientCertificateIdentifier: String): DeleteHsmClientCertificateMessage = {
    val __obj = js.Dynamic.literal(HsmClientCertificateIdentifier = HsmClientCertificateIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHsmClientCertificateMessage]
  }
  
  @scala.inline
  implicit class DeleteHsmClientCertificateMessageMutableBuilder[Self <: DeleteHsmClientCertificateMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHsmClientCertificateIdentifier(value: String): Self = StObject.set(x, "HsmClientCertificateIdentifier", value.asInstanceOf[js.Any])
  }
}
