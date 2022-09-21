package typings.chance.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chance.Chance.UrlOptions> */
trait PartialUrlOptions extends StObject {
  
  var domain: js.UndefOr[String] = js.undefined
  
  var domain_prefix: js.UndefOr[String] = js.undefined
  
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var protocol: js.UndefOr[String] = js.undefined
}
object PartialUrlOptions {
  
  inline def apply(): PartialUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUrlOptions]
  }
  
  extension [Self <: PartialUrlOptions](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setDomain_prefix(value: String): Self = StObject.set(x, "domain_prefix", value.asInstanceOf[js.Any])
    
    inline def setDomain_prefixUndefined: Self = StObject.set(x, "domain_prefix", js.undefined)
    
    inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
