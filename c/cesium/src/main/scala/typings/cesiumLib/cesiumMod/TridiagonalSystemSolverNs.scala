package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "TridiagonalSystemSolver")
@js.native
object TridiagonalSystemSolverNs extends js.Object {
  def solve(
    diagonal: js.Array[scala.Double],
    lower: js.Array[scala.Double],
    upper: js.Array[scala.Double],
    right: js.Array[cesiumLib.cesiumMod.Cartesian3]
  ): js.Array[cesiumLib.cesiumMod.Cartesian3] = js.native
}

