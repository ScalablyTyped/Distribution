package typings.datatablesNetButtons.DataTables

import typings.datatablesNet.JQuery
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ButtonSelectorTypes = String | Double | JQuery

/**
  * A function that will be executed upon creation of the buttons.
  */
type FunctionButtom = js.Function1[/* dt */ Api, ButtomSettingsCommon]

type FunctionButtonAction = js.Function4[/* e */ Any, /* dt */ Api, /* node */ JQuery, /* config */ ButtonSettings, Unit]

type FunctionButtonAvailable = js.Function2[/* dt */ Api, /* config */ Any, Boolean]

type FunctionButtonColvisColumnText = js.Function3[/* dt */ Api, /* i */ Double, /* title */ String, String]

type FunctionButtonCustomize = js.Function1[/* win */ Window | String, Unit]

type FunctionButtonCustomizeData = js.Function1[/* content */ Any, Unit]

type FunctionButtonInit = js.Function3[/* dt */ Api, /* node */ JQuery, /* config */ Any, Unit]

type FunctionButtonText = js.Function3[/* dt */ Api, /* node */ JQuery, /* config */ Any, String]

type FunctionExtButtonsCollectionText = js.Function1[/* a */ Any, String]
