package typings.bitcoinComputerLib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encrypted extends StObject {
  
  var __cypher: String
  
  var __secrets: js.Array[String]
}
object Encrypted {
  
  inline def apply(__cypher: String, __secrets: js.Array[String]): Encrypted = {
    val __obj = js.Dynamic.literal(__cypher = __cypher.asInstanceOf[js.Any], __secrets = __secrets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encrypted]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Encrypted] (val x: Self) extends AnyVal {
    
    inline def set__cypher(value: String): Self = StObject.set(x, "__cypher", value.asInstanceOf[js.Any])
    
    inline def set__secrets(value: js.Array[String]): Self = StObject.set(x, "__secrets", value.asInstanceOf[js.Any])
    
    inline def set__secretsVarargs(value: String*): Self = StObject.set(x, "__secrets", js.Array(value*))
  }
}
