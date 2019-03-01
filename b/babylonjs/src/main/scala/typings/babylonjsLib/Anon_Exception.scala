package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exception extends js.Object {
  var exception: js.UndefOr[js.Any] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Exception {
  @scala.inline
  def apply(exception: js.Any = null, message: java.lang.String = null): Anon_Exception = {
    val __obj = js.Dynamic.literal()
    if (exception != null) __obj.updateDynamic("exception")(exception)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Anon_Exception]
  }
}

