package typings.cardValidator

import typings.cardValidator.typesMod.Verification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("card-validator/dist/cvv", JSImport.Namespace)
@js.native
object cvvMod extends js.Object {
  
  def cvv(value: String): Verification = js.native
  def cvv(value: String, maxLength: js.Array[Double]): Verification = js.native
  def cvv(value: String, maxLength: Double): Verification = js.native
  def cvv(value: js.Any): Verification = js.native
  def cvv(value: js.Any, maxLength: js.Array[Double]): Verification = js.native
  def cvv(value: js.Any, maxLength: Double): Verification = js.native
}
