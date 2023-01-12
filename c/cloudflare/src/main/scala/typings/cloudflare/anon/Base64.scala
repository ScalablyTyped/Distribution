package typings.cloudflare.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base64 extends StObject {
  
  var base64: js.UndefOr[Boolean] = js.undefined
  
  var expiration: js.UndefOr[Double] = js.undefined
  
  var expiration_ttl: js.UndefOr[Double] = js.undefined
  
  var key: String
  
  var metadata: js.UndefOr[js.Object] = js.undefined
  
  var value: String
}
object Base64 {
  
  inline def apply(key: String, value: String): Base64 = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base64]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Base64] (val x: Self) extends AnyVal {
    
    inline def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
    
    inline def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
    
    inline def setExpiration(value: Double): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    inline def setExpiration_ttl(value: Double): Self = StObject.set(x, "expiration_ttl", value.asInstanceOf[js.Any])
    
    inline def setExpiration_ttlUndefined: Self = StObject.set(x, "expiration_ttl", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
