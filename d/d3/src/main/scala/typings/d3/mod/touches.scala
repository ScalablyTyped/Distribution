package typings.d3.mod

import typings.d3Selection.mod.ContainerElement
import typings.std.TouchList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "touches")
@js.native
object touches extends js.Object {
  def apply(container: ContainerElement): js.Array[js.Tuple2[Double, Double]] = js.native
  def apply(container: ContainerElement, touches: TouchList): js.Array[js.Tuple2[Double, Double]] = js.native
}

