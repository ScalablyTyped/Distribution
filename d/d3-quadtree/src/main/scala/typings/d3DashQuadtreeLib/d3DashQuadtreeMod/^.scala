package typings
package d3DashQuadtreeLib.d3DashQuadtreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-quadtree", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def quadtree[T](): Quadtree[T] = js.native
  def quadtree[T](data: js.Array[T]): Quadtree[T] = js.native
  def quadtree[T](data: js.Array[T], x: js.Function1[/* d */ T, scala.Double]): Quadtree[T] = js.native
  def quadtree[T](
    data: js.Array[T],
    x: js.Function1[/* d */ T, scala.Double],
    y: js.Function1[/* d */ T, scala.Double]
  ): Quadtree[T] = js.native
}

