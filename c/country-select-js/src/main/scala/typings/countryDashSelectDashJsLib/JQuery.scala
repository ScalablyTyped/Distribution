package typings
package countryDashSelectDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
     * initialize the plugin with optional options.
     */
  def countrySelect(): jqueryLib.JQueryDeferred[_] = js.native
  def countrySelect(method: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
     * initialize the plugin with optional options.
     */
  def countrySelect(options: countryDashSelectDashJsLib.CountrySelectJsNs.Options): jqueryLib.JQueryDeferred[_] = js.native
  /**
     * Remove the plugin from the input, and unbind any event listeners.
     */
  @JSName("countrySelect")
  def countrySelect_destroy(method: countryDashSelectDashJsLib.countryDashSelectDashJsLibStrings.destroy): scala.Unit = js.native
  /**
     * Get the country data for the currently selected flag.
     */
  @JSName("countrySelect")
  def countrySelect_getSelectedCountryData(method: countryDashSelectDashJsLib.countryDashSelectDashJsLibStrings.getSelectedCountryData): countryDashSelectDashJsLib.CountrySelectJsNs.CountryData = js.native
}

