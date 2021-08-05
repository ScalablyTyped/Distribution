package typings.ckeditorCkeditor5Engine.mod.model

import typings.std.Iterable
import typings.std.Iterator
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// engine/model/documentfragment
@JSImport("@ckeditor/ckeditor5-engine", "model.DocumentFragment")
@js.native
/* protected */ class DocumentFragment ()
  extends StObject
     with _NodeSet {
  /* protected */ def this(children: Node) = this()
  /* protected */ def this(children: Iterable[Node]) = this()
  
  /* protected */ def _appendChild(items: Item): Unit = js.native
  /* protected */ def _appendChild(items: Iterable[Item]): Unit = js.native
  
  /* protected */ def _insertChild(index: Double, items: Item): Unit = js.native
  /* protected */ def _insertChild(index: Double, items: Iterable[Item]): Unit = js.native
  
  /* protected */ def _removeChildren(index: Double): js.Array[Node] = js.native
  /* protected */ def _removeChildren(index: Double, howMany: Double): js.Array[Node] = js.native
  
  val childCount: Double = js.native
  
  def getChild(index: Double): Node | Null = js.native
  
  def getChildIndex(node: Node): Double | Null = js.native
  
  def getChildStartOffset(node: Node): Double | Null = js.native
  
  def getChildren(): Iterable[Node] = js.native
  
  def getNodeByPath(relativePath: js.Array[Double]): Node | DocumentFragment = js.native
  
  def getPath(): js.Array[Double] = js.native
  
  /*TS3.0: []*/
  def is(`type`: String): Boolean = js.native
  
  val isEmpty: Boolean = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[Iterator[Node, js.Any, Unit]] = js.native
  
  val markers: Map[String, Range] = js.native
  
  val maxOffset: Double = js.native
  
  def offsetToIndex(offset: Double): Double = js.native
  
  val parent: Null = js.native
  
  val root: DocumentFragment = js.native
  
  def toJSON(): js.Object = js.native
}
object DocumentFragment {
  
  @JSImport("@ckeditor/ckeditor5-engine", "model.DocumentFragment")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromJSON(json: js.Object): DocumentFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[DocumentFragment]
}
