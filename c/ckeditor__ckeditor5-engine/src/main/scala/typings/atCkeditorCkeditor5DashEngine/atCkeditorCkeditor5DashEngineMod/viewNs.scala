package typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod

import org.scalablytyped.runtime.StringDictionary
import typings.atCkeditorCkeditor5DashEngine.Anon_Attribute
import typings.atCkeditorCkeditor5DashEngine.Anon_Attributes
import typings.atCkeditorCkeditor5DashEngine.Anon_AttributesClasses
import typings.atCkeditorCkeditor5DashEngine.Anon_Boundaries
import typings.atCkeditorCkeditor5DashEngine.Anon_IncludeSelfBooleanOptional
import typings.atCkeditorCkeditor5DashEngine.Anon_IncludeSelfParentFirst
import typings.atCkeditorCkeditor5DashEngine.Anon_IncludeSelfParentFirstBoolean
import typings.atCkeditorCkeditor5DashEngine.Anon_Priority
import typings.atCkeditorCkeditor5DashEngine.Anon_PriorityNumber
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.AttributeElement
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.ChangeType
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.ContainerElement
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.Document
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.DocumentFragment
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.DocumentSelection
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.DomConverter
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.DowncastWriter
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.EditableElement
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.Element
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.Item
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.Node
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.Position
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.Range
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.Renderer
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.RootEditableElement
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.Text
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.TreeWalkerDirection
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.TreeWalkerValue
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.TreeWalkerValueType
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.View
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.observerNs.DomEventData
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.observerNs.DomEventObserver
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.observerNs.MutationObserver
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.observerNs.Observer
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.attributeElement
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.containerElement
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.documentFragment
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.element
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.emptyElement
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.text
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.textProxy
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.uiElement
import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.Collection
import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.Emitter
import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.KeystrokeInfo
import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.Observable
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Iterable
import typings.std.Iterator
import typings.std.Map
import typings.std.RegExp
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-engine", "view")
@js.native
object viewNs extends js.Object {
  // engine/view/attributeelement
  @js.native
  class AttributeElement protected () extends Element {
    protected def this(name: String) = this()
    protected def this(name: String, attrs: js.Object) = this()
    protected def this(name: String, attrs: Iterable[js.Tuple2[String, String]]) = this()
    protected def this(name: String, attrs: Map[String, String]) = this()
    protected def this(name: String, attrs: js.Object, children: Node) = this()
    protected def this(name: String, attrs: js.Object, children: Iterable[Node]) = this()
    protected def this(name: String, attrs: Iterable[js.Tuple2[String, String]], children: Node) = this()
    protected def this(name: String, attrs: Iterable[js.Tuple2[String, String]], children: Iterable[Node]) = this()
    protected def this(name: String, attrs: Map[String, String], children: Node) = this()
    protected def this(name: String, attrs: Map[String, String], children: Iterable[Node]) = this()
    var _clonesGroup: Set[AttributeElement] | Null = js.native
    var _id: String | Double = js.native
    var _priority: Double = js.native
    val id: String | Double = js.native
    val priority: Double = js.native
    def getElementsWithSameId(): Set[AttributeElement] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.children
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.attributes
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.text
  */
  trait ChangeType extends js.Object
  
  // engine/view/containerelement
  @js.native
  class ContainerElement protected () extends Element {
    protected def this(name: String) = this()
    protected def this(name: String, attrs: js.Object) = this()
    protected def this(name: String, attrs: Iterable[js.Tuple2[String, String]]) = this()
    protected def this(name: String, attrs: Map[String, String]) = this()
    protected def this(name: String, attrs: js.Object, children: Node) = this()
    protected def this(name: String, attrs: js.Object, children: Iterable[Node]) = this()
    protected def this(name: String, attrs: Iterable[js.Tuple2[String, String]], children: Node) = this()
    protected def this(name: String, attrs: Iterable[js.Tuple2[String, String]], children: Iterable[Node]) = this()
    protected def this(name: String, attrs: Map[String, String], children: Node) = this()
    protected def this(name: String, attrs: Map[String, String], children: Iterable[Node]) = this()
  }
  
