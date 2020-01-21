package typings.ckeditorCkeditor5Engine.mod.view

import typings.std.Iterable
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/view/documentfragment
@JSImport("@ckeditor/ckeditor5-engine", "view.DocumentFragment")
@js.native
class DocumentFragment protected () extends js.Object {
  protected def this(children: Node) = this()
  protected def this(children: Iterable[Node]) = this()
  var _children: js.Array[Element] = js.native
  val childCount: Double = js.native
  val isEmpty: Boolean = js.native
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[Iterator[Node, _, js.UndefOr[scala.Nothing]]] = js.native
  val parent: Null = js.native
  val root: DocumentFragment = js.native
  def _appendChild(items: Item): Double = js.native
  def _appendChild(items: Iterable[Item]): Double = js.native
  def _insertChild(index: Double, items: Item): Double = js.native
  def _insertChild(index: Double, items: Iterable[Item]): Double = js.native
  def _removeChildren(index: Double): js.Array[Node] = js.native
  def _removeChildren(index: Double, howMany: Double): js.Array[Node] = js.native
  def getChild(index: Double): Node = js.native
  def getChildIndex(node: Node): Double = js.native
  def getChildren(): Iterable[Node] = js.native
  def is(`type`: String): Boolean = js.native
}

