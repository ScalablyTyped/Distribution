package typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod

import typings.atCkeditorCkeditor5DashEngine.Anon_Backward
import typings.atCkeditorCkeditor5DashEngine.Anon_BackwardBoundaries
import typings.atCkeditorCkeditor5DashEngine.Anon_DoNotResetEntireContent
import typings.atCkeditorCkeditor5DashEngine.Anon_DoNotResetEntireContentLeaveUnmerged
import typings.atCkeditorCkeditor5DashEngine.Anon_Document
import typings.atCkeditorCkeditor5DashEngine.Anon_IgnoreElementEnd
import typings.atCkeditorCkeditor5DashEngine.Anon_IncludeSelf
import typings.atCkeditorCkeditor5DashEngine.Anon_IncludeSelfBoolean
import typings.atCkeditorCkeditor5DashEngine.Anon_IncludeSelfParentFirst
import typings.atCkeditorCkeditor5DashEngine.Anon_Priority
import typings.atCkeditorCkeditor5DashEngine.Anon_PriorityNumber
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Batch
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Document
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.DocumentFragment
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.DocumentSelection
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Element
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Item
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.MarkerCollection
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Model
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Node
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Position
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.PositionRelation
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.PositionStickiness
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Range
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Schema
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Selection
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Text
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.TextProxy
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.TreeWalkerValue
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.TreeWalkerValueType
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs._NodeSet
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs._SchemaContextDefinition
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.operationNs.Operation
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.operationNs.TransformationContext
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.after
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.backward
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.before
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.default
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.documentFragment
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.element
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.end
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.forward
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.rootElement
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.text
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.textProxy
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.transparent
import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.Emitter
import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.Observable
import typings.std.Iterable
import typings.std.Iterator
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-engine", "model")
@js.native
object modelNs extends js.Object {
  // engine/model/batch
  @js.native
  class Batch () extends js.Object
  
  // engine/model/differ
  @js.native
  class Differ () extends js.Object
  
  // engine/model/document
  @js.native
  class Document () extends js.Object
  
  // engine/model/documentfragment
  @js.native
  class DocumentFragment protected () extends _NodeSet {
    protected def this(children: Node) = this()
    protected def this(children: Iterable[Node]) = this()
    val childCount: Double = js.native
    val isEmpty: Boolean = js.native
    @JSName(scala.scalajs.js.Symbol.iterator)
    var iterator: js.Function0[Iterator[Node]] = js.native
    val markers: Map[String, Range] = js.native
    val maxOffset: Double = js.native
    val parent: Null = js.native
    val root: DocumentFragment = js.native
    /* protected */ def _appendChild(items: Item): Unit = js.native
    /* protected */ def _appendChild(items: Iterable[Item]): Unit = js.native
    /* protected */ def _insertChild(index: Double, items: Item): Unit = js.native
    /* protected */ def _insertChild(index: Double, items: Iterable[Item]): Unit = js.native
    /* protected */ def _removeChildren(index: Double): js.Array[Node] = js.native
    /* protected */ def _removeChildren(index: Double, howMany: Double): js.Array[Node] = js.native
    def getChild(index: Double): Node | Null = js.native
    def getChildIndex(node: Node): Double | Null = js.native
    def getChildStartOffset(node: Node): Double | Null = js.native
    def getChildren(): Iterable[Node] = js.native
    def getNodeByPath(relativePath: js.Array[Double]): Node | DocumentFragment = js.native
    def getPath(): js.Array[Double] = js.native
     /*TS3.0: []*/ def is(`type`: String): Boolean = js.native
    def offsetToIndex(offset: Double): Double = js.native
    def toJSON(): js.Object = js.native
  }
  
  // engine/model/documentselection
  @js.native
  class DocumentSelection () extends js.Object
  
