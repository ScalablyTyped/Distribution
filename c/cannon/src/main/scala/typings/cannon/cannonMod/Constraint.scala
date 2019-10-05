package typings.cannon.cannonMod

import typings.cannon.CANNON.IConstraintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "Constraint")
@js.native
class Constraint protected ()
  extends typings.cannon.CANNON.Constraint {
  def this(bodyA: typings.cannon.CANNON.Body, bodyB: typings.cannon.CANNON.Body) = this()
  def this(bodyA: typings.cannon.CANNON.Body, bodyB: typings.cannon.CANNON.Body, options: IConstraintOptions) = this()
}

