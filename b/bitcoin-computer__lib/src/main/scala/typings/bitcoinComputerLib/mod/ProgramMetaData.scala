package typings.bitcoinComputerLib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@bitcoin-computer/lib.@bitcoin-computer/lib.JObject & {  _amount :number,   _owners :std.Array<string>,   _readers :std.Array<string> | undefined,   _url :string | undefined}> */
trait ProgramMetaData extends StObject {
  
  var _amount: js.UndefOr[Double] = js.undefined
  
  var _owners: js.UndefOr[js.Array[String]] = js.undefined
  
  var _readers: js.UndefOr[js.Array[String]] = js.undefined
  
  var _url: js.UndefOr[String] = js.undefined
}
object ProgramMetaData {
  
  inline def apply(): ProgramMetaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgramMetaData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProgramMetaData] (val x: Self) extends AnyVal {
    
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
