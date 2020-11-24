package typings.cardValidator.postalCodeMod

import typings.cardValidator.typesMod.Verification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("card-validator/dist/postal-code", "postalCode")
@js.native
object postalCode extends js.Object {
  
  def apply(value: String): Verification = js.native
  def apply(value: String, options: PostalCodeOptions): Verification = js.native
  def apply(value: js.Any): Verification = js.native
  def apply(value: js.Any, options: PostalCodeOptions): Verification = js.native
}
