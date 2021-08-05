package typings.ckeditorCkeditor5Engine.mod.model

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.after
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.before
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.end
import typings.ckeditorCkeditor5Engine.mod.model.operation.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// engine/model/position
@JSImport("@ckeditor/ckeditor5-engine", "model.Position")
@js.native
class Position protected ()
  extends StObject
     with _SchemaContextDefinition {
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
  
  @JSImport("@ckeditor/ckeditor5-engine", "model.Position")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createAfter(item: Item): Position = ^.asInstanceOf[js.Dynamic].applyDynamic("createAfter")(item.asInstanceOf[js.Any]).asInstanceOf[Position]
  
  /* static member */
  inline def createAt(itemOrPosition: Item): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAt")(itemOrPosition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def createAt(itemOrPosition: Item, offset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAt")(itemOrPosition.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createAt(itemOrPosition: Position): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAt")(itemOrPosition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def createAt(itemOrPosition: Position, offset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAt")(itemOrPosition.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createAt_after(itemOrPosition: Item, offset: after): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAt")(itemOrPosition.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createAt_after(itemOrPosition: Position, offset: after): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAt")(itemOrPosition.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createAt_before(itemOrPosition: Item, offset: before): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAt")(itemOrPosition.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createAt_before(itemOrPosition: Position, offset: before): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAt")(itemOrPosition.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createAt_end(itemOrPosition: Item, offset: end): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAt")(itemOrPosition.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createAt_end(itemOrPosition: Position, offset: end): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAt")(itemOrPosition.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def createBefore(item: Item): Position = ^.asInstanceOf[js.Dynamic].applyDynamic("createBefore")(item.asInstanceOf[js.Any]).asInstanceOf[Position]
  
  inline def createFromParentAndOffset(parent: DocumentFragment, offset: Double): Position = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromParentAndOffset")(parent.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Position]
  /* static member */
  inline def createFromParentAndOffset(parent: Element, offset: Double): Position = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromParentAndOffset")(parent.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Position]
  
  /* static member */
  inline def createFromPosition(position: Position): Position = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromPosition")(position.asInstanceOf[js.Any]).asInstanceOf[Position]
  
  /* static member */
  inline def fromJSON(json: js.Object, doc: Document): Position = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Position]
}