  // engine/view/document
  @js.native
  class Document () extends Observable {
    val isComposing: Boolean = js.native
    val isFocused: Boolean = js.native
    var isReadOnly: Boolean = js.native
    val roots: Collection[RootEditableElement] = js.native
    val selection: DocumentSelection = js.native
    /* protected */ def _callPostFixers(writer: DowncastWriter): Unit = js.native
    def getRoot(): RootEditableElement | Null = js.native
    def getRoot(name: String): RootEditableElement | Null = js.native
    def listenTo(emitter: Emitter, event: String, callback: js.Function, options: Anon_Priority): Unit = js.native
    def on(event: String, callback: js.Function, options: Anon_PriorityNumber): Unit = js.native
    def once(event: String, callback: js.Function, options: Anon_PriorityNumber): Unit = js.native
    def registerPostFixer(postFixer: js.Function1[/* downcastWriter */ DowncastWriter, Boolean]): Unit = js.native
  }
  
  // engine/view/documentfragment
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
  
  // engine/view/documentselection
  @js.native
  class DocumentSelection () extends js.Object
  
  // engine/view/domconverter
  @js.native
  class DomConverter () extends js.Object
  
  // engine/view/downcastwriter
  @js.native
  class DowncastWriter () extends js.Object
  
  // engine/view/editableelement
  @js.native
  class EditableElement () extends ContainerElement
  
  // engine/view/element
  @js.native
  class Element protected () extends Node {
    protected def this(name: String) = this()
    protected def this(name: String, attrs: js.Object) = this()
    protected def this(name: String, attrs: Iterable[js.Tuple2[String, String]]) = this()
    protected def this(name: String, attrs: Map[String, String]) = this()
    protected def this(name: String, attrs: js.Object, children: Node) = this()
    protected def this(name: String, attrs: js.Object, children: Iterable[Node]) = this()
    protected def this(name: String, attrs: Iterable[js.Tuple2[String, String]], children: Node) = this()
    protected def this(name: String, attrs: Iterable[js.Tuple2[String, String]], children: Iterable[Node]) = this()
    protected def this(name: String, attrs: Map[String, String], children: Node) = this()
    protected def this(name: String, attrs: Map[String, String], children: Iterable[Node]) = this()
    var _attrs: Map[String, String] = js.native
    var _children: js.Array[Node] = js.native
    var _classes: Set[String] = js.native
    var _customProperties: Map[String, _] = js.native
    var _styles: Map[String, String] = js.native
    val childCount: Double = js.native
    val isEmpty: Boolean = js.native
    val name: String = js.native
    /* protected */ def _addClass(className: String): Unit = js.native
    /* protected */ def _addClass(className: js.Array[String]): Unit = js.native
    /* protected */ def _appendChild(items: Item): Double = js.native
    /* protected */ def _appendChild(items: Iterable[Item]): Double = js.native
    /* protected */ def _clone(deep: Boolean): Element = js.native
    /* protected */ def _insertChild(index: Double, items: Item): Double = js.native
    /* protected */ def _insertChild(index: Double, items: Iterable[Item]): Double = js.native
    /* protected */ def _removeAttribute(key: String): Boolean = js.native
    def _removeChildren(index: Double): js.Array[Node] = js.native
    def _removeChildren(index: Double, howMany: Double): js.Array[Node] = js.native
    def _removeClass(className: String): Unit = js.native
    def _removeClass(className: js.Array[String]): Unit = js.native
    /* protected */ def _removeCustomProperty(key: String): Boolean = js.native
    /* protected */ def _removeCustomProperty(key: js.Symbol): Boolean = js.native
    /* protected */ def _removeStyle(property: String): Unit = js.native
    /* protected */ def _removeStyle(property: js.Array[String]): Unit = js.native
    /* protected */ def _setAttribute(key: String, value: String): Unit = js.native
    /* protected */ def _setCustomProperty(key: String, value: js.Any): Unit = js.native
    /* protected */ def _setCustomProperty(key: js.Symbol, value: js.Any): Unit = js.native
    /* protected */ def _setStyle(property: String): Unit = js.native
    /* protected */ def _setStyle(property: String, value: String): Unit = js.native
    /* protected */ def _setStyle(property: StringDictionary[String]): Unit = js.native
    /* protected */ def _setStyle(property: StringDictionary[String], value: String): Unit = js.native
    def findAncestor(patterns: String): Element | Null = js.native
    def findAncestor(patterns: js.Function): Element | Null = js.native
    def findAncestor(patterns: js.Object): Element | Null = js.native
    def findAncestor(patterns: RegExp): Element | Null = js.native
    def getAttribute(key: String): js.UndefOr[String] = js.native
    def getAttributeKeys(): Iterable[String] = js.native
    def getAttributes(): Iterable[_] = js.native
    def getChild(index: Double): Node = js.native
    def getChildIndex(node: Node): Double = js.native
    def getChildren(): Iterable[Node] = js.native
    def getClassNames(): Iterable[String] = js.native
    def getCustomProperties(): Iterable[_] = js.native
    def getCustomProperty(key: String): js.Any = js.native
    def getCustomProperty(key: js.Symbol): js.Any = js.native
    def getFillerOffset(): Unit = js.native
    def getIdentity(): String = js.native
    def getStyle(property: String): js.UndefOr[String] = js.native
    def getStyleNames(): Iterable[String] = js.native
    def hasAttribute(key: String): Boolean = js.native
    def hasClass(className: String): Unit = js.native
    def hasStyle(property: String): Unit = js.native
    def is(`type`: String): Boolean = js.native
    def isSimilar(otherElement: Element): Boolean = js.native
  }
  
