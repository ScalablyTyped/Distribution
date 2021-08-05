package typings.datatablesNet.DataTables

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowLegacy extends StObject {
  
  var _aData: js.Any
  
  var _aSortData: js.Array[js.Any]
  
  var _anHidden: js.Array[Node]
  
  var _sRowStripe: String
  
  var nTr: Node
}
object RowLegacy {
  
  inline def apply(
    _aData: js.Any,
    _aSortData: js.Array[js.Any],
    _anHidden: js.Array[Node],
    _sRowStripe: String,
    nTr: Node
  ): RowLegacy = {
    val __obj = js.Dynamic.literal(_aData = _aData.asInstanceOf[js.Any], _aSortData = _aSortData.asInstanceOf[js.Any], _anHidden = _anHidden.asInstanceOf[js.Any], _sRowStripe = _sRowStripe.asInstanceOf[js.Any], nTr = nTr.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowLegacy]
  }
  
  extension [Self <: RowLegacy](x: Self) {
    
    inline def setNTr(value: Node): Self = StObject.set(x, "nTr", value.asInstanceOf[js.Any])
    
    inline def set_aData(value: js.Any): Self = StObject.set(x, "_aData", value.asInstanceOf[js.Any])
    
    inline def set_aSortData(value: js.Array[js.Any]): Self = StObject.set(x, "_aSortData", value.asInstanceOf[js.Any])
    
    inline def set_aSortDataVarargs(value: js.Any*): Self = StObject.set(x, "_aSortData", js.Array(value :_*))
    
    inline def set_anHidden(value: js.Array[Node]): Self = StObject.set(x, "_anHidden", value.asInstanceOf[js.Any])
    
    inline def set_anHiddenVarargs(value: Node*): Self = StObject.set(x, "_anHidden", js.Array(value :_*))
    
    inline def set_sRowStripe(value: String): Self = StObject.set(x, "_sRowStripe", value.asInstanceOf[js.Any])
  }
}
