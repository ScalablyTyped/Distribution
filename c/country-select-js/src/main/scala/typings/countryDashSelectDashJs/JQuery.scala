package typings.countryDashSelectDashJs

import typings.countryDashSelectDashJs.CountrySelectJsNs.CountryData
import typings.countryDashSelectDashJs.CountrySelectJsNs.Options
import typings.countryDashSelectDashJs.countryDashSelectDashJsStrings.destroy
import typings.countryDashSelectDashJs.countryDashSelectDashJsStrings.getSelectedCountryData
import typings.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * initialize the plugin with optional options.
    */
  def countrySelect(): JQueryDeferred[_] = js.native
  def countrySelect(method: String, value: String): Unit = js.native
  def countrySelect(options: Options): JQueryDeferred[_] = js.native
  /**
    * Remove the plugin from the input, and unbind any event listeners.
    */
  @JSName("countrySelect")
  def countrySelect_destroy(method: destroy): Unit = js.native
  /**
    * Get the country data for the currently selected flag.
    */
  @JSName("countrySelect")
  def countrySelect_getSelectedCountryData(method: getSelectedCountryData): CountryData = js.native
}

