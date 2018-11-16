package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnLegacy extends js.Object {
  var _bAutoType: scala.Boolean = js.native
  var aDataSort: js.Any = js.native
  var asSorting: js.Array[java.lang.String] = js.native
  var bSearchable: scala.Boolean = js.native
  var bSortable: scala.Boolean = js.native
  var bVisible: scala.Boolean = js.native
  @JSName("fnCreatedCell")
  var fnCreatedCell_Original: FunctionColumnCreatedCell = js.native
  var idx: scala.Double = js.native
  var mData: js.Any = js.native
  var mRender: js.Any = js.native
  var nIf: stdLib.Node = js.native
  var nTh: stdLib.Node = js.native
  var sClass: java.lang.String = js.native
  var sContentPadding: java.lang.String = js.native
  var sDefaultContent: java.lang.String = js.native
  var sName: java.lang.String = js.native
  var sSortDataType: java.lang.String = js.native
  var sSortingClass: java.lang.String = js.native
  var sSortingClassJUI: java.lang.String = js.native
  var sTitle: java.lang.String = js.native
  var sType: java.lang.String = js.native
  var sWidth: java.lang.String = js.native
  var sWidthOrig: java.lang.String = js.native
  def fnCreatedCell(cell: stdLib.Node, cellData: js.Any, rowData: js.Any, row: scala.Double, col: scala.Double): scala.Unit = js.native
  def fnGetData(data: js.Any, specific: java.lang.String): js.Any = js.native
  def fnSetData(data: js.Any, value: js.Any): scala.Unit = js.native
}

