package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitSolver
  extends StObject
     with Solver {
  
  var subsolver: Solver
}
object SplitSolver {
  
  inline def apply(
    addEquation: Equation => Unit,
    equations: js.Array[Equation],
    iterations: Double,
    removeAllEquations: () => Unit,
    removeEquation: Equation => Unit,
    solve: (Double, World) => Double,
    subsolver: Solver
  ): SplitSolver = {
    val __obj = js.Dynamic.literal(addEquation = js.Any.fromFunction1(addEquation), equations = equations.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], removeAllEquations = js.Any.fromFunction0(removeAllEquations), removeEquation = js.Any.fromFunction1(removeEquation), solve = js.Any.fromFunction2(solve), subsolver = subsolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitSolver]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SplitSolver] (val x: Self) extends AnyVal {
    
    inline def setSubsolver(value: Solver): Self = StObject.set(x, "subsolver", value.asInstanceOf[js.Any])
  }
}
