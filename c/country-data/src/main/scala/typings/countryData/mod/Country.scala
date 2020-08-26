package typings.countryData.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Country extends js.Object {
  val alpha2: String = js.native
  val alpha3: String = js.native
  val countryCallingCodes: js.Array[String] = js.native
  val currencies: js.Array[String] = js.native
  val emoji: String = js.native
  val ioc: String = js.native
  val languages: js.Array[String] = js.native
  val name: String = js.native
  val status: String = js.native
}

object Country {
  @scala.inline
  def apply(
    alpha2: String,
    alpha3: String,
    countryCallingCodes: js.Array[String],
    currencies: js.Array[String],
    emoji: String,
    ioc: String,
    languages: js.Array[String],
    name: String,
    status: String
  ): Country = {
    val __obj = js.Dynamic.literal(alpha2 = alpha2.asInstanceOf[js.Any], alpha3 = alpha3.asInstanceOf[js.Any], countryCallingCodes = countryCallingCodes.asInstanceOf[js.Any], currencies = currencies.asInstanceOf[js.Any], emoji = emoji.asInstanceOf[js.Any], ioc = ioc.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Country]
  }
  @scala.inline
  implicit class CountryOps[Self <: Country] (val x: Self) extends AnyVal {
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
    def setAlpha2(value: String): Self = this.set("alpha2", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlpha3(value: String): Self = this.set("alpha3", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountryCallingCodesVarargs(value: String*): Self = this.set("countryCallingCodes", js.Array(value :_*))
    @scala.inline
    def setCountryCallingCodes(value: js.Array[String]): Self = this.set("countryCallingCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrenciesVarargs(value: String*): Self = this.set("currencies", js.Array(value :_*))
    @scala.inline
    def setCurrencies(value: js.Array[String]): Self = this.set("currencies", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmoji(value: String): Self = this.set("emoji", value.asInstanceOf[js.Any])
    @scala.inline
    def setIoc(value: String): Self = this.set("ioc", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguagesVarargs(value: String*): Self = this.set("languages", js.Array(value :_*))
    @scala.inline
    def setLanguages(value: js.Array[String]): Self = this.set("languages", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

