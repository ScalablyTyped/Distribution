package typings
package bugsnagDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorClass
  extends bugsnagDashJsLib.typesClientMod._NotifiableError {
  var errorClass: java.lang.String
  var errorMessage: java.lang.String
}

object Anon_ErrorClass {
  @scala.inline
  def apply(errorClass: java.lang.String, errorMessage: java.lang.String): Anon_ErrorClass = {
    val __obj = js.Dynamic.literal(errorClass = errorClass, errorMessage = errorMessage)
  
    __obj.asInstanceOf[Anon_ErrorClass]
  }
}

