package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClasses extends js.Object {
  /** If provided, removes the regions that have all of the specified classes. Otherwise removes all regions. */
  var classes: js.UndefOr[js.Array[String]] = js.undefined
  /** Transition duration for fade out. */
  var duration: js.UndefOr[Double] = js.undefined
}

object AnonClasses {
  @scala.inline
  def apply(classes: js.Array[String] = null, duration: Int | Double = null): AnonClasses = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClasses]
  }
}

