package typings.cashaddrjs

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Hash extends StObject {
    
    var hash: Uint8Array
    
    var prefix: String
    
    var `type`: String
  }
  object Hash {
    
    inline def apply(hash: Uint8Array, prefix: String, `type`: String): Hash = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hash]
    }
    
    extension [Self <: Hash](x: Self) {
      
      inline def setHash(value: Uint8Array): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
