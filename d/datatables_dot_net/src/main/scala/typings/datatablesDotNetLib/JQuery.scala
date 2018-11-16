package typings
package datatablesDotNetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("dataTable")
  var dataTable_Original: datatablesDotNetLib.DataTablesNs.StaticFunctions = js.native
  def DataTable(): datatablesDotNetLib.DataTablesNs.Api = js.native
  def DataTable(opts: datatablesDotNetLib.DataTablesNs.Settings): datatablesDotNetLib.DataTablesNs.Api = js.native
  /**
           * Returns JQuery object
           *
           * Usage:
           * $( selector ).dataTable();
           */
  def dataTable(): datatablesDotNetLib.DataTablesNs.JQueryDataTables = js.native
}

