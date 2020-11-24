package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.FloatArray
import typings.babylonjs.BABYLON.IndicesArray
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.anon.Minimum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.extractMinAndMaxIndexed")
@js.native
object extractMinAndMaxIndexed extends js.Object {
  
  def apply(positions: FloatArray, indices: IndicesArray, indexStart: Double, indexCount: Double): Minimum = js.native
  def apply(
    positions: FloatArray,
    indices: IndicesArray,
    indexStart: Double,
    indexCount: Double,
    bias: Nullable[typings.babylonjs.BABYLON.Vector2]
  ): Minimum = js.native
}