  // engine/model/element
  @js.native
  class Element protected () extends Node {
    protected def this(name: String) = this()
    protected def this(name: String, attrs: js.Array[js.Tuple2[String, _]]) = this()
    protected def this(name: String, attrs: Map[String, _]) = this()
    protected def this(name: String, attrs: js.Array[js.Tuple2[String, _]], children: Node) = this()
    protected def this(name: String, attrs: js.Array[js.Tuple2[String, _]], children: Iterable[Node]) = this()
    protected def this(name: String, attrs: Map[String, _], children: Node) = this()
    protected def this(name: String, attrs: Map[String, _], children: Iterable[Node]) = this()
    val childCount: Double = js.native
    val isEmpty: Boolean = js.native
    val maxOffset: Double = js.native
    val name: String = js.native
    /* protected */ def _appendChild(nodes: Item): Unit = js.native
    /* protected */ def _appendChild(nodes: Iterable[Item]): Unit = js.native
    /* protected */ def _clone(): Element = js.native
    /* protected */ def _clone(deep: Boolean): Element = js.native
    /* protected */ def _insertChild(index: Double, items: Item): Unit = js.native
    /* protected */ def _insertChild(index: Double, items: Iterable[Item]): Unit = js.native
    /* protected */ def _removeChildren(index: Double): js.Array[Node] = js.native
    /* protected */ def _removeChildren(index: Double, howMany: Double): js.Array[Node] = js.native
    def getChild(index: Double): Node = js.native
    def getChildIndex(node: Node): Double = js.native
    def getChildStartOffset(node: Node): Double = js.native
    def getChildren(): Iterable[Node] = js.native
    def getNodeByPath(relativePath: js.Array[Double]): Node = js.native
    def is(`type`: String): Boolean = js.native
    def offsetToIndex(offset: Double): Double = js.native
  }
  
  // engine/model/history
  @js.native
  class History () extends js.Object
  
  // engine/model/item
  /* Rewritten from type alias, can be one of: 
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Node
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.TextProxy
  */
  trait Item extends js.Object
  
  // engine/model/liveposition
  @js.native
  class LivePosition () extends js.Object
  
  // engine/model/liverange
  @js.native
  class LiveRange () extends js.Object
  
  // engine/model/markercollection
  @js.native
  class Marker () extends js.Object
  
  @js.native
  class MarkerCollection () extends js.Object
  
  // engine/model/model
  @js.native
  class Model () extends Observable {
    val document: Document = js.native
    val markers: MarkerCollection = js.native
    val schema: Schema = js.native
    def applyOperation(operation: Operation): Unit = js.native
    def change(callback: js.Function): js.Any = js.native
    def deleteContent(selection: DocumentSelection, batch: Batch, options: Anon_DoNotResetEntireContentLeaveUnmerged): Unit = js.native
    def deleteContent(selection: Selection, batch: Batch, options: Anon_DoNotResetEntireContentLeaveUnmerged): Unit = js.native
    def destroy(): Unit = js.native
    def enqueueChange(batchOrType: Batch, callback: js.Function): Unit = js.native
    @JSName("enqueueChange")
    def enqueueChange_default(batchOrType: default, callback: js.Function): Unit = js.native
    @JSName("enqueueChange")
    def enqueueChange_transparent(batchOrType: transparent, callback: js.Function): Unit = js.native
    def getSelectedContent(selection: DocumentSelection): DocumentFragment = js.native
    def getSelectedContent(selection: Selection): DocumentFragment = js.native
    def hasContent(rangeOrElement: Element): Boolean = js.native
    def hasContent(rangeOrElement: Range): Boolean = js.native
    def insertContent(content: DocumentFragment): Unit = js.native
    def insertContent(content: DocumentFragment, selectable: DocumentSelection): Unit = js.native
    def insertContent(content: DocumentFragment, selectable: Element): Unit = js.native
    def insertContent(content: DocumentFragment, selectable: Position): Unit = js.native
    def insertContent(content: DocumentFragment, selectable: Range): Unit = js.native
    def insertContent(content: DocumentFragment, selectable: Selection): Unit = js.native
    def insertContent(content: DocumentFragment, selectable: Iterable[Range]): Unit = js.native
    def insertContent(content: Item): Unit = js.native
    def insertContent(content: Item, selectable: DocumentSelection): Unit = js.native
    def insertContent(content: Item, selectable: Element): Unit = js.native
    def insertContent(content: Item, selectable: Position): Unit = js.native
    def insertContent(content: Item, selectable: Range): Unit = js.native
    def insertContent(content: Item, selectable: Selection): Unit = js.native
    def insertContent(content: Item, selectable: Iterable[Range]): Unit = js.native
    def listenTo(emitter: Emitter, event: String, callback: js.Function, options: Anon_Priority): Unit = js.native
    def modifySelection(selection: DocumentSelection): Unit = js.native
    def modifySelection(selection: DocumentSelection, options: Anon_Backward): Unit = js.native
    def modifySelection(selection: Selection): Unit = js.native
    def modifySelection(selection: Selection, options: Anon_Backward): Unit = js.native
    def on(event: String, callback: js.Function, options: Anon_PriorityNumber): Unit = js.native
    def once(event: String, callback: js.Function, options: Anon_PriorityNumber): Unit = js.native
  }
  
