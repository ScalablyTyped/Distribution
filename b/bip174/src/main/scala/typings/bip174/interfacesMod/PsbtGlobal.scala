package typings.bip174.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PsbtGlobal extends PsbtGlobalUpdate {
  
  var unknownKeyVals: js.UndefOr[js.Array[KeyValue]] = js.native
  
  var unsignedTx: Transaction = js.native
}
object PsbtGlobal {
  
  @scala.inline
  def apply(unsignedTx: Transaction): PsbtGlobal = {
    val __obj = js.Dynamic.literal(unsignedTx = unsignedTx.asInstanceOf[js.Any])
    __obj.asInstanceOf[PsbtGlobal]
  }
  
  @scala.inline
  implicit class PsbtGlobalOps[Self <: PsbtGlobal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUnsignedTx(value: Transaction): Self = this.set("unsignedTx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownKeyValsVarargs(value: KeyValue*): Self = this.set("unknownKeyVals", js.Array(value :_*))
    
    @scala.inline
    def setUnknownKeyVals(value: js.Array[KeyValue]): Self = this.set("unknownKeyVals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnknownKeyVals: Self = this.set("unknownKeyVals", js.undefined)
  }
}