  // engine/view/emptyelement
  @js.native
  class EmptyElement protected () extends Element {
    protected def this(name: String) = this()
    protected def this(name: String, attrs: js.Object) = this()
    protected def this(name: String, attrs: Iterable[js.Tuple2[String, String]]) = this()
    protected def this(name: String, attrs: Map[String, String]) = this()
    protected def this(name: String, attrs: js.Object, children: Node) = this()
    protected def this(name: String, attrs: js.Object, children: Iterable[Node]) = this()
    protected def this(name: String, attrs: Iterable[js.Tuple2[String, String]], children: Node) = this()
    protected def this(name: String, attrs: Iterable[js.Tuple2[String, String]], children: Iterable[Node]) = this()
    protected def this(name: String, attrs: Map[String, String], children: Node) = this()
    protected def this(name: String, attrs: Map[String, String], children: Iterable[Node]) = this()
  }
  
  // engine/view/item
  /* Rewritten from type alias, can be one of: 
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.Node
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.viewNs.TextProxy
  */
  trait Item extends js.Object
  
  // engine/view/matcher
  @js.native
  class Matcher () extends js.Object
  
  // engine/view/node
  @js.native
  class Node () extends Item {
    val document: Document | Null = js.native
    val index: Double | Null = js.native
    val nextSibling: Node | Null = js.native
    val parent: Element | DocumentFragment | Null = js.native
    val previousSibling: Node | Null = js.native
    val root: Node | DocumentFragment = js.native
    /* protected */ def _clone(): Node = js.native
    def _fireChange(`type`: ChangeType, node: Node): Unit = js.native
    /* protected */ def _remove(): Unit = js.native
    def getAncestors(options: Anon_IncludeSelfParentFirstBoolean): js.Array[Element | DocumentFragment] = js.native
    def getCommonAncestor(node: Node, options: Anon_IncludeSelfBooleanOptional): Element | DocumentFragment | Null = js.native
    def getPath(): js.Array[Double] = js.native
    def is(`type`: String, name: String): Boolean = js.native
    def isAfter(node: Node): Boolean = js.native
    def isBefore(node: Node): Boolean = js.native
    def isSimilar(otherElement: Node): Boolean = js.native
    @JSName("is")
    def is_attributeElement(`type`: attributeElement): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.AttributeElement */ Boolean = js.native
    @JSName("is")
    def is_containerElement(`type`: containerElement): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.ContainerElement */ Boolean = js.native
    @JSName("is")
    def is_documentFragment(`type`: documentFragment): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.DocumentFragment */ Boolean = js.native
    @JSName("is")
    def is_element(`type`: element): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.Element */ Boolean = js.native
    @JSName("is")
    def is_emptyElement(`type`: emptyElement): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.EmptyElement */ Boolean = js.native
    @JSName("is")
    def is_text(`type`: text): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.Text */ Boolean = js.native
    @JSName("is")
    def is_textProxy(`type`: textProxy): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.TextProxy */ Boolean = js.native
    @JSName("is")
    def is_uiElement(`type`: uiElement): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.UIElement */ Boolean = js.native
    def toJSON(): js.Object = js.native
  }
  
