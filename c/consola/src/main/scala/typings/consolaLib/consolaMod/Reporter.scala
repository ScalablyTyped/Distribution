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
  def apply(log: js.Function1[js.Any, scala.Unit]): Reporter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("log")(log)
    __obj.asInstanceOf[Reporter]
  }
}

