package typings.bitcoinComputerLib.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bitcoin-computer/lib.@bitcoin-computer/lib.ProgramMetaData & @bitcoin-computer/lib.@bitcoin-computer/lib.Transition & @bitcoin-computer/lib.@bitcoin-computer/lib.JObject */
trait Data
  extends StObject
     with /* x */ StringDictionary[Json] {
  
  var __cypher: String
  
  var __secrets: js.Array[String]
  
  var _amount: js.UndefOr[Double] = js.undefined
  
  var _owners: js.UndefOr[js.Array[String]] = js.undefined
  
  var _readers: js.UndefOr[js.Array[String]] = js.undefined
  
  var _url: js.UndefOr[String] = js.undefined
  
  var env: StringDictionary[String]
  
  var exp: String
  
  var mod: String
  
  var root: String
}
object Data {
  
  inline def apply(
    __cypher: String,
    __secrets: js.Array[String],
    env: StringDictionary[String],
    exp: String,
    mod: String,
    root: String
  ): Data = {
    val __obj = js.Dynamic.literal(__cypher = __cypher.asInstanceOf[js.Any], __secrets = __secrets.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    inline def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setExp(value: String): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    inline def setMod(value: String): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def set__cypher(value: String): Self = StObject.set(x, "__cypher", value.asInstanceOf[js.Any])
    
    inline def set__secrets(value: js.Array[String]): Self = StObject.set(x, "__secrets", value.asInstanceOf[js.Any])
    
    inline def set__secretsVarargs(value: String*): Self = StObject.set(x, "__secrets", js.Array(value*))
    
    inline def set_amount(value: Double): Self = StObject.set(x, "_amount", value.asInstanceOf[js.Any])
    
    inline def set_amountUndefined: Self = StObject.set(x, "_amount", js.undefined)
    
    inline def set_owners(value: js.Array[String]): Self = StObject.set(x, "_owners", value.asInstanceOf[js.Any])
    
    inline def set_ownersUndefined: Self = StObject.set(x, "_owners", js.undefined)
    
    inline def set_ownersVarargs(value: String*): Self = StObject.set(x, "_owners", js.Array(value*))
    
    inline def set_readers(value: js.Array[String]): Self = StObject.set(x, "_readers", value.asInstanceOf[js.Any])
    
    inline def set_readersUndefined: Self = StObject.set(x, "_readers", js.undefined)
    
    inline def set_readersVarargs(value: String*): Self = StObject.set(x, "_readers", js.Array(value*))
    
    inline def set_url(value: String): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}
