package typings.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  def BadArgumentException(): Unit
  def Exception(msg: String): Unit
  def InvalidStateException(): Unit
}

object Errors {
  @scala.inline
  def apply(BadArgumentException: () => Unit, Exception: String => Unit, InvalidStateException: () => Unit): Errors = {
    val __obj = js.Dynamic.literal(BadArgumentException = js.Any.fromFunction0(BadArgumentException), Exception = js.Any.fromFunction1(Exception), InvalidStateException = js.Any.fromFunction0(InvalidStateException))
  
    __obj.asInstanceOf[Errors]
  }
}

