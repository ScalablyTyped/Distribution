package typings.babylonjs

import typings.babylonjs.anon.Maximum
import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.typesMod.FloatArray
import typings.babylonjs.typesMod.IndicesArray
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathFunctionsMod {
  
  @JSImport("babylonjs/Maths/math.functions", "extractMinAndMax")
  @js.native
  def extractMinAndMax(positions: FloatArray, start: Double, count: Double): Maximum = js.native
  @JSImport("babylonjs/Maths/math.functions", "extractMinAndMax")
  @js.native
  def extractMinAndMax(
    positions: FloatArray,
    start: Double,
    count: Double,
    bias: js.UndefOr[Nullable[Vector2]],
    stride: Double
  ): Maximum = js.native
  @JSImport("babylonjs/Maths/math.functions", "extractMinAndMax")
  @js.native
  def extractMinAndMax(positions: FloatArray, start: Double, count: Double, bias: Nullable[Vector2]): Maximum = js.native
  
  @JSImport("babylonjs/Maths/math.functions", "extractMinAndMaxIndexed")
  @js.native
  def extractMinAndMaxIndexed(positions: FloatArray, indices: IndicesArray, indexStart: Double, indexCount: Double): Maximum = js.native
  @JSImport("babylonjs/Maths/math.functions", "extractMinAndMaxIndexed")
  @js.native
  def extractMinAndMaxIndexed(
    positions: FloatArray,
    indices: IndicesArray,
    indexStart: Double,
    indexCount: Double,
    bias: Nullable[Vector2]
  ): Maximum = js.native
}
