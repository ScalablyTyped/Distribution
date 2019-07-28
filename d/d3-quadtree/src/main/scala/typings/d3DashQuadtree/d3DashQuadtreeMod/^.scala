package typings.d3DashQuadtree.d3DashQuadtreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-quadtree", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def quadtree[T](): Quadtree[T] = js.native
  def quadtree[T](data: js.Array[T]): Quadtree[T] = js.native
  def quadtree[T](data: js.Array[T], x: js.Function1[/* d */ T, Double]): Quadtree[T] = js.native
  def quadtree[T](data: js.Array[T], x: js.Function1[/* d */ T, Double], y: js.Function1[/* d */ T, Double]): Quadtree[T] = js.native
}

