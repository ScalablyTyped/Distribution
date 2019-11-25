package typings.bugsnagDashJs

import typings.bugsnagDashJs.typesClientMod._NotifiableError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorClass extends _NotifiableError {
  var errorClass: String
  var errorMessage: String
}

object Anon_ErrorClass {
  @scala.inline
  def apply(errorClass: String, errorMessage: String): Anon_ErrorClass = {
    val __obj = js.Dynamic.literal(errorClass = errorClass.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ErrorClass]
  }
}

