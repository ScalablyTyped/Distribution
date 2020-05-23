package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Solver extends js.Object {
  var equations: js.Array[Equation]
  var iterations: Double
  def addEquation(eq: Equation): Unit
  def removeAllEquations(): Unit
  def removeEquation(eq: Equation): Unit
  def solve(dy: Double, world: World): Double
}

object Solver {
  @scala.inline
  def apply(
    addEquation: Equation => Unit,
    equations: js.Array[Equation],
    iterations: Double,
    removeAllEquations: () => Unit,
    removeEquation: Equation => Unit,
    solve: (Double, World) => Double
  ): Solver = {
    val __obj = js.Dynamic.literal(addEquation = js.Any.fromFunction1(addEquation), equations = equations.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], removeAllEquations = js.Any.fromFunction0(removeAllEquations), removeEquation = js.Any.fromFunction1(removeEquation), solve = js.Any.fromFunction2(solve))
    __obj.asInstanceOf[Solver]
  }
}

