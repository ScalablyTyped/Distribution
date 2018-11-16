package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsLegacy extends js.Object {
  var _iDisplayEnd: scala.Double = js.native
  var _iDisplayLength: scala.Double = js.native
  var _iDisplayStart: scala.Double = js.native
  var _iRecordsDisplay: scala.Double = js.native
  var _iRecordsTotal: scala.Double = js.native
  var aIds: js.Any = js.native
  var aLengthMenu: js.Array[_] = js.native
  var aaSorting: js.Array[js.Array[_]] = js.native
  var aaSortingFixed: js.Array[js.Array[_]] = js.native
  var aanFeatures: js.Array[js.Array[ArrayStringNode]] = js.native
  var aiDisplay: js.Array[scala.Double] = js.native
  var aiDisplayMaster: js.Array[scala.Double] = js.native
  var ajax: js.Any = js.native
  var aoColumns: js.Array[ColumnLegacy] = js.native
  var aoData: js.Array[RowLegacy] = js.native
  var aoDestroyCallback: js.Array[_] = js.native
  var aoDrawCallback: js.Array[FunctionDrawCallback] = js.native
  var aoFooter: js.Array[_] = js.native
  var aoFooterCallback: js.Array[FunctionFooterCallback] = js.native
  var aoHeader: js.Array[_] = js.native
  var aoHeaderCallback: js.Array[FunctionHeaderCallback] = js.native
  var aoInitComplete: js.Array[FunctionInitComplete] = js.native
  var aoOpenRows: js.Array[_] = js.native
  var aoPreDrawCallback: js.Array[FunctionPreDrawCallback] = js.native
  var aoPreSearchCols: js.Array[_] = js.native
  var aoRowCallback: js.Array[FunctionRowCallback] = js.native
  var aoRowCreatedCallback: js.Array[FunctionCreateRow] = js.native
  var aoServerParams: js.Array[_] = js.native
  var aoStateLoad: js.Array[FunctionStateLoadCallback] = js.native
  var aoStateLoadParams: js.Array[FunctionStateLoadParams] = js.native
  var aoStateLoaded: js.Array[FunctionStateLoaded] = js.native
  var aoStateSave: js.Array[FunctionStateSaveCallback] = js.native
  var aoStateSaveParams: js.Array[FunctionStateSaveParams] = js.native
  var asDataSearch: js.Array[java.lang.String] = js.native
  var asDestroyStripes: js.Array[java.lang.String] = js.native
  var asStripeClasses: js.Array[java.lang.String] = js.native
  var bAjaxDataGet: scala.Boolean = js.native
  var bDeferLoading: scala.Boolean = js.native
  var bDrawing: scala.Boolean = js.native
  var bFiltered: scala.Boolean = js.native
  var bInitialized: scala.Boolean = js.native
  var bJUI: scala.Boolean = js.native
  var bSortCellsTop: scala.Boolean = js.native
  var bSorted: scala.Boolean = js.native
  @JSName("fnCookieCallback")
  var fnCookieCallback_Original: CookieCallbackLegacy = js.native
  @JSName("fnFormatNumber")
  var fnFormatNumber_Original: FunctionFormatNumber = js.native
  var fnServerData: js.Any = js.native
  var iCookieDuration: scala.Double = js.native
  var iDraw: scala.Double = js.native
  var iDrawError: scala.Double = js.native
  var iTabIndex: scala.Double = js.native
  var jqXHR: js.Any = js.native
  var nScrollFoot: stdLib.Node = js.native
  var nScrollHead: stdLib.Node = js.native
  var nTBody: stdLib.Node = js.native
  var nTFoot: stdLib.Node = js.native
  var nTHead: stdLib.Node = js.native
  var nTable: stdLib.Node = js.native
  var nTableWrapper: stdLib.Node = js.native
  var oApi: js.Any = js.native
   // | { fnInfoCallback: FunctionInfoCallback; };
  var oBrowser: BrowserLegacy = js.native
  var oClasses: js.Any = js.native
  var oFeatures: FeaturesLegacy = js.native
  var oInit: js.Any = js.native
  var oInstance: js.Any = js.native
  var oLanguage: LanguageLegacy = js.native
  var oLoadedState: js.Any = js.native
  var oPreviousSearch: js.Any = js.native
  var oScroll: ScrollingLegacy = js.native
  var sAjaxDataProp: java.lang.String = js.native
  var sAjaxSource: java.lang.String = js.native
  var sCookiePrefix: java.lang.String = js.native
  var sDestroyWidth: scala.Double = js.native
  var sDom: java.lang.String = js.native
  var sInstance: java.lang.String = js.native
  var sPaginationType: java.lang.String = js.native
  var sServerMethod: java.lang.String = js.native
  var sTableId: java.lang.String = js.native
  def fnCookieCallback(
    name: java.lang.String,
    data: js.Any,
    expires: java.lang.String,
    path: java.lang.String,
    cookie: java.lang.String
  ): scala.Unit = js.native
  def fnDisplayEnd(): scala.Double = js.native
  def fnFormatNumber(formatNumber: scala.Double): scala.Unit = js.native
  def fnRecordsDisplay(): scala.Double = js.native
  def fnRecordsTotal(): scala.Double = js.native
  def rowIdFn(mSource: java.lang.String): js.Function0[scala.Unit] = js.native
  def rowIdFn(mSource: js.Function0[scala.Unit]): js.Function0[scala.Unit] = js.native
  def rowIdFn(mSource: scala.Double): js.Function0[scala.Unit] = js.native
}

