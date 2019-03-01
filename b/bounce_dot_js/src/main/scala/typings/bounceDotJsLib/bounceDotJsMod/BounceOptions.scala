package typings
package bounceDotJsLib.bounceDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BounceOptions[T] extends js.Object {
  var bounces: js.UndefOr[scala.Double] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[java.lang.String] = js.undefined
  var from: T
  var stiffness: js.UndefOr[scala.Double] = js.undefined
  var to: T
}

object BounceOptions {
  @scala.inline
  def apply[T](
    from: T,
    to: T,
    bounces: scala.Int | scala.Double = null,
    delay: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    easing: java.lang.String = null,
    stiffness: scala.Int | scala.Double = null
  ): BounceOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (bounces != null) __obj.updateDynamic("bounces")(bounces.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (stiffness != null) __obj.updateDynamic("stiffness")(stiffness.asInstanceOf[js.Any])
    __obj.asInstanceOf[BounceOptions[T]]
  }
}

