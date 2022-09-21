package typings.cloudflare.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bundlemethod extends StObject {
  
  var bundle_method: String
  
  var custom_certificate: String
  
  var custom_key: String
  
  var method: String
  
  var settings: Ciphers
  
  var `type`: String
  
  var wildcard: Boolean
}
object Bundlemethod {
  
  inline def apply(
    bundle_method: String,
    custom_certificate: String,
    custom_key: String,
    method: String,
    settings: Ciphers,
    `type`: String,
    wildcard: Boolean
  ): Bundlemethod = {
    val __obj = js.Dynamic.literal(bundle_method = bundle_method.asInstanceOf[js.Any], custom_certificate = custom_certificate.asInstanceOf[js.Any], custom_key = custom_key.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], wildcard = wildcard.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundlemethod]
  }
  
  extension [Self <: Bundlemethod](x: Self) {
    
    inline def setBundle_method(value: String): Self = StObject.set(x, "bundle_method", value.asInstanceOf[js.Any])
    
    inline def setCustom_certificate(value: String): Self = StObject.set(x, "custom_certificate", value.asInstanceOf[js.Any])
    
    inline def setCustom_key(value: String): Self = StObject.set(x, "custom_key", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: Ciphers): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWildcard(value: Boolean): Self = StObject.set(x, "wildcard", value.asInstanceOf[js.Any])
  }
}
