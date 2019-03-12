package typings
package consolaLib.consolaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reporter extends js.Object {
  def log(logObj: js.Any): scala.Unit
}

object Reporter {
  @scala.inline
  def apply(log: js.Any => scala.Unit): Reporter = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
  
    __obj.asInstanceOf[Reporter]
  }
}

