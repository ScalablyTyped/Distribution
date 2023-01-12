package typings.azureMsalCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aliases extends StObject {
  
  var aliases: js.Array[String]
  
  var preferred_cache: String
  
  var preferred_network: String
}
object Aliases {
  
  inline def apply(aliases: js.Array[String], preferred_cache: String, preferred_network: String): Aliases = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], preferred_cache = preferred_cache.asInstanceOf[js.Any], preferred_network = preferred_network.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aliases]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Aliases] (val x: Self) extends AnyVal {
    
    inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setPreferred_cache(value: String): Self = StObject.set(x, "preferred_cache", value.asInstanceOf[js.Any])
    
    inline def setPreferred_network(value: String): Self = StObject.set(x, "preferred_network", value.asInstanceOf[js.Any])
  }
}
