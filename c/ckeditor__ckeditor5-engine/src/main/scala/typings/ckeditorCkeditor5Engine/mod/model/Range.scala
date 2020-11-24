package typings.ckeditorCkeditor5Engine.mod.model

import typings.ckeditorCkeditor5Engine.anon.IgnoreElementEnd
import typings.ckeditorCkeditor5Engine.mod.model.operation.Operation
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// engine/model/range
@JSImport("@ckeditor/ckeditor5-engine", "model.Range")
@js.native
class Range protected () extends Iterable[Node] {
  def this(start: Position) = this()
  def this(start: Position, end: Position) = this()
  
  def containsItem(item: Item): Unit = js.native
  
  def containsPosition(position: Position): Boolean = js.native
  
  def containsRange(otherRange: Range): Boolean = js.native
  def containsRange(otherRange: Range, loose: Boolean): Boolean = js.native
  
  val end: Position = js.native
  
  def getCommonAncestor(): Element | DocumentFragment | Null = js.native
  
  def getDifference(otherRange: Range): js.Array[Range] = js.native
  
  def getIntersection(otherRange: Range): Range | Null = js.native
  
  def getMinimalFlatRanges(): js.Array[Range] = js.native
  
  def getPositions(options: js.Object): Iterable[Position] = js.native
  
  def getTransformedByOperation(operation: Operation): js.Array[Range] = js.native
  
  def getTransformedByOperations(operations: Iterable[Operation]): js.Array[Range] = js.native
  
  def getWalker(options: IgnoreElementEnd): Unit = js.native
  
  var isCollapsed: Boolean = js.native
  
  def isEqual(otherRange: Range): Boolean = js.native
  
  var isFlat: Boolean = js.native
  
  def isIntersecting(otherRange: Range): Boolean = js.native
  
  var root: Element | DocumentFragment = js.native
  
  val start: Position = js.native
  
  def toJSON(): js.Object = js.native
}
