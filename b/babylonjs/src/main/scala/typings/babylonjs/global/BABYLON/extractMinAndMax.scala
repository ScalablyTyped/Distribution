package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.FloatArray
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.anon.Minimum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.extractMinAndMax")
@js.native
object extractMinAndMax extends js.Object {
  
  def apply(positions: FloatArray, start: Double, count: Double): Minimum = js.native
  def apply(
    positions: FloatArray,
    start: Double,
    count: Double,
    bias: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Vector2]],
    stride: Double
  ): Minimum = js.native
  def apply(
    positions: FloatArray,
    start: Double,
    count: Double,
    bias: Nullable[typings.babylonjs.BABYLON.Vector2]
  ): Minimum = js.native
}
