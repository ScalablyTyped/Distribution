package typings
package dcLib.dcMod.dcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  def Exception(msg: java.lang.String): scala.Unit
  def InvalidStateException(msg: java.lang.String): scala.Unit
}

object Errors {
  @scala.inline
  def apply(
    Exception: js.Function1[java.lang.String, scala.Unit],
    InvalidStateException: js.Function1[java.lang.String, scala.Unit]
  ): Errors = {
    val __obj = js.Dynamic.literal(Exception = Exception, InvalidStateException = InvalidStateException)
  
    __obj.asInstanceOf[Errors]
  }
}

