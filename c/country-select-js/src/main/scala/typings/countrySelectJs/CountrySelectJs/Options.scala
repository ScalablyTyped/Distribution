package typings.countrySelectJs.CountrySelectJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Set the default country by it's country code. Otherwise it will just be
    * the first country in the list.
    */
  var defaultCountry: js.UndefOr[String] = js.undefined
  /**
    * Display only the countries you specify. Takes an array of country codes.
    */
  var onlyCountries: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Specify the countries to appear at the top of the list. Defaults to
    * ["us", "gb"]
    */
  var preferredCountries: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Set the dropdown's width to be the same as the input. This is
    * automatically enabled for small screens.
    */
  var responsiveDropdown: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    defaultCountry: String = null,
    onlyCountries: js.Array[String] = null,
    preferredCountries: js.Array[String] = null,
    responsiveDropdown: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (defaultCountry != null) __obj.updateDynamic("defaultCountry")(defaultCountry.asInstanceOf[js.Any])
    if (onlyCountries != null) __obj.updateDynamic("onlyCountries")(onlyCountries.asInstanceOf[js.Any])
    if (preferredCountries != null) __obj.updateDynamic("preferredCountries")(preferredCountries.asInstanceOf[js.Any])
    if (!js.isUndefined(responsiveDropdown)) __obj.updateDynamic("responsiveDropdown")(responsiveDropdown.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

