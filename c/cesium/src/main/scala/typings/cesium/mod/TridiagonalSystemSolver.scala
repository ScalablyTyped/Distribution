package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TridiagonalSystemSolver {
  
  @JSImport("cesium", "TridiagonalSystemSolver")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Solves a tridiagonal system of linear equations.
    * @example
    * const lowerDiagonal = [1.0, 1.0, 1.0, 1.0];
    * const diagonal = [2.0, 4.0, 4.0, 4.0, 2.0];
    * const upperDiagonal = [1.0, 1.0, 1.0, 1.0];
    * const rightHandSide = [
    *     new Cesium.Cartesian3(410757.0, -1595711.0, 1375302.0),
    *     new Cesium.Cartesian3(-5986705.0, -2190640.0, 1099600.0),
    *     new Cesium.Cartesian3(-12593180.0, 288588.0, -1755549.0),
    *     new Cesium.Cartesian3(-5349898.0, 2457005.0, -2685438.0),
    *     new Cesium.Cartesian3(845820.0, 1573488.0, -1205591.0)
    * ];
    *
    * const solution = Cesium.TridiagonalSystemSolver.solve(lowerDiagonal, diagonal, upperDiagonal, rightHandSide);
    * @param diagonal - An array with length <code>n</code> that contains the diagonal of the coefficient matrix.
    * @param lower - An array with length <code>n - 1</code> that contains the lower diagonal of the coefficient matrix.
    * @param upper - An array with length <code>n - 1</code> that contains the upper diagonal of the coefficient matrix.
    * @param right - An array of Cartesians with length <code>n</code> that is the right side of the system of equations.
    * @returns An array of Cartesians with length <code>n</code> that is the solution to the tridiagonal system of equations.
    */
  inline def solve(
    diagonal: js.Array[Double],
    lower: js.Array[Double],
    upper: js.Array[Double],
    right: js.Array[Cartesian3]
  ): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("solve")(diagonal.asInstanceOf[js.Any], lower.asInstanceOf[js.Any], upper.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
}
