package typings.babylonjs.indexMod

import typings.babylonjs.anon.Maximum
import typings.babylonjs.typesMod.FloatArray
import typings.babylonjs.typesMod.IndicesArray
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "extractMinAndMaxIndexed")
@js.native
object extractMinAndMaxIndexed extends js.Object {
  
  def apply(positions: FloatArray, indices: IndicesArray, indexStart: Double, indexCount: Double): Maximum = js.native
  def apply(
    positions: FloatArray,
    indices: IndicesArray,
    indexStart: Double,
    indexCount: Double,
    bias: Nullable[typings.babylonjs.mathVectorMod.Vector2]
  ): Maximum = js.native
}
