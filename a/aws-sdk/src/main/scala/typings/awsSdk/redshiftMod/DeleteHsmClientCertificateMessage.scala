package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteHsmClientCertificateMessage extends js.Object {
  
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
  implicit class DeleteHsmClientCertificateMessageOps[Self <: DeleteHsmClientCertificateMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHsmClientCertificateIdentifier(value: String): Self = this.set("HsmClientCertificateIdentifier", value.asInstanceOf[js.Any])
  }
}
