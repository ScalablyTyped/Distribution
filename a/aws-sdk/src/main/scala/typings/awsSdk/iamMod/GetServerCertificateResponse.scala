package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetServerCertificateResponse extends js.Object {
  
  /**
    * A structure containing details about the server certificate.
    */
  var ServerCertificate: typings.awsSdk.iamMod.ServerCertificate = js.native
}
object GetServerCertificateResponse {
  
  @scala.inline
  def apply(ServerCertificate: ServerCertificate): GetServerCertificateResponse = {
    val __obj = js.Dynamic.literal(ServerCertificate = ServerCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServerCertificateResponse]
  }
  
  @scala.inline
  implicit class GetServerCertificateResponseOps[Self <: GetServerCertificateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setServerCertificate(value: ServerCertificate): Self = this.set("ServerCertificate", value.asInstanceOf[js.Any])
  }
}
