package typings.cheerio

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cheerio_
  extends // Document References
// Cheerio https://github.com/cheeriojs/cheerio
// JQuery http://api.jquery.com
/* index */ NumberDictionary[CheerioElement] {
  var cheerio: String = js.native
  var length: Double = js.native
  def add(elements: js.Array[CheerioElement]): Cheerio_ = js.native
  def add(element: CheerioElement): Cheerio_ = js.native
  def add(selection: Cheerio_): Cheerio_ = js.native
  def add(selectorOrHtml: String): Cheerio_ = js.native
  def add(selector: String, context: Document_): Cheerio_ = js.native
  def addBack(): Cheerio_ = js.native
  def addBack(filter: String): Cheerio_ = js.native
  def addClass(classNames: String): Cheerio_ = js.native
  def after(content: String, contents: js.Any*): Cheerio_ = js.native
  def after(content: js.Array[Document_], contents: js.Any*): Cheerio_ = js.native
  def after(content: Cheerio_, contents: js.Any*): Cheerio_ = js.native
  def after(content: Document_, contents: js.Any*): Cheerio_ = js.native
  def append(content: String, contents: js.Any*): Cheerio_ = js.native
  def append(content: js.Array[Document_], contents: js.Any*): Cheerio_ = js.native
  def append(content: Cheerio_, contents: js.Any*): Cheerio_ = js.native
  def append(content: Document_, contents: js.Any*): Cheerio_ = js.native
  // Manipulation
  def appendTo(target: Cheerio_): Cheerio_ = js.native
  // Attributes
  def attr(): StringDictionary[String] = js.native
  // The map's values *can* be `any` but they'll all be cast to strings
  // regardless.
  def attr(map: StringDictionary[js.Any]): Cheerio_ = js.native
  def attr(name: String): js.UndefOr[String] = js.native
  // `value` *can* be `any` here but:
  // 1. That makes type-checking the function-type useless
  // 2. It's converted to a string anyways
  def attr(name: String, value: String): Cheerio_ = js.native
  def attr(name: String, value: AttrFunction): Cheerio_ = js.native
  def before(content: String, contents: js.Any*): Cheerio_ = js.native
  def before(content: js.Array[Document_], contents: js.Any*): Cheerio_ = js.native
  def before(content: Cheerio_, contents: js.Any*): Cheerio_ = js.native
  def before(content: Document_, contents: js.Any*): Cheerio_ = js.native
  def children(): Cheerio_ = js.native
  def children(selector: String): Cheerio_ = js.native
  def closest(): Cheerio_ = js.native
  def closest(selector: String): Cheerio_ = js.native
  def contents(): Cheerio_ = js.native
  def css(properties: js.Object): Cheerio_ = js.native
  def css(propertyName: String): String = js.native
  def css(propertyName: String, func: js.Function2[/* index */ Double, /* value */ String, Double | String]): Cheerio_ = js.native
  def css(propertyName: String, value: String): Cheerio_ = js.native
  def css(propertyName: String, value: Double): Cheerio_ = js.native
  def css(propertyNames: js.Array[String]): js.Array[String] = js.native
  def data(): js.Any = js.native
  def data(name: String): js.Any = js.native
  def data(name: String, value: js.Any): js.Any = js.native
  def each(func: js.Function2[/* index */ Double, /* element */ CheerioElement, _]): Cheerio_ = js.native
  def empty(): Cheerio_ = js.native
  def end(): Cheerio_ = js.native
  def eq(index: Double): Cheerio_ = js.native
  def filter(elements: js.Array[CheerioElement]): Cheerio_ = js.native
  def filter(element: CheerioElement): Cheerio_ = js.native
  def filter(func: js.Function2[/* index */ Double, /* element */ CheerioElement, Boolean]): Cheerio_ = js.native
  def filter(selection: Cheerio_): Cheerio_ = js.native
  def filter(selector: String): Cheerio_ = js.native
  def find(element: Cheerio_): Cheerio_ = js.native
  // Traversing
  def find(selector: String): Cheerio_ = js.native
  def first(): Cheerio_ = js.native
  def get(): js.Array[_] = js.native
  def get(index: Double): js.Any = js.native
  def has(element: CheerioElement): Cheerio_ = js.native
  def has(selector: String): Cheerio_ = js.native
  def hasClass(className: String): Boolean = js.native
  def html(): String | Null = js.native
  def html(html: String): Cheerio_ = js.native
  def index(): Double = js.native
  def index(selection: Cheerio_): Double = js.native
  def index(selector: String): Double = js.native
  def insertAfter(content: String): Cheerio_ = js.native
  def insertAfter(content: Cheerio_): Cheerio_ = js.native
  def insertAfter(content: Document_): Cheerio_ = js.native
  def insertBefore(content: String): Cheerio_ = js.native
  def insertBefore(content: Cheerio_): Cheerio_ = js.native
  def insertBefore(content: Document_): Cheerio_ = js.native
  def is(element: js.Array[CheerioElement]): Boolean = js.native
  def is(element: CheerioElement): Boolean = js.native
  def is(func: js.Function2[/* index */ Double, /* element */ CheerioElement, Boolean]): Boolean = js.native
  def is(selection: Cheerio_): Boolean = js.native
  def is(selector: String): Boolean = js.native
  def last(): Cheerio_ = js.native
  def map(func: js.Function2[/* index */ Double, /* element */ CheerioElement, _]): Cheerio_ = js.native
  def next(): Cheerio_ = js.native
  def next(selector: String): Cheerio_ = js.native
  def nextAll(): Cheerio_ = js.native
  def nextAll(selector: String): Cheerio_ = js.native
  def nextUntil(): Cheerio_ = js.native
  def nextUntil(element: CheerioElement): Cheerio_ = js.native
  def nextUntil(element: CheerioElement, filter: String): Cheerio_ = js.native
  def nextUntil(element: Cheerio_): Cheerio_ = js.native
  def nextUntil(element: Cheerio_, filter: String): Cheerio_ = js.native
  def nextUntil(selector: String): Cheerio_ = js.native
  def nextUntil(selector: String, filter: String): Cheerio_ = js.native
  def not(element: CheerioElement): Cheerio_ = js.native
  def not(func: js.Function2[/* index */ Double, /* element */ CheerioElement, Boolean]): Cheerio_ = js.native
  def not(selection: Cheerio_): Cheerio_ = js.native
  def not(selector: String): Cheerio_ = js.native
  def parent(): Cheerio_ = js.native
  def parent(selector: String): Cheerio_ = js.native
  def parents(): Cheerio_ = js.native
  def parents(selector: String): Cheerio_ = js.native
  def parentsUntil(): Cheerio_ = js.native
  def parentsUntil(element: CheerioElement): Cheerio_ = js.native
  def parentsUntil(element: CheerioElement, filter: String): Cheerio_ = js.native
  def parentsUntil(element: Cheerio_): Cheerio_ = js.native
  def parentsUntil(element: Cheerio_, filter: String): Cheerio_ = js.native
  def parentsUntil(selector: String): Cheerio_ = js.native
  def parentsUntil(selector: String, filter: String): Cheerio_ = js.native
  def prepend(content: String, contents: js.Any*): Cheerio_ = js.native
  def prepend(content: js.Array[Document_], contents: js.Any*): Cheerio_ = js.native
  def prepend(content: Cheerio_, contents: js.Any*): Cheerio_ = js.native
  def prepend(content: Document_, contents: js.Any*): Cheerio_ = js.native
  def prependTo(target: Cheerio_): Cheerio_ = js.native
  def prev(): Cheerio_ = js.native
  def prev(selector: String): Cheerio_ = js.native
  def prevAll(): Cheerio_ = js.native
  def prevAll(selector: String): Cheerio_ = js.native
  def prevUntil(): Cheerio_ = js.native
  def prevUntil(element: CheerioElement): Cheerio_ = js.native
  def prevUntil(element: CheerioElement, filter: String): Cheerio_ = js.native
  def prevUntil(element: Cheerio_): Cheerio_ = js.native
  def prevUntil(element: Cheerio_, filter: String): Cheerio_ = js.native
  def prevUntil(selector: String): Cheerio_ = js.native
  def prevUntil(selector: String, filter: String): Cheerio_ = js.native
  def prop(name: String): js.Any = js.native
  def prop(name: String, value: js.Any): Cheerio_ = js.native
  def remove(): Cheerio_ = js.native
  def remove(selector: String): Cheerio_ = js.native
  def removeAttr(name: String): Cheerio_ = js.native
  def removeClass(): Cheerio_ = js.native
  def removeClass(className: String): Cheerio_ = js.native
  def removeClass(func: js.Function2[/* index */ Double, /* className */ String, String]): Cheerio_ = js.native
  def replaceWith(content: String): Cheerio_ = js.native
  def replaceWith(content: js.Array[CheerioElement]): Cheerio_ = js.native
  def replaceWith(content: js.Function0[this.type]): Cheerio_ = js.native
  def replaceWith(content: CheerioElement): Cheerio_ = js.native
  def replaceWith(content: Cheerio_): Cheerio_ = js.native
  // Form
  def serialize(): String = js.native
  def serializeArray(): js.Array[AnonName] = js.native
  def siblings(): Cheerio_ = js.native
  def siblings(selector: String): Cheerio_ = js.native
  def slice(start: Double): Cheerio_ = js.native
  def slice(start: Double, end: Double): Cheerio_ = js.native
  def text(): String = js.native
  def text(text: String): Cheerio_ = js.native
  // Not Documented
  def toArray(): js.Array[CheerioElement] = js.native
  def toggleClass(): Cheerio_ = js.native
  def toggleClass(className: String): Cheerio_ = js.native
  def toggleClass(className: String, toggleSwitch: Boolean): Cheerio_ = js.native
  def toggleClass(func: js.Function3[/* index */ Double, /* className */ String, /* toggleSwitch */ Boolean, String]): Cheerio_ = js.native
  def toggleClass(
    func: js.Function3[/* index */ Double, /* className */ String, /* toggleSwitch */ Boolean, String],
    toggleSwitch: Boolean
  ): Cheerio_ = js.native
  def toggleClass(toggleSwitch: Boolean): Cheerio_ = js.native
  def `val`(): String = js.native
  def `val`(value: String): Cheerio_ = js.native
  def wrap(content: String): Cheerio_ = js.native
  def wrap(content: Cheerio_): Cheerio_ = js.native
  def wrap(content: Document_): Cheerio_ = js.native
}

