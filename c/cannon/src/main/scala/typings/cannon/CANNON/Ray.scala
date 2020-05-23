package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ray extends js.Object {
  var checkCollisionResponse: Boolean
  var from: Vec3
  var precision: Double
  var to: Vec3
  def getAABB(result: RaycastResult): Unit
}

object Ray {
  @scala.inline
  def apply(
    checkCollisionResponse: Boolean,
    from: Vec3,
    getAABB: RaycastResult => Unit,
    precision: Double,
    to: Vec3
  ): Ray = {
    val __obj = js.Dynamic.literal(checkCollisionResponse = checkCollisionResponse.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], getAABB = js.Any.fromFunction1(getAABB), precision = precision.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ray]
  }
}

