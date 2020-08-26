package typings.cannon.mod

import typings.cannon.CANNON.IHingeConstraintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "HingeConstraint")
@js.native
class HingeConstraint protected ()
  extends typings.cannon.CANNON.HingeConstraint {
  def this(bodyA: typings.cannon.CANNON.Body, bodyB: typings.cannon.CANNON.Body) = this()
  def this(
    bodyA: typings.cannon.CANNON.Body,
    bodyB: typings.cannon.CANNON.Body,
    options: IHingeConstraintOptions
  ) = this()
}

