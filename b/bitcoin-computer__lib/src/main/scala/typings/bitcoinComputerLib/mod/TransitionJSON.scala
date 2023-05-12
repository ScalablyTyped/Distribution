package typings.bitcoinComputerLib.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionJSON extends StObject {
  
  var env: StringDictionary[String]
  
  var exp: String
  
  var mod: String
}
object TransitionJSON {
  
  inline def apply(env: StringDictionary[String], exp: String, mod: String): TransitionJSON = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionJSON]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitionJSON] (val x: Self) extends AnyVal {
    
    inline def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setExp(value: String): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    inline def setMod(value: String): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
  }
}
