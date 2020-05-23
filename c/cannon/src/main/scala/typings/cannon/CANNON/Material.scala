package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Material extends js.Object {
  var friction: Double
  var id: Double
  var name: String
  var restitution: Double
}

object Material {
  @scala.inline
  def apply(friction: Double, id: Double, name: String, restitution: Double): Material = {
    val __obj = js.Dynamic.literal(friction = friction.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any])
    __obj.asInstanceOf[Material]
  }
}

