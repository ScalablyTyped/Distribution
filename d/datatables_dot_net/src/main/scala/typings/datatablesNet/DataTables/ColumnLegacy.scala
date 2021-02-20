package typings.datatablesNet.DataTables

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnLegacy extends StObject {
  
  var _bAutoType: Boolean = js.native
  
  var aDataSort: js.Any = js.native
  
  var asSorting: js.Array[String] = js.native
  
  var bSearchable: Boolean = js.native
  
  var bSortable: Boolean = js.native
  
  var bVisible: Boolean = js.native
  
  def fnCreatedCell(cell: Node, cellData: js.Any, rowData: js.Any, row: Double, col: Double): Unit = js.native
  @JSName("fnCreatedCell")
  var fnCreatedCell_Original: FunctionColumnCreatedCell = js.native
  
  def fnGetData(data: js.Any, specific: String): js.Any = js.native
  
  def fnSetData(data: js.Any, value: js.Any): Unit = js.native
  
  var idx: Double = js.native
  
  var mData: js.Any = js.native
  
  var mRender: js.Any = js.native
  
  var nIf: Node = js.native
  
  var nTh: Node = js.native
  
  var sClass: String = js.native
  
  var sContentPadding: String = js.native
  
  var sDefaultContent: String = js.native
  
  var sName: String = js.native
  
  var sSortDataType: String = js.native
  
  var sSortingClass: String = js.native
  
  var sSortingClassJUI: String = js.native
  
  var sTitle: String = js.native
  
  var sType: String = js.native
  
  var sWidth: String = js.native
  
  var sWidthOrig: String = js.native
}
