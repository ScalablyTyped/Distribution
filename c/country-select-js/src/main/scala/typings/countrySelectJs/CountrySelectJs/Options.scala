package typings.countrySelectJs.CountrySelectJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Set the default country by it's country code. Otherwise it will just be
    * the first country in the list.
    */
  var defaultCountry: js.UndefOr[String] = js.native
  /**
    * Display only the countries you specify. Takes an array of country codes.
    */
  var onlyCountries: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specify the countries to appear at the top of the list. Defaults to
    * ["us", "gb"]
    */
  var preferredCountries: js.UndefOr[js.Array[String]] = js.native
  /**
    * Set the dropdown's width to be the same as the input. This is
    * automatically enabled for small screens.
    */
  var responsiveDropdown: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaultCountry(value: String): Self = this.set("defaultCountry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultCountry: Self = this.set("defaultCountry", js.undefined)
    @scala.inline
    def setOnlyCountriesVarargs(value: String*): Self = this.set("onlyCountries", js.Array(value :_*))
    @scala.inline
    def setOnlyCountries(value: js.Array[String]): Self = this.set("onlyCountries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyCountries: Self = this.set("onlyCountries", js.undefined)
    @scala.inline
    def setPreferredCountriesVarargs(value: String*): Self = this.set("preferredCountries", js.Array(value :_*))
    @scala.inline
    def setPreferredCountries(value: js.Array[String]): Self = this.set("preferredCountries", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredCountries: Self = this.set("preferredCountries", js.undefined)
    @scala.inline
    def setResponsiveDropdown(value: Boolean): Self = this.set("responsiveDropdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsiveDropdown: Self = this.set("responsiveDropdown", js.undefined)
  }
  
}

