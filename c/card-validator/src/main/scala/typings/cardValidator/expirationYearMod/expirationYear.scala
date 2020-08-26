package typings.cardValidator.expirationYearMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("card-validator/dist/expiration-year", "expirationYear")
@js.native
object expirationYear extends js.Object {
  def apply(value: String): ExpirationYearVerification = js.native
  def apply(value: String, maxElapsedYear: Double): ExpirationYearVerification = js.native
  def apply(value: js.Any): ExpirationYearVerification = js.native
  def apply(value: js.Any, maxElapsedYear: Double): ExpirationYearVerification = js.native
}