  // engine/model/node
  @js.native
  class Node ()
    extends Item
       with _NodeSet
       with _SchemaContextDefinition {
    def this(attrs: js.Array[js.Tuple2[String, _]]) = this()
    def this(attrs: Map[String, _]) = this()
    val document: Document | Null = js.native
    val endOffset: Double | Null = js.native
    val index: Double | Null = js.native
    val nextSibling: Node | Null = js.native
    val offsetSize: Double = js.native
    val parent: Element | DocumentFragment | Null = js.native
    val previousSibling: Node | Null = js.native
    val root: Node | DocumentFragment = js.native
    val startOffset: Double | Null = js.native
    def getAncestors(options: Anon_IncludeSelf): js.Array[Node] = js.native
    def getAttribute(key: String): js.Any = js.native
    def getAttributeKeys(): Iterable[String] = js.native
    def getAttributes(): Iterable[_] = js.native
    def getCommonAncestor(node: Node): Element | DocumentFragment | Null = js.native
    def getCommonAncestor(node: Node, options: Anon_IncludeSelfBoolean): Element | DocumentFragment | Null = js.native
    def getPath(): js.Array[Double] = js.native
    def hasAttribute(key: String): Boolean = js.native
    def is(`type`: String, name: String): Boolean = js.native
    def isAfter(node: Node): Boolean = js.native
    def isBefore(node: Node): Boolean = js.native
    @JSName("is")
    def is_documentFragment(`type`: documentFragment): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.model.DocumentFragment */ Boolean = js.native
    @JSName("is")
    def is_element(`type`: element): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.model.Element */ Boolean = js.native
    @JSName("is")
    def is_rootElement(`type`: rootElement): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.model.RootElement */ Boolean = js.native
    @JSName("is")
    def is_text(`type`: text): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.model.Text */ Boolean = js.native
    @JSName("is")
    def is_textProxy(`type`: textProxy): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.model.TextProxy */ Boolean = js.native
    def toJSON(): js.Object = js.native
  }
  
  // engine/model/nodelist
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
  
  // engine/model/position
  @js.native
  class Position protected () extends _SchemaContextDefinition {
    def this(root: DocumentFragment, path: js.Array[Double]) = this()
    def this(root: Element, path: js.Array[Double]) = this()
    def this(root: DocumentFragment, path: js.Array[Double], stickiness: PositionStickiness) = this()
    def this(root: Element, path: js.Array[Double], stickiness: PositionStickiness) = this()
    val index: Double = js.native
    val isAtEnd: Boolean = js.native
    val isAtStart: Boolean = js.native
    val nodeAfter: Node | Null = js.native
    val nodeBefore: Node = js.native
    var offset: Double = js.native
    val parent: Element = js.native
    val path: js.Array[Double] = js.native
    val root: Element | DocumentFragment = js.native
    var stickiness: PositionStickiness = js.native
    val textNode: Text | Null = js.native
    def compareWith(otherPosition: Position): PositionRelation = js.native
    def getAncestors(): js.Array[Item] = js.native
    def getCommonAncestor(position: Position): Element | DocumentFragment | Null = js.native
    def getCommonPath(position: Position): js.Array[Double] = js.native
    def getLastMatchingPosition(skip: js.Function1[/* t */ TreeWalkerValue, Boolean], options: js.Object): Position = js.native
    def getParentPath(): js.Array[Double] = js.native
    def getShiftedBy(shift: Double): Position = js.native
    def getTransformedByOperation(operation: Operation): Position = js.native
    def hasSameParentAs(position: Position): Boolean = js.native
    def isAfter(otherPosition: Position): Boolean = js.native
    def isBefore(otherPosition: Position): Boolean = js.native
    def isEqual(otherPosition: Position): Boolean = js.native
    def isTouching(otherPosition: Position): Boolean = js.native
    def toJSON(): js.Object = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.before
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.after
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.same
  */
  trait PositionRelation extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.toNone
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.toNext
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.toPrevious
  */
  trait PositionStickiness extends js.Object
  
