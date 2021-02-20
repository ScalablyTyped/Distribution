package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientAuthentication extends StObject {
  
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
  implicit class ClientAuthenticationMutableBuilder[Self <: ClientAuthentication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSasl(value: Sasl): Self = StObject.set(x, "Sasl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaslUndefined: Self = StObject.set(x, "Sasl", js.undefined)
    
    @scala.inline
    def setTls(value: Tls): Self = StObject.set(x, "Tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsUndefined: Self = StObject.set(x, "Tls", js.undefined)
  }
}
