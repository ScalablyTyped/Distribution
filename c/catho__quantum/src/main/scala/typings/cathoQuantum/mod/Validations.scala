package typings.cathoQuantum.mod

import typings.cathoQuantum.AnonMaxLength
import typings.cathoQuantum.AnonMinLength
import typings.cathoQuantum.AnonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@catho/quantum", "Validations")
@js.native
object Validations extends js.Object {
  def CEP(params: AnonValue): String = js.native
  def CPF(params: AnonValue): String = js.native
  def CPF(params: AnonValue, cpf: String): String = js.native
  def Date(params: AnonValue): String = js.native
  def Email(params: AnonValue): String = js.native
  def MaxLength(params: AnonMaxLength): String = js.native
  def MinLength(params: AnonMinLength): String = js.native
  def Required(params: AnonValue): String = js.native
}

