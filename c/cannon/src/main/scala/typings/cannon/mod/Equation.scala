package typings.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "Equation")
@js.native
class Equation protected ()
  extends typings.cannon.CANNON.Equation {
  def this(bi: typings.cannon.CANNON.Body, bj: typings.cannon.CANNON.Body) = this()
  def this(bi: typings.cannon.CANNON.Body, bj: typings.cannon.CANNON.Body, minForce: Double) = this()
  def this(
    bi: typings.cannon.CANNON.Body,
    bj: typings.cannon.CANNON.Body,
    minForce: js.UndefOr[scala.Nothing],
    maxForce: Double
  ) = this()
  def this(bi: typings.cannon.CANNON.Body, bj: typings.cannon.CANNON.Body, minForce: Double, maxForce: Double) = this()
}
