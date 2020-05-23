package typings.cardValidator.mod

import typings.cardValidator.anon.MinLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("card-validator", "postalCode")
@js.native
object postalCode extends js.Object {
  def apply(value: String): valid = js.native
  def apply(value: String, options: MinLength): valid = js.native
}

