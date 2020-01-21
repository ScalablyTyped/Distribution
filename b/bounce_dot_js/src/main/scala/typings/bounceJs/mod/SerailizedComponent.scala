package typings.bounceJs.mod

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
    val __obj = js.Dynamic.literal(bounces = bounces.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], stiffness = stiffness.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerailizedComponent[T]]
  }
}

