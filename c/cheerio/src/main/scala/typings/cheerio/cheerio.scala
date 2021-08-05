package typings.cheerio

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.cheerio.anon.Name
import typings.node.Buffer
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cheerio {
  
  type AttrFunction = js.Function3[/* el */ Element, /* i */ Double, /* currentValue */ String, js.Any]
  
  @js.native
  trait Cheerio
    extends StObject
       with // Document References
  // Cheerio https://github.com/cheeriojs/cheerio
  // JQuery http://api.jquery.com
  /* index */ NumberDictionary[Element] {
    
    def add(elements: js.Array[Element]): Cheerio = js.native
    def add(element: Element): Cheerio = js.native
    def add(selection: Cheerio): Cheerio = js.native
    def add(selectorOrHtml: String): Cheerio = js.native
    def add(selector: String, context: Document): Cheerio = js.native
    
    def addBack(): Cheerio = js.native
    def addBack(filter: String): Cheerio = js.native
    
    def addClass(classNames: String): Cheerio = js.native
    
    def after(content: String, contents: js.Any*): Cheerio = js.native
    def after(content: js.Array[Document], contents: js.Any*): Cheerio = js.native
    def after(content: Cheerio, contents: js.Any*): Cheerio = js.native
    def after(content: Document, contents: js.Any*): Cheerio = js.native
    
    def append(content: String, contents: js.Any*): Cheerio = js.native
    def append(content: js.Array[Document], contents: js.Any*): Cheerio = js.native
    def append(content: Cheerio, contents: js.Any*): Cheerio = js.native
    def append(content: Document, contents: js.Any*): Cheerio = js.native
    
    // Manipulation
    def appendTo(target: Cheerio): Cheerio = js.native
    
    // Attributes
    def attr(): StringDictionary[String] = js.native
    // The map's values *can* be `any` but they'll all be cast to strings
    // regardless.
    def attr(map: StringDictionary[js.Any]): Cheerio = js.native
    def attr(name: String): js.UndefOr[String] = js.native
    // `value` *can* be `any` here but:
    // 1. That makes type-checking the function-type useless
    // 2. It's converted to a string anyways
    def attr(name: String, value: String): Cheerio = js.native
    def attr(name: String, value: AttrFunction): Cheerio = js.native
    
    def before(content: String, contents: js.Any*): Cheerio = js.native
    def before(content: js.Array[Document], contents: js.Any*): Cheerio = js.native
    def before(content: Cheerio, contents: js.Any*): Cheerio = js.native
    def before(content: Document, contents: js.Any*): Cheerio = js.native
    
    var cheerio: String = js.native
    
    def children(): Cheerio = js.native
    def children(selector: String): Cheerio = js.native
    
    def closest(): Cheerio = js.native
    def closest(selector: String): Cheerio = js.native
    
    def contents(): Cheerio = js.native
    
    def css(properties: js.Object): Cheerio = js.native
    def css(propertyName: String): String = js.native
    def css(propertyName: String, func: js.Function2[/* index */ Double, /* value */ String, Double | String]): Cheerio = js.native
    def css(propertyName: String, value: String): Cheerio = js.native
    def css(propertyName: String, value: Double): Cheerio = js.native
    def css(propertyNames: js.Array[String]): js.Array[String] = js.native
    
    def data(): js.Any = js.native
    def data(name: String): js.Any = js.native
    def data(name: String, value: js.Any): js.Any = js.native
    
    def each(func: js.Function2[/* index */ Double, /* element */ Element, js.Any]): Cheerio = js.native
    
    def empty(): Cheerio = js.native
    
    def end(): Cheerio = js.native
    
    def eq(index: Double): Cheerio = js.native
    
    def filter(elements: js.Array[Element]): Cheerio = js.native
    def filter(element: Element): Cheerio = js.native
    def filter(func: js.Function2[/* index */ Double, /* element */ Element, Boolean]): Cheerio = js.native
    def filter(selection: Cheerio): Cheerio = js.native
    def filter(selector: String): Cheerio = js.native
    
    def find(element: Cheerio): Cheerio = js.native
    // Traversing
    def find(selector: String): Cheerio = js.native
    
    def first(): Cheerio = js.native
    
    def get(): js.Array[js.Any] = js.native
    def get(index: Double): js.Any = js.native
    
    def has(element: Element): Cheerio = js.native
    def has(selector: String): Cheerio = js.native
    
    def hasClass(className: String): Boolean = js.native
    
    def html(): String | Null = js.native
    def html(html: String): Cheerio = js.native
    
    def index(): Double = js.native
    def index(selection: Cheerio): Double = js.native
    def index(selector: String): Double = js.native
    
    def insertAfter(content: String): Cheerio = js.native
    def insertAfter(content: Cheerio): Cheerio = js.native
    def insertAfter(content: Document): Cheerio = js.native
    
    def insertBefore(content: String): Cheerio = js.native
    def insertBefore(content: Cheerio): Cheerio = js.native
    def insertBefore(content: Document): Cheerio = js.native
    
    def is(element: js.Array[Element]): Boolean = js.native
    def is(element: Element): Boolean = js.native
    def is(func: js.Function2[/* index */ Double, /* element */ Element, Boolean]): Boolean = js.native
    def is(selection: Cheerio): Boolean = js.native
    def is(selector: String): Boolean = js.native
    
    def last(): Cheerio = js.native
    
    var length: Double = js.native
    
    def map(func: js.Function2[/* index */ Double, /* element */ Element, js.Any]): Cheerio = js.native
    
    def next(): Cheerio = js.native
    def next(selector: String): Cheerio = js.native
    
    def nextAll(): Cheerio = js.native
    def nextAll(selector: String): Cheerio = js.native
    
    def nextUntil(): Cheerio = js.native
    def nextUntil(element: Cheerio): Cheerio = js.native
    def nextUntil(element: Cheerio, filter: String): Cheerio = js.native
    def nextUntil(element: Element): Cheerio = js.native
    def nextUntil(element: Element, filter: String): Cheerio = js.native
    def nextUntil(selector: String): Cheerio = js.native
    def nextUntil(selector: String, filter: String): Cheerio = js.native
    def nextUntil(selector: Unit, filter: String): Cheerio = js.native
    
    def not(element: Element): Cheerio = js.native
    def not(func: js.Function2[/* index */ Double, /* element */ Element, Boolean]): Cheerio = js.native
    def not(selection: Cheerio): Cheerio = js.native
    def not(selector: String): Cheerio = js.native
    
    def parent(): Cheerio = js.native
    def parent(selector: String): Cheerio = js.native
    
    def parents(): Cheerio = js.native
    def parents(selector: String): Cheerio = js.native
    
    def parentsUntil(): Cheerio = js.native
    def parentsUntil(element: Cheerio): Cheerio = js.native
    def parentsUntil(element: Cheerio, filter: String): Cheerio = js.native
    def parentsUntil(element: Element): Cheerio = js.native
    def parentsUntil(element: Element, filter: String): Cheerio = js.native
    def parentsUntil(selector: String): Cheerio = js.native
    def parentsUntil(selector: String, filter: String): Cheerio = js.native
    def parentsUntil(selector: Unit, filter: String): Cheerio = js.native
    
    def prepend(content: String, contents: js.Any*): Cheerio = js.native
    def prepend(content: js.Array[Document], contents: js.Any*): Cheerio = js.native
    def prepend(content: Cheerio, contents: js.Any*): Cheerio = js.native
    def prepend(content: Document, contents: js.Any*): Cheerio = js.native
    
    def prependTo(target: Cheerio): Cheerio = js.native
    
    def prev(): Cheerio = js.native
    def prev(selector: String): Cheerio = js.native
    
    def prevAll(): Cheerio = js.native
    def prevAll(selector: String): Cheerio = js.native
    
    def prevUntil(): Cheerio = js.native
    def prevUntil(element: Cheerio): Cheerio = js.native
    def prevUntil(element: Cheerio, filter: String): Cheerio = js.native
    def prevUntil(element: Element): Cheerio = js.native
    def prevUntil(element: Element, filter: String): Cheerio = js.native
    def prevUntil(selector: String): Cheerio = js.native
    def prevUntil(selector: String, filter: String): Cheerio = js.native
    def prevUntil(selector: Unit, filter: String): Cheerio = js.native
    
    def prop(name: String): js.Any = js.native
    def prop(name: String, value: js.Any): Cheerio = js.native
    
    def remove(): Cheerio = js.native
    def remove(selector: String): Cheerio = js.native
    
    def removeAttr(name: String): Cheerio = js.native
    
    def removeClass(): Cheerio = js.native
    def removeClass(className: String): Cheerio = js.native
    def removeClass(func: js.Function2[/* index */ Double, /* className */ String, String]): Cheerio = js.native
    
    def replaceWith(content: String): Cheerio = js.native
    def replaceWith(content: js.Array[Element]): Cheerio = js.native
    def replaceWith(content: js.Function0[this.type]): Cheerio = js.native
    def replaceWith(content: Cheerio): Cheerio = js.native
    def replaceWith(content: Element): Cheerio = js.native
    
    // Form
    def serialize(): String = js.native
    
    def serializeArray(): js.Array[Name] = js.native
    
    def siblings(): Cheerio = js.native
    def siblings(selector: String): Cheerio = js.native
    
    def slice(start: Double): Cheerio = js.native
    def slice(start: Double, end: Double): Cheerio = js.native
    
    def text(): String = js.native
    def text(text: String): Cheerio = js.native
    
    // Not Documented
    def toArray(): js.Array[Element] = js.native
    
    def toggleClass(): Cheerio = js.native
    def toggleClass(className: String): Cheerio = js.native
    def toggleClass(className: String, toggleSwitch: Boolean): Cheerio = js.native
    def toggleClass(func: js.Function3[/* index */ Double, /* className */ String, /* toggleSwitch */ Boolean, String]): Cheerio = js.native
    def toggleClass(
      func: js.Function3[/* index */ Double, /* className */ String, /* toggleSwitch */ Boolean, String],
      toggleSwitch: Boolean
    ): Cheerio = js.native
    def toggleClass(toggleSwitch: Boolean): Cheerio = js.native
    
    def `val`(): String = js.native
    def `val`(value: String): Cheerio = js.native
    
    def wrap(content: String): Cheerio = js.native
    def wrap(content: Cheerio): Cheerio = js.native
    def wrap(content: Document): Cheerio = js.native
  }
  
  @js.native
  trait CheerioAPI
    extends StObject
       with Root {
    
    def load(element: Element): Root = js.native
    def load(element: Element, options: CheerioParserOptions): Root = js.native
    def load(html: String): Root = js.native
    def load(html: String, options: CheerioParserOptions): Root = js.native
    def load(html: Buffer): Root = js.native
    def load(html: Buffer, options: CheerioParserOptions): Root = js.native
    
    var version: String = js.native
  }
  
  trait CheerioParserOptions extends StObject {
    
    var _useHtmlParser2: js.UndefOr[Boolean] = js.undefined
    
    var decodeEntities: js.UndefOr[Boolean] = js.undefined
    
    var ignoreWhitespace: js.UndefOr[Boolean] = js.undefined
    
    var lowerCaseAttributeNames: js.UndefOr[Boolean] = js.undefined
    
    var lowerCaseTags: js.UndefOr[Boolean] = js.undefined
    
    var normalizeWhitespace: js.UndefOr[Boolean] = js.undefined
    
    var recognizeCDATA: js.UndefOr[Boolean] = js.undefined
    
    var recognizeSelfClosing: js.UndefOr[Boolean] = js.undefined
    
    var withEndIndices: js.UndefOr[Boolean] = js.undefined
    
    var withStartIndices: js.UndefOr[Boolean] = js.undefined
    
    // Document References
    // Cheerio https://github.com/cheeriojs/cheerio
    // HTMLParser2 https://github.com/fb55/htmlparser2/wiki/Parser-options
    // DomHandler https://github.com/fb55/DomHandler
    var xmlMode: js.UndefOr[Boolean] = js.undefined
  }
  object CheerioParserOptions {
    
    inline def apply(): CheerioParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheerioParserOptions]
    }
    
    extension [Self <: CheerioParserOptions](x: Self) {
      
      inline def setDecodeEntities(value: Boolean): Self = StObject.set(x, "decodeEntities", value.asInstanceOf[js.Any])
      
      inline def setDecodeEntitiesUndefined: Self = StObject.set(x, "decodeEntities", js.undefined)
      
      inline def setIgnoreWhitespace(value: Boolean): Self = StObject.set(x, "ignoreWhitespace", value.asInstanceOf[js.Any])
      
      inline def setIgnoreWhitespaceUndefined: Self = StObject.set(x, "ignoreWhitespace", js.undefined)
      
      inline def setLowerCaseAttributeNames(value: Boolean): Self = StObject.set(x, "lowerCaseAttributeNames", value.asInstanceOf[js.Any])
      
      inline def setLowerCaseAttributeNamesUndefined: Self = StObject.set(x, "lowerCaseAttributeNames", js.undefined)
      
      inline def setLowerCaseTags(value: Boolean): Self = StObject.set(x, "lowerCaseTags", value.asInstanceOf[js.Any])
      
      inline def setLowerCaseTagsUndefined: Self = StObject.set(x, "lowerCaseTags", js.undefined)
      
      inline def setNormalizeWhitespace(value: Boolean): Self = StObject.set(x, "normalizeWhitespace", value.asInstanceOf[js.Any])
      
      inline def setNormalizeWhitespaceUndefined: Self = StObject.set(x, "normalizeWhitespace", js.undefined)
      
      inline def setRecognizeCDATA(value: Boolean): Self = StObject.set(x, "recognizeCDATA", value.asInstanceOf[js.Any])
      
      inline def setRecognizeCDATAUndefined: Self = StObject.set(x, "recognizeCDATA", js.undefined)
      
      inline def setRecognizeSelfClosing(value: Boolean): Self = StObject.set(x, "recognizeSelfClosing", value.asInstanceOf[js.Any])
      
      inline def setRecognizeSelfClosingUndefined: Self = StObject.set(x, "recognizeSelfClosing", js.undefined)
      
      inline def setWithEndIndices(value: Boolean): Self = StObject.set(x, "withEndIndices", value.asInstanceOf[js.Any])
      
      inline def setWithEndIndicesUndefined: Self = StObject.set(x, "withEndIndices", js.undefined)
      
      inline def setWithStartIndices(value: Boolean): Self = StObject.set(x, "withStartIndices", value.asInstanceOf[js.Any])
      
      inline def setWithStartIndicesUndefined: Self = StObject.set(x, "withStartIndices", js.undefined)
      
      inline def setXmlMode(value: Boolean): Self = StObject.set(x, "xmlMode", value.asInstanceOf[js.Any])
      
      inline def setXmlModeUndefined: Self = StObject.set(x, "xmlMode", js.undefined)
      
      inline def set_useHtmlParser2(value: Boolean): Self = StObject.set(x, "_useHtmlParser2", value.asInstanceOf[js.Any])
      
      inline def set_useHtmlParser2Undefined: Self = StObject.set(x, "_useHtmlParser2", js.undefined)
    }
  }
  
  trait Element extends StObject {
    
    var attribs: StringDictionary[String]
    
    var childNodes: js.Array[Element]
    
    var children: js.Array[Element]
    
    var data: js.UndefOr[String] = js.undefined
    
    var firstChild: Element
    
    var lastChild: Element
    
    var name: String
    
    var next: Element
    
    var nextSibling: Element
    
    var nodeValue: String
    
    var parent: Element
    
    var parentNode: Element
    
    var prev: Element
    
    var previousSibling: Element
    
    var startIndex: js.UndefOr[Double] = js.undefined
    
    // Document References
    // Node Console
    var tagName: String
    
    var `type`: String
  }
  object Element {
    
    inline def apply(
      attribs: StringDictionary[String],
      childNodes: js.Array[Element],
      children: js.Array[Element],
      firstChild: Element,
      lastChild: Element,
      name: String,
      next: Element,
      nextSibling: Element,
      nodeValue: String,
      parent: Element,
      parentNode: Element,
      prev: Element,
      previousSibling: Element,
      tagName: String,
      `type`: String
    ): Element = {
      val __obj = js.Dynamic.literal(attribs = attribs.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    extension [Self <: Element](x: Self) {
      
      inline def setAttribs(value: StringDictionary[String]): Self = StObject.set(x, "attribs", value.asInstanceOf[js.Any])
      
      inline def setChildNodes(value: js.Array[Element]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
      
      inline def setChildNodesVarargs(value: Element*): Self = StObject.set(x, "childNodes", js.Array(value :_*))
      
      inline def setChildren(value: js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFirstChild(value: Element): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
      
      inline def setLastChild(value: Element): Self = StObject.set(x, "lastChild", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNext(value: Element): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextSibling(value: Element): Self = StObject.set(x, "nextSibling", value.asInstanceOf[js.Any])
      
      inline def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Element): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNode(value: Element): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
      
      inline def setPrev(value: Element): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPreviousSibling(value: Element): Self = StObject.set(x, "previousSibling", value.asInstanceOf[js.Any])
      
      inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Root
    extends StObject
       with Selector {
    
    def contains(container: Element, contained: Element): Boolean = js.native
    
    def html(): String = js.native
    def html(dom: String): String = js.native
    def html(dom: String, options: CheerioParserOptions): String = js.native
    def html(dom: Cheerio): String = js.native
    def html(dom: Cheerio, options: CheerioParserOptions): String = js.native
    def html(dom: Element): String = js.native
    def html(dom: Element, options: CheerioParserOptions): String = js.native
    def html(options: CheerioParserOptions): String = js.native
    
    def parseHTML(data: String): js.Array[Document] = js.native
    def parseHTML(data: String, context: Unit, keepScripts: Boolean): js.Array[Document] = js.native
    def parseHTML(data: String, context: Document): js.Array[Document] = js.native
    def parseHTML(data: String, context: Document, keepScripts: Boolean): js.Array[Document] = js.native
    
    // Document References
    // Cheerio https://github.com/cheeriojs/cheerio
    // JQuery http://api.jquery.com
    def root(): Cheerio = js.native
    
    def xml(): String = js.native
    def xml(dom: String): String = js.native
    def xml(dom: Cheerio): String = js.native
    def xml(dom: Element): String = js.native
  }
  
  @js.native
  trait Selector extends StObject {
    
    def apply(selector: String): Cheerio = js.native
    def apply(selector: String, context: String): Cheerio = js.native
    def apply(selector: String, context: String, root: String): Cheerio = js.native
    def apply(selector: String, context: js.Array[Element]): Cheerio = js.native
    def apply(selector: String, context: js.Array[Element], root: String): Cheerio = js.native
    def apply(selector: String, context: Cheerio): Cheerio = js.native
    def apply(selector: String, context: Cheerio, root: String): Cheerio = js.native
    def apply(selector: String, context: Element): Cheerio = js.native
    def apply(selector: String, context: Element, root: String): Cheerio = js.native
    def apply(selector: js.Any): Cheerio = js.native
  }
}
