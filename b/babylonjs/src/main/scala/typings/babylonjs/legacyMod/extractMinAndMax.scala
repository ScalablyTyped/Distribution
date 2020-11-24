package typings.babylonjs.legacyMod

import typings.babylonjs.anon.Maximum
import typings.babylonjs.typesMod.FloatArray
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "extractMinAndMax")
@js.native
object extractMinAndMax extends js.Object {
  
  def apply(positions: FloatArray, start: Double, count: Double): Maximum = js.native
  def apply(
    positions: FloatArray,
    start: Double,
    count: Double,
    bias: js.UndefOr[Nullable[typings.babylonjs.mathVectorMod.Vector2]],
    stride: Double
  ): Maximum = js.native
  def apply(
    positions: FloatArray,
    start: Double,
    count: Double,
    bias: Nullable[typings.babylonjs.mathVectorMod.Vector2]
  ): Maximum = js.native
}
