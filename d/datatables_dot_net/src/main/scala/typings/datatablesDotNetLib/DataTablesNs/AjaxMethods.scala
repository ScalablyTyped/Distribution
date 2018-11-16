package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region "ajax-methods"
@js.native
trait AjaxMethods extends Api {
  /**
           * Reload the table data from the Ajax data source.
           *
           * @param callback Function which is executed when the data as been reloaded and the table fully redrawn.
           * @param resetPaging Reset (default action or true) or hold the current paging position (false).
           */
  def load(): Api = js.native
  /**
           * Reload the table data from the Ajax data source.
           *
           * @param callback Function which is executed when the data as been reloaded and the table fully redrawn.
           * @param resetPaging Reset (default action or true) or hold the current paging position (false).
           */
  def load(callback: js.Function1[/* json */ js.Any, scala.Unit]): Api = js.native
  /**
           * Reload the table data from the Ajax data source.
           *
           * @param callback Function which is executed when the data as been reloaded and the table fully redrawn.
           * @param resetPaging Reset (default action or true) or hold the current paging position (false).
           */
  def load(callback: js.Function1[/* json */ js.Any, scala.Unit], resetPaging: scala.Boolean): Api = js.native
}

