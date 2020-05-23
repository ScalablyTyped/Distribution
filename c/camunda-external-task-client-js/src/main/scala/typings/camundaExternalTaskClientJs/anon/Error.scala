package typings.camundaExternalTaskClientJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  def error(text: String): Unit
  def success(text: String): Unit
}

object Error {
  @scala.inline
  def apply(error: String => Unit, success: String => Unit): Error = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[Error]
  }
}

