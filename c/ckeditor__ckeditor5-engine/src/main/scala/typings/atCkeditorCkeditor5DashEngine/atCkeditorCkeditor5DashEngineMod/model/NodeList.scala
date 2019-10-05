package typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/model/nodelist
@JSImport("@ckeditor/ckeditor5-engine", "model.NodeList")
@js.native
class NodeList ()
  extends Iterable[Node]
     with _NodeSet {
  val length: Double = js.native
  val maxOffset: Double = js.native
  def getNode(index: Double): Node | Null = js.native
  def getNodeIndex(node: Node): Double | Null = js.native
  def getNodeStartOffset(node: Node): Double | Null = js.native
  def indexToOffset(index: Double): Double = js.native
  def offsetToIndex(offset: Double): Double = js.native
  def toJSON(): js.Array[Node] = js.native
}

