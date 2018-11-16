package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryDataTables
  extends datatablesDotNetLib.JQuery {
  /**
           * Returns DataTables API instance
           * Usage:
           * $( selector ).dataTable().api();
           */
  def api(): Api = js.native
}

