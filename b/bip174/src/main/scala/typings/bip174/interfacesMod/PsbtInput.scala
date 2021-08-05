package typings.bip174.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PsbtInput
  extends StObject
     with PsbtInputUpdate {
  
  var unknownKeyVals: js.UndefOr[js.Array[KeyValue]] = js.undefined
}
object PsbtInput {
  
  inline def apply(): PsbtInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PsbtInput]
  }
  
  extension [Self <: PsbtInput](x: Self) {
    
    inline def setUnknownKeyVals(value: js.Array[KeyValue]): Self = StObject.set(x, "unknownKeyVals", value.asInstanceOf[js.Any])
    
    inline def setUnknownKeyValsUndefined: Self = StObject.set(x, "unknownKeyVals", js.undefined)
    
    inline def setUnknownKeyValsVarargs(value: KeyValue*): Self = StObject.set(x, "unknownKeyVals", js.Array(value :_*))
  }
}
