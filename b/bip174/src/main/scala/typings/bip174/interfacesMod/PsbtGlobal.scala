package typings.bip174.interfacesMod

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
  
  @scala.inline
  def apply(unsignedTx: Transaction): PsbtGlobal = {
    val __obj = js.Dynamic.literal(unsignedTx = unsignedTx.asInstanceOf[js.Any])
    __obj.asInstanceOf[PsbtGlobal]
  }
  
  @scala.inline
  implicit class PsbtGlobalMutableBuilder[Self <: PsbtGlobal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnknownKeyVals(value: js.Array[KeyValue]): Self = StObject.set(x, "unknownKeyVals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownKeyValsUndefined: Self = StObject.set(x, "unknownKeyVals", js.undefined)
    
    @scala.inline
    def setUnknownKeyValsVarargs(value: KeyValue*): Self = StObject.set(x, "unknownKeyVals", js.Array(value :_*))
    
    @scala.inline
    def setUnsignedTx(value: Transaction): Self = StObject.set(x, "unsignedTx", value.asInstanceOf[js.Any])
  }
}
