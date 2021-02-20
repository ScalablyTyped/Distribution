package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.anon.Attributes
import typings.ckeditor.anon.EndNode
import typings.ckeditor.anon.RemoveListener
import typings.ckeditor.ckeditorBooleans.`false`
import typings.ckeditor.ckeditorNumbers.`1`
import typings.ckeditor.ckeditorStrings.ltr
import typings.ckeditor.ckeditorStrings.rtl
import typings.std.CSSStyleSheet
import typings.std.ClientRect
import typings.std.Document
import typings.std.HTMLElement
import typings.std.Selection
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dom {
  
  @js.native
  trait bookmark extends StObject {
    
    var collapsed: Boolean = js.native
    
    var endNode: node | String = js.native
    
    var serializable: Boolean = js.native
    
    var startNode: node | String = js.native
  }
  object bookmark {
    
    @scala.inline
    def apply(collapsed: Boolean, endNode: node | String, serializable: Boolean, startNode: node | String): bookmark = {
      val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], endNode = endNode.asInstanceOf[js.Any], serializable = serializable.asInstanceOf[js.Any], startNode = startNode.asInstanceOf[js.Any])
      __obj.asInstanceOf[bookmark]
    }
    
    @scala.inline
    implicit class bookmarkMutableBuilder[Self <: bookmark] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndNode(value: node | String): Self = StObject.set(x, "endNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializable(value: Boolean): Self = StObject.set(x, "serializable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartNode(value: node | String): Self = StObject.set(x, "startNode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait bookmark2 extends StObject {
    
    var collapsed: Boolean = js.native
    
    var end: js.Array[Double] = js.native
    
    var endOffset: Double = js.native
    
    var is2: Boolean = js.native
    
    var normalized: Boolean = js.native
    
    var start: js.Array[Double] = js.native
    
    var startOffset: Double = js.native
  }
  object bookmark2 {
    
    @scala.inline
    def apply(
      collapsed: Boolean,
      end: js.Array[Double],
      endOffset: Double,
      is2: Boolean,
      normalized: Boolean,
      start: js.Array[Double],
      startOffset: Double
    ): bookmark2 = {
      val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], is2 = is2.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[bookmark2]
    }
    
    @scala.inline
    implicit class bookmark2MutableBuilder[Self <: bookmark2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd(value: js.Array[Double]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndVarargs(value: Double*): Self = StObject.set(x, "end", js.Array(value :_*))
      
      @scala.inline
      def setIs2(value: Boolean): Self = StObject.set(x, "is2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalized(value: Boolean): Self = StObject.set(x, "normalized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: js.Array[Double]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartVarargs(value: Double*): Self = StObject.set(x, "start", js.Array(value :_*))
    }
  }
  
  @js.native
  trait comment extends node {
    
    def getOuterHtml(): String = js.native
  }
  
  @js.native
  trait document extends domObject {
    
    @JSName("$")
    val $_document: Document = js.native
    
    def appendStyleSheet(cssFileUrl: String): Unit = js.native
    
    def appendStyleText(cssStyleText: String): CSSStyleSheet = js.native
    
    def createElement(name: String): element = js.native
    def createElement(name: String, attribsAndStyles: Attributes): element = js.native
    
    def createText(text: String): element = js.native
    
    def find(selector: String): nodeList = js.native
    
    def findOne(selector: String): element = js.native
    
    def focus(): Unit = js.native
    
    def getActive(): element = js.native
    
    def getBody(): element = js.native
    
    def getByAddress(address: js.Array[_]): node = js.native
    def getByAddress(address: js.Array[_], normalized: Boolean): node = js.native
    
    def getById(elementId: String): element = js.native
    
    def getDocumentElement(): element = js.native
    
    def getElementsByTag(tagName: String): nodeList = js.native
    
    def getHead(): element = js.native
    
    def getSelection(): selection = js.native
    
    def getWindow(): window = js.native
    
    val `type`: Double = js.native
    
    def write(html: String): Unit = js.native
  }
  
  @js.native
  trait documentFragment extends node {
    
    def insertAfterNode(node: node): Unit = js.native
  }
  
  @js.native
  trait domObject
    extends typings.ckeditor.CKEDITOR.event {
    
    @JSName("$")
    val $: js.Any = js.native
    
    def clearCustomData(): Unit = js.native
    
    def equals(`object`: js.Any): Boolean = js.native
    
    def getCustomData(key: String): js.Any = js.native
    
    def getPrivate(): js.Any = js.native
    
    def getUniqueId(): Double = js.native
    
    def removeCustomData(key: String): js.Any = js.native
    
    def setCustomData(key: String, value: js.Any): domObject = js.native
  }
  
  @js.native
  trait element extends node {
    
    @JSName("$")
    val $_element: HTMLElement = js.native
    
    def addClass(className: String): Unit = js.native
    
    def append(node: String): node = js.native
    def append(node: String, toStart: Boolean): node = js.native
    def append(node: node): node = js.native
    def append(node: node, toStart: Boolean): node = js.native
    
    def appendBogus(force: Boolean): Unit = js.native
    
    def appendHtml(html: String): Unit = js.native
    
    def appendText(text: String): node = js.native
    
    def breakParent(parent: element): Unit = js.native
    
    def contains(node: node): Boolean = js.native
    
    def copyAttributes(dest: element, skipAttributes: StringDictionary[String]): Unit = js.native
    
    def data(name: String): String = js.native
    def data(name: String, value: String): String = js.native
    @JSName("data")
    def data_false(name: String, value: `false`): String = js.native
    
    def disableContextMenu(): Unit = js.native
    
    def find(selector: String): nodeList = js.native
    
    def findOne(selector: String): element = js.native
    
    def focus(): Unit = js.native
    def focus(defer: Boolean): Unit = js.native
    
    def focusNext(): Unit = js.native
    def focusNext(ignoreChildren: js.UndefOr[scala.Nothing], indexToUse: Double): Unit = js.native
    def focusNext(ignoreChildren: Boolean): Unit = js.native
    def focusNext(ignoreChildren: Boolean, indexToUse: Double): Unit = js.native
    
    def focusPrevious(): Unit = js.native
    def focusPrevious(ignoreChildren: js.UndefOr[scala.Nothing], indexToUse: Double): Unit = js.native
    def focusPrevious(ignoreChildren: Boolean): Unit = js.native
    def focusPrevious(ignoreChildren: Boolean, indexToUse: Double): Unit = js.native
    
    def forEach(callback: js.Function1[/* node */ node, Unit]): Unit = js.native
    def forEach(
      callback: js.Function1[/* node */ node, Unit],
      `type`: js.UndefOr[scala.Nothing],
      skipRoot: Boolean
    ): Unit = js.native
    def forEach(callback: js.Function1[/* node */ node, Unit], `type`: Double): Unit = js.native
    def forEach(callback: js.Function1[/* node */ node, Unit], `type`: Double, skipRoot: Boolean): Unit = js.native
    
    def getAttribute(name: String): String = js.native
    
    def getBogus(): node | Boolean = js.native
    
    def getChild(indices: js.Array[Double]): node = js.native
    def getChild(indices: Double): node = js.native
    
    def getChildCount(): Double = js.native
    
    def getChildren(): nodeList = js.native
    
    def getClientRect(): ClientRect = js.native
    
    def getComputedStyle(propertyName: String): String = js.native
    
    def getDirection(useComputed: Boolean): String = js.native
    
    def getDocumentPosition(refDocument: document): position = js.native
    
    def getDtd(): dtdDefinition = js.native
    
    def getEditor(): editor = js.native
    
    def getElementsByTag(tagName: String): nodeList = js.native
    
    def getFirst(): node = js.native
    def getFirst(evaluator: js.Function1[/* node */ node, Boolean]): node = js.native
    
    def getFrameDocument(): document = js.native
    
    def getHtml(): String = js.native
    
    def getId(): String = js.native
    
    def getLast(): node = js.native
    def getLast(evaluator: js.Function1[/* node */ node, Boolean]): node = js.native
    
    def getName(): String = js.native
    
    def getNameAtt(): String = js.native
    
    def getOuterHtml(): String = js.native
    
    def getPositionedAncestor(): element = js.native
    
    def getSize(`type`: String, isBorderBox: Boolean): Unit = js.native
    
    def getStyle(name: String): String = js.native
    
    def getTabIndex(): Double = js.native
    
    def getText(): String = js.native
    
    def getValue(): String = js.native
    
    def getWindow(): window = js.native
    
    def hasAttribute(name: String): Boolean = js.native
    
    def hasAttributes(): Boolean = js.native
    
    def hasClass(className: String): Boolean = js.native
    
    def hide(): Unit = js.native
    
    def is(name: String*): Boolean = js.native
    def is(name: js.Any): Boolean = js.native
    
    @JSName("isBlockBoundary")
    def isBlockBoundary_1(customNodeNames: StringDictionary[`1`]): Boolean = js.native
    
    def isEditable(): Boolean = js.native
    def isEditable(textCursor: Boolean): Boolean = js.native
    
    def isEmptyInlineRemoveable(): Boolean = js.native
    
    def isIdentical(otherElement: element): Boolean = js.native
    
    def isVisible(): Boolean = js.native
    
    def mergeSiblings(): Unit = js.native
    def mergeSiblings(inlineOnly: Boolean): Unit = js.native
    
    def moveChildren(target: element): Unit = js.native
    def moveChildren(target: element, toStart: Boolean): Unit = js.native
    
    def removeAttribute(name: String): Unit = js.native
    
    def removeAttributes(): Unit = js.native
    def removeAttributes(attributes: js.Array[String]): Unit = js.native
    
    def removeClass(className: String): Unit = js.native
    
    def removeStyle(name: String): Unit = js.native
    
    def renameNode(newTag: String): Unit = js.native
    
    def scrollIntoParent(parent: element, alignToTop: Boolean, hscroll: Boolean): Unit = js.native
    def scrollIntoParent(parent: window, alignToTop: Boolean, hscroll: Boolean): Unit = js.native
    
    def scrollIntoView(): Unit = js.native
    def scrollIntoView(alignToTop: Boolean): Unit = js.native
    
    def setAttribute(name: String, value: String): element = js.native
    
    def setAttributes(attributesPairs: StringDictionary[String]): element = js.native
    
    def setHtml(html: String): String = js.native
    
    def setOpacity(opacity: Double): Unit = js.native
    
    def setSize(`type`: String, size: Double, isBorderBox: Boolean): Unit = js.native
    
    def setState(state: Double): Unit = js.native
    def setState(state: Double, base: js.UndefOr[scala.Nothing], useAria: Boolean): Unit = js.native
    def setState(state: Double, base: String): Unit = js.native
    def setState(state: Double, base: String, useAria: Boolean): Unit = js.native
    
    def setStyle(name: String, value: String): element = js.native
    
    def setStyles(stylesPair: StringDictionary[String]): element = js.native
    
    def setText(text: String): String = js.native
    
    def setValue(value: String): element = js.native
    
    def show(): Unit = js.native
    
    def unselectable(): Unit = js.native
  }
  
  @js.native
  trait elementPath extends StObject {
    
    val block: element = js.native
    
    val blockLimit: element = js.native
    
    def compare(otherPath: elementPath): Boolean = js.native
    
    def contains(query: String): element = js.native
    def contains(query: String, excludeRoot: js.UndefOr[scala.Nothing], fromTop: Boolean): element = js.native
    def contains(query: String, excludeRoot: Boolean): element = js.native
    def contains(query: String, excludeRoot: Boolean, fromTop: Boolean): element = js.native
    def contains(query: js.Array[String]): element = js.native
    def contains(query: js.Array[String], excludeRoot: js.UndefOr[scala.Nothing], fromTop: Boolean): element = js.native
    def contains(query: js.Array[String], excludeRoot: Boolean): element = js.native
    def contains(query: js.Array[String], excludeRoot: Boolean, fromTop: Boolean): element = js.native
    def contains(query: js.Function1[/* element */ element, Boolean]): element = js.native
    def contains(
      query: js.Function1[/* element */ element, Boolean],
      excludeRoot: js.UndefOr[scala.Nothing],
      fromTop: Boolean
    ): element = js.native
    def contains(query: js.Function1[/* element */ element, Boolean], excludeRoot: Boolean): element = js.native
    def contains(query: js.Function1[/* element */ element, Boolean], excludeRoot: Boolean, fromTop: Boolean): element = js.native
    def contains(query: StringDictionary[js.Any]): element = js.native
    def contains(query: StringDictionary[js.Any], excludeRoot: js.UndefOr[scala.Nothing], fromTop: Boolean): element = js.native
    def contains(query: StringDictionary[js.Any], excludeRoot: Boolean): element = js.native
    def contains(query: StringDictionary[js.Any], excludeRoot: Boolean, fromTop: Boolean): element = js.native
    def contains(query: element): element = js.native
    def contains(query: element, excludeRoot: js.UndefOr[scala.Nothing], fromTop: Boolean): element = js.native
    def contains(query: element, excludeRoot: Boolean): element = js.native
    def contains(query: element, excludeRoot: Boolean, fromTop: Boolean): element = js.native
    
    def direction(): ltr | rtl = js.native
    
    val elements: js.Array[element] = js.native
    
    def isContextFor(tag: String): Boolean = js.native
    
    val lastElement: element = js.native
    
    val root: element = js.native
  }
  
  @js.native
  trait event extends StObject {
    
    def getKey(): Double = js.native
    
    def getKeystroke(): Double = js.native
    
    def getPhase(): Double = js.native
    
    def getPhaseOffset(): position = js.native
    
    def getTarget(): node = js.native
    
    def on(eventName: String, listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit]): RemoveListener = js.native
    def on(
      eventName: String,
      listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
      scopeObj: js.UndefOr[scala.Nothing],
      listenerData: js.UndefOr[scala.Nothing],
      priority: Double
    ): RemoveListener = js.native
    def on(
      eventName: String,
      listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
      scopeObj: js.UndefOr[scala.Nothing],
      listenerData: js.Any
    ): RemoveListener = js.native
    def on(
      eventName: String,
      listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
      scopeObj: js.UndefOr[scala.Nothing],
      listenerData: js.Any,
      priority: Double
    ): RemoveListener = js.native
    def on(
      eventName: String,
      listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
      scopeObj: js.Any
    ): RemoveListener = js.native
    def on(
      eventName: String,
      listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
      scopeObj: js.Any,
      listenerData: js.UndefOr[scala.Nothing],
      priority: Double
    ): RemoveListener = js.native
    def on(
      eventName: String,
      listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
      scopeObj: js.Any,
      listenerData: js.Any
    ): RemoveListener = js.native
    def on(
      eventName: String,
      listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
      scopeObj: js.Any,
      listenerData: js.Any,
      priority: Double
    ): RemoveListener = js.native
    
    def preventDefault(): Unit = js.native
    def preventDefault(stopPropagation: Boolean): Unit = js.native
    
    def stopPropagation(): Unit = js.native
  }
  
  @js.native
  trait iterator extends StObject {
    
    val activeFilter: typings.ckeditor.CKEDITOR.filter = js.native
    
    var enforceRealBlocks: Boolean = js.native
    
    var enlargeBr: Boolean = js.native
    
    val filter: typings.ckeditor.CKEDITOR.filter = js.native
    
    var forceBrBreak: Boolean = js.native
    
    def getNextParagraph(): element = js.native
    def getNextParagraph(blockTag: String): element = js.native
    
    val range: typings.ckeditor.CKEDITOR.dom.range = js.native
  }
  
  @js.native
  trait node extends domObject {
    
    def appendTo(element: element): element = js.native
    
    def clone(includeChildren: Boolean, cloneId: Boolean): node = js.native
    
    def getAddress(): js.Array[Double] = js.native
    def getAddress(normalized: Boolean): js.Array[Double] = js.native
    
    def getAscendant(reference: String): node = js.native
    def getAscendant(reference: String, includeSelf: Boolean): node = js.native
    
    def getCommonAncestor(node: node): Unit = js.native
    
    def getDocument(): document = js.native
    
    def getIndex(): Double = js.native
    def getIndex(normalized: Boolean): Double = js.native
    
    def getNext(): node = js.native
    def getNext(evaluator: js.Function1[/* node */ this.type, Boolean]): node = js.native
    
    def getNextSourceNode(): node = js.native
    def getNextSourceNode(
      startFromSibling: js.UndefOr[scala.Nothing],
      nodeType: js.UndefOr[scala.Nothing],
      guard: js.Function1[/* node */ this.type, Boolean]
    ): node = js.native
    def getNextSourceNode(startFromSibling: js.UndefOr[scala.Nothing], nodeType: js.UndefOr[scala.Nothing], guard: node): node = js.native
    def getNextSourceNode(startFromSibling: js.UndefOr[scala.Nothing], nodeType: Double): node = js.native
    def getNextSourceNode(
      startFromSibling: js.UndefOr[scala.Nothing],
      nodeType: Double,
      guard: js.Function1[/* node */ this.type, Boolean]
    ): node = js.native
    def getNextSourceNode(startFromSibling: js.UndefOr[scala.Nothing], nodeType: Double, guard: node): node = js.native
    def getNextSourceNode(startFromSibling: Boolean): node = js.native
    def getNextSourceNode(
      startFromSibling: Boolean,
      nodeType: js.UndefOr[scala.Nothing],
      guard: js.Function1[/* node */ this.type, Boolean]
    ): node = js.native
    def getNextSourceNode(startFromSibling: Boolean, nodeType: js.UndefOr[scala.Nothing], guard: node): node = js.native
    def getNextSourceNode(startFromSibling: Boolean, nodeType: Double): node = js.native
    def getNextSourceNode(startFromSibling: Boolean, nodeType: Double, guard: js.Function1[/* node */ this.type, Boolean]): node = js.native
    def getNextSourceNode(startFromSibling: Boolean, nodeType: Double, guard: node): node = js.native
    
    def getParent(): element = js.native
    def getParent(allowFragmentParent: Boolean): element = js.native
    
    def getParents(): js.Array[node] = js.native
    def getParents(closerFirst: Boolean): js.Array[node] = js.native
    
    def getPosition(otherNode: node): Unit = js.native
    
    def getPrevious(): node = js.native
    def getPrevious(evaluator: js.Function1[/* node */ this.type, Boolean]): node = js.native
    
    def getPreviousSourceNode(): node = js.native
    def getPreviousSourceNode(
      startFromSibling: js.UndefOr[scala.Nothing],
      nodeType: js.UndefOr[scala.Nothing],
      guard: js.Function1[/* node */ this.type, Boolean]
    ): node = js.native
    def getPreviousSourceNode(startFromSibling: js.UndefOr[scala.Nothing], nodeType: js.UndefOr[scala.Nothing], guard: node): node = js.native
    def getPreviousSourceNode(startFromSibling: js.UndefOr[scala.Nothing], nodeType: Double): node = js.native
    def getPreviousSourceNode(
      startFromSibling: js.UndefOr[scala.Nothing],
      nodeType: Double,
      guard: js.Function1[/* node */ this.type, Boolean]
    ): node = js.native
    def getPreviousSourceNode(startFromSibling: js.UndefOr[scala.Nothing], nodeType: Double, guard: node): node = js.native
    def getPreviousSourceNode(startFromSibling: Boolean): node = js.native
    def getPreviousSourceNode(
      startFromSibling: Boolean,
      nodeType: js.UndefOr[scala.Nothing],
      guard: js.Function1[/* node */ this.type, Boolean]
    ): node = js.native
    def getPreviousSourceNode(startFromSibling: Boolean, nodeType: js.UndefOr[scala.Nothing], guard: node): node = js.native
    def getPreviousSourceNode(startFromSibling: Boolean, nodeType: Double): node = js.native
    def getPreviousSourceNode(startFromSibling: Boolean, nodeType: Double, guard: js.Function1[/* node */ this.type, Boolean]): node = js.native
    def getPreviousSourceNode(startFromSibling: Boolean, nodeType: Double, guard: node): node = js.native
    
    def hasAscendant(name: String, includeSelf: Boolean): Boolean = js.native
    
    def hasNext(): Boolean = js.native
    
    def hasPrevious(): Boolean = js.native
    
    def insertAfter(node: node): node = js.native
    
    def insertBefore(node: node): node = js.native
    
    def insertBeforeMe(node: node): node = js.native
    
    def isReadOnly(): Boolean = js.native
    
    def ltrim(): Unit = js.native
    
    def remove(): node = js.native
    def remove(preserveChildren: Boolean): node = js.native
    
    def replace(nodeToReplace: node): Unit = js.native
    
    def rtrim(): Unit = js.native
    
    def trim(): Unit = js.native
    
    var `type`: Double = js.native
  }
  
  @js.native
  trait nodeList extends StObject {
    
    def count(): Double = js.native
    
    def getItem(index: Double): node = js.native
    
    def toArray(): js.Array[node] = js.native
  }
  object nodeList {
    
    @scala.inline
    def apply(count: () => Double, getItem: Double => node, toArray: () => js.Array[node]): nodeList = {
      val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count), getItem = js.Any.fromFunction1(getItem), toArray = js.Any.fromFunction0(toArray))
      __obj.asInstanceOf[nodeList]
    }
    
    @scala.inline
    implicit class nodeListMutableBuilder[Self <: nodeList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: () => Double): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetItem(value: Double => node): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToArray(value: () => js.Array[node]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait position extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object position {
    
    @scala.inline
    def apply(x: Double, y: Double): position = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[position]
    }
    
    @scala.inline
    implicit class positionMutableBuilder[Self <: position] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait range extends StObject {
    
    def checkBoundaryOfElement(element: element, checkType: Double): Boolean = js.native
    
    def checkEndOfBlock(): Boolean = js.native
    
    def checkReadOnly(): Boolean = js.native
    
    def checkStartOfBlock(): Boolean = js.native
    
    def clone(cloneId: Boolean): range = js.native
    
    def cloneContents(): documentFragment = js.native
    
    def collapse(): Boolean = js.native
    def collapse(toStart: Boolean): Boolean = js.native
    
    val collapsed: Boolean = js.native
    
    def createBookmark(): bookmark = js.native
    def createBookmark(serializable: Boolean): bookmark = js.native
    
    def createBookmark2(): bookmark2 = js.native
    def createBookmark2(normalized: Boolean): bookmark2 = js.native
    
    def createIterator(): iterator = js.native
    
    def deleteContents(): Unit = js.native
    def deleteContents(mergeThen: Boolean): Unit = js.native
    
    val document: typings.ckeditor.CKEDITOR.dom.document = js.native
    
    val endContainer: element | text = js.native
    
    val endOffset: Double = js.native
    
    def endPath(): elementPath = js.native
    
    def enlarge(unit: Double): Unit = js.native
    def enlarge(unit: Double, excludeBrs: Boolean): Unit = js.native
    
    def extractContents(): documentFragment = js.native
    def extractContents(mergeThen: js.UndefOr[scala.Nothing], cloneId: Boolean): documentFragment = js.native
    def extractContents(mergeThen: Boolean): documentFragment = js.native
    def extractContents(mergeThen: Boolean, cloneId: Boolean): documentFragment = js.native
    
    def fixBlock(isStart: Boolean, blockTag: String): element = js.native
    
    def getBoundaryNodes(): EndNode = js.native
    
    def getCommonAncestor(): element = js.native
    def getCommonAncestor(includeSelf: js.UndefOr[scala.Nothing], ignoreTextNode: Boolean): element = js.native
    def getCommonAncestor(includeSelf: Boolean): element = js.native
    def getCommonAncestor(includeSelf: Boolean, ignoreTextNode: Boolean): element = js.native
    
    def getEnclosedNode(): node = js.native
    
    def getNextEditableNode(): element | text = js.native
    
    def getNextNode(): element = js.native
    def getNextNode(evaluator: js.UndefOr[scala.Nothing], guard: js.UndefOr[scala.Nothing], boundary: element): element = js.native
    def getNextNode(evaluator: js.UndefOr[scala.Nothing], guard: js.Function1[/* element */ element, Boolean]): element = js.native
    def getNextNode(
      evaluator: js.UndefOr[scala.Nothing],
      guard: js.Function1[/* element */ element, Boolean],
      boundary: element
    ): element = js.native
    def getNextNode(evaluator: js.Function1[/* element */ element, Boolean]): element = js.native
    def getNextNode(
      evaluator: js.Function1[/* element */ element, Boolean],
      guard: js.UndefOr[scala.Nothing],
      boundary: element
    ): element = js.native
    def getNextNode(
      evaluator: js.Function1[/* element */ element, Boolean],
      guard: js.Function1[/* element */ element, Boolean]
    ): element = js.native
    def getNextNode(
      evaluator: js.Function1[/* element */ element, Boolean],
      guard: js.Function1[/* element */ element, Boolean],
      boundary: element
    ): element = js.native
    
    def getPreviousEditableNode(): element | text = js.native
    
    def getPreviousNode(): element = js.native
    def getPreviousNode(evaluator: js.UndefOr[scala.Nothing], guard: js.UndefOr[scala.Nothing], boundary: element): element = js.native
    def getPreviousNode(evaluator: js.UndefOr[scala.Nothing], guard: js.Function1[/* element */ element, Boolean]): element = js.native
    def getPreviousNode(
      evaluator: js.UndefOr[scala.Nothing],
      guard: js.Function1[/* element */ element, Boolean],
      boundary: element
    ): element = js.native
    def getPreviousNode(evaluator: js.Function1[/* element */ element, Boolean]): element = js.native
    def getPreviousNode(
      evaluator: js.Function1[/* element */ element, Boolean],
      guard: js.UndefOr[scala.Nothing],
      boundary: element
    ): element = js.native
    def getPreviousNode(
      evaluator: js.Function1[/* element */ element, Boolean],
      guard: js.Function1[/* element */ element, Boolean]
    ): element = js.native
    def getPreviousNode(
      evaluator: js.Function1[/* element */ element, Boolean],
      guard: js.Function1[/* element */ element, Boolean],
      boundary: element
    ): element = js.native
    
    def getTouchedEndNode(): node = js.native
    
    def getTouchedStartNode(): node = js.native
    
    def insertNode(node: node): Unit = js.native
    
    def moveToBookmark(bookmark: bookmark): Unit = js.native
    def moveToBookmark(bookmark: bookmark2): Unit = js.native
    
    def moveToClosestEditablePosition(): Boolean = js.native
    def moveToClosestEditablePosition(element: js.UndefOr[scala.Nothing], isMoveForward: Boolean): Boolean = js.native
    def moveToClosestEditablePosition(element: element): Boolean = js.native
    def moveToClosestEditablePosition(element: element, isMoveForward: Boolean): Boolean = js.native
    
    def moveToElementEditEnd(target: element): Boolean = js.native
    
    def moveToElementEditStart(target: element): Boolean = js.native
    
    def moveToElementEditablePosition(element: element, isMoveToEnd: Boolean): Boolean = js.native
    
    def moveToPosition(node: node, position: Double): Unit = js.native
    
    def moveToRange(range: range): Unit = js.native
    
    def optimize(): Unit = js.native
    
    def optimizeBookmark(): Unit = js.native
    
    def removeEmptyBlocksAtEnd(atEnd: Boolean): Unit = js.native
    
    val root: element = js.native
    
    def scrollIntoView(): Unit = js.native
    
    def select(): selection = js.native
    
    def selectNodeContents(node: node): Unit = js.native
    
    def setEnd(endNode: node, endOffset: Double): Unit = js.native
    
    def setEndAfter(node: node): Unit = js.native
    
    def setEndAt(node: node, position: Double): Unit = js.native
    
    def setEndBefore(node: node): Unit = js.native
    
    def setStart(startNode: node, startOffset: Double): Unit = js.native
    
    def setStartAfter(node: node): Unit = js.native
    
    def setStartAt(node: node, position: Double): Unit = js.native
    
    def setStartBefore(node: node): Unit = js.native
    
    def shrink(mode: Double): Unit = js.native
    def shrink(mode: Double, selectContents: js.UndefOr[scala.Nothing], options: Boolean): Unit = js.native
    def shrink(mode: Double, selectContents: js.UndefOr[scala.Nothing], options: shrinkOptions): Unit = js.native
    def shrink(mode: Double, selectContents: Boolean): Unit = js.native
    def shrink(mode: Double, selectContents: Boolean, options: Boolean): Unit = js.native
    def shrink(mode: Double, selectContents: Boolean, options: shrinkOptions): Unit = js.native
    
    def splitBlock(): Unit = js.native
    def splitBlock(cloneId: Boolean): Unit = js.native
    
    def splitElement(toSplit: element): element = js.native
    def splitElement(toSplit: element, cloneId: Boolean): element = js.native
    
    val startContainer: element | text = js.native
    
    val startOffset: Double = js.native
    
    def startPath(): elementPath = js.native
    
    def trim(): Unit = js.native
    def trim(ignoreStart: js.UndefOr[scala.Nothing], ignoreEnd: Boolean): Unit = js.native
    def trim(ignoreStart: Boolean): Unit = js.native
    def trim(ignoreStart: Boolean, ignoreEnd: Boolean): Unit = js.native
  }
  
  @js.native
  trait rangeList extends StObject {
    
    def createBokmarks(): js.Array[bookmark] = js.native
    def createBokmarks(serializable: Boolean): js.Array[bookmark] = js.native
    
    def createBookmarks2(): js.Array[bookmark2] = js.native
    def createBookmarks2(normalized: Boolean): js.Array[bookmark2] = js.native
    
    def createIterator(): rangeListIterator = js.native
    
    def moveToBookmarks(bookmarks: js.Array[bookmark]): Unit = js.native
  }
  
  @js.native
  trait rangeListIterator extends StObject {
    
    def getNextRange(): range = js.native
    def getNextRange(mergeConsequent: Boolean): range = js.native
  }
  
  // see https://docs.com/ckeditor4/latest/api/CKEDITOR_dom_selection.html
  @js.native
  trait selection extends StObject {
    
    val FILLING_CHAR_SEQUENCE: String = js.native
    
    def createBookmarks(serializable: js.Any): js.Array[bookmark] = js.native
    
    def createBookmarks2(normalized: js.Any): js.Array[bookmark2] = js.native
    
    val document: typings.ckeditor.CKEDITOR.dom.document = js.native
    
    def fake(element: element): Unit = js.native
    def fake(element: element, ariaLabel: Boolean): Unit = js.native
    
    def getCommonAncestor(): element = js.native
    
    def getNative(): Selection = js.native
    
    def getRanges(): js.Array[range] = js.native
    def getRanges(onlyEditables: Boolean): js.Array[range] = js.native
    
    def getSelectedElement(): element = js.native
    
    def getSelectedText(): String = js.native
    
    def getStartElement(): element = js.native
    
    def getType(): Double = js.native
    
    def isCollapsed(): Boolean = js.native
    
    val isFake: Boolean = js.native
    
    def isHidden(): Boolean = js.native
    
    def isInTable(): Boolean = js.native
    def isInTable(allowPartialSelection: Boolean): Boolean = js.native
    
    val isLocked: Boolean = js.native
    
    def lock(): Unit = js.native
    
    def removeAllRanges(): Unit = js.native
    
    def reset(): Unit = js.native
    
    val rev: Double = js.native
    
    val root: element = js.native
    
    def scrollIntoView(): Unit = js.native
    
    def selectBookmarks(bookmarks: js.Array[bookmark | bookmark2]): selection = js.native
    
    def selectElement(element: element): Unit = js.native
    
    def selectRanges(ranges: js.Array[range]): Unit = js.native
    
    def unlock(restore: Boolean): Unit = js.native
  }
  
  @js.native
  trait shrinkOptions extends StObject {
    
    var shrinkOnBlockBoundary: js.UndefOr[Boolean] = js.native
    
    var skipBogus: js.UndefOr[Boolean] = js.native
  }
  object shrinkOptions {
    
    @scala.inline
    def apply(): shrinkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[shrinkOptions]
    }
    
    @scala.inline
    implicit class shrinkOptionsMutableBuilder[Self <: shrinkOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShrinkOnBlockBoundary(value: Boolean): Self = StObject.set(x, "shrinkOnBlockBoundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShrinkOnBlockBoundaryUndefined: Self = StObject.set(x, "shrinkOnBlockBoundary", js.undefined)
      
      @scala.inline
      def setSkipBogus(value: Boolean): Self = StObject.set(x, "skipBogus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipBogusUndefined: Self = StObject.set(x, "skipBogus", js.undefined)
    }
  }
  
  @js.native
  trait text extends node {
    
    @JSName("$")
    val $_text: Text = js.native
    
    def getLength(): Double = js.native
    
    def getText(): String = js.native
    
    def setText(text: String): Unit = js.native
    
    def split(offset: Double): text = js.native
    
    def substring(indexA: Double): Unit = js.native
    def substring(indexA: Double, indexB: Double): Unit = js.native
  }
  
  @js.native
  trait walker extends StObject {
    
    def checkBackward(): Boolean = js.native
    
    def checkForward(): Boolean = js.native
    
    def end(): Unit = js.native
    
    def evaluator(node: node): Boolean = js.native
    
    def guard(node: node): Boolean = js.native
    def guard(node: node, movingOut: Boolean): Boolean = js.native
    
    def lastBackward(): node = js.native
    
    def lastForward(): node = js.native
    
    def next(): node = js.native
    
    def previous(): node = js.native
    
    def reset(): Unit = js.native
  }
  
  @js.native
  trait widthAndHeight extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object widthAndHeight {
    
    @scala.inline
    def apply(height: Double, width: Double): widthAndHeight = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[widthAndHeight]
    }
    
    @scala.inline
    implicit class widthAndHeightMutableBuilder[Self <: widthAndHeight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait window extends domObject {
    
    def focus(): Unit = js.native
    
    def getFrame(): element = js.native
    
    def getScrollPosition(): position = js.native
    
    def getViewPaneSize(): widthAndHeight = js.native
  }
}