  // engine/view/position
  @js.native
  class Position () extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.before
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.after
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.same
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.different
  */
  trait PositionRelation extends js.Object
  
  // engine/view/range
  @js.native
  class Range () extends js.Object
  
  // engine/view/renderer
  @js.native
  class Renderer () extends js.Object
  
  // engine/view/rooteditableelement
  @js.native
  class RootEditableElement () extends EditableElement
  
  // engine/view/selection
  @js.native
  class Selection () extends js.Object
  
  // engine/view/text
  @js.native
  class Text protected () extends Node {
    protected def this(data: String) = this()
    var _data: String = js.native
    var _textData: String = js.native
    val data: String = js.native
    def isSimilar(otherNode: Text): Boolean = js.native
  }
  
  // engine/view/textproxy
  @js.native
  class TextProxy protected () extends Item {
    protected def this(textNode: Text, offsetInText: Double, length: Double) = this()
    val data: String = js.native
    val document: Document | Null = js.native
    val isPartial: Boolean = js.native
    val offsetInText: Double = js.native
    val offsetSize: Double = js.native
    val parent: Element | DocumentFragment | Null = js.native
    val root: Node | DocumentFragment = js.native
    val textNode: Text = js.native
    def getAncestors(options: Anon_IncludeSelfParentFirst): js.Array[Text | Element | DocumentFragment] = js.native
    def is(`type`: String): Boolean = js.native
    @JSName("is")
    def is_textProxy(`type`: textProxy): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.TextProxy */ Boolean = js.native
  }
  
  // engine/view/treewalker
  @js.native
  class TreeWalker protected () extends js.Object {
    def this(options: Anon_Boundaries) = this()
    val boundaries: Range = js.native
    val direction: TreeWalkerDirection = js.native
    val ignoreElementEnd: Boolean = js.native
    @JSName(scala.scalajs.js.Symbol.iterator)
    var iterator: js.Function0[Iterator[TreeWalkerValue, _, js.UndefOr[scala.Nothing]]] = js.native
    val position: Position = js.native
    val shallow: Boolean = js.native
    val singleCharacters: Boolean = js.native
    def next(): TreeWalkerValue = js.native
    def skip(skip: js.Function1[/* treeWalkerValue */ TreeWalkerValue, Boolean]): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.forward
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.backward
  */
  trait TreeWalkerDirection extends js.Object
  
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
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.text
  */
  trait TreeWalkerValueType extends js.Object
  
  // engine/view/uielement
  @js.native
  class UIElement protected () extends Element {
    protected def this(name: String) = this()
    protected def this(name: String, attrs: js.Object) = this()
    protected def this(name: String, attrs: Iterable[js.Tuple2[String, String]]) = this()
    protected def this(name: String, attrs: Map[String, String]) = this()
    protected def this(name: String, attrs: js.Object, children: Node) = this()
    protected def this(name: String, attrs: js.Object, children: Iterable[Node]) = this()
    protected def this(name: String, attrs: Iterable[js.Tuple2[String, String]], children: Node) = this()
    protected def this(name: String, attrs: Iterable[js.Tuple2[String, String]], children: Iterable[Node]) = this()
    protected def this(name: String, attrs: Map[String, String], children: Node) = this()
    protected def this(name: String, attrs: Map[String, String], children: Iterable[Node]) = this()
    def render(domDocument: /*TODO: globals.*/ Document): HTMLElement = js.native
    def toDomElement(domDocument: /*TODO: globals.*/ Document): HTMLElement = js.native
  }
  
  // engine/view/upcastwriter
  @js.native
  class UpcastWriter () extends js.Object
  
  // engine/view/view
  @js.native
  class View () extends Observable {
    def listenTo(emitter: Emitter, event: String, callback: js.Function, options: Anon_Priority): Unit = js.native
    def on(event: String, callback: js.Function, options: Anon_PriorityNumber): Unit = js.native
    def once(event: String, callback: js.Function, options: Anon_PriorityNumber): Unit = js.native
  }
  
