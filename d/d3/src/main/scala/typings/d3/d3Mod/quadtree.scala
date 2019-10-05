package typings.d3.d3Mod

import typings.d3DashQuadtree.d3DashQuadtreeMod.Quadtree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "quadtree")
@js.native
object quadtree extends js.Object {
  def apply[T](): Quadtree[T] = js.native
  def apply[T](data: js.Array[T]): Quadtree[T] = js.native
  def apply[T](data: js.Array[T], x: js.Function1[/* d */ T, Double]): Quadtree[T] = js.native
  def apply[T](data: js.Array[T], x: js.Function1[/* d */ T, Double], y: js.Function1[/* d */ T, Double]): Quadtree[T] = js.native
}

