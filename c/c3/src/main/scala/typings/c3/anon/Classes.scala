package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Classes extends js.Object {
  /** If provided, removes the regions that have all of the specified classes. Otherwise removes all regions. */
  var classes: js.UndefOr[js.Array[String]] = js.undefined
  /** Transition duration for fade out. */
  var duration: js.UndefOr[Double] = js.undefined
}

object Classes {
  @scala.inline
  def apply(classes: js.Array[String] = null, duration: js.UndefOr[Double] = js.undefined): Classes = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes]
  }
}

