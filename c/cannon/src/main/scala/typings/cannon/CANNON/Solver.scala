package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Solver extends StObject {
  
  def addEquation(eq: Equation): Unit
  
  var equations: js.Array[Equation]
  
  var iterations: Double
  
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
  
  @scala.inline
  implicit class SolverMutableBuilder[Self <: Solver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEquation(value: Equation => Unit): Self = StObject.set(x, "addEquation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEquations(value: js.Array[Equation]): Self = StObject.set(x, "equations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquationsVarargs(value: Equation*): Self = StObject.set(x, "equations", js.Array(value :_*))
    
    @scala.inline
    def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveAllEquations(value: () => Unit): Self = StObject.set(x, "removeAllEquations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveEquation(value: Equation => Unit): Self = StObject.set(x, "removeEquation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSolve(value: (Double, World) => Double): Self = StObject.set(x, "solve", js.Any.fromFunction2(value))
  }
}