  // engine/model/range
  @js.native
  class Range protected () extends Iterable[Node] {
    def this(start: Position) = this()
    def this(start: Position, end: Position) = this()
    val end: Position = js.native
    var isCollapsed: Boolean = js.native
    var isFlat: Boolean = js.native
    var root: Element | DocumentFragment = js.native
    val start: Position = js.native
    def containsItem(item: Item): Unit = js.native
    def containsPosition(position: Position): Boolean = js.native
    def containsRange(otherRange: Range): Boolean = js.native
    def containsRange(otherRange: Range, loose: Boolean): Boolean = js.native
    def getCommonAncestor(): Element | DocumentFragment | Null = js.native
    def getDifference(otherRange: Range): js.Array[Range] = js.native
    def getIntersection(otherRange: Range): Range | Null = js.native
    def getMinimalFlatRanges(): js.Array[Range] = js.native
    def getPositions(options: js.Object): Iterable[Position] = js.native
    def getTransformedByOperation(operation: Operation): js.Array[Range] = js.native
    def getTransformedByOperations(operations: Iterable[Operation]): js.Array[Range] = js.native
    def getWalker(options: Anon_IgnoreElementEnd): Unit = js.native
    def isEqual(otherRange: Range): Boolean = js.native
    def isIntersecting(otherRange: Range): Boolean = js.native
    def toJSON(): js.Object = js.native
  }
  
  // engine/model/rootelement
  @js.native
  class RootElement protected () extends Element {
    def this(doc: Document, name: String, rootName: String) = this()
    val rootName: String = js.native
  }
  
  // engine/model/schema
  @js.native
  class Schema () extends js.Object
  
  trait SchemaCompiledItemDefinition extends js.Object {
    var allowAttributes: String | js.Array[String]
    var allowIn: String | js.Array[String]
    var isBlock: Boolean
    var isLimit: Boolean
    var isObject: Boolean
    var name: String
  }
  
  @js.native
  class SchemaContext () extends _SchemaContextDefinition
  
  trait SchemaContextItem extends js.Object {
    var getAttributeKeys: Iterable[String]
    var name: String
    def getAttribute(key: String): String
  }
  
  trait SchemaItemDefinition extends js.Object {
    var allowAttributes: String | js.Array[String]
    var allowAttributesOf: String | js.Array[String]
    var allowContentOf: String | js.Array[String]
    var allowIn: String | js.Array[String]
    var allowWhere: String | js.Array[String]
    var inheritAllFrom: String | js.Array[String]
    var inheritTypesFrom: String | js.Array[String]
    var isBlock: Boolean
    var isLimit: Boolean
    var isObject: Boolean
  }
  
  // engine/model/selection
  @js.native
  class Selection () extends Emitter {
    def listenTo(emitter: Emitter, event: String, callback: js.Function, options: Anon_Priority): Unit = js.native
    def on(event: String, callback: js.Function, options: Anon_PriorityNumber): Unit = js.native
    def once(event: String, callback: js.Function, options: Anon_PriorityNumber): Unit = js.native
  }
  
  // engine/model/text
  @js.native
  class Text protected () extends Node {
    protected def this(data: String) = this()
    protected def this(data: String, attrs: js.Array[js.Tuple2[String, _]]) = this()
    protected def this(data: String, attrs: Map[String, _]) = this()
    var _data: String = js.native
    val data: String = js.native
    /* protected */ def _clone(): Text = js.native
  }
  
