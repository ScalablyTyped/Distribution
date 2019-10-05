package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Constraint")
@js.native
class Constraint protected () extends js.Object {
  def this(bodyA: Body, bodyB: Body) = this()
  def this(bodyA: Body, bodyB: Body, options: IConstraintOptions) = this()
  var bodyA: Body = js.native
  var bodyB: Body = js.native
  var collideConnected: Boolean = js.native
  var equations: js.Array[_] = js.native
  var id: Double = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def update(): Unit = js.native
}

