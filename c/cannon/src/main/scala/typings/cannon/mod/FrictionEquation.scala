package typings.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "FrictionEquation")
@js.native
class FrictionEquation protected ()
  extends typings.cannon.CANNON.Equation {
  def this(bi: typings.cannon.CANNON.Body, bj: typings.cannon.CANNON.Body, slipForce: Double) = this()
}

