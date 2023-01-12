package typings.bip174.srcLibInterfacesMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PsbtInput] (val x: Self) extends AnyVal {
    
    inline def setUnknownKeyVals(value: js.Array[KeyValue]): Self = StObject.set(x, "unknownKeyVals", value.asInstanceOf[js.Any])
    
    inline def setUnknownKeyValsUndefined: Self = StObject.set(x, "unknownKeyVals", js.undefined)
    
    inline def setUnknownKeyValsVarargs(value: KeyValue*): Self = StObject.set(x, "unknownKeyVals", js.Array(value*))
  }
}
