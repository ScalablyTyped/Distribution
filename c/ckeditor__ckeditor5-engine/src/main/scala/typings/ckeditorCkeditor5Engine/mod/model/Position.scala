package typings.ckeditorCkeditor5Engine.mod.model

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.after
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.before
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.end
import typings.ckeditorCkeditor5Engine.mod.model.operation.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// engine/model/position
@JSImport("@ckeditor/ckeditor5-engine", "model.Position")
@js.native
class Position protected () extends _SchemaContextDefinition {
  def this(root: DocumentFragment, path: js.Array[Double]) = this()
  def this(root: Element, path: js.Array[Double]) = this()
  def this(root: DocumentFragment, path: js.Array[Double], stickiness: PositionStickiness) = this()
  def this(root: Element, path: js.Array[Double], stickiness: PositionStickiness) = this()
  
  def compareWith(otherPosition: Position): PositionRelation = js.native
  
  def getAncestors(): js.Array[Item] = js.native
  
  def getCommonAncestor(position: Position): Element | DocumentFragment | Null = js.native
  
  def getCommonPath(position: Position): js.Array[Double] = js.native
  
  def getLastMatchingPosition(skip: js.Function1[/* t */ TreeWalkerValue, Boolean], options: js.Object): Position = js.native
  
  def getParentPath(): js.Array[Double] = js.native
  
  def getShiftedBy(shift: Double): Position = js.native
  
  def getTransformedByOperation(operation: Operation): Position = js.native
  
  def hasSameParentAs(position: Position): Boolean = js.native
  
  val index: Double = js.native
  
  def isAfter(otherPosition: Position): Boolean = js.native
  
  val isAtEnd: Boolean = js.native
  
  val isAtStart: Boolean = js.native
  
  def isBefore(otherPosition: Position): Boolean = js.native
  
  def isEqual(otherPosition: Position): Boolean = js.native
  
  def isTouching(otherPosition: Position): Boolean = js.native
  
  val nodeAfter: Node | Null = js.native
  
  val nodeBefore: Node = js.native
  
  var offset: Double = js.native
  
  val parent: Element = js.native
  
  val path: js.Array[Double] = js.native
  
  val root: Element | DocumentFragment = js.native
  
  var stickiness: PositionStickiness = js.native
  
  val textNode: Text | Null = js.native
  
  def toJSON(): js.Object = js.native
}
object Position {
  
  /* static member */
  @JSImport("@ckeditor/ckeditor5-engine", "model.Position.createAfter")
  @js.native
  def createAfter(item: Item): Position = js.native
  
  /* static member */
  @JSImport("@ckeditor/ckeditor5-engine", "model.Position.createAt")
  @js.native
  def createAt(itemOrPosition: Item): Unit = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "model.Position.createAt")
  @js.native
  def createAt(itemOrPosition: Item, offset: Double): Unit = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "model.Position.createAt")
  @js.native
  def createAt(itemOrPosition: Position): Unit = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "model.Position.createAt")
  @js.native
  def createAt(itemOrPosition: Position, offset: Double): Unit = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "model.Position.createAt")
  @js.native
  def createAt_after(itemOrPosition: Item, offset: after): Unit = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "model.Position.createAt")
  @js.native
  def createAt_after(itemOrPosition: Position, offset: after): Unit = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "model.Position.createAt")
  @js.native
  def createAt_before(itemOrPosition: Item, offset: before): Unit = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "model.Position.createAt")
  @js.native
  def createAt_before(itemOrPosition: Position, offset: before): Unit = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "model.Position.createAt")
  @js.native
  def createAt_end(itemOrPosition: Item, offset: end): Unit = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "model.Position.createAt")
  @js.native
  def createAt_end(itemOrPosition: Position, offset: end): Unit = js.native
  
  /* static member */
  @JSImport("@ckeditor/ckeditor5-engine", "model.Position.createBefore")
  @js.native
  def createBefore(item: Item): Position = js.native
  
  @JSImport("@ckeditor/ckeditor5-engine", "model.Position.createFromParentAndOffset")
  @js.native
  def createFromParentAndOffset(parent: DocumentFragment, offset: Double): Position = js.native
  /* static member */
  @JSImport("@ckeditor/ckeditor5-engine", "model.Position.createFromParentAndOffset")
  @js.native
  def createFromParentAndOffset(parent: Element, offset: Double): Position = js.native
  
  /* static member */
  @JSImport("@ckeditor/ckeditor5-engine", "model.Position.createFromPosition")
  @js.native
  def createFromPosition(position: Position): Position = js.native
  
  /* static member */
  @JSImport("@ckeditor/ckeditor5-engine", "model.Position.fromJSON")
  @js.native
  def fromJSON(json: js.Object, doc: Document): Position = js.native
}
