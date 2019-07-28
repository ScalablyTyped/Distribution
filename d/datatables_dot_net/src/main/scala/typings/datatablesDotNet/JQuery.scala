package typings.datatablesDotNet

import typings.datatablesDotNet.DataTablesNs.Api
import typings.datatablesDotNet.DataTablesNs.JQueryDataTables
import typings.datatablesDotNet.DataTablesNs.Settings
import typings.datatablesDotNet.DataTablesNs.StaticFunctions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("dataTable")
  var dataTable_Original: StaticFunctions = js.native
  def DataTable(): Api = js.native
  def DataTable(opts: Settings): Api = js.native
  /**
    * Returns JQuery object
    *
    * Usage:
    * $( selector ).dataTable();
    */
  def dataTable(): JQueryDataTables = js.native
}

