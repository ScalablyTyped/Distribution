package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SslConfiguration extends StObject {
  
  /**
    * The contents of the certificate's domain.crt file.
    */
  var Certificate: String
  
  /**
    * Optional. Can be used to specify an intermediate certificate authority key or client authentication.
    */
  var Chain: js.UndefOr[String] = js.undefined
  
  /**
    * The private key; the contents of the certificate's domain.kex file.
    */
  var PrivateKey: String
}
object SslConfiguration {
  
  inline def apply(Certificate: String, PrivateKey: String): SslConfiguration = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any], PrivateKey = PrivateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SslConfiguration]
  }
  
  extension [Self <: SslConfiguration](x: Self) {
    
    inline def setCertificate(value: String): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    inline def setChain(value: String): Self = StObject.set(x, "Chain", value.asInstanceOf[js.Any])
    
    inline def setChainUndefined: Self = StObject.set(x, "Chain", js.undefined)
    
    inline def setPrivateKey(value: String): Self = StObject.set(x, "PrivateKey", value.asInstanceOf[js.Any])
  }
}
