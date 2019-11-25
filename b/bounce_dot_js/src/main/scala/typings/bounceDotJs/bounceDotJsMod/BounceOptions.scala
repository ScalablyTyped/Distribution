package typings.bounceDotJs.bounceDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BounceOptions[T] extends js.Object {
  var bounces: js.UndefOr[Double] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var from: T
  var stiffness: js.UndefOr[Double] = js.undefined
  var to: T
}

object BounceOptions {
  @scala.inline
  def apply[T](
    from: T,
    to: T,
    bounces: Int | Double = null,
    delay: Int | Double = null,
    duration: Int | Double = null,
    easing: String = null,
    stiffness: Int | Double = null
  ): BounceOptions[T] = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (bounces != null) __obj.updateDynamic("bounces")(bounces.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (stiffness != null) __obj.updateDynamic("stiffness")(stiffness.asInstanceOf[js.Any])
    __obj.asInstanceOf[BounceOptions[T]]
  }
}

