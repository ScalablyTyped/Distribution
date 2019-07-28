package typings.datatablesDotNet

import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DataTablesNs {
  //#endregion "language-settings"
  //#endregion "Settings"
  //#region "SettingsLegacy"
  type ArrayStringNode = StringDictionary[Node]
  type CookieCallbackLegacy = js.Function5[
    /* name */ String, 
    /* data */ js.Any, 
    /* expires */ String, 
    /* path */ String, 
    /* cookie */ String, 
    Unit
  ]
  type FunctionAjax = js.Function3[
    /* data */ js.Object, 
    /* callback */ js.Function1[/* data */ js.Any, Unit], 
    /* settings */ SettingsLegacy, 
    Unit
  ]
  type FunctionAjaxData = js.Function2[/* data */ js.Object, /* settings */ Settings, String | js.Object]
  type FunctionColumnCreatedCell = js.Function5[
    /* cell */ Node, 
    /* cellData */ js.Any, 
    /* rowData */ js.Any, 
    /* row */ Double, 
    /* col */ Double, 
    Unit
  ]
  type FunctionColumnRender = js.Function4[
    /* data */ js.Any, 
    /* type */ js.Any, 
    /* row */ js.Any, 
    /* meta */ CellMetaSettings, 
    js.Any
  ]
  //#endregion "other-settings"
  //#region "callback-functions"
  type FunctionCreateRow = js.Function3[/* row */ Node, /* data */ js.Array[js.Any] | js.Object, /* dataIndex */ Double, Unit]
  type FunctionDrawCallback = js.Function1[/* settings */ SettingsLegacy, Unit]
  /**
    * @param data Data from the column cell to be analysed.
    * @param DataTables settings object.
    */
  type FunctionExtTypeSettingsDetect = js.Function2[/* data */ js.Any, /* settings */ Settings, String | Null]
  type FunctionFooterCallback = js.Function5[
    /* tfoot */ Node, 
    /* data */ js.Array[js.Any], 
    /* start */ Double, 
    /* end */ Double, 
    /* display */ js.Array[js.Any], 
    Unit
  ]
  type FunctionFormatNumber = js.Function1[/* formatNumber */ Double, Unit]
  type FunctionHeaderCallback = js.Function5[
    /* thead */ Node, 
    /* data */ js.Array[js.Any], 
    /* start */ Double, 
    /* end */ Double, 
    /* display */ js.Array[js.Any], 
    Unit
  ]
  type FunctionInfoCallback = js.Function6[
    /* settings */ SettingsLegacy, 
    /* start */ Double, 
    /* end */ Double, 
    /* mnax */ Double, 
    /* total */ Double, 
    /* pre */ String, 
    Unit
  ]
  type FunctionInitComplete = js.Function2[/* settings */ SettingsLegacy, /* json */ js.Object, Unit]
  type FunctionPreDrawCallback = js.Function1[/* settings */ SettingsLegacy, Unit]
  type FunctionRowCallback = js.Function3[/* row */ Node, /* data */ js.Array[js.Any] | js.Object, /* index */ Double, Unit]
  type FunctionStateLoadCallback = js.Function1[/* settings */ SettingsLegacy, Unit]
  type FunctionStateLoadParams = js.Function2[/* settings */ SettingsLegacy, /* data */ js.Object, Unit]
  type FunctionStateLoaded = js.Function2[/* settings */ SettingsLegacy, /* data */ js.Object, Unit]
  type FunctionStateSaveCallback = js.Function2[/* settings */ SettingsLegacy, /* data */ js.Object, Unit]
  type FunctionStateSaveParams = js.Function2[/* settings */ SettingsLegacy, /* data */ js.Object, Unit]
  type FunctionThrottle = js.Function1[/* data */ js.Any, Unit]
}
