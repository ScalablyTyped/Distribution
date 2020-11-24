package typings.cheerio.cheerio

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.cheerio.anon.Name
import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cheerio
  extends // Document References
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
  
  def each(func: js.Function2[/* index */ Double, /* element */ Element, _]): Cheerio = js.native
  
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
  
  def get(): js.Array[_] = js.native
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
  
  def map(func: js.Function2[/* index */ Double, /* element */ Element, _]): Cheerio = js.native
  
  def next(): Cheerio = js.native
  def next(selector: String): Cheerio = js.native
  
  def nextAll(): Cheerio = js.native
  def nextAll(selector: String): Cheerio = js.native
  
  def nextUntil(): Cheerio = js.native
  def nextUntil(element: Cheerio): Cheerio = js.native
  def nextUntil(element: Cheerio, filter: String): Cheerio = js.native
  def nextUntil(element: Element): Cheerio = js.native
  def nextUntil(element: Element, filter: String): Cheerio = js.native
  def nextUntil(selector: js.UndefOr[scala.Nothing], filter: String): Cheerio = js.native
  def nextUntil(selector: String): Cheerio = js.native
  def nextUntil(selector: String, filter: String): Cheerio = js.native
  
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
  def parentsUntil(selector: js.UndefOr[scala.Nothing], filter: String): Cheerio = js.native
  def parentsUntil(selector: String): Cheerio = js.native
  def parentsUntil(selector: String, filter: String): Cheerio = js.native
  
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
  def prevUntil(selector: js.UndefOr[scala.Nothing], filter: String): Cheerio = js.native
  def prevUntil(selector: String): Cheerio = js.native
  def prevUntil(selector: String, filter: String): Cheerio = js.native
  
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
