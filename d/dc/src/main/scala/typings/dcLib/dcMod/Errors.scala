package typings
package dcLib.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  def Exception(msg: java.lang.String): scala.Unit
  def InvalidStateException(msg: java.lang.String): scala.Unit
}

object Errors {
  @scala.inline
  def apply(Exception: java.lang.String => scala.Unit, InvalidStateException: java.lang.String => scala.Unit): Errors = {
    val __obj = js.Dynamic.literal(Exception = js.Any.fromFunction1(Exception), InvalidStateException = js.Any.fromFunction1(InvalidStateException))
  
    __obj.asInstanceOf[Errors]
  }
}

