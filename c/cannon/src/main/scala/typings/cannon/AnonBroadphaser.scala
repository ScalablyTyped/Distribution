package typings.cannon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBroadphaser extends js.Object {
  var broadphaser: Double
  var integrate: Double
  var makeContactConstraints: Double
  var narrowphase: Double
  var solve: Double
}

object AnonBroadphaser {
  @scala.inline
  def apply(
    broadphaser: Double,
    integrate: Double,
    makeContactConstraints: Double,
    narrowphase: Double,
    solve: Double
  ): AnonBroadphaser = {
    val __obj = js.Dynamic.literal(broadphaser = broadphaser.asInstanceOf[js.Any], integrate = integrate.asInstanceOf[js.Any], makeContactConstraints = makeContactConstraints.asInstanceOf[js.Any], narrowphase = narrowphase.asInstanceOf[js.Any], solve = solve.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBroadphaser]
  }
}

