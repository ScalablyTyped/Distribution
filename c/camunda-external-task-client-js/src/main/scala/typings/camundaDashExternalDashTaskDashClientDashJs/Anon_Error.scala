package typings.camundaDashExternalDashTaskDashClientDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  def error(text: String): Unit
  def success(text: String): Unit
}

object Anon_Error {
  @scala.inline
  def apply(error: String => Unit, success: String => Unit): Anon_Error = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_Error]
  }
}

