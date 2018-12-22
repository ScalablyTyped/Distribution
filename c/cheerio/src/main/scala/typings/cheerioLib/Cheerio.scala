package typings
package cheerioLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cheerio
  extends // Document References
// Cheerio https://github.com/cheeriojs/cheerio
// JQuery http://api.jquery.com
/* index */ org.scalablytyped.runtime.NumberDictionary[CheerioElement] {
  var length: scala.Double = js.native
  def add(element: CheerioElement): Cheerio = js.native
  def add(elements: js.Array[CheerioElement]): Cheerio = js.native
  def add(selection: Cheerio): Cheerio = js.native
  def add(selectorOrHtml: java.lang.String): Cheerio = js.native
  def add(selector: java.lang.String, context: Document): Cheerio = js.native
  def addBack(): Cheerio = js.native
  def addBack(filter: java.lang.String): Cheerio = js.native
  def addClass(classNames: java.lang.String): Cheerio = js.native
  def after(content: Cheerio, contents: js.Any*): Cheerio = js.native
  def after(content: Document, contents: js.Any*): Cheerio = js.native
  def after(content: java.lang.String, contents: js.Any*): Cheerio = js.native
  def after(content: js.Array[Document], contents: js.Any*): Cheerio = js.native
  def append(content: Cheerio, contents: js.Any*): Cheerio = js.native
  def append(content: Document, contents: js.Any*): Cheerio = js.native
  def append(content: java.lang.String, contents: js.Any*): Cheerio = js.native
  def append(content: js.Array[Document], contents: js.Any*): Cheerio = js.native
  // Manipulation
  def appendTo(target: Cheerio): Cheerio = js.native
  // Attributes
  def attr(): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def attr(name: java.lang.String): java.lang.String = js.native
  def attr(name: java.lang.String, value: js.Any): Cheerio = js.native
  def before(content: Cheerio, contents: js.Any*): Cheerio = js.native
  def before(content: Document, contents: js.Any*): Cheerio = js.native
  def before(content: java.lang.String, contents: js.Any*): Cheerio = js.native
  def before(content: js.Array[Document], contents: js.Any*): Cheerio = js.native
  def children(): Cheerio = js.native
  def children(selector: java.lang.String): Cheerio = js.native
  def closest(): Cheerio = js.native
  def closest(selector: java.lang.String): Cheerio = js.native
  def contents(): Cheerio = js.native
  def css(properties: js.Object): Cheerio = js.native
  def css(propertyName: java.lang.String): java.lang.String = js.native
  def css(
    propertyName: java.lang.String,
    func: js.Function2[
      /* index */ scala.Double, 
      /* value */ java.lang.String, 
      scala.Double | java.lang.String
    ]
  ): Cheerio = js.native
  def css(propertyName: java.lang.String, value: java.lang.String): Cheerio = js.native
  def css(propertyName: java.lang.String, value: scala.Double): Cheerio = js.native
  def css(propertyNames: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def data(): js.Any = js.native
  def data(name: java.lang.String): js.Any = js.native
  def data(name: java.lang.String, value: js.Any): js.Any = js.native
  def each(func: js.Function2[/* index */ scala.Double, /* element */ CheerioElement, _]): Cheerio = js.native
  def empty(): Cheerio = js.native
  def end(): Cheerio = js.native
  def eq(index: scala.Double): Cheerio = js.native
  def filter(element: CheerioElement): Cheerio = js.native
  def filter(elements: js.Array[CheerioElement]): Cheerio = js.native
  def filter(func: js.Function2[/* index */ scala.Double, /* element */ CheerioElement, scala.Boolean]): Cheerio = js.native
  def filter(selection: Cheerio): Cheerio = js.native
  def filter(selector: java.lang.String): Cheerio = js.native
  def find(element: Cheerio): Cheerio = js.native
  // Traversing
  def find(selector: java.lang.String): Cheerio = js.native
  def first(): Cheerio = js.native
  def get(): js.Array[_] = js.native
  def get(index: scala.Double): js.Any = js.native
  def has(element: CheerioElement): Cheerio = js.native
  def has(selector: java.lang.String): Cheerio = js.native
  def hasClass(className: java.lang.String): scala.Boolean = js.native
  def html(): java.lang.String | scala.Null = js.native
  def html(html: java.lang.String): Cheerio = js.native
  def index(): scala.Double = js.native
  def index(selection: Cheerio): scala.Double = js.native
  def index(selector: java.lang.String): scala.Double = js.native
  def insertAfter(content: Cheerio): Cheerio = js.native
  def insertAfter(content: Document): Cheerio = js.native
  def insertAfter(content: java.lang.String): Cheerio = js.native
  def insertBefore(content: Cheerio): Cheerio = js.native
  def insertBefore(content: Document): Cheerio = js.native
  def insertBefore(content: java.lang.String): Cheerio = js.native
  def is(element: CheerioElement): scala.Boolean = js.native
  def is(element: js.Array[CheerioElement]): scala.Boolean = js.native
  def is(func: js.Function2[/* index */ scala.Double, /* element */ CheerioElement, scala.Boolean]): scala.Boolean = js.native
  def is(selection: Cheerio): scala.Boolean = js.native
  def is(selector: java.lang.String): scala.Boolean = js.native
  def last(): Cheerio = js.native
  def map(func: js.Function2[/* index */ scala.Double, /* element */ CheerioElement, _]): Cheerio = js.native
  def next(): Cheerio = js.native
  def next(selector: java.lang.String): Cheerio = js.native
  def nextAll(): Cheerio = js.native
  def nextAll(selector: java.lang.String): Cheerio = js.native
  def nextUntil(): Cheerio = js.native
  def nextUntil(element: Cheerio): Cheerio = js.native
  def nextUntil(element: CheerioElement): Cheerio = js.native
  def nextUntil(element: CheerioElement, filter: java.lang.String): Cheerio = js.native
  def nextUntil(element: Cheerio, filter: java.lang.String): Cheerio = js.native
  def nextUntil(selector: java.lang.String): Cheerio = js.native
  def nextUntil(selector: java.lang.String, filter: java.lang.String): Cheerio = js.native
  def not(element: CheerioElement): Cheerio = js.native
  def not(func: js.Function2[/* index */ scala.Double, /* element */ CheerioElement, scala.Boolean]): Cheerio = js.native
  def not(selection: Cheerio): Cheerio = js.native
  def not(selector: java.lang.String): Cheerio = js.native
  def parent(): Cheerio = js.native
  def parent(selector: java.lang.String): Cheerio = js.native
  def parents(): Cheerio = js.native
  def parents(selector: java.lang.String): Cheerio = js.native
  def parentsUntil(): Cheerio = js.native
  def parentsUntil(element: Cheerio): Cheerio = js.native
  def parentsUntil(element: CheerioElement): Cheerio = js.native
  def parentsUntil(element: CheerioElement, filter: java.lang.String): Cheerio = js.native
  def parentsUntil(element: Cheerio, filter: java.lang.String): Cheerio = js.native
  def parentsUntil(selector: java.lang.String): Cheerio = js.native
  def parentsUntil(selector: java.lang.String, filter: java.lang.String): Cheerio = js.native
  def prepend(content: Cheerio, contents: js.Any*): Cheerio = js.native
  def prepend(content: Document, contents: js.Any*): Cheerio = js.native
  def prepend(content: java.lang.String, contents: js.Any*): Cheerio = js.native
  def prepend(content: js.Array[Document], contents: js.Any*): Cheerio = js.native
  def prependTo(target: Cheerio): Cheerio = js.native
  def prev(): Cheerio = js.native
  def prev(selector: java.lang.String): Cheerio = js.native
  def prevAll(): Cheerio = js.native
  def prevAll(selector: java.lang.String): Cheerio = js.native
  def prevUntil(): Cheerio = js.native
  def prevUntil(element: Cheerio): Cheerio = js.native
  def prevUntil(element: CheerioElement): Cheerio = js.native
  def prevUntil(element: CheerioElement, filter: java.lang.String): Cheerio = js.native
  def prevUntil(element: Cheerio, filter: java.lang.String): Cheerio = js.native
  def prevUntil(selector: java.lang.String): Cheerio = js.native
  def prevUntil(selector: java.lang.String, filter: java.lang.String): Cheerio = js.native
  def prop(name: java.lang.String): js.Any = js.native
  def prop(name: java.lang.String, value: js.Any): Cheerio = js.native
  def remove(): Cheerio = js.native
  def remove(selector: java.lang.String): Cheerio = js.native
  def removeAttr(name: java.lang.String): Cheerio = js.native
  def removeClass(): Cheerio = js.native
  def removeClass(className: java.lang.String): Cheerio = js.native
  def removeClass(func: js.Function2[/* index */ scala.Double, /* className */ java.lang.String, java.lang.String]): Cheerio = js.native
  def replaceWith(content: Cheerio): Cheerio = js.native
  def replaceWith(content: CheerioElement): Cheerio = js.native
  def replaceWith(content: java.lang.String): Cheerio = js.native
  def replaceWith(content: js.Array[CheerioElement]): Cheerio = js.native
  def replaceWith(content: js.Function0[this.type]): Cheerio = js.native
  // Form
  def serialize(): java.lang.String = js.native
  def serializeArray(): js.Array[Anon_Value] = js.native
  def siblings(): Cheerio = js.native
  def siblings(selector: java.lang.String): Cheerio = js.native
  def slice(start: scala.Double): Cheerio = js.native
  def slice(start: scala.Double, end: scala.Double): Cheerio = js.native
  def text(): java.lang.String = js.native
  def text(text: java.lang.String): Cheerio = js.native
  // Not Documented
  def toArray(): js.Array[CheerioElement] = js.native
  def toggleClass(): Cheerio = js.native
  def toggleClass(className: java.lang.String): Cheerio = js.native
  def toggleClass(className: java.lang.String, toggleSwitch: scala.Boolean): Cheerio = js.native
  def toggleClass(
    func: js.Function3[
      /* index */ scala.Double, 
      /* className */ java.lang.String, 
      /* toggleSwitch */ scala.Boolean, 
      java.lang.String
    ]
  ): Cheerio = js.native
  def toggleClass(
    func: js.Function3[
      /* index */ scala.Double, 
      /* className */ java.lang.String, 
      /* toggleSwitch */ scala.Boolean, 
      java.lang.String
    ],
    toggleSwitch: scala.Boolean
  ): Cheerio = js.native
  def toggleClass(toggleSwitch: scala.Boolean): Cheerio = js.native
  def `val`(): java.lang.String = js.native
  def `val`(value: java.lang.String): Cheerio = js.native
  def wrap(content: Cheerio): Cheerio = js.native
  def wrap(content: Document): Cheerio = js.native
  def wrap(content: java.lang.String): Cheerio = js.native
}

