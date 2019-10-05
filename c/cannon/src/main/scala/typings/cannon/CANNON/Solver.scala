package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Solver")
@js.native
class Solver () extends js.Object {
  var equations: js.Array[Equation] = js.native
  var iterations: Double = js.native
  def addEquation(eq: Equation): Unit = js.native
  def removeAllEquations(): Unit = js.native
  def removeEquation(eq: Equation): Unit = js.native
  def solve(dy: Double, world: World): Double = js.native
}

