package typings
package datatablesDotNetDashButtonsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DataTablesNs {
  /**
       * A function that will be executed upon creation of the buttons.
       */
  type FunctionButtom = js.Function1[/* dt */ Api, ButtomSettingsCommon]
  type FunctionButtonAction = js.Function4[
    /* e */ js.Any, 
    /* dt */ Api, 
    /* node */ datatablesDotNetLib.JQuery, 
    /* config */ ButtonSettings, 
    scala.Unit
  ]
  type FunctionButtonAvailable = js.Function2[/* dt */ Api, /* config */ js.Any, scala.Boolean]
  type FunctionButtonColvisColumnText = js.Function3[/* dt */ Api, /* i */ scala.Double, /* title */ java.lang.String, java.lang.String]
  type FunctionButtonCustomize = js.Function1[/* win */ stdLib.Window | java.lang.String, scala.Unit]
  type FunctionButtonCustomizeData = js.Function1[/* content */ js.Any, scala.Unit]
  type FunctionButtonInit = js.Function3[/* dt */ Api, /* node */ datatablesDotNetLib.JQuery, /* config */ js.Any, scala.Unit]
  type FunctionButtonText = js.Function3[
    /* dt */ Api, 
    /* node */ datatablesDotNetLib.JQuery, 
    /* config */ js.Any, 
    java.lang.String
  ]
  type FunctionExtButtonsCollectionText = js.Function1[/* a */ js.Any, java.lang.String]
}
