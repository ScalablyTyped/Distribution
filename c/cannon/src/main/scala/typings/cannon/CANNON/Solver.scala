package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Solver extends js.Object {
  
  def addEquation(eq: Equation): Unit = js.native
  
  var equations: js.Array[Equation] = js.native
  
  var iterations: Double = js.native
  
  def removeAllEquations(): Unit = js.native
  
  def removeEquation(eq: Equation): Unit = js.native
  
  def solve(dy: Double, world: World): Double = js.native
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
  
  @scala.inline
  implicit class SolverOps[Self <: Solver] (val x: Self) extends AnyVal {
    
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
    def setAddEquation(value: Equation => Unit): Self = this.set("addEquation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEquationsVarargs(value: Equation*): Self = this.set("equations", js.Array(value :_*))
    
    @scala.inline
    def setEquations(value: js.Array[Equation]): Self = this.set("equations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveAllEquations(value: () => Unit): Self = this.set("removeAllEquations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveEquation(value: Equation => Unit): Self = this.set("removeEquation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSolve(value: (Double, World) => Double): Self = this.set("solve", js.Any.fromFunction2(value))
  }
}
