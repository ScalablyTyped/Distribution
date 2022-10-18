package typings.bip174.srcLibInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PsbtGlobal
  extends StObject
     with PsbtGlobalUpdate {
  
  var unknownKeyVals: js.UndefOr[js.Array[KeyValue]] = js.undefined
  
  var unsignedTx: Transaction
}
object PsbtGlobal {
  
  inline def apply(unsignedTx: Transaction): PsbtGlobal = {
    val __obj = js.Dynamic.literal(unsignedTx = unsignedTx.asInstanceOf[js.Any])
    __obj.asInstanceOf[PsbtGlobal]
  }
  
  extension [Self <: PsbtGlobal](x: Self) {
    
    inline def setUnknownKeyVals(value: js.Array[KeyValue]): Self = StObject.set(x, "unknownKeyVals", value.asInstanceOf[js.Any])
    
    inline def setUnknownKeyValsUndefined: Self = StObject.set(x, "unknownKeyVals", js.undefined)
    
    inline def setUnknownKeyValsVarargs(value: KeyValue*): Self = StObject.set(x, "unknownKeyVals", js.Array(value*))
    
    inline def setUnsignedTx(value: Transaction): Self = StObject.set(x, "unsignedTx", value.asInstanceOf[js.Any])
  }
}
