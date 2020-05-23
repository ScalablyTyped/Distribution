package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraint extends js.Object {
  var bodyA: Body
  var bodyB: Body
  var collideConnected: Boolean
  var equations: js.Array[_]
  var id: Double
  def disable(): Unit
  def enable(): Unit
  def update(): Unit
}

object Constraint {
  @scala.inline
  def apply(
    bodyA: Body,
    bodyB: Body,
    collideConnected: Boolean,
    disable: () => Unit,
    enable: () => Unit,
    equations: js.Array[_],
    id: Double,
    update: () => Unit
  ): Constraint = {
    val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), equations = equations.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Constraint]
  }
}

