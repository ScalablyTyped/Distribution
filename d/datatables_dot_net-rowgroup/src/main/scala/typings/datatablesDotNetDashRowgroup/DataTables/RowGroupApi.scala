package typings.datatablesDotNetDashRowgroup.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowGroupApi extends js.Object {
  /**
  		 * Get the data source for the row grouping
  		 */
  def dataSrc(): Double | String = js.native
  def dataSrc(prop: String): Api = js.native
  /**
  		 * Set the data source for the row grouping
  		 */
  def dataSrc(prop: Double): Api = js.native
  /**
  		 * Disable RowGroup's interaction with the table
  		 */
  def disable(): Api = js.native
  /**
  		 * Enable or disable RowGroup's interaction with the table
  		 */
  def enable(): Api = js.native
  def enable(enable: Boolean): Api = js.native
}

