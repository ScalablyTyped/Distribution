package typings
package countryDashDataLib.countryDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Country extends js.Object {
  val alpha2: java.lang.String
  val alpha3: java.lang.String
  val countryCallingCodes: js.Array[java.lang.String]
  val currencies: js.Array[java.lang.String]
  val emoji: java.lang.String
  val ioc: java.lang.String
  val languages: js.Array[java.lang.String]
  val name: java.lang.String
  val status: java.lang.String
}

object Country {
  @scala.inline
  def apply(
    alpha2: java.lang.String,
    alpha3: java.lang.String,
    countryCallingCodes: js.Array[java.lang.String],
    currencies: js.Array[java.lang.String],
    emoji: java.lang.String,
    ioc: java.lang.String,
    languages: js.Array[java.lang.String],
    name: java.lang.String,
    status: java.lang.String
  ): Country = {
    val __obj = js.Dynamic.literal(alpha2 = alpha2, alpha3 = alpha3, countryCallingCodes = countryCallingCodes, currencies = currencies, emoji = emoji, ioc = ioc, languages = languages, name = name, status = status)
  
    __obj.asInstanceOf[Country]
  }
}

