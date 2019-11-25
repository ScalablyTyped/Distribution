package typings.datatablesDotNet.DataTables

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowLegacy extends js.Object {
  var _aData: js.Any
  var _aSortData: js.Array[_]
  var _anHidden: js.Array[Node]
  var _sRowStripe: String
  var nTr: Node
}

object RowLegacy {
  @scala.inline
  def apply(_aData: js.Any, _aSortData: js.Array[_], _anHidden: js.Array[Node], _sRowStripe: String, nTr: Node): RowLegacy = {
    val __obj = js.Dynamic.literal(_aData = _aData.asInstanceOf[js.Any], _aSortData = _aSortData.asInstanceOf[js.Any], _anHidden = _anHidden.asInstanceOf[js.Any], _sRowStripe = _sRowStripe.asInstanceOf[js.Any], nTr = nTr.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RowLegacy]
  }
}

