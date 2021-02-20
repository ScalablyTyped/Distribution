package typings.ckeditorCkeditor5Engine.mod.model

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// engine/model/nodelist
@JSImport("@ckeditor/ckeditor5-engine", "model.NodeList")
@js.native
class NodeList ()
  extends Iterable[Node]
     with _NodeSet {
  
  def getNode(index: Double): Node | Null = js.native
  
  def getNodeIndex(node: Node): Double | Null = js.native
  
  def getNodeStartOffset(node: Node): Double | Null = js.native
  
  def indexToOffset(index: Double): Double = js.native
  
  val length: Double = js.native
  
  val maxOffset: Double = js.native
  
  def offsetToIndex(offset: Double): Double = js.native
  
  def toJSON(): js.Array[Node] = js.native
}
