package typings.datatablesNetButtons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DataTables {
  type ButtonSelectorTypes = java.lang.String | scala.Double | typings.datatablesNet.JQuery
  /**
    * A function that will be executed upon creation of the buttons.
    */
  type FunctionButtom = js.Function1[
    /* dt */ typings.datatablesNetButtons.DataTables.Api, 
    typings.datatablesNetButtons.DataTables.ButtomSettingsCommon
  ]
  type FunctionButtonAction = js.Function4[
    /* e */ js.Any, 
    /* dt */ typings.datatablesNetButtons.DataTables.Api, 
    /* node */ typings.datatablesNet.JQuery, 
    /* config */ typings.datatablesNetButtons.DataTables.ButtonSettings, 
    scala.Unit
  ]
  type FunctionButtonAvailable = js.Function2[
    /* dt */ typings.datatablesNetButtons.DataTables.Api, 
    /* config */ js.Any, 
    scala.Boolean
  ]
  type FunctionButtonColvisColumnText = js.Function3[
    /* dt */ typings.datatablesNetButtons.DataTables.Api, 
    /* i */ scala.Double, 
    /* title */ java.lang.String, 
    java.lang.String
  ]
  type FunctionButtonCustomize = js.Function1[/* win */ typings.std.Window_ | java.lang.String, scala.Unit]
  type FunctionButtonCustomizeData = js.Function1[/* content */ js.Any, scala.Unit]
  type FunctionButtonInit = js.Function3[
    /* dt */ typings.datatablesNetButtons.DataTables.Api, 
    /* node */ typings.datatablesNet.JQuery, 
    /* config */ js.Any, 
    scala.Unit
  ]
  type FunctionButtonText = js.Function3[
    /* dt */ typings.datatablesNetButtons.DataTables.Api, 
    /* node */ typings.datatablesNet.JQuery, 
    /* config */ js.Any, 
    java.lang.String
  ]
  type FunctionExtButtonsCollectionText = js.Function1[/* a */ js.Any, java.lang.String]
}
