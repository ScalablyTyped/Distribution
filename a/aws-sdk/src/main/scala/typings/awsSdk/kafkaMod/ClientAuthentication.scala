package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientAuthentication extends js.Object {
  
  /**
    * 
    Details for ClientAuthentication using SASL.
    
    */
  var Sasl: js.UndefOr[typings.awsSdk.kafkaMod.Sasl] = js.native
  
  /**
    * 
    Details for ClientAuthentication using TLS.
    
    */
  var Tls: js.UndefOr[typings.awsSdk.kafkaMod.Tls] = js.native
}
object ClientAuthentication {
  
  @scala.inline
  def apply(): ClientAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientAuthentication]
  }
  
  @scala.inline
  implicit class ClientAuthenticationOps[Self <: ClientAuthentication] (val x: Self) extends AnyVal {
    
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
    def setSasl(value: Sasl): Self = this.set("Sasl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSasl: Self = this.set("Sasl", js.undefined)
    
    @scala.inline
    def setTls(value: Tls): Self = this.set("Tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTls: Self = this.set("Tls", js.undefined)
  }
}
