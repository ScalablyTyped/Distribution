package typings
package chromeLib.chromeNs.downloadsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringDelta extends js.Object {
  var current: js.UndefOr[java.lang.String] = js.undefined
  var previous: js.UndefOr[java.lang.String] = js.undefined
}

object StringDelta {
  @scala.inline
  def apply(current: java.lang.String = null, previous: java.lang.String = null): StringDelta = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current)
    if (previous != null) __obj.updateDynamic("previous")(previous)
    __obj.asInstanceOf[StringDelta]
  }
}

