package typings
package datatablesDotNetDashFixedheaderLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FixedHeaderApi extends js.Object {
  /**
           * Recalculate the position of the DataTable on the page and adjust the fixed element as appropriate.
           */
  def adjust(): Api
  /**
           * Disable the fixed elements
           */
  def disable(): Api
  /**
           * Enable / disable the fixed elements
           */
  def enable(enable: scala.Boolean): Api
  /**
           * Get the fixed footer's offset.
           */
  def footerOffset(offset: scala.Double): Api
  /**
           * Get the fixed header's offset.
           */
  def headerOffset(offset: scala.Double): Api
}

