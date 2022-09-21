package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


//#endregion "language-settings"
//#endregion "Settings"
//#region "SettingsLegacy"
type ArrayStringNode = StringDictionary[Node]

type CookieCallbackLegacy = js.Function5[
/* name */ String, 
/* data */ Any, 
/* expires */ String, 
/* path */ String, 
/* cookie */ String, 
Unit]

type FunctionAjax = js.Function3[
/* data */ js.Object, 
/* callback */ js.Function1[/* data */ Any, Unit], 
/* settings */ SettingsLegacy, 
Unit]

type FunctionAjaxData = js.Function2[/* data */ js.Object, /* settings */ Settings, String | js.Object]

type FunctionColumnCreatedCell = js.Function5[
/* cell */ Node, 
/* cellData */ Any, 
/* rowData */ Any, 
/* row */ Double, 
/* col */ Double, 
Unit]

type FunctionColumnRender = js.Function4[/* data */ Any, /* type */ Any, /* row */ Any, /* meta */ CellMetaSettings, Any]

//#endregion "other-settings"
//#region "callback-functions"
type FunctionCreateRow = js.Function4[
/* row */ Node, 
/* data */ js.Array[Any] | js.Object, 
/* dataIndex */ Double, 
/* cells */ js.Array[Node], 
Unit]

type FunctionDrawCallback = js.Function1[/* settings */ SettingsLegacy, Unit]

/**
  * @param data Data from the column cell to be analysed.
  * @param DataTables settings object.
  */
type FunctionExtTypeSettingsDetect = js.Function2[/* data */ Any, /* settings */ Settings, String | Null]

type FunctionFooterCallback = js.Function5[
/* tfoot */ Node, 
/* data */ js.Array[Any], 
/* start */ Double, 
/* end */ Double, 
/* display */ js.Array[Any], 
Unit]

type FunctionFormatNumber = js.Function1[/* formatNumber */ Double, Unit]

type FunctionHeaderCallback = js.Function5[
/* thead */ Node, 
/* data */ js.Array[Any], 
/* start */ Double, 
/* end */ Double, 
/* display */ js.Array[Any], 
Unit]

type FunctionInfoCallback = js.Function6[
/* settings */ SettingsLegacy, 
/* start */ Double, 
/* end */ Double, 
/* mnax */ Double, 
/* total */ Double, 
/* pre */ String, 
Unit]

type FunctionInitComplete = js.Function2[/* settings */ SettingsLegacy, /* json */ js.Object, Unit]

type FunctionPreDrawCallback = js.Function1[/* settings */ SettingsLegacy, Unit]

type FunctionRowCallback = js.Function3[/* row */ Node, /* data */ js.Array[Any] | js.Object, /* index */ Double, Unit]

type FunctionStateLoadCallback = js.Function1[/* settings */ SettingsLegacy, Unit]

type FunctionStateLoadParams = js.Function2[/* settings */ SettingsLegacy, /* data */ js.Object, Unit]

type FunctionStateLoaded = js.Function2[/* settings */ SettingsLegacy, /* data */ js.Object, Unit]

type FunctionStateSaveCallback = js.Function2[/* settings */ SettingsLegacy, /* data */ js.Object, Unit]

type FunctionStateSaveParams = js.Function2[/* settings */ SettingsLegacy, /* data */ js.Object, Unit]

type FunctionThrottle = js.Function1[/* data */ Any, Unit]
