package typings.consul.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsulOptions extends StObject {
  
  var ca: js.UndefOr[js.Array[String]] = js.undefined
  
  var defaults: js.UndefOr[CommonOptions] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var port: js.UndefOr[String] = js.undefined
  
  var promisify: js.UndefOr[Boolean | js.Function] = js.undefined
  
  var secure: js.UndefOr[Boolean] = js.undefined
}
object ConsulOptions {
  
  inline def apply(): ConsulOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsulOptions]
  }
  
  extension [Self <: ConsulOptions](x: Self) {
    
    inline def setCa(value: js.Array[String]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
    
    inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
    
    inline def setCaVarargs(value: String*): Self = StObject.set(x, "ca", js.Array(value :_*))
    
    inline def setDefaults(value: CommonOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setPromisify(value: Boolean | js.Function): Self = StObject.set(x, "promisify", value.asInstanceOf[js.Any])
    
    inline def setPromisifyUndefined: Self = StObject.set(x, "promisify", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
  }
}
