package typings.bip174.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PsbtOutput extends PsbtOutputUpdate {
  
  var unknownKeyVals: js.UndefOr[js.Array[KeyValue]] = js.native
}
object PsbtOutput {
  
  @scala.inline
  def apply(): PsbtOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PsbtOutput]
  }
  
  @scala.inline
  implicit class PsbtOutputMutableBuilder[Self <: PsbtOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnknownKeyVals(value: js.Array[KeyValue]): Self = StObject.set(x, "unknownKeyVals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownKeyValsUndefined: Self = StObject.set(x, "unknownKeyVals", js.undefined)
    
    @scala.inline
    def setUnknownKeyValsVarargs(value: KeyValue*): Self = StObject.set(x, "unknownKeyVals", js.Array(value :_*))
  }
}
