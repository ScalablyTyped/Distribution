package typings.countryCodeLookup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("country-code-lookup", "byIso")
@js.native
object byIso extends js.Object {
  def apply(code: String): CountryCode = js.native
  def apply(code: Double): CountryCode = js.native
}

