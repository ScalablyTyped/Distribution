package typings.datatablesDotNet.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowsMethods
  extends CoreMethods
     with CommonRowMethod {
  /**
    * Get / Set the data for the selected row
    *
    * @param d Data to use for the row.
    */
  def data(): Api = js.native
  def data(d: js.Array[_]): Api = js.native
  def data(d: js.Object): Api = js.native
  /**
    * Iterate over each selected row, with the function context set to be the row in question. Since: DataTables 1.10.6
    *
    * @param fn Function to execute for every row selected.
    */
  def every(
    fn: js.ThisFunction3[
      /* this */ RowMethods, 
      /* rowIdx */ Double, 
      /* tableLoop */ Double, 
      /* rowLoop */ Double, 
      Unit
    ]
  ): Api = js.native
  /**
    * Get the ids of the selected rows. Since: 1.10.8
    *
    * @param hash true - Append a hash (#) to the start of each row id. This can be useful for then using the ids as selectors
    * false - Do not modify the id value.
    * @returns Api instance with the selected rows in its result set. If a row does not have an id available 'undefined' will be returned as the value.
    */
  def ids(): Api = js.native
  def ids(hash: Boolean): Api = js.native
  /**
    * Get the row indexes of the selected rows.
    */
  def indexes(): Api = js.native
  /**
    * Obtain the tr nodes for the selected rows
    */
  def nodes(): Api = js.native
  /**
    * Delete the selected rows from the DataTable.
    */
  def remove(): Api = js.native
}

