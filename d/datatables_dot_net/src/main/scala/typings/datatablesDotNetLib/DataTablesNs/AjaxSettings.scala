package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AjaxSettings
  extends jqueryLib.JQueryNs.AjaxSettings[js.Any] {
  /**
           * Data property or manipulation method for table data. Since: 1.10
           */
  var dataSrc: js.UndefOr[java.lang.String | (js.Function1[/* data */ js.Any, js.Array[_]])] = js.undefined
  /**
           * Add or modify data submitted to the server upon an Ajax request. Since: 1.10
           */
  @JSName("data")
  var data_AjaxSettings: js.UndefOr[js.Object | FunctionAjaxData] = js.undefined
}

