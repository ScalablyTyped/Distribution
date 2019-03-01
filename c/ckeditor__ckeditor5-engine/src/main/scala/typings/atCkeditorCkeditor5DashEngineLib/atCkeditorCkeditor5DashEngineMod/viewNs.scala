package typings
package atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-engine", "view")
@js.native
object viewNs extends js.Object {
  // engine/view/attributeelement
  @js.native
  class AttributeElement protected () extends Element {
    protected def this(name: java.lang.String) = this()
    protected def this(name: java.lang.String, attrs: js.Object) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Iterable[js.Tuple2[java.lang.String, java.lang.String]]) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Map[java.lang.String, java.lang.String]) = this()
    protected def this(name: java.lang.String, attrs: js.Object, children: Node) = this()
    protected def this(name: java.lang.String, attrs: js.Object, children: stdLib.Iterable[Node]) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Iterable[js.Tuple2[java.lang.String, java.lang.String]], children: Node) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Iterable[js.Tuple2[java.lang.String, java.lang.String]], children: stdLib.Iterable[Node]) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Map[java.lang.String, java.lang.String], children: Node) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Map[java.lang.String, java.lang.String], children: stdLib.Iterable[Node]) = this()
    var _clonesGroup: stdLib.Set[AttributeElement] | scala.Null = js.native
    var _id: java.lang.String | scala.Double = js.native
    var _priority: scala.Double = js.native
    val id: java.lang.String | scala.Double = js.native
    val priority: scala.Double = js.native
    def getElementsWithSameId(): stdLib.Set[AttributeElement] = js.native
  }
  
  trait ChangeType extends js.Object
  
  // engine/view/containerelement
  @js.native
  class ContainerElement protected () extends Element {
    protected def this(name: java.lang.String) = this()
    protected def this(name: java.lang.String, attrs: js.Object) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Iterable[js.Tuple2[java.lang.String, java.lang.String]]) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Map[java.lang.String, java.lang.String]) = this()
    protected def this(name: java.lang.String, attrs: js.Object, children: Node) = this()
    protected def this(name: java.lang.String, attrs: js.Object, children: stdLib.Iterable[Node]) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Iterable[js.Tuple2[java.lang.String, java.lang.String]], children: Node) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Iterable[js.Tuple2[java.lang.String, java.lang.String]], children: stdLib.Iterable[Node]) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Map[java.lang.String, java.lang.String], children: Node) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Map[java.lang.String, java.lang.String], children: stdLib.Iterable[Node]) = this()
  }
  
  // engine/view/document
  @js.native
  class Document ()
    extends atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.Observable {
    val isComposing: scala.Boolean = js.native
    val isFocused: scala.Boolean = js.native
    var isReadOnly: scala.Boolean = js.native
    val roots: atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.Collection[RootEditableElement] = js.native
    val selection: DocumentSelection = js.native
    /* protected */ def _callPostFixers(writer: DowncastWriter): scala.Unit = js.native
    def getRoot(): RootEditableElement | scala.Null = js.native
    def getRoot(name: java.lang.String): RootEditableElement | scala.Null = js.native
    def listenTo(
      emitter: atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.Emitter,
      event: java.lang.String,
      callback: js.Function,
      options: atCkeditorCkeditor5DashEngineLib.Anon_Priority
    ): scala.Unit = js.native
    def on(
      event: java.lang.String,
      callback: js.Function,
      options: atCkeditorCkeditor5DashEngineLib.Anon_PriorityNumber
    ): scala.Unit = js.native
    def once(
      event: java.lang.String,
      callback: js.Function,
      options: atCkeditorCkeditor5DashEngineLib.Anon_PriorityNumber
    ): scala.Unit = js.native
    def registerPostFixer(postFixer: js.Function1[/* downcastWriter */ DowncastWriter, scala.Boolean]): scala.Unit = js.native
  }
  
  // engine/view/documentfragment
  @js.native
  class DocumentFragment protected () extends js.Object {
    protected def this(children: Node) = this()
    protected def this(children: stdLib.Iterable[Node]) = this()
    var _children: js.Array[Element] = js.native
    val childCount: scala.Double = js.native
    val isEmpty: scala.Boolean = js.native
    @JSName(org.scalablytyped.runtime.Symbol.iterator)
    var iterator: js.Function0[stdLib.Iterator[Node]] = js.native
    val parent: scala.Null = js.native
    val root: DocumentFragment = js.native
    def _appendChild(items: Item): scala.Double = js.native
    def _appendChild(items: stdLib.Iterable[Item]): scala.Double = js.native
    def _insertChild(index: scala.Double, items: Item): scala.Double = js.native
    def _insertChild(index: scala.Double, items: stdLib.Iterable[Item]): scala.Double = js.native
    def _removeChildren(index: scala.Double): js.Array[Node] = js.native
    def _removeChildren(index: scala.Double, howMany: scala.Double): js.Array[Node] = js.native
    def getChild(index: scala.Double): Node = js.native
    def getChildIndex(node: Node): scala.Double = js.native
    def getChildren(): stdLib.Iterable[Node] = js.native
    def is(`type`: java.lang.String): scala.Boolean = js.native
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
    protected def this(name: java.lang.String) = this()
    protected def this(name: java.lang.String, attrs: js.Object) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Iterable[js.Tuple2[java.lang.String, java.lang.String]]) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Map[java.lang.String, java.lang.String]) = this()
    protected def this(name: java.lang.String, attrs: js.Object, children: Node) = this()
    protected def this(name: java.lang.String, attrs: js.Object, children: stdLib.Iterable[Node]) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Iterable[js.Tuple2[java.lang.String, java.lang.String]], children: Node) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Iterable[js.Tuple2[java.lang.String, java.lang.String]], children: stdLib.Iterable[Node]) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Map[java.lang.String, java.lang.String], children: Node) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Map[java.lang.String, java.lang.String], children: stdLib.Iterable[Node]) = this()
    var _attrs: stdLib.Map[java.lang.String, java.lang.String] = js.native
    var _children: js.Array[Node] = js.native
    var _classes: stdLib.Set[java.lang.String] = js.native
    var _customProperties: stdLib.Map[java.lang.String, _] = js.native
    var _styles: stdLib.Map[java.lang.String, java.lang.String] = js.native
    val childCount: scala.Double = js.native
    val isEmpty: scala.Boolean = js.native
    val name: java.lang.String = js.native
    /* protected */ def _addClass(className: java.lang.String): scala.Unit = js.native
    /* protected */ def _addClass(className: js.Array[java.lang.String]): scala.Unit = js.native
    /* protected */ def _appendChild(items: Item): scala.Double = js.native
    /* protected */ def _appendChild(items: stdLib.Iterable[Item]): scala.Double = js.native
    /* protected */ def _clone(deep: scala.Boolean): Element = js.native
    /* protected */ def _insertChild(index: scala.Double, items: Item): scala.Double = js.native
    /* protected */ def _insertChild(index: scala.Double, items: stdLib.Iterable[Item]): scala.Double = js.native
    /* protected */ def _removeAttribute(key: java.lang.String): scala.Boolean = js.native
    def _removeChildren(index: scala.Double): js.Array[Node] = js.native
    def _removeChildren(index: scala.Double, howMany: scala.Double): js.Array[Node] = js.native
    def _removeClass(className: java.lang.String): scala.Unit = js.native
    def _removeClass(className: js.Array[java.lang.String]): scala.Unit = js.native
    /* protected */ def _removeCustomProperty(key: java.lang.String): scala.Boolean = js.native
    /* protected */ def _removeCustomProperty(key: js.Symbol): scala.Boolean = js.native
    /* protected */ def _removeStyle(property: java.lang.String): scala.Unit = js.native
    /* protected */ def _removeStyle(property: js.Array[java.lang.String]): scala.Unit = js.native
    /* protected */ def _setAttribute(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
    /* protected */ def _setCustomProperty(key: java.lang.String, value: js.Any): scala.Unit = js.native
    /* protected */ def _setCustomProperty(key: js.Symbol, value: js.Any): scala.Unit = js.native
    /* protected */ def _setStyle(property: java.lang.String): scala.Unit = js.native
    /* protected */ def _setStyle(property: java.lang.String, value: java.lang.String): scala.Unit = js.native
    /* protected */ def _setStyle(property: org.scalablytyped.runtime.StringDictionary[java.lang.String]): scala.Unit = js.native
    /* protected */ def _setStyle(property: org.scalablytyped.runtime.StringDictionary[java.lang.String], value: java.lang.String): scala.Unit = js.native
    def findAncestor(patterns: java.lang.String): Element | scala.Null = js.native
    def findAncestor(patterns: js.Function): Element | scala.Null = js.native
    def findAncestor(patterns: js.Object): Element | scala.Null = js.native
    def findAncestor(patterns: stdLib.RegExp): Element | scala.Null = js.native
    def getAttribute(key: java.lang.String): js.UndefOr[java.lang.String] = js.native
    def getAttributeKeys(): stdLib.Iterable[java.lang.String] = js.native
    def getAttributes(): stdLib.Iterable[_] = js.native
    def getChild(index: scala.Double): Node = js.native
    def getChildIndex(node: Node): scala.Double = js.native
    def getChildren(): stdLib.Iterable[Node] = js.native
    def getClassNames(): stdLib.Iterable[java.lang.String] = js.native
    def getCustomProperties(): stdLib.Iterable[_] = js.native
    def getCustomProperty(key: java.lang.String): js.Any = js.native
    def getCustomProperty(key: js.Symbol): js.Any = js.native
    def getFillerOffset(): scala.Unit = js.native
    def getIdentity(): java.lang.String = js.native
    def getStyle(property: java.lang.String): js.UndefOr[java.lang.String] = js.native
    def getStyleNames(): stdLib.Iterable[java.lang.String] = js.native
    def hasAttribute(key: java.lang.String): scala.Boolean = js.native
    def hasClass(className: java.lang.String): scala.Unit = js.native
    def hasStyle(property: java.lang.String): scala.Unit = js.native
    def is(`type`: java.lang.String): scala.Boolean = js.native
    def isSimilar(otherElement: Element): scala.Boolean = js.native
  }
  
  // engine/view/emptyelement
  @js.native
  class EmptyElement protected () extends Element {
    protected def this(name: java.lang.String) = this()
    protected def this(name: java.lang.String, attrs: js.Object) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Iterable[js.Tuple2[java.lang.String, java.lang.String]]) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Map[java.lang.String, java.lang.String]) = this()
    protected def this(name: java.lang.String, attrs: js.Object, children: Node) = this()
    protected def this(name: java.lang.String, attrs: js.Object, children: stdLib.Iterable[Node]) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Iterable[js.Tuple2[java.lang.String, java.lang.String]], children: Node) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Iterable[js.Tuple2[java.lang.String, java.lang.String]], children: stdLib.Iterable[Node]) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Map[java.lang.String, java.lang.String], children: Node) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Map[java.lang.String, java.lang.String], children: stdLib.Iterable[Node]) = this()
  }
  
  trait Item extends js.Object
  
  // engine/view/matcher
  @js.native
  class Matcher () extends js.Object
  
  // engine/view/node
  @js.native
  class Node () extends Item {
    val document: Document | scala.Null = js.native
    val index: scala.Double | scala.Null = js.native
    val nextSibling: Node | scala.Null = js.native
    val parent: Element | DocumentFragment | scala.Null = js.native
    val previousSibling: Node | scala.Null = js.native
    val root: Node | DocumentFragment = js.native
    /* protected */ def _clone(): Node = js.native
    def _fireChange(`type`: ChangeType, node: Node): scala.Unit = js.native
    /* protected */ def _remove(): scala.Unit = js.native
    def getAncestors(options: atCkeditorCkeditor5DashEngineLib.Anon_IncludeSelfParentFirstBoolean): js.Array[Element | DocumentFragment] = js.native
    def getCommonAncestor(node: Node, options: atCkeditorCkeditor5DashEngineLib.Anon_IncludeSelfBooleanOptional): Element | DocumentFragment | scala.Null = js.native
    def getPath(): js.Array[scala.Double] = js.native
    def is(`type`: java.lang.String, name: java.lang.String): scala.Boolean = js.native
    def isAfter(node: Node): scala.Boolean = js.native
    def isBefore(node: Node): scala.Boolean = js.native
    def isSimilar(otherElement: Node): scala.Boolean = js.native
    @JSName("is")
    def is_attributeElement(`type`: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.attributeElement): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.AttributeElement */ scala.Boolean = js.native
    @JSName("is")
    def is_containerElement(`type`: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.containerElement): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.ContainerElement */ scala.Boolean = js.native
    @JSName("is")
    def is_documentFragment(`type`: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.documentFragment): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.DocumentFragment */ scala.Boolean = js.native
    @JSName("is")
    def is_element(`type`: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.element): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.Element */ scala.Boolean = js.native
    @JSName("is")
    def is_emptyElement(`type`: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.emptyElement): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.EmptyElement */ scala.Boolean = js.native
    @JSName("is")
    def is_text(`type`: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.text): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.Text */ scala.Boolean = js.native
    @JSName("is")
    def is_textProxy(`type`: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.textProxy): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.TextProxy */ scala.Boolean = js.native
    @JSName("is")
    def is_uiElement(`type`: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.uiElement): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.UIElement */ scala.Boolean = js.native
    def toJSON(): js.Object = js.native
  }
  
  // engine/view/position
  @js.native
  class Position () extends js.Object
  
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
    protected def this(data: java.lang.String) = this()
    var _data: java.lang.String = js.native
    var _textData: java.lang.String = js.native
    val data: java.lang.String = js.native
    def isSimilar(otherNode: Text): scala.Boolean = js.native
  }
  
  // engine/view/textproxy
  @js.native
  class TextProxy protected () extends Item {
    protected def this(textNode: Text, offsetInText: scala.Double, length: scala.Double) = this()
    val data: java.lang.String = js.native
    val document: Document | scala.Null = js.native
    val isPartial: scala.Boolean = js.native
    val offsetInText: scala.Double = js.native
    val offsetSize: scala.Double = js.native
    val parent: Element | DocumentFragment | scala.Null = js.native
    val root: Node | DocumentFragment = js.native
    val textNode: Text = js.native
    def getAncestors(options: atCkeditorCkeditor5DashEngineLib.Anon_IncludeSelfParentFirst): js.Array[Text | Element | DocumentFragment] = js.native
    def is(`type`: java.lang.String): scala.Boolean = js.native
    @JSName("is")
    def is_textProxy(`type`: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.textProxy): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.TextProxy */ scala.Boolean = js.native
  }
  
  // engine/view/treewalker
  @js.native
  class TreeWalker protected () extends js.Object {
    def this(options: atCkeditorCkeditor5DashEngineLib.Anon_Boundaries) = this()
    val boundaries: Range = js.native
    val direction: TreeWalkerDirection = js.native
    val ignoreElementEnd: scala.Boolean = js.native
    @JSName(org.scalablytyped.runtime.Symbol.iterator)
    var iterator: js.Function0[stdLib.Iterator[TreeWalkerValue]] = js.native
    val position: Position = js.native
    val shallow: scala.Boolean = js.native
    val singleCharacters: scala.Boolean = js.native
    def next(): TreeWalkerValue = js.native
    def skip(skip: js.Function1[/* treeWalkerValue */ TreeWalkerValue, scala.Boolean]): scala.Unit = js.native
  }
  
  trait TreeWalkerDirection extends js.Object
  
  trait TreeWalkerValue extends js.Object {
    var item: Item
    var length: scala.Double
    var nextPosition: Position
    var previousPosition: Position
    var `type`: TreeWalkerValueType
  }
  
  trait TreeWalkerValueType extends js.Object
  
  // engine/view/uielement
  @js.native
  class UIElement protected () extends Element {
    protected def this(name: java.lang.String) = this()
    protected def this(name: java.lang.String, attrs: js.Object) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Iterable[js.Tuple2[java.lang.String, java.lang.String]]) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Map[java.lang.String, java.lang.String]) = this()
    protected def this(name: java.lang.String, attrs: js.Object, children: Node) = this()
    protected def this(name: java.lang.String, attrs: js.Object, children: stdLib.Iterable[Node]) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Iterable[js.Tuple2[java.lang.String, java.lang.String]], children: Node) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Iterable[js.Tuple2[java.lang.String, java.lang.String]], children: stdLib.Iterable[Node]) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Map[java.lang.String, java.lang.String], children: Node) = this()
    protected def this(name: java.lang.String, attrs: stdLib.Map[java.lang.String, java.lang.String], children: stdLib.Iterable[Node]) = this()
    def render(domDocument: /*TODO: globals.*/ Document): stdLib.HTMLElement = js.native
    def toDomElement(domDocument: /*TODO: globals.*/ Document): stdLib.HTMLElement = js.native
  }
  
  // engine/view/upcastwriter
  @js.native
  class UpcastWriter () extends js.Object
  
  // engine/view/view
  @js.native
  class View ()
    extends atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.Observable {
    def listenTo(
      emitter: atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.Emitter,
      event: java.lang.String,
      callback: js.Function,
      options: atCkeditorCkeditor5DashEngineLib.Anon_Priority
    ): scala.Unit = js.native
    def on(
      event: java.lang.String,
      callback: js.Function,
      options: atCkeditorCkeditor5DashEngineLib.Anon_PriorityNumber
    ): scala.Unit = js.native
    def once(
      event: java.lang.String,
      callback: js.Function,
      options: atCkeditorCkeditor5DashEngineLib.Anon_PriorityNumber
    ): scala.Unit = js.native
  }
  
  val INLINE_FILLER: java.lang.String = js.native
  // engine/view/filler
  val INLINE_FILLER_LENGTH: scala.Double = js.native
  def BR_FILLER(): scala.Unit = js.native
  def NBSP_FILLER(): scala.Unit = js.native
  // engine/view/placeholder
  def attachPlaceholder(view: View, element: Element, placeholderText: java.lang.String): scala.Unit = js.native
  def attachPlaceholder(view: View, element: Element, placeholderText: java.lang.String, checkFunction: js.Function): scala.Unit = js.native
  def detachPlaceholder(view: View, element: Element): scala.Unit = js.native
  def getDataWithoutFiller(domText: Text): java.lang.String = js.native
  def injectQuirksHandling(view: View): scala.Unit = js.native
  def isBlockFiller(domNode: /*TODO globals.*/ Node, blockFiller: js.Function): scala.Boolean = js.native
  def isInlineFiller(domText: /*TODO globals.*/ Text): scala.Boolean = js.native
  def startsWithFiller(domNode: /*TODO globals.*/ Text): scala.Boolean = js.native
  /* static members */
  @js.native
  object AttributeElement extends js.Object {
    var DEFAULT_PRIORITY: scala.Double = js.native
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
      val domEventType: java.lang.String | js.Array[java.lang.String] = js.native
      var useCapture: scala.Boolean = js.native
      def fire(eventType: java.lang.String, domEvent: stdLib.Event): scala.Unit = js.native
      def fire(eventType: java.lang.String, domEvent: stdLib.Event, additionalData: js.Object): scala.Unit = js.native
      def onDomEvent(): scala.Unit = js.native
    }
    
    // engine/view/observer/fakeselectionobserver
    @js.native
    class FakeSelectionObserver protected () extends Observer {
      def this(view: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.View) = this()
      def observe(): scala.Unit = js.native
    }
    
    // engine/view/observer/focusobserver
    @js.native
    class FocusObserver () extends DomEventObserver
    
    // engine/view/observer/keyobserver
    @js.native
    class KeyEventData ()
      extends DomEventData
         with atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.KeystrokeInfo {
      /* CompleteClass */
      override var keyCode: scala.Double = js.native
      var keystroke: scala.Double = js.native
    }
    
    @js.native
    class KeyObserver () extends DomEventObserver
    
    // engine/view/observer/mouseobserver
    @js.native
    class MouseObserver () extends DomEventObserver
    
    trait MutatedChildren extends js.Object {
      var newChildren: js.Array[atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Node]
      var node: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Element
      var oldChildren: js.Array[atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Node]
      var `type`: java.lang.String
    }
    
    trait MutatedText extends js.Object {
      var newText: java.lang.String
      var node: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Text
      var oldText: java.lang.String
      var `type`: java.lang.String
    }
    
    // engine/view/observer/mutationobserver
    @js.native
    class MutationObserver () extends Observer {
      var domConverter: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.DomConverter = js.native
      var renderer: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Renderer = js.native
    }
    
    // engine/view/observer/observer
    @js.native
    class Observer protected () extends js.Object {
      def this(view: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.View) = this()
      val document: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Document = js.native
      val isEnabled: scala.Boolean = js.native
      val view: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.View = js.native
      def destroy(): scala.Unit = js.native
      def disable(): scala.Unit = js.native
      def enable(): scala.Unit = js.native
      def observe(domElement: stdLib.HTMLElement, name: java.lang.String): scala.Unit = js.native
    }
    
    // engine/view/observer/selectionobserver
    @js.native
    class SelectionObserver () extends Observer {
      val domConverter: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.DomConverter = js.native
      val mutationObserver: MutationObserver = js.native
      val selection: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.DocumentSelection = js.native
    }
    
  }
  
  // engine/view/elementdefinition
  type ElementDefinition = java.lang.String | atCkeditorCkeditor5DashEngineLib.Anon_Attributes
  type MatcherPattern = (js.Function1[
    /* element */ Element, 
    scala.Null | atCkeditorCkeditor5DashEngineLib.Anon_Attribute
  ]) | java.lang.String | stdLib.RegExp | atCkeditorCkeditor5DashEngineLib.Anon_AttributesClasses
}