  // engine/model/textproxy
  @js.native
  class TextProxy protected ()
    extends Item
       with _NodeSet {
    protected def this(textNode: Text, offsetInText: Double, length: Double) = this()
    val data: String = js.native
    val document: Document | Null = js.native
    val endOffset: Double = js.native
    val isPartial: Boolean = js.native
    val offsetInText: Double = js.native
    val offsetSize: Double = js.native
    val parent: Element | DocumentFragment | Null = js.native
    val root: Node | DocumentFragment = js.native
    val startOffset: Double = js.native
    val textNode: Text = js.native
    def getAncestors(options: Anon_IncludeSelfParentFirst): js.Array[TextProxy | Element | DocumentFragment] = js.native
    def getAttribute(key: String): js.Any = js.native
    def getAttributeKeys(): Iterable[String] = js.native
    def getAttributes(): Iterable[_] = js.native
    def getPath(): js.Array[Double] = js.native
    def hasAttribute(key: String): Boolean = js.native
    def is(`type`: String): Boolean = js.native
    @JSName("is")
    def is_textProxy(`type`: textProxy): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.model.TextProxy */ Boolean = js.native
  }
  
  // engine/model/treewalker
  @js.native
  class TreeWalker () extends Iterable[TreeWalkerValue] {
    def this(options: Anon_BackwardBoundaries) = this()
    val boundaries: Range = js.native
    val direction: backward | forward = js.native
    val ignoreElementEnd: Boolean = js.native
    val position: Position = js.native
    val shallow: Boolean = js.native
    val singleCharacters: Boolean = js.native
    def next(): TreeWalkerValue = js.native
    def skip(skip: js.Function1[/* t */ TreeWalkerValue, Boolean]): Unit = js.native
  }
  
  trait TreeWalkerValue extends js.Object {
    var item: Item
    var length: Double
    var nextPosition: Position
    var previousPosition: Position
    var `type`: TreeWalkerValueType
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.elementStart
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.elementEnd
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.character
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.text
  */
  trait TreeWalkerValueType extends js.Object
  
  // engine/model/writer
  @js.native
  class Writer () extends js.Object
  
  trait _NodeSet extends js.Object
  
  trait _SchemaContextDefinition extends js.Object
  
  def getItems(options: js.Object): Iterable[Item] = js.native
  /* static members */
  @js.native
  object DocumentFragment extends js.Object {
    def fromJSON(json: js.Object): DocumentFragment = js.native
  }
  
  /* static members */
  @js.native
  object Element extends js.Object {
    def fromJSON(json: js.Object): Element = js.native
  }
  
  /* static members */
  @js.native
  object Position extends js.Object {
    def createAfter(item: Item): Position = js.native
    def createAt(itemOrPosition: Item): Unit = js.native
    def createAt(itemOrPosition: Item, offset: Double): Unit = js.native
    def createAt(itemOrPosition: Position): Unit = js.native
    def createAt(itemOrPosition: Position, offset: Double): Unit = js.native
    @JSName("createAt")
    def createAt_after(itemOrPosition: Item, offset: after): Unit = js.native
    @JSName("createAt")
    def createAt_after(itemOrPosition: Position, offset: after): Unit = js.native
    @JSName("createAt")
    def createAt_before(itemOrPosition: Item, offset: before): Unit = js.native
    @JSName("createAt")
    def createAt_before(itemOrPosition: Position, offset: before): Unit = js.native
    @JSName("createAt")
    def createAt_end(itemOrPosition: Item, offset: end): Unit = js.native
    @JSName("createAt")
    def createAt_end(itemOrPosition: Position, offset: end): Unit = js.native
    def createBefore(item: Item): Position = js.native
    def createFromParentAndOffset(parent: DocumentFragment, offset: Double): Position = js.native
    def createFromParentAndOffset(parent: Element, offset: Double): Position = js.native
    def createFromPosition(position: Position): Position = js.native
    def fromJSON(json: js.Object, doc: Document): Position = js.native
  }
  
  /* static members */
  @js.native
  object Text extends js.Object {
    def fromJSON(json: js.Object): Text = js.native
  }
  
  @JSName("operation")
  @js.native
  object operationNs extends js.Object {
    // engine/model/operation/attributeoperation
    @js.native
    class AttributeOperation () extends js.Object
    
    // engine/model/operation/detachoperation
    @js.native
    class DetachOperation () extends js.Object
    
