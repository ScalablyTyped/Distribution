package typings
package bounceDotJsLib.bounceDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerailizedComponent[T] extends js.Object {
  var bounces: scala.Double
  var delay: scala.Double
  var duration: scala.Double
  var easing: java.lang.String
  var from: T
  var stiffness: scala.Double
  var to: T
  var `type`: java.lang.String
}

object SerailizedComponent {
  @scala.inline
  def apply[T](
    bounces: scala.Double,
    delay: scala.Double,
    duration: scala.Double,
    easing: java.lang.String,
    from: T,
    stiffness: scala.Double,
    to: T,
    `type`: java.lang.String
  ): SerailizedComponent[T] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bounces")(bounces)
    __obj.updateDynamic("delay")(delay)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("easing")(easing)
    __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    __obj.updateDynamic("stiffness")(stiffness)
    __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerailizedComponent[T]]
  }
}

