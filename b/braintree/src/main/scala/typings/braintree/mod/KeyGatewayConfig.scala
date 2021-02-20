package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyGatewayConfig extends GatewayConfig {
  
  var environment: Environment = js.native
  
  var merchantId: String = js.native
  
  var privateKey: String = js.native
  
  var publicKey: String = js.native
}
object KeyGatewayConfig {
  
  @scala.inline
  def apply(environment: Environment, merchantId: String, privateKey: String, publicKey: String): KeyGatewayConfig = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], merchantId = merchantId.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyGatewayConfig]
  }
  
  @scala.inline
  implicit class KeyGatewayConfigMutableBuilder[Self <: KeyGatewayConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
