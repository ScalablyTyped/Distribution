package typings.cash

import org.scalablytyped.runtime.TopLevel
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cash
  * Interface for CashJs 
  * Refer https://github.com/kenwheeler/cash for documentation and uses of the methods and properties
  */
@js.native
trait Cash extends js.Object {
  /**
    * add
    * Returns a new collection with the element(s) added to the end.
    */
  def add(selector: String): Cash = js.native
  def add(selector: String, context: Element): Cash = js.native
  def add(selector: Cash): Cash = js.native
  def add(selector: Cash, context: Element): Cash = js.native
  def add(selector: Element): Cash = js.native
  def add(selector: Element, context: Element): Cash = js.native
  /**
    * addClass
    * Adds the className argument to collection elements.
    */
  def addClass(c: String): Cash = js.native
  def after(selector: String): Cash = js.native
  /**
    * after
    * Inserts content or elements after the collection.
    */
  def after(selector: Element): Cash = js.native
  /**
    * append
    * Appends the target element to the each element in the collection.
    */
  def append(content: String): Cash = js.native
  def append(content: Cash): Cash = js.native
  def append(content: Element): Cash = js.native
  /**
    * appendTo
    * Adds the elements in a collection to the target element(s).
    */
  def appendTo(parent: String): Cash = js.native
  def appendTo(parent: Cash): Cash = js.native
  def appendTo(parent: Element): Cash = js.native
  /**
    * attr
    * Without attrValue, returns the attribute value of the first element in the collection.
    * With attrValue, sets the attribute value of each element of the collection.
    */
  def attr(name: String): js.Any = js.native
  def attr(name: String, value: String): Cash = js.native
  /**
    * before
    * Inserts content or elements before the collection.
    */
  def before(selector: String): Cash = js.native
  def before(selector: Element): Cash = js.native
  /**
    * children
    * Without a selector specified, returns a collection of child elements.
    * With a selector, returns child elements that match the selector.
    */
  def children(): Cash = js.native
  def children(selector: String): Cash = js.native
  /**
    * closest
    * Returns the closest matching selector up the DOM tree.
    */
  def closest(): Cash = js.native
  def closest(selector: String): Cash = js.native
  def css(prop: String, value: js.Any): Cash = js.native
  /**
    * css
    * Returns a CSS property value when just property is supplied.
    * Sets a CSS property when property and value are supplied, and set multiple properties when an object is supplied.
    * Properties will be autoprefixed if needed for the user's browser.
    */
  def css(prop: js.Any): js.Any = js.native
  def data(name: String, value: js.Any): Cash = js.native
  /**
    * data
    * Link some data (string, object, array, etc.) to an element when both key and value are supplied.
    * If only a key is supplied, returns the linked data and falls back to data attribute value if no data is already linked.
    * Multiple data can be set when an object is supplied.
    */
  def data(name: js.Any): js.Any = js.native
  /**
    * each
    * Iterates over a collection with callback(value, index, array).
    */
  def each(callback: js.Function): Cash = js.native
  /**
    * empty
    * Empties an elements interior markup.
    */
  def empty(): Cash = js.native
  /**
    * eq
    * Returns a collection with the element at index.
    */
  def eq(index: Double): Cash = js.native
  /**
    * extend
    * Adds properties to the cash collection prototype.
    */
  def extend(target: js.Any): js.Any = js.native
  /**
    * filter
    * Returns the collection that results from applying the filter method.
    */
  def filter(selector: js.Function): Cash = js.native
  /**
    * find
    * Returns selector match descendants from the first element in the collection.
    */
  def find(selector: String): Cash = js.native
  /**
    * first
    * Returns the first element in the collection.
    */
  def first(): Cash = js.native
  /**
    * get
    * Returns the element at the index.
    */
  def get(index: Double): HTMLElement = js.native
  /**
    * has
    * Returns boolean result of the selector argument against the collection.
    */
  def has(selector: String): Boolean = js.native
  /**
    * hasClass
    * Returns the boolean result of checking if the first element in the collection has the className attribute.
    */
  def hasClass(c: String): Boolean = js.native
  /**
    * height
    * Returns the height of the element.
    */
  def height(): Double = js.native
  /**
    * html
    * Returns the HTML text of the first element in the collection, sets the HTML if provided.
    */
  def html(): String = js.native
  def html(content: String): Cash = js.native
  /**
    * index
    * Returns the index of the element in its parent if an element or selector isn't provided.
    * Returns index within element or selector if it is.
    */
  def index(): Double = js.native
  def index(elem: Element): Double = js.native
  /**
    * innerHeight
    * Returns the height of the element + padding.
    */
  def innerHeight(): Double = js.native
  /**
    * innerWidth
    * Returns the width of the element + padding.
    */
  def innerWidth(): Double = js.native
  /**
    * insertAfter
    * Inserts collection after specified element.
    */
  def insertAfter(selector: String): Cash = js.native
  def insertAfter(selector: Cash): Cash = js.native
  def insertAfter(selector: Element): Cash = js.native
  /**
    * insertBefore
    * Inserts collection before specified element.
    */
  def insertBefore(selector: String): Cash = js.native
  def insertBefore(selector: Cash): Cash = js.native
  def insertBefore(selector: Element): Cash = js.native
  /**
    * is
    * Returns whether the provided selector, element or collection matches any element in the collection.
    */
  def is(selector: String): Boolean = js.native
  def is(selector: Cash): Boolean = js.native
  def is(selector: Element): Boolean = js.native
  /**
    * last
    * Returns last element in the collection.
    */
  def last(): Cash = js.native
  /**
    * next
    * Returns next sibling.
    */
  def next(): Cash = js.native
  /**
    * not
    * Filters collection by false match on selector.
    */
  def not(selector: String): Cash = js.native
  def not(selector: Cash): Cash = js.native
  def not(selector: Element): Cash = js.native
  /**
    * off
    * Removes event listener from collection elements.
    */
  def off(eventName: String, callback: js.Function): Cash = js.native
  /**
    * offset
    * Get the coordinates of the first element in a collection relative to the document.
    */
  def offset(): OffsetType = js.native
  /**
    * offsetParent
    * Get the first element's ancestor that's positioned.
    */
  def offsetParent(): OffsetType = js.native
  /**
    * on
    * Adds event listener to collection elements. Event is delegated if delegate is supplied.
    */
  def on(eventName: String, delegate: js.Any): Cash = js.native
  def on(eventName: String, delegate: js.Any, callback: js.Function): Cash = js.native
  def on(eventName: String, delegate: js.Any, callback: js.Function, runOnce: Boolean): Cash = js.native
  def on(eventName: js.Array[String], delegate: js.Any): Cash = js.native
  def on(eventName: js.Array[String], delegate: js.Any, callback: js.Function): Cash = js.native
  def on(eventName: js.Array[String], delegate: js.Any, callback: js.Function, runOnce: Boolean): Cash = js.native
  /**
    * one
    * Adds event listener to collection elements that only triggers once for each element.
    * Event is delegated if delegate is supplied.
    */
  def one(eventName: String, delegate: js.Any): Cash = js.native
  def one(eventName: String, delegate: js.Any, callback: js.Function): Cash = js.native
  def one(eventName: String, delegate: js.Any, callback: js.Function, runOnce: Boolean): Cash = js.native
  def one(eventName: js.Array[String], delegate: js.Any): Cash = js.native
  def one(eventName: js.Array[String], delegate: js.Any, callback: js.Function): Cash = js.native
  def one(eventName: js.Array[String], delegate: js.Any, callback: js.Function, runOnce: Boolean): Cash = js.native
  /**
    * outerHeight
    * Returns the outer height of the element. Includes margins if margin is set to true.
    */
  def outerHeight(): Double = js.native
  def outerHeight(flag: Boolean): Double = js.native
  /**
    * outerWidth
    * Returns the outer width of the element. Includes margins if margin is set to true.
    */
  def outerWidth(): Double = js.native
  def outerWidth(flag: Boolean): Double = js.native
  /**
    * parent
    * Returns parent element.
    */
  def parent(): Cash = js.native
  /**
    * parents
    * Returns collection of elements who are parents of element. Optionally filtering by selector.
    */
  def parents(): Cash = js.native
  def parents(selector: String): Cash = js.native
  /**
    * position
    * Get the coordinates of the first element in a collection relative to its offsetParent.
    */
  def position(): OffsetType = js.native
  /**
    * prepend
    * Prepends element to the each element in collection.
    */
  def prepend(content: String): Cash = js.native
  /**
    * prependTo
    * Prepends elements in a collection to the target element(s).
    */
  def prependTo(parent: String): Cash = js.native
  def prependTo(parent: Cash): Cash = js.native
  def prependTo(parent: Element): Cash = js.native
  /**
    * prev
    * Returns the previous adjacent element.
    */
  def prev(): Cash = js.native
  /**
    * prop
    * Returns a property value when just property is supplied.
    * Sets a property when property and value are supplied, and sets multiple properties when an object is supplied.
    */
  def prop(name: String): js.Any = js.native
  def prop(name: String, value: String): Cash = js.native
  /**
    * ready
    * Calls callback method on DOMContentLoaded.
    */
  def ready(fn: js.Function): Unit = js.native
  /**
    * remove
    * Removes collection elements from the DOM.
    */
  def remove(): Cash = js.native
  /**
    * removeAttr
    * Removes attribute from collection elements.
    */
  def removeAttr(name: String): Cash = js.native
  /**
    * removeClass
    * Removes className from collection elements.
    * Accepts space-separated classNames for removing multiple classes.
    * Providing no arguments will remove all classes.
    */
  def removeClass(): Cash = js.native
  def removeClass(c: String): Cash = js.native
  /**
    * removeData
    * Removes linked data and data-attributes from collection elements.
    */
  def removeData(key: String): Cash = js.native
  /**
    * removeProp
    * Removes property from collection elements.
    */
  def removeProp(name: String): Cash = js.native
  /**
    * serialize
    * When called on a form, serializes and returns form data.
    */
  def serialize(): String = js.native
  /**
    * siblings
    * Returns a collection of sibling elements.
    */
  def siblings(): Cash = js.native
  /**
    * text
    * Returns the inner text of the first element in the collection, sets the text if textContent is provided.
    */
  def text(): String = js.native
  def text(content: String): Cash = js.native
  @JSName("text")
  def text_Cash(): Cash = js.native
  /**
    * toggleClass
    * Adds or removes className from collection elements based on if the element already has the class.
    * Accepts space-separated classNames for toggling multiple classes, and an optional force boolean to ensure classes are added (true) or removed (false).
    */
  def toggleClass(c: String): Cash = js.native
  def toggleClass(c: String, state: Boolean): Cash = js.native
  /**
    * trigger
    * Triggers supplied event on elements in collection. Data can be passed along as the second parameter.
    */
  def trigger(eventName: String): Cash = js.native
  def trigger(eventName: String, data: js.Any): Cash = js.native
  /**
    * val
    * Returns an inputs value. If value is supplied, sets all inputs in collection's value to the value argument.
    */
  def `val`(): js.Any = js.native
  def `val`(value: String): Cash = js.native
  @JSName("val")
  def val_Cash(): Cash = js.native
  /**
    * width
    * Returns the width of the element.
    */
  def width(): Double = js.native
}

@JSGlobal("cash")
@js.native
object cash extends TopLevel[CashStatic]