  val INLINE_FILLER: String = js.native
  // engine/view/filler
  val INLINE_FILLER_LENGTH: Double = js.native
  def BR_FILLER(): Unit = js.native
  def NBSP_FILLER(): Unit = js.native
  // engine/view/placeholder
  def attachPlaceholder(view: View, element: Element, placeholderText: String): Unit = js.native
  def attachPlaceholder(view: View, element: Element, placeholderText: String, checkFunction: js.Function): Unit = js.native
  def detachPlaceholder(view: View, element: Element): Unit = js.native
  def getDataWithoutFiller(domText: Text): String = js.native
  def injectQuirksHandling(view: View): Unit = js.native
  def isBlockFiller(domNode: /*TODO globals.*/ Node, blockFiller: js.Function): Boolean = js.native
  def isInlineFiller(domText: /*TODO globals.*/ Text): Boolean = js.native
  def startsWithFiller(domNode: /*TODO globals.*/ Text): Boolean = js.native
  /* static members */
  @js.native
  object AttributeElement extends js.Object {
    var DEFAULT_PRIORITY: Double = js.native
  }
  
  @JSName("observer")
  @js.native
  object observerNs extends js.Object {
    // engine/view/observer/clickobserver
    @js.native
    class ClickObserver () extends DomEventObserver
    
    // engine/view/observer/compositionobserver
    @js.native
    class CompositionObserver () extends DomEventObserver
    
    // engine/view/observer/domeventdata
    @js.native
    class DomEventData () extends js.Object
    
    // engine/view/observer/domeventobserver
    @js.native
    class DomEventObserver () extends Observer {
      val domEventType: String | js.Array[String] = js.native
      var useCapture: Boolean = js.native
      def fire(eventType: String, domEvent: Event): Unit = js.native
      def fire(eventType: String, domEvent: Event, additionalData: js.Object): Unit = js.native
      def onDomEvent(): Unit = js.native
    }
    
    // engine/view/observer/fakeselectionobserver
    @js.native
    class FakeSelectionObserver protected () extends Observer {
      def this(view: View) = this()
      def observe(): Unit = js.native
    }
    
    // engine/view/observer/focusobserver
    @js.native
    class FocusObserver () extends DomEventObserver
    
    // engine/view/observer/keyobserver
    @js.native
    class KeyEventData ()
      extends DomEventData
         with KeystrokeInfo {
      /* CompleteClass */
      override var keyCode: Double = js.native
      var keystroke: Double = js.native
    }
    
    @js.native
    class KeyObserver () extends DomEventObserver
    
    // engine/view/observer/mouseobserver
    @js.native
    class MouseObserver () extends DomEventObserver
    
    trait MutatedChildren extends js.Object {
      var newChildren: js.Array[Node]
      var node: Element
      var oldChildren: js.Array[Node]
      var `type`: String
    }
    
    trait MutatedText extends js.Object {
      var newText: String
      var node: Text
      var oldText: String
      var `type`: String
    }
    
    // engine/view/observer/mutationobserver
    @js.native
    class MutationObserver () extends Observer {
      var domConverter: DomConverter = js.native
      var renderer: Renderer = js.native
    }
    
    // engine/view/observer/observer
    @js.native
    class Observer protected () extends js.Object {
      def this(view: View) = this()
      val document: Document = js.native
      val isEnabled: Boolean = js.native
      val view: View = js.native
      def destroy(): Unit = js.native
      def disable(): Unit = js.native
      def enable(): Unit = js.native
      def observe(domElement: HTMLElement, name: String): Unit = js.native
    }
    
    // engine/view/observer/selectionobserver
    @js.native
    class SelectionObserver () extends Observer {
      val domConverter: DomConverter = js.native
      val mutationObserver: MutationObserver = js.native
      val selection: DocumentSelection = js.native
    }
    
  }
  
  // engine/view/elementdefinition
  type ElementDefinition = String | Anon_Attributes
  type MatcherPattern = (js.Function1[/* element */ Element, Null | Anon_Attribute]) | String | RegExp | Anon_AttributesClasses
}

