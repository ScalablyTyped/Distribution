package typings.datatablesDotNet.DataTablesNs

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
    val __obj = js.Dynamic.literal(_aData = _aData, _aSortData = _aSortData, _anHidden = _anHidden, _sRowStripe = _sRowStripe, nTr = nTr)
  
    __obj.asInstanceOf[RowLegacy]
  }
}

