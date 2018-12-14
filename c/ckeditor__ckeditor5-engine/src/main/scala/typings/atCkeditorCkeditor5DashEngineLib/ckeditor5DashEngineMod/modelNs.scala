package typings
package atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod

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
  class DocumentFragment protected () extends js.Object {
    protected def this(children: Node) = this()
    protected def this(children: stdLib.Iterable[Node]) = this()
    val childCount: scala.Double = js.native
    val isEmpty: scala.Boolean = js.native
    @JSName(org.scalablytyped.runtime.Symbol.iterator)
    var iterator: js.Function0[stdLib.Iterator[Node]] = js.native
    val markers: stdLib.Map[java.lang.String, Range] = js.native
    val maxOffset: scala.Double = js.native
    val parent: scala.Null = js.native
    val root: DocumentFragment = js.native
    /* protected */ def _appendChild(items: Item): scala.Unit = js.native
    /* protected */ def _appendChild(items: stdLib.Iterable[Item]): scala.Unit = js.native
    /* protected */ def _insertChild(index: scala.Double, items: Item): scala.Unit = js.native
    /* protected */ def _insertChild(index: scala.Double, items: stdLib.Iterable[Item]): scala.Unit = js.native
    /* protected */ def _removeChildren(index: scala.Double): js.Array[Node] = js.native
    /* protected */ def _removeChildren(index: scala.Double, howMany: scala.Double): js.Array[Node] = js.native
    def getChild(index: scala.Double): Node | scala.Null = js.native
    def getChildIndex(node: Node): scala.Double | scala.Null = js.native
    def getChildStartOffset(node: Node): scala.Double | scala.Null = js.native
    def getChildren(): stdLib.Iterable[Node] = js.native
    def getNodeByPath(relativePath: js.Array[scala.Double]): Node | DocumentFragment = js.native
    def getPath(): js.Array[scala.Double] = js.native
     /*TS3.0: []*/def is(`type`: java.lang.String): scala.Boolean = js.native
    def offsetToIndex(offset: scala.Double): scala.Double = js.native
    def toJSON(): js.Object = js.native
  }
  
  // engine/model/documentselection
  @js.native
  class DocumentSelection () extends js.Object
  
  // engine/model/element
  @js.native
  class Element protected () extends Node {
    protected def this(name: java.lang.String) = this()
    protected def this(name: java.lang.String, attrs: js.Array[js.Tuple2[java.lang.String, _]]) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Map[java.lang.String, _]) = this()
    protected def this(name: java.lang.String, attrs: js.Array[js.Tuple2[java.lang.String, _]], children: Node) = this()
    protected def this(name: java.lang.String, attrs: js.Array[js.Tuple2[java.lang.String, _]], children: stdLib.Iterable[Node]) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Map[java.lang.String, _], children: Node) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Map[java.lang.String, _], children: stdLib.Iterable[Node]) = this()
    val childCount: scala.Double = js.native
    val isEmpty: scala.Boolean = js.native
    val maxOffset: scala.Double = js.native
    val name: java.lang.String = js.native
    /* protected */ def _appendChild(nodes: Item): scala.Unit = js.native
    /* protected */ def _appendChild(nodes: stdLib.Iterable[Item]): scala.Unit = js.native
    /* protected */ def _clone(): Element = js.native
    /* protected */ def _clone(deep: scala.Boolean): Element = js.native
    /* protected */ def _insertChild(index: scala.Double, items: Item): scala.Unit = js.native
    /* protected */ def _insertChild(index: scala.Double, items: stdLib.Iterable[Item]): scala.Unit = js.native
    /* protected */ def _removeChildren(index: scala.Double): js.Array[Node] = js.native
    /* protected */ def _removeChildren(index: scala.Double, howMany: scala.Double): js.Array[Node] = js.native
    def getChild(index: scala.Double): Node = js.native
    def getChildIndex(node: Node): scala.Double = js.native
    def getChildStartOffset(node: Node): scala.Double = js.native
    def getChildren(): stdLib.Iterable[Node] = js.native
    def getNodeByPath(relativePath: js.Array[scala.Double]): Node = js.native
    def is(`type`: java.lang.String): scala.Boolean = js.native
    def offsetToIndex(offset: scala.Double): scala.Double = js.native
  }
  
  // engine/model/history
  @js.native
  class History () extends js.Object
  
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
  class Model ()
    extends atCkeditorCkeditor5DashUtilsLib.ckeditor5DashUtilsMod.Observable {
    val document: Document = js.native
    val markers: MarkerCollection = js.native
    val schema: Schema = js.native
    def applyOperation(operation: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.operationNs.Operation): scala.Unit = js.native
    def change(callback: js.Function): js.Any = js.native
    def deleteContent(
      selection: DocumentSelection,
      batch: Batch,
      options: atCkeditorCkeditor5DashEngineLib.Anon_LeaveUnmergedDoNotResetEntireContent
    ): scala.Unit = js.native
    def deleteContent(
      selection: Selection,
      batch: Batch,
      options: atCkeditorCkeditor5DashEngineLib.Anon_LeaveUnmergedDoNotResetEntireContent
    ): scala.Unit = js.native
    def destroy(): scala.Unit = js.native
    def enqueueChange(batchOrType: Batch, callback: js.Function): scala.Unit = js.native
    @JSName("enqueueChange")
    def enqueueChange_default(
      batchOrType: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.default,
      callback: js.Function
    ): scala.Unit = js.native
    @JSName("enqueueChange")
    def enqueueChange_transparent(
      batchOrType: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.transparent,
      callback: js.Function
    ): scala.Unit = js.native
    def getSelectedContent(selection: DocumentSelection): DocumentFragment = js.native
    def getSelectedContent(selection: Selection): DocumentFragment = js.native
    def hasContent(rangeOrElement: Element): scala.Boolean = js.native
    def hasContent(rangeOrElement: Range): scala.Boolean = js.native
    def insertContent(content: DocumentFragment): scala.Unit = js.native
    def insertContent(content: DocumentFragment, selectable: DocumentSelection): scala.Unit = js.native
    def insertContent(content: DocumentFragment, selectable: Element): scala.Unit = js.native
    def insertContent(content: DocumentFragment, selectable: Position): scala.Unit = js.native
    def insertContent(content: DocumentFragment, selectable: Range): scala.Unit = js.native
    def insertContent(content: DocumentFragment, selectable: Selection): scala.Unit = js.native
    def insertContent(content: DocumentFragment, selectable: stdLib.Iterable[Range]): scala.Unit = js.native
    def insertContent(content: Item): scala.Unit = js.native
    def insertContent(content: Item, selectable: DocumentSelection): scala.Unit = js.native
    def insertContent(content: Item, selectable: Element): scala.Unit = js.native
    def insertContent(content: Item, selectable: Position): scala.Unit = js.native
    def insertContent(content: Item, selectable: Range): scala.Unit = js.native
    def insertContent(content: Item, selectable: Selection): scala.Unit = js.native
    def insertContent(content: Item, selectable: stdLib.Iterable[Range]): scala.Unit = js.native
    def modifySelection(selection: DocumentSelection): scala.Unit = js.native
    def modifySelection(selection: DocumentSelection, options: atCkeditorCkeditor5DashEngineLib.Anon_Direction): scala.Unit = js.native
    def modifySelection(selection: Selection): scala.Unit = js.native
    def modifySelection(selection: Selection, options: atCkeditorCkeditor5DashEngineLib.Anon_Direction): scala.Unit = js.native
  }
  
  // engine/model/node
  @js.native
  class Node () extends js.Object {
    def this(attrs: js.Array[js.Tuple2[java.lang.String, _]]) = this()
    def this(attrs: stdLib.Map[java.lang.String, _]) = this()
    val document: Document | scala.Null = js.native
    val endOffset: scala.Double | scala.Null = js.native
    val index: scala.Double | scala.Null = js.native
    val nextSibling: Node | scala.Null = js.native
    val offsetSize: scala.Double = js.native
    val parent: Element | DocumentFragment | scala.Null = js.native
    val previousSibling: Node | scala.Null = js.native
    val root: Node | DocumentFragment = js.native
    val startOffset: scala.Double | scala.Null = js.native
    def getAncestors(options: atCkeditorCkeditor5DashEngineLib.Anon_ParentFirst): js.Array[Node] = js.native
    def getAttribute(key: java.lang.String): js.Any = js.native
    def getAttributeKeys(): stdLib.Iterable[java.lang.String] = js.native
    def getAttributes(): stdLib.Iterable[_] = js.native
    def getCommonAncestor(node: Node): Element | DocumentFragment | scala.Null = js.native
    def getCommonAncestor(node: Node, options: atCkeditorCkeditor5DashEngineLib.Anon_IncludeSelf): Element | DocumentFragment | scala.Null = js.native
    def getPath(): js.Array[scala.Double] = js.native
    def hasAttribute(key: java.lang.String): scala.Boolean = js.native
    def is(`type`: java.lang.String, name: java.lang.String): scala.Boolean = js.native
    def isAfter(node: Node): scala.Boolean = js.native
    def isBefore(node: Node): scala.Boolean = js.native
    @JSName("is")
    def is_documentFragment(`type`: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.documentFragment): /* is DocumentFragment */scala.Boolean = js.native
    @JSName("is")
    def is_element(`type`: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.element): /* is Element */scala.Boolean = js.native
    @JSName("is")
    def is_rootElement(`type`: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.rootElement): /* is RootElement */scala.Boolean = js.native
    @JSName("is")
    def is_text(`type`: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.text): /* is Text */scala.Boolean = js.native
    @JSName("is")
    def is_textProxy(`type`: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.textProxy): /* is TextProxy */scala.Boolean = js.native
    def toJSON(): js.Object = js.native
  }
  
  // engine/model/nodelist
  @js.native
  class NodeList ()
    extends stdLib.Iterable[Node] {
    /* CompleteClass */
    @JSName(org.scalablytyped.runtime.Symbol.iterator)
    override var iterator: js.Function0[stdLib.Iterator[Node]] = js.native
    val length: scala.Double = js.native
    val maxOffset: scala.Double = js.native
    def getNode(index: scala.Double): Node | scala.Null = js.native
    def getNodeIndex(node: Node): scala.Double | scala.Null = js.native
    def getNodeStartOffset(node: Node): scala.Double | scala.Null = js.native
    def indexToOffset(index: scala.Double): scala.Double = js.native
    def offsetToIndex(offset: scala.Double): scala.Double = js.native
    def toJSON(): js.Array[Node] = js.native
  }
  
  // engine/model/position
  @js.native
  class Position protected () extends js.Object {
    def this(root: DocumentFragment, path: js.Array[scala.Double]) = this()
    def this(root: Element, path: js.Array[scala.Double]) = this()
    def this(root: DocumentFragment, path: js.Array[scala.Double], stickiness: PositionStickiness) = this()
    def this(root: Element, path: js.Array[scala.Double], stickiness: PositionStickiness) = this()
    val index: scala.Double = js.native
    val isAtEnd: scala.Boolean = js.native
    val isAtStart: scala.Boolean = js.native
    val nodeAfter: Node | scala.Null = js.native
    val nodeBefore: Node = js.native
    var offset: scala.Double = js.native
    val parent: Element = js.native
    val path: js.Array[scala.Double] = js.native
    val root: Element | DocumentFragment = js.native
    var stickiness: PositionStickiness = js.native
    val textNode: Text | scala.Null = js.native
    def compareWith(otherPosition: Position): PositionRelation = js.native
    def getAncestors(): js.Array[Item] = js.native
    def getCommonAncestor(position: Position): Element | DocumentFragment | scala.Null = js.native
    def getCommonPath(position: Position): js.Array[scala.Double] = js.native
    def getLastMatchingPosition(skip: js.Function1[/* t */ TreeWalkerValue, scala.Boolean], options: js.Object): Position = js.native
    def getParentPath(): js.Array[scala.Double] = js.native
    def getShiftedBy(shift: scala.Double): Position = js.native
    def getTransformedByOperation(operation: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.operationNs.Operation): Position = js.native
    def hasSameParentAs(position: Position): scala.Boolean = js.native
    def isAfter(otherPosition: Position): scala.Boolean = js.native
    def isBefore(otherPosition: Position): scala.Boolean = js.native
    def isEqual(otherPosition: Position): scala.Boolean = js.native
    def isTouching(otherPosition: Position): scala.Boolean = js.native
    def toJSON(): js.Object = js.native
  }
  
  // engine/model/range
  @js.native
  class Range protected ()
    extends stdLib.Iterable[Node] {
    def this(start: Position) = this()
    def this(start: Position, end: Position) = this()
    val end: Position = js.native
    var isCollapsed: scala.Boolean = js.native
    var isFlat: scala.Boolean = js.native
    /* CompleteClass */
    @JSName(org.scalablytyped.runtime.Symbol.iterator)
    override var iterator: js.Function0[stdLib.Iterator[Node]] = js.native
    var root: Element | DocumentFragment = js.native
    val start: Position = js.native
    def containsItem(item: Item): scala.Unit = js.native
    def containsPosition(position: Position): scala.Boolean = js.native
    def containsRange(otherRange: Range): scala.Boolean = js.native
    def containsRange(otherRange: Range, loose: scala.Boolean): scala.Boolean = js.native
    def getCommonAncestor(): Element | DocumentFragment | scala.Null = js.native
    def getDifference(otherRange: Range): js.Array[Range] = js.native
    def getIntersection(otherRange: Range): Range | scala.Null = js.native
    def getMinimalFlatRanges(): js.Array[Range] = js.native
    def getPositions(options: js.Object): stdLib.Iterable[Position] = js.native
    def getTransformedByOperation(operation: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.operationNs.Operation): js.Array[Range] = js.native
    def getTransformedByOperations(
      operations: stdLib.Iterable[
          atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.operationNs.Operation
        ]
    ): js.Array[Range] = js.native
    def getWalker(options: atCkeditorCkeditor5DashEngineLib.Anon_IgnoreElementEnd): scala.Unit = js.native
    def isEqual(otherRange: Range): scala.Boolean = js.native
    def isIntersecting(otherRange: Range): scala.Boolean = js.native
    def toJSON(): js.Object = js.native
  }
  
  // engine/model/rootelement
  @js.native
  class RootElement protected () extends Element {
    def this(doc: Document, name: java.lang.String, rootName: java.lang.String) = this()
    val rootName: java.lang.String = js.native
  }
  
  // engine/model/schema
  @js.native
  class Schema () extends js.Object
  
  
  trait SchemaCompiledItemDefinition extends js.Object {
    var allowAttributes: java.lang.String | js.Array[java.lang.String]
    var allowIn: java.lang.String | js.Array[java.lang.String]
    var isBlock: scala.Boolean
    var isLimit: scala.Boolean
    var isObject: scala.Boolean
    var name: java.lang.String
  }
  
  @js.native
  class SchemaContext () extends js.Object
  
  
  trait SchemaContextItem extends js.Object {
    var getAttributeKeys: stdLib.Iterable[java.lang.String]
    var name: java.lang.String
    def getAttribute(key: java.lang.String): java.lang.String
  }
  
  
  trait SchemaItemDefinition extends js.Object {
    var allowAttributes: java.lang.String | js.Array[java.lang.String]
    var allowAttributesOf: java.lang.String | js.Array[java.lang.String]
    var allowContentOf: java.lang.String | js.Array[java.lang.String]
    var allowIn: java.lang.String | js.Array[java.lang.String]
    var allowWhere: java.lang.String | js.Array[java.lang.String]
    var inheritAllFrom: java.lang.String | js.Array[java.lang.String]
    var inheritTypesFrom: java.lang.String | js.Array[java.lang.String]
    var isBlock: scala.Boolean
    var isLimit: scala.Boolean
    var isObject: scala.Boolean
  }
  
  // engine/model/selection
  @js.native
  class Selection ()
    extends atCkeditorCkeditor5DashUtilsLib.ckeditor5DashUtilsMod.Emitter
  
  // engine/model/text
  @js.native
  class Text protected () extends Node {
    protected def this(data: java.lang.String) = this()
    protected def this(data: java.lang.String, attrs: js.Array[js.Tuple2[java.lang.String, _]]) = this()
    protected def this(data: java.lang.String, attrs: stdLib.Map[java.lang.String, _]) = this()
    var _data: java.lang.String = js.native
    val data: java.lang.String = js.native
    /* protected */ def _clone(): Text = js.native
  }
  
  // engine/model/textproxy
  @js.native
  class TextProxy protected () extends js.Object {
    protected def this(textNode: Text, offsetInText: scala.Double, length: scala.Double) = this()
    val data: java.lang.String = js.native
    val document: Document | scala.Null = js.native
    val endOffset: scala.Double = js.native
    val isPartial: scala.Boolean = js.native
    val offsetInText: scala.Double = js.native
    val offsetSize: scala.Double = js.native
    val parent: Element | DocumentFragment | scala.Null = js.native
    val root: Node | DocumentFragment = js.native
    val startOffset: scala.Double = js.native
    val textNode: Text = js.native
    def getAncestors(options: atCkeditorCkeditor5DashEngineLib.Anon_ParentFirstIncludeSelf): js.Array[TextProxy | Element | DocumentFragment] = js.native
    def getAttribute(key: java.lang.String): js.Any = js.native
    def getAttributeKeys(): stdLib.Iterable[java.lang.String] = js.native
    def getAttributes(): stdLib.Iterable[_] = js.native
    def getPath(): js.Array[scala.Double] = js.native
    def hasAttribute(key: java.lang.String): scala.Boolean = js.native
    def is(`type`: java.lang.String): scala.Boolean = js.native
    @JSName("is")
    def is_textProxy(`type`: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.textProxy): /* is TextProxy */scala.Boolean = js.native
  }
  
  // engine/model/treewalker
  @js.native
  class TreeWalker ()
    extends stdLib.Iterable[TreeWalkerValue] {
    def this(options: atCkeditorCkeditor5DashEngineLib.Anon_SingleCharacters) = this()
    val boundaries: Range = js.native
    val direction: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.backward | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.forward = js.native
    val ignoreElementEnd: scala.Boolean = js.native
    /* CompleteClass */
    @JSName(org.scalablytyped.runtime.Symbol.iterator)
    override var iterator: js.Function0[stdLib.Iterator[TreeWalkerValue]] = js.native
    val position: Position = js.native
    val shallow: scala.Boolean = js.native
    val singleCharacters: scala.Boolean = js.native
    def next(): TreeWalkerValue = js.native
    def skip(skip: js.Function1[/* t */ TreeWalkerValue, scala.Boolean]): scala.Unit = js.native
  }
  
  
  trait TreeWalkerValue extends js.Object {
    var item: Item
    var length: scala.Double
    var nextPosition: Position
    var previousPosition: Position
    var `type`: TreeWalkerValueType
  }
  
  // engine/model/writer
  @js.native
  class Writer () extends js.Object
  
  def getItems(options: js.Object): stdLib.Iterable[Item] = js.native
  // engine/model/documentfragment
  @js.native
  object DocumentFragment extends js.Object {
    def fromJSON(json: js.Object): atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentFragment = js.native
  }
  
  // engine/model/element
  @js.native
  object Element extends js.Object {
    def fromJSON(json: js.Object): atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Element = js.native
  }
  
  // engine/model/position
  @js.native
  object Position extends js.Object {
    def createAfter(item: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Item): atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Position = js.native
    def createAt(itemOrPosition: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Item): scala.Unit = js.native
    def createAt(
      itemOrPosition: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Item,
      offset: scala.Double
    ): scala.Unit = js.native
    def createAt(itemOrPosition: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Position): scala.Unit = js.native
    def createAt(
      itemOrPosition: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Position,
      offset: scala.Double
    ): scala.Unit = js.native
    @JSName("createAt")
    def createAt_after(
      itemOrPosition: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Item,
      offset: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.after
    ): scala.Unit = js.native
    @JSName("createAt")
    def createAt_after(
      itemOrPosition: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Position,
      offset: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.after
    ): scala.Unit = js.native
    @JSName("createAt")
    def createAt_before(
      itemOrPosition: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Item,
      offset: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.before
    ): scala.Unit = js.native
    @JSName("createAt")
    def createAt_before(
      itemOrPosition: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Position,
      offset: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.before
    ): scala.Unit = js.native
    @JSName("createAt")
    def createAt_end(
      itemOrPosition: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Item,
      offset: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.end
    ): scala.Unit = js.native
    @JSName("createAt")
    def createAt_end(
      itemOrPosition: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Position,
      offset: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.end
    ): scala.Unit = js.native
    def createBefore(item: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Item): atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Position = js.native
    def createFromParentAndOffset(
      parent: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentFragment,
      offset: scala.Double
    ): atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Position = js.native
    def createFromParentAndOffset(
      parent: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Element,
      offset: scala.Double
    ): atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Position = js.native
    def createFromPosition(position: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Position): atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Position = js.native
    def fromJSON(json: js.Object, doc: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Document): atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Position = js.native
  }
  
  // engine/model/text
  @js.native
  object Text extends js.Object {
    def fromJSON(json: js.Object): atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Text = js.native
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
    def transformSets(
      operationsA: js.Array[Operation],
      operationsB: js.Array[Operation],
      options: atCkeditorCkeditor5DashEngineLib.Anon_UseRelations
    ): js.Object = js.native
  }
  
  @JSName("utils")
  @js.native
  object utilsNs extends js.Object {
    def deleteContent(
      model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model,
      selection: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentSelection,
      batch: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Batch
    ): scala.Unit = js.native
    def deleteContent(
      model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model,
      selection: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentSelection,
      batch: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Batch,
      options: atCkeditorCkeditor5DashEngineLib.Anon_LeaveUnmerged
    ): scala.Unit = js.native
    def deleteContent(
      model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model,
      selection: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Selection,
      batch: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Batch
    ): scala.Unit = js.native
    def deleteContent(
      model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model,
      selection: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Selection,
      batch: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Batch,
      options: atCkeditorCkeditor5DashEngineLib.Anon_LeaveUnmerged
    ): scala.Unit = js.native
    def getSelectedContent(
      model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model,
      selection: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentSelection
    ): atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentFragment = js.native
    def getSelectedContent(
      model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model,
      selection: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Selection
    ): atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentFragment = js.native
    def injectSelectionPostFixer(model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model): scala.Unit = js.native
    def insertContent(
      model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model,
      content: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentFragment
    ): scala.Unit = js.native
    def insertContent(
      model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model,
      content: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentFragment,
      selectable: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentSelection
    ): scala.Unit = js.native
    def insertContent(
      model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model,
      content: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentFragment,
      selectable: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Element
    ): scala.Unit = js.native
    def insertContent(
      model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model,
      content: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentFragment,
      selectable: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Position
    ): scala.Unit = js.native
    def insertContent(
      model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model,
      content: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentFragment,
      selectable: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Range
    ): scala.Unit = js.native
    def insertContent(
      model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model,
      content: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentFragment,
      selectable: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Selection
    ): scala.Unit = js.native
    def insertContent(
      model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model,
      content: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentFragment,
      selectable: stdLib.Iterable[atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Range]
    ): scala.Unit = js.native
    def insertContent(
      model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model,
      content: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Item
    ): scala.Unit = js.native
    def insertContent(
      model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model,
      content: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Item,
      selectable: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentSelection
    ): scala.Unit = js.native
    def insertContent(
      model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model,
      content: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Item,
      selectable: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Element
    ): scala.Unit = js.native
    def insertContent(
      model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model,
      content: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Item,
      selectable: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Position
    ): scala.Unit = js.native
    def insertContent(
      model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model,
      content: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Item,
      selectable: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Range
    ): scala.Unit = js.native
    def insertContent(
      model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model,
      content: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Item,
      selectable: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Selection
    ): scala.Unit = js.native
    def insertContent(
      model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model,
      content: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Item,
      selectable: stdLib.Iterable[atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Range]
    ): scala.Unit = js.native
    def modifySelection(
      model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model,
      selection: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentSelection
    ): scala.Unit = js.native
    def modifySelection(
      model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model,
      selection: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.DocumentSelection,
      options: atCkeditorCkeditor5DashEngineLib.Anon_Direction
    ): scala.Unit = js.native
    def modifySelection(
      model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model,
      selection: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Selection
    ): scala.Unit = js.native
    def modifySelection(
      model: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Model,
      selection: atCkeditorCkeditor5DashEngineLib.ckeditor5DashEngineMod.modelNs.Selection,
      options: atCkeditorCkeditor5DashEngineLib.Anon_Direction
    ): scala.Unit = js.native
  }
  
  // engine/model/item
  type Item = Node | TextProxy
  type NodeSet = Node | TextProxy | java.lang.String | NodeList | DocumentFragment | stdLib.Iterable[js.Any]
  type PositionRelation = atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.before | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.after | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.same
  type PositionStickiness = atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.toNone | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.toNext | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.toPrevious
  type SchemaContextDefinition = Node | Position | SchemaContext | java.lang.String | (js.Array[java.lang.String | Node])
  type TreeWalkerValueType = atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.elementStart | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.elementEnd | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.character | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.text
}

