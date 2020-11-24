package typings.datatablesNet.DataTables

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowLegacy extends js.Object {
  
  var _aData: js.Any = js.native
  
  var _aSortData: js.Array[_] = js.native
  
  var _anHidden: js.Array[Node] = js.native
  
  var _sRowStripe: String = js.native
  
  var nTr: Node = js.native
}
object RowLegacy {
  
  @scala.inline
  def apply(_aData: js.Any, _aSortData: js.Array[_], _anHidden: js.Array[Node], _sRowStripe: String, nTr: Node): RowLegacy = {
    val __obj = js.Dynamic.literal(_aData = _aData.asInstanceOf[js.Any], _aSortData = _aSortData.asInstanceOf[js.Any], _anHidden = _anHidden.asInstanceOf[js.Any], _sRowStripe = _sRowStripe.asInstanceOf[js.Any], nTr = nTr.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowLegacy]
  }
  
  @scala.inline
  implicit class RowLegacyOps[Self <: RowLegacy] (val x: Self) extends AnyVal {
    
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
    def set_aData(value: js.Any): Self = this.set("_aData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_aSortDataVarargs(value: js.Any*): Self = this.set("_aSortData", js.Array(value :_*))
    
    @scala.inline
    def set_aSortData(value: js.Array[_]): Self = this.set("_aSortData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_anHiddenVarargs(value: Node*): Self = this.set("_anHidden", js.Array(value :_*))
    
    @scala.inline
    def set_anHidden(value: js.Array[Node]): Self = this.set("_anHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sRowStripe(value: String): Self = this.set("_sRowStripe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNTr(value: Node): Self = this.set("nTr", value.asInstanceOf[js.Any])
  }
}