    // engine/model/operation/insertoperation
    @js.native
    class InsertOperation () extends js.Object
    
    // engine/model/operation/markeroperation
    @js.native
    class MarkerOperation () extends js.Object
    
    // engine/model/operation/mergeoperation
    @js.native
    class MergeOperation () extends js.Object
    
    // engine/model/operation/moveoperation
    @js.native
    class MoveOperation () extends js.Object
    
    // engine/model/operation/nooperation
    @js.native
    class NoOperation () extends js.Object
    
    // engine/model/operation/operation
    @js.native
    class Operation () extends js.Object
    
    // engine/model/operation/operationfactory
    @js.native
    class OperationFactory () extends js.Object
    
    // engine/model/operation/renameoperation
    @js.native
    class RenameOperation () extends js.Object
    
    // engine/model/operation/rootattributeoperation
    @js.native
    class RootAttributeOperation () extends js.Object
    
    // engine/model/operation/splitoperation
    @js.native
    class SplitOperation () extends js.Object
    
    // engine/model/operation/transform
    @js.native
    class TransformationContext () extends js.Object
    
    def transform(a: Operation, b: Operation, context: TransformationContext): js.Array[Operation] = js.native
    def transformSets(operationsA: js.Array[Operation], operationsB: js.Array[Operation], options: Anon_Document): js.Object = js.native
  }
  
  @JSName("utils")
  @js.native
  object utilsNs extends js.Object {
    def deleteContent(model: Model, selection: DocumentSelection, batch: Batch): Unit = js.native
    def deleteContent(model: Model, selection: DocumentSelection, batch: Batch, options: Anon_DoNotResetEntireContent): Unit = js.native
    def deleteContent(model: Model, selection: Selection, batch: Batch): Unit = js.native
    def deleteContent(model: Model, selection: Selection, batch: Batch, options: Anon_DoNotResetEntireContent): Unit = js.native
    def getSelectedContent(model: Model, selection: DocumentSelection): DocumentFragment = js.native
    def getSelectedContent(model: Model, selection: Selection): DocumentFragment = js.native
    def injectSelectionPostFixer(model: Model): Unit = js.native
    def insertContent(model: Model, content: DocumentFragment): Unit = js.native
    def insertContent(model: Model, content: DocumentFragment, selectable: DocumentSelection): Unit = js.native
    def insertContent(model: Model, content: DocumentFragment, selectable: Element): Unit = js.native
    def insertContent(model: Model, content: DocumentFragment, selectable: Position): Unit = js.native
    def insertContent(model: Model, content: DocumentFragment, selectable: Range): Unit = js.native
    def insertContent(model: Model, content: DocumentFragment, selectable: Selection): Unit = js.native
    def insertContent(model: Model, content: DocumentFragment, selectable: Iterable[Range]): Unit = js.native
    def insertContent(model: Model, content: Item): Unit = js.native
    def insertContent(model: Model, content: Item, selectable: DocumentSelection): Unit = js.native
    def insertContent(model: Model, content: Item, selectable: Element): Unit = js.native
    def insertContent(model: Model, content: Item, selectable: Position): Unit = js.native
    def insertContent(model: Model, content: Item, selectable: Range): Unit = js.native
    def insertContent(model: Model, content: Item, selectable: Selection): Unit = js.native
    def insertContent(model: Model, content: Item, selectable: Iterable[Range]): Unit = js.native
    def modifySelection(model: Model, selection: DocumentSelection): Unit = js.native
    def modifySelection(model: Model, selection: DocumentSelection, options: Anon_Backward): Unit = js.native
    def modifySelection(model: Model, selection: Selection): Unit = js.native
    def modifySelection(model: Model, selection: Selection, options: Anon_Backward): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Node
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.TextProxy
    - java.lang.String
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.NodeList
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.DocumentFragment
    - typings.std.Iterable[js.Any]
  */
  type NodeSet = _NodeSet | Iterable[js.Any] | String
  /* Rewritten from type alias, can be one of: 
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Node
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Position
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.SchemaContext
    - java.lang.String
    - js.Array[
  java.lang.String | typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.Node]
  */
  type SchemaContextDefinition = _SchemaContextDefinition | (js.Array[String | Node]) | String
}

