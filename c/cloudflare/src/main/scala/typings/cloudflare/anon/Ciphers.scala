package typings.cloudflare.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ciphers extends StObject {
  
  var ciphers: js.Array[String]
  
  var http2: String
  
  var http3: String
  
  var min_tls_version: String
  
  var tls_1_3: String
}
object Ciphers {
  
  inline def apply(ciphers: js.Array[String], http2: String, http3: String, min_tls_version: String, tls_1_3: String): Ciphers = {
    val __obj = js.Dynamic.literal(ciphers = ciphers.asInstanceOf[js.Any], http2 = http2.asInstanceOf[js.Any], http3 = http3.asInstanceOf[js.Any], min_tls_version = min_tls_version.asInstanceOf[js.Any], tls_1_3 = tls_1_3.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ciphers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ciphers] (val x: Self) extends AnyVal {
    
    inline def setCiphers(value: js.Array[String]): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
    
    inline def setCiphersVarargs(value: String*): Self = StObject.set(x, "ciphers", js.Array(value*))
    
    inline def setHttp2(value: String): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
    
    inline def setHttp3(value: String): Self = StObject.set(x, "http3", value.asInstanceOf[js.Any])
    
    inline def setMin_tls_version(value: String): Self = StObject.set(x, "min_tls_version", value.asInstanceOf[js.Any])
    
    inline def setTls_1_3(value: String): Self = StObject.set(x, "tls_1_3", value.asInstanceOf[js.Any])
  }
}
