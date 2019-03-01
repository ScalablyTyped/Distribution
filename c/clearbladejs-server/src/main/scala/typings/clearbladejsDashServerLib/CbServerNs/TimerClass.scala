package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimerClass extends js.Object {
  def Create(name: java.lang.String, options: TimerCreateOptions, callback: CbCallback): scala.Unit
  def Fetch(name: java.lang.String, callback: CbCallback): scala.Unit
}

object TimerClass {
  @scala.inline
  def apply(
    Create: js.Function3[java.lang.String, TimerCreateOptions, CbCallback, scala.Unit],
    Fetch: js.Function2[java.lang.String, CbCallback, scala.Unit]
  ): TimerClass = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Create")(Create)
    __obj.updateDynamic("Fetch")(Fetch)
    __obj.asInstanceOf[TimerClass]
  }
}

