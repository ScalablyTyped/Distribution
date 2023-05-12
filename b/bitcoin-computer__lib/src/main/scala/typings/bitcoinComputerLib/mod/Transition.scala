package typings.bitcoinComputerLib.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transition
  extends StObject
     with Encrypted {
  
  var env: StringDictionary[String]
  
  var exp: String
  
  var mod: String
  
  var root: String
}
object Transition {
  
  inline def apply(
    __cypher: String,
    __secrets: js.Array[String],
    env: StringDictionary[String],
    exp: String,
    mod: String,
    root: String
  ): Transition = {
    val __obj = js.Dynamic.literal(__cypher = __cypher.asInstanceOf[js.Any], __secrets = __secrets.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transition] (val x: Self) extends AnyVal {
    
    inline def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setExp(value: String): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    inline def setMod(value: String): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
