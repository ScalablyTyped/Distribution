package typings.countrySelectJs

import typings.countrySelectJs.CountrySelectJs.CountryData
import typings.countrySelectJs.CountrySelectJs.Options
import typings.countrySelectJs.countrySelectJsStrings.destroy
import typings.countrySelectJs.countrySelectJsStrings.getSelectedCountryData
import typings.jquery.JQueryDeferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
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
