package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  /**
    * Set duration of transition (in milliseconds) for chart animation.
    * Note: If 0 or null set, transition will be skipped. So, this makes initial rendering faster especially in case you have a lot of data.
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Duration {
  @scala.inline
  def apply(duration: scala.Int | scala.Double = null): Anon_Duration = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Duration]
  }
}

