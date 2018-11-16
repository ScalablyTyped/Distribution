package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Solver")
@js.native
class Solver () extends js.Object {
  var equations: js.Array[Equation] = js.native
  var iterations: scala.Double = js.native
  def addEquation(eq: Equation): scala.Unit = js.native
  def removeAllEquations(): scala.Unit = js.native
  def removeEquation(eq: Equation): scala.Unit = js.native
  def solve(dy: scala.Double, world: World): scala.Double = js.native
}

