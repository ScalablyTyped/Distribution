package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GSSolver extends Solver {
  var tolerance: Double = js.native
}

object GSSolver {
  @scala.inline
  def apply(
    addEquation: Equation => Unit,
    equations: js.Array[Equation],
    iterations: Double,
    removeAllEquations: () => Unit,
    removeEquation: Equation => Unit,
    solve: (Double, World) => Double,
    tolerance: Double
  ): GSSolver = {
    val __obj = js.Dynamic.literal(addEquation = js.Any.fromFunction1(addEquation), equations = equations.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], removeAllEquations = js.Any.fromFunction0(removeAllEquations), removeEquation = js.Any.fromFunction1(removeEquation), solve = js.Any.fromFunction2(solve), tolerance = tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[GSSolver]
  }
  @scala.inline
  implicit class GSSolverOps[Self <: GSSolver] (val x: Self) extends AnyVal {
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
    def setTolerance(value: Double): Self = this.set("tolerance", value.asInstanceOf[js.Any])
  }
  
}

