package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowLegacy extends js.Object {
  var _aData: js.Any
  var _aSortData: js.Array[_]
  var _anHidden: js.Array[stdLib.Node]
  var _sRowStripe: java.lang.String
  var nTr: stdLib.Node
}

object RowLegacy {
  @scala.inline
  def apply(
    _aData: js.Any,
    _aSortData: js.Array[_],
    _anHidden: js.Array[stdLib.Node],
    _sRowStripe: java.lang.String,
    nTr: stdLib.Node
  ): RowLegacy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_aData")(_aData)
    __obj.updateDynamic("_aSortData")(_aSortData)
    __obj.updateDynamic("_anHidden")(_anHidden)
    __obj.updateDynamic("_sRowStripe")(_sRowStripe)
    __obj.updateDynamic("nTr")(nTr)
    __obj.asInstanceOf[RowLegacy]
  }
}

