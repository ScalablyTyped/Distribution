package typings.dc.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  def Exception(msg: String): Unit
  def InvalidStateException(msg: String): Unit
}

object Errors {
  @scala.inline
  def apply(Exception: String => Unit, InvalidStateException: String => Unit): Errors = {
    val __obj = js.Dynamic.literal(Exception = js.Any.fromFunction1(Exception), InvalidStateException = js.Any.fromFunction1(InvalidStateException))
  
    __obj.asInstanceOf[Errors]
  }
}

