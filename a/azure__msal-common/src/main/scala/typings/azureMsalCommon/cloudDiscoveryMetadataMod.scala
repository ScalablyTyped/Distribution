package typings.azureMsalCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudDiscoveryMetadataMod {
  
  trait CloudDiscoveryMetadata extends StObject {
    
    var aliases: js.Array[String]
    
    var preferred_cache: String
    
    var preferred_network: String
  }
  object CloudDiscoveryMetadata {
    
    inline def apply(aliases: js.Array[String], preferred_cache: String, preferred_network: String): CloudDiscoveryMetadata = {
      val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], preferred_cache = preferred_cache.asInstanceOf[js.Any], preferred_network = preferred_network.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudDiscoveryMetadata]
    }
    
    extension [Self <: CloudDiscoveryMetadata](x: Self) {
      
      inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
      
      inline def setPreferred_cache(value: String): Self = StObject.set(x, "preferred_cache", value.asInstanceOf[js.Any])
      
      inline def setPreferred_network(value: String): Self = StObject.set(x, "preferred_network", value.asInstanceOf[js.Any])
    }
  }
}
