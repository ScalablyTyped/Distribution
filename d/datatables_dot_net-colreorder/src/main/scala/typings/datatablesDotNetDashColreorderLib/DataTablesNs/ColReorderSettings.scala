package typings
package datatablesDotNetDashColreorderLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ColReorderSettings extends js.Object {
  /*
       * Number of columns (counting from the left) to disallow reordering of, '0' in default
       */
  var fixedColumnsLeft: js.UndefOr[scala.Double] = js.undefined
  /*
       * Number of columns (counting from the right) to disallow reordering of, '0' in default
       */
  var fixedColumnsRight: js.UndefOr[scala.Double] = js.undefined
  /*
       * Set a default order for the columns in the table
       */
  var order: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /*
       * Enable / disable live reordering of columns during a drag, 'true' in default
       */
  var realtime: js.UndefOr[scala.Boolean] = js.undefined
  /*
       * Callback after reorder
       */
  def reorderCallback(): scala.Unit
}

