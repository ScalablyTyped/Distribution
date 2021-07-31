package typings.ckeditorCkeditor5Engine.mod.model

import typings.std.Iterable
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// engine/model/element
@JSImport("@ckeditor/ckeditor5-engine", "model.Element")
@js.native
class Element protected () extends Node {
  protected def this(name: String) = this()
  protected def this(name: String, attrs: js.Array[js.Tuple2[String, js.Any]]) = this()
  protected def this(name: String, attrs: Map[String, js.Any]) = this()
  protected def this(name: String, attrs: js.Array[js.Tuple2[String, js.Any]], children: Node) = this()
  protected def this(name: String, attrs: js.Array[js.Tuple2[String, js.Any]], children: Iterable[Node]) = this()
  protected def this(name: String, attrs: Unit, children: Node) = this()
  protected def this(name: String, attrs: Unit, children: Iterable[Node]) = this()
  protected def this(name: String, attrs: Map[String, js.Any], children: Node) = this()
  protected def this(name: String, attrs: Map[String, js.Any], children: Iterable[Node]) = this()
  
  /* protected */ def _appendChild(nodes: Item): Unit = js.native
  /* protected */ def _appendChild(nodes: Iterable[Item]): Unit = js.native
  
  /* protected */ def _clone(): Element = js.native
  /* protected */ def _clone(deep: Boolean): Element = js.native
  
  /* protected */ def _insertChild(index: Double, items: Item): Unit = js.native
  /* protected */ def _insertChild(index: Double, items: Iterable[Item]): Unit = js.native
  
  /* protected */ def _removeChildren(index: Double): js.Array[Node] = js.native
  /* protected */ def _removeChildren(index: Double, howMany: Double): js.Array[Node] = js.native
  
  val childCount: Double = js.native
  
  def getChild(index: Double): Node = js.native
  
  def getChildIndex(node: Node): Double = js.native
  
  def getChildStartOffset(node: Node): Double = js.native
  
  def getChildren(): Iterable[Node] = js.native
  
  def getNodeByPath(relativePath: js.Array[Double]): Node = js.native
  
  def is(`type`: String): Boolean = js.native
  
  val isEmpty: Boolean = js.native
  
  val maxOffset: Double = js.native
  
  val name: String = js.native
  
  def offsetToIndex(offset: Double): Double = js.native
}
object Element {
  
  @JSImport("@ckeditor/ckeditor5-engine", "model.Element")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def fromJSON(json: js.Object): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Element]
}
