package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TridiagonalSystemSolver {
  
  @JSGlobal("Cesium.TridiagonalSystemSolver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def solve(
    diagonal: js.Array[Double],
    lower: js.Array[Double],
    upper: js.Array[Double],
    right: js.Array[typings.cesium.mod.Cartesian3]
  ): js.Array[typings.cesium.mod.Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("solve")(diagonal.asInstanceOf[js.Any], lower.asInstanceOf[js.Any], upper.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.cesium.mod.Cartesian3]]
}
