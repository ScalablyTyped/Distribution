package typings.datatablesNet.DataTables

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnLegacy extends StObject {
  
  var _bAutoType: Boolean
  
  var aDataSort: Any
  
  var asSorting: js.Array[String]
  
  var bSearchable: Boolean
  
  var bSortable: Boolean
  
  var bVisible: Boolean
  
  def fnCreatedCell(cell: Node, cellData: Any, rowData: Any, row: Double, col: Double): Unit
  @JSName("fnCreatedCell")
  var fnCreatedCell_Original: FunctionColumnCreatedCell
  
  def fnGetData(data: Any, specific: String): Any
  
  def fnSetData(data: Any, value: Any): Unit
  
  var idx: Double
  
  var mData: Any
  
  var mRender: Any
  
  var nIf: Node
  
  var nTh: Node
  
  var sClass: String
  
  var sContentPadding: String
  
  var sDefaultContent: String
  
  var sName: String
  
  var sSortDataType: String
  
  var sSortingClass: String
  
  var sSortingClassJUI: String
  
  var sTitle: String
  
  var sType: String
  
  var sWidth: String
  
  var sWidthOrig: String
}
object ColumnLegacy {
  
  inline def apply(
    _bAutoType: Boolean,
    aDataSort: Any,
    asSorting: js.Array[String],
    bSearchable: Boolean,
    bSortable: Boolean,
    bVisible: Boolean,
    fnCreatedCell: (/* cell */ Node, /* cellData */ Any, /* rowData */ Any, /* row */ Double, /* col */ Double) => Unit,
    fnGetData: (Any, String) => Any,
    fnSetData: (Any, Any) => Unit,
    idx: Double,
    mData: Any,
    mRender: Any,
    nIf: Node,
    nTh: Node,
    sClass: String,
    sContentPadding: String,
    sDefaultContent: String,
    sName: String,
    sSortDataType: String,
    sSortingClass: String,
    sSortingClassJUI: String,
    sTitle: String,
    sType: String,
    sWidth: String,
    sWidthOrig: String
  ): ColumnLegacy = {
    val __obj = js.Dynamic.literal(_bAutoType = _bAutoType.asInstanceOf[js.Any], aDataSort = aDataSort.asInstanceOf[js.Any], asSorting = asSorting.asInstanceOf[js.Any], bSearchable = bSearchable.asInstanceOf[js.Any], bSortable = bSortable.asInstanceOf[js.Any], bVisible = bVisible.asInstanceOf[js.Any], fnCreatedCell = js.Any.fromFunction5(fnCreatedCell), fnGetData = js.Any.fromFunction2(fnGetData), fnSetData = js.Any.fromFunction2(fnSetData), idx = idx.asInstanceOf[js.Any], mData = mData.asInstanceOf[js.Any], mRender = mRender.asInstanceOf[js.Any], nIf = nIf.asInstanceOf[js.Any], nTh = nTh.asInstanceOf[js.Any], sClass = sClass.asInstanceOf[js.Any], sContentPadding = sContentPadding.asInstanceOf[js.Any], sDefaultContent = sDefaultContent.asInstanceOf[js.Any], sName = sName.asInstanceOf[js.Any], sSortDataType = sSortDataType.asInstanceOf[js.Any], sSortingClass = sSortingClass.asInstanceOf[js.Any], sSortingClassJUI = sSortingClassJUI.asInstanceOf[js.Any], sTitle = sTitle.asInstanceOf[js.Any], sType = sType.asInstanceOf[js.Any], sWidth = sWidth.asInstanceOf[js.Any], sWidthOrig = sWidthOrig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnLegacy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnLegacy] (val x: Self) extends AnyVal {
    
    inline def setADataSort(value: Any): Self = StObject.set(x, "aDataSort", value.asInstanceOf[js.Any])
    
    inline def setAsSorting(value: js.Array[String]): Self = StObject.set(x, "asSorting", value.asInstanceOf[js.Any])
    
    inline def setAsSortingVarargs(value: String*): Self = StObject.set(x, "asSorting", js.Array(value*))
    
    inline def setBSearchable(value: Boolean): Self = StObject.set(x, "bSearchable", value.asInstanceOf[js.Any])
    
    inline def setBSortable(value: Boolean): Self = StObject.set(x, "bSortable", value.asInstanceOf[js.Any])
    
    inline def setBVisible(value: Boolean): Self = StObject.set(x, "bVisible", value.asInstanceOf[js.Any])
    
    inline def setFnCreatedCell(
      value: (/* cell */ Node, /* cellData */ Any, /* rowData */ Any, /* row */ Double, /* col */ Double) => Unit
    ): Self = StObject.set(x, "fnCreatedCell", js.Any.fromFunction5(value))
    
    inline def setFnGetData(value: (Any, String) => Any): Self = StObject.set(x, "fnGetData", js.Any.fromFunction2(value))
    
    inline def setFnSetData(value: (Any, Any) => Unit): Self = StObject.set(x, "fnSetData", js.Any.fromFunction2(value))
    
    inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    inline def setMData(value: Any): Self = StObject.set(x, "mData", value.asInstanceOf[js.Any])
    
    inline def setMRender(value: Any): Self = StObject.set(x, "mRender", value.asInstanceOf[js.Any])
    
    inline def setNIf(value: Node): Self = StObject.set(x, "nIf", value.asInstanceOf[js.Any])
    
    inline def setNTh(value: Node): Self = StObject.set(x, "nTh", value.asInstanceOf[js.Any])
    
    inline def setSClass(value: String): Self = StObject.set(x, "sClass", value.asInstanceOf[js.Any])
    
    inline def setSContentPadding(value: String): Self = StObject.set(x, "sContentPadding", value.asInstanceOf[js.Any])
    
    inline def setSDefaultContent(value: String): Self = StObject.set(x, "sDefaultContent", value.asInstanceOf[js.Any])
    
    inline def setSName(value: String): Self = StObject.set(x, "sName", value.asInstanceOf[js.Any])
    
    inline def setSSortDataType(value: String): Self = StObject.set(x, "sSortDataType", value.asInstanceOf[js.Any])
    
    inline def setSSortingClass(value: String): Self = StObject.set(x, "sSortingClass", value.asInstanceOf[js.Any])
    
    inline def setSSortingClassJUI(value: String): Self = StObject.set(x, "sSortingClassJUI", value.asInstanceOf[js.Any])
    
    inline def setSTitle(value: String): Self = StObject.set(x, "sTitle", value.asInstanceOf[js.Any])
    
    inline def setSType(value: String): Self = StObject.set(x, "sType", value.asInstanceOf[js.Any])
    
    inline def setSWidth(value: String): Self = StObject.set(x, "sWidth", value.asInstanceOf[js.Any])
    
    inline def setSWidthOrig(value: String): Self = StObject.set(x, "sWidthOrig", value.asInstanceOf[js.Any])
    
    inline def set_bAutoType(value: Boolean): Self = StObject.set(x, "_bAutoType", value.asInstanceOf[js.Any])
  }
}
