package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constraint extends js.Object {
  var bodyA: Body = js.native
  var bodyB: Body = js.native
  var collideConnected: Boolean = js.native
  var equations: js.Array[_] = js.native
  var id: Double = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def update(): Unit = js.native
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
  @scala.inline
  implicit class ConstraintOps[Self <: Constraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBodyA(value: Body): Self = this.set("bodyA", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyB(value: Body): Self = this.set("bodyB", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollideConnected(value: Boolean): Self = this.set("collideConnected", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisable(value: () => Unit): Self = this.set("disable", js.Any.fromFunction0(value))
    @scala.inline
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
    @scala.inline
    def setEquationsVarargs(value: js.Any*): Self = this.set("equations", js.Array(value :_*))
    @scala.inline
    def setEquations(value: js.Array[_]): Self = this.set("equations", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
  
}

