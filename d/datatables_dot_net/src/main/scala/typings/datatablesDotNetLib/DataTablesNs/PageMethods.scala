package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "order-methods"
//#region "page-methods"
@js.native
trait PageMethods extends js.Object {
  /**
           * Get the current page of the table.
           */
  def apply(): scala.Double = js.native
  /**
           * Set the current page of the table.
           *
           * @param page Index or 'first', 'next', 'previous', 'last'
           */
  def apply(page: java.lang.String): Api = js.native
  /**
           * Set the current page of the table.
           *
           * @param page Index or 'first', 'next', 'previous', 'last'
           */
  def apply(page: scala.Double): Api = js.native
  /**
           * Get paging information about the table
           */
  def info(): PageMethodeModelInfoReturn = js.native
  /**
           * Get the table's page length.
           */
  def len(): scala.Double = js.native
  /**
           * Set the table's page length.
           *
           * @param length Page length to set. use -1 to show all records.
           */
  def len(length: scala.Double): Api = js.native
}

