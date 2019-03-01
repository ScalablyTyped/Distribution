package typings
package cradleLib.cradleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangesOptions extends js.Object {
  var since: scala.Double
}

object ChangesOptions {
  @scala.inline
  def apply(since: scala.Double): ChangesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("since")(since)
    __obj.asInstanceOf[ChangesOptions]
  }
}

