package typings
package cypressLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeedSettings[TElement] extends js.Object {
  /**
    * A function to call once the animation is complete.
    */
  var complete: js.UndefOr[js.ThisFunction0[/* this */ TElement, scala.Unit]] = js.undefined
  /**
    * A string or number determining how long the animation will run.
    */
  var duration: js.UndefOr[Duration] = js.undefined
  /**
    * A string indicating which easing function to use for the transition.
    */
  var easing: js.UndefOr[java.lang.String] = js.undefined
}

object SpeedSettings {
  @scala.inline
  def apply[TElement](
    complete: js.ThisFunction0[/* this */ TElement, scala.Unit] = null,
    duration: Duration = null,
    easing: java.lang.String = null
  ): SpeedSettings[TElement] = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    __obj.asInstanceOf[SpeedSettings[TElement]]
  }
}

