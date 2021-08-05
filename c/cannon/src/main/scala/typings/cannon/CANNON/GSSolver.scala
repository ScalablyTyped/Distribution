package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GSSolver
  extends StObject
     with Solver {
  
  var tolerance: Double
}
object GSSolver {
  
  inline def apply(
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
  
  extension [Self <: GSSolver](x: Self) {
    
    inline def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
  }
}
