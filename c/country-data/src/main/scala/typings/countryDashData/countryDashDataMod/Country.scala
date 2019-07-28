package typings.countryDashData.countryDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Country extends js.Object {
  val alpha2: String
  val alpha3: String
  val countryCallingCodes: js.Array[String]
  val currencies: js.Array[String]
  val emoji: String
  val ioc: String
  val languages: js.Array[String]
  val name: String
  val status: String
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
    val __obj = js.Dynamic.literal(alpha2 = alpha2, alpha3 = alpha3, countryCallingCodes = countryCallingCodes, currencies = currencies, emoji = emoji, ioc = ioc, languages = languages, name = name, status = status)
  
    __obj.asInstanceOf[Country]
  }
}

