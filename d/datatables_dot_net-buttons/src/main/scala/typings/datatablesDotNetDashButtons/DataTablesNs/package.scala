package typings.datatablesDotNetDashButtons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DataTablesNs {
  import typings.datatablesDotNet.JQuery
  import typings.std.Window

  type ButtonSelectorTypes = String | Double | JQuery
  /**
    * A function that will be executed upon creation of the buttons.
    */
  type FunctionButtom = js.Function1[/* dt */ Api, ButtomSettingsCommon]
  type FunctionButtonAction = js.Function4[/* e */ js.Any, /* dt */ Api, /* node */ JQuery, /* config */ ButtonSettings, Unit]
  type FunctionButtonAvailable = js.Function2[/* dt */ Api, /* config */ js.Any, Boolean]
  type FunctionButtonColvisColumnText = js.Function3[/* dt */ Api, /* i */ Double, /* title */ String, String]
  type FunctionButtonCustomize = js.Function1[/* win */ Window | String, Unit]
  type FunctionButtonCustomizeData = js.Function1[/* content */ js.Any, Unit]
  type FunctionButtonInit = js.Function3[/* dt */ Api, /* node */ JQuery, /* config */ js.Any, Unit]
  type FunctionButtonText = js.Function3[/* dt */ Api, /* node */ JQuery, /* config */ js.Any, String]
  type FunctionExtButtonsCollectionText = js.Function1[/* a */ js.Any, String]
}
