package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnMethods
  extends CoreMethods
     with CommonColumnMethod {
  /**
    * Get the data for the cells in the selected column.
    */
  def data(): Api = js.native
  /**
    * Get the data source property for the selected column
    */
  def dataSrc(): scala.Double | java.lang.String | js.Function0[java.lang.String] = js.native
  /**
    * Get index information about the selected cell
    *
    * @param t Specify if you want to get the column data index (default) or the visible index (visible).
    */
  def index(): Api = js.native
  def index(t: java.lang.String): Api = js.native
  /**
    * Obtain the th / td nodes for the selected column
    */
  def nodes(): js.Array[Api] = js.native
}

