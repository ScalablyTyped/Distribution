package typings.bounceDotJs.bounceDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerailizedComponent[T] extends js.Object {
  var bounces: Double
  var delay: Double
  var duration: Double
  var easing: String
  var from: T
  var stiffness: Double
  var to: T
  var `type`: String
}

object SerailizedComponent {
  @scala.inline
  def apply[T](
    bounces: Double,
    delay: Double,
    duration: Double,
    easing: String,
    from: T,
    stiffness: Double,
    to: T,
    `type`: String
  ): SerailizedComponent[T] = {
    val __obj = js.Dynamic.literal(bounces = bounces, delay = delay, duration = duration, easing = easing, from = from.asInstanceOf[js.Any], stiffness = stiffness, to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SerailizedComponent[T]]
  }
}

