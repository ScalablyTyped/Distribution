package typings.countryData.mod

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
    val __obj = js.Dynamic.literal(alpha2 = alpha2.asInstanceOf[js.Any], alpha3 = alpha3.asInstanceOf[js.Any], countryCallingCodes = countryCallingCodes.asInstanceOf[js.Any], currencies = currencies.asInstanceOf[js.Any], emoji = emoji.asInstanceOf[js.Any], ioc = ioc.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Country]
  }
}

