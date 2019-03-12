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

object FixedHeaderApi {
  @scala.inline
  def apply(
    adjust: () => Api,
    disable: () => Api,
    enable: scala.Boolean => Api,
    footerOffset: scala.Double => Api,
    headerOffset: scala.Double => Api
  ): FixedHeaderApi = {
    val __obj = js.Dynamic.literal(adjust = js.Any.fromFunction0(adjust), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction1(enable), footerOffset = js.Any.fromFunction1(footerOffset), headerOffset = js.Any.fromFunction1(headerOffset))
  
    __obj.asInstanceOf[FixedHeaderApi]
  }
}

