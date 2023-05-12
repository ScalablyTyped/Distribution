package typings.bitcoinComputerLib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  include :std.Array<string>,   exclude :std.Array<string>}> */
trait SelectUtxos extends StObject {
  
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  
  var include: js.UndefOr[js.Array[String]] = js.undefined
}
object SelectUtxos {
  
  inline def apply(): SelectUtxos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectUtxos]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectUtxos] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
  }
}
