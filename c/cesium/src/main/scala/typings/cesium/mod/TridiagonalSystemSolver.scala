package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TridiagonalSystemSolver {
  
  @JSImport("cesium", "TridiagonalSystemSolver.solve")
  @js.native
  def solve(
    diagonal: js.Array[Double],
    lower: js.Array[Double],
    upper: js.Array[Double],
    right: js.Array[Cartesian3]
  ): js.Array[Cartesian3] = js.native
}
