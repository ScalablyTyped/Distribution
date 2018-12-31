package typings
package cashLib

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
  def add(selector: Cash): Cash = js.native
  def add(selector: Cash, context: stdLib.Element): Cash = js.native
  /**
    * add
    * Returns a new collection with the element(s) added to the end.
    */
  def add(selector: java.lang.String): Cash = js.native
  def add(selector: java.lang.String, context: stdLib.Element): Cash = js.native
  def add(selector: stdLib.Element): Cash = js.native
  def add(selector: stdLib.Element, context: stdLib.Element): Cash = js.native
  /**
    * addClass
    * Adds the className argument to collection elements.
    */
  def addClass(c: java.lang.String): Cash = js.native
  def after(selector: java.lang.String): Cash = js.native
  /**
    * after
    * Inserts content or elements after the collection.
    */
  def after(selector: stdLib.Element): Cash = js.native
  def append(content: Cash): Cash = js.native
  /**
    * append
    * Appends the target element to the each element in the collection.
    */
  def append(content: java.lang.String): Cash = js.native
  def append(content: stdLib.Element): Cash = js.native
  def appendTo(parent: Cash): Cash = js.native
  /**
    * appendTo
    * Adds the elements in a collection to the target element(s).
    */
  def appendTo(parent: java.lang.String): Cash = js.native
  def appendTo(parent: stdLib.Element): Cash = js.native
  /**
    * attr
    * Without attrValue, returns the attribute value of the first element in the collection.
    * With attrValue, sets the attribute value of each element of the collection.
    */
  def attr(name: java.lang.String): js.Any = js.native
  def attr(name: java.lang.String, value: java.lang.String): Cash = js.native
  /**
    * before
    * Inserts content or elements before the collection.
    */
  def before(selector: java.lang.String): Cash = js.native
  def before(selector: stdLib.Element): Cash = js.native
  /**
    * children
    * Without a selector specified, returns a collection of child elements.
    * With a selector, returns child elements that match the selector.
    */
  def children(): Cash = js.native
  def children(selector: java.lang.String): Cash = js.native
  /**
    * closest
    * Returns the closest matching selector up the DOM tree.
    */
  def closest(): Cash = js.native
  def closest(selector: java.lang.String): Cash = js.native
  def css(prop: java.lang.String, value: js.Any): Cash = js.native
  /**
    * css
    * Returns a CSS property value when just property is supplied.
    * Sets a CSS property when property and value are supplied, and set multiple properties when an object is supplied.
    * Properties will be autoprefixed if needed for the user's browser.
    */
  def css(prop: js.Any): js.Any = js.native
  def data(name: java.lang.String, value: js.Any): Cash = js.native
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
  def eq(index: scala.Double): Cash = js.native
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
  def find(selector: java.lang.String): Cash = js.native
  /**
    * first
    * Returns the first element in the collection.
    */
  def first(): Cash = js.native
  /**
    * get
    * Returns the element at the index.
    */
  def get(index: scala.Double): stdLib.HTMLElement = js.native
  /**
    * has
    * Returns boolean result of the selector argument against the collection.
    */
  def has(selector: java.lang.String): scala.Boolean = js.native
  /**
    * hasClass
    * Returns the boolean result of checking if the first element in the collection has the className attribute.
    */
  def hasClass(c: java.lang.String): scala.Boolean = js.native
  /**
    * height
    * Returns the height of the element.
    */
  def height(): scala.Double = js.native
  /**
    * html
    * Returns the HTML text of the first element in the collection, sets the HTML if provided.
    */
  def html(): java.lang.String = js.native
  def html(content: java.lang.String): Cash = js.native
  /**
    * index
    * Returns the index of the element in its parent if an element or selector isn't provided.
    * Returns index within element or selector if it is.
    */
  def index(): scala.Double = js.native
  def index(elem: stdLib.Element): scala.Double = js.native
  /**
    * innerHeight
    * Returns the height of the element + padding.
    */
  def innerHeight(): scala.Double = js.native
  /**
    * innerWidth
    * Returns the width of the element + padding.
    */
  def innerWidth(): scala.Double = js.native
  def insertAfter(selector: Cash): Cash = js.native
  /**
    * insertAfter
    * Inserts collection after specified element.
    */
  def insertAfter(selector: java.lang.String): Cash = js.native
  def insertAfter(selector: stdLib.Element): Cash = js.native
  def insertBefore(selector: Cash): Cash = js.native
  /**
    * insertBefore
    * Inserts collection before specified element.
    */
  def insertBefore(selector: java.lang.String): Cash = js.native
  def insertBefore(selector: stdLib.Element): Cash = js.native
  def is(selector: Cash): scala.Boolean = js.native
  /**
    * is
    * Returns whether the provided selector, element or collection matches any element in the collection.
    */
  def is(selector: java.lang.String): scala.Boolean = js.native
  def is(selector: stdLib.Element): scala.Boolean = js.native
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
  def not(selector: Cash): Cash = js.native
  /**
    * not
    * Filters collection by false match on selector.
    */
  def not(selector: java.lang.String): Cash = js.native
  def not(selector: stdLib.Element): Cash = js.native
  /**
    * off
    * Removes event listener from collection elements.
    */
  def off(eventName: java.lang.String, callback: js.Function): Cash = js.native
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
  def on(eventName: java.lang.String, delegate: js.Any): Cash = js.native
  def on(eventName: java.lang.String, delegate: js.Any, callback: js.Function): Cash = js.native
  def on(eventName: java.lang.String, delegate: js.Any, callback: js.Function, runOnce: scala.Boolean): Cash = js.native
  def on(eventName: js.Array[java.lang.String], delegate: js.Any): Cash = js.native
  def on(eventName: js.Array[java.lang.String], delegate: js.Any, callback: js.Function): Cash = js.native
  def on(
    eventName: js.Array[java.lang.String],
    delegate: js.Any,
    callback: js.Function,
    runOnce: scala.Boolean
  ): Cash = js.native
  /**
    * one
    * Adds event listener to collection elements that only triggers once for each element.
    * Event is delegated if delegate is supplied.
    */
  def one(eventName: java.lang.String, delegate: js.Any): Cash = js.native
  def one(eventName: java.lang.String, delegate: js.Any, callback: js.Function): Cash = js.native
  def one(eventName: java.lang.String, delegate: js.Any, callback: js.Function, runOnce: scala.Boolean): Cash = js.native
  def one(eventName: js.Array[java.lang.String], delegate: js.Any): Cash = js.native
  def one(eventName: js.Array[java.lang.String], delegate: js.Any, callback: js.Function): Cash = js.native
  def one(
    eventName: js.Array[java.lang.String],
    delegate: js.Any,
    callback: js.Function,
    runOnce: scala.Boolean
  ): Cash = js.native
  /**
    * outerHeight
    * Returns the outer height of the element. Includes margins if margin is set to true.
    */
  def outerHeight(): scala.Double = js.native
  def outerHeight(flag: scala.Boolean): scala.Double = js.native
  /**
    * outerWidth
    * Returns the outer width of the element. Includes margins if margin is set to true.
    */
  def outerWidth(): scala.Double = js.native
  def outerWidth(flag: scala.Boolean): scala.Double = js.native
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
  def parents(selector: java.lang.String): Cash = js.native
  /**
    * position
    * Get the coordinates of the first element in a collection relative to its offsetParent.
    */
  def position(): OffsetType = js.native
  /**
    * prepend
    * Prepends element to the each element in collection.
    */
  def prepend(content: java.lang.String): Cash = js.native
  def prependTo(parent: Cash): Cash = js.native
  /**
    * prependTo
    * Prepends elements in a collection to the target element(s).
    */
  def prependTo(parent: java.lang.String): Cash = js.native
  def prependTo(parent: stdLib.Element): Cash = js.native
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
  def prop(name: java.lang.String): js.Any = js.native
  def prop(name: java.lang.String, value: java.lang.String): Cash = js.native
  /**
    * ready
    * Calls callback method on DOMContentLoaded.
    */
  def ready(fn: js.Function): scala.Unit = js.native
  /**
    * remove
    * Removes collection elements from the DOM.
    */
  def remove(): Cash = js.native
  /**
    * removeAttr
    * Removes attribute from collection elements.
    */
  def removeAttr(name: java.lang.String): Cash = js.native
  /**
    * removeClass
    * Removes className from collection elements.
    * Accepts space-separated classNames for removing multiple classes.
    * Providing no arguments will remove all classes.
    */
  def removeClass(): Cash = js.native
  def removeClass(c: java.lang.String): Cash = js.native
  /**
    * removeData
    * Removes linked data and data-attributes from collection elements.
    */
  def removeData(key: java.lang.String): Cash = js.native
  /**
    * removeProp
    * Removes property from collection elements.
    */
  def removeProp(name: java.lang.String): Cash = js.native
  /**
    * serialize
    * When called on a form, serializes and returns form data.
    */
  def serialize(): java.lang.String = js.native
  /**
    * siblings
    * Returns a collection of sibling elements.
    */
  def siblings(): Cash = js.native
  /**
    * text
    * Returns the inner text of the first element in the collection, sets the text if textContent is provided.
    */
  def text(): java.lang.String = js.native
  def text(content: java.lang.String): Cash = js.native
  @JSName("text")
  def text_Cash(): Cash = js.native
  /**
    * toggleClass
    * Adds or removes className from collection elements based on if the element already has the class.
    * Accepts space-separated classNames for toggling multiple classes, and an optional force boolean to ensure classes are added (true) or removed (false).
    */
  def toggleClass(c: java.lang.String): Cash = js.native
  def toggleClass(c: java.lang.String, state: scala.Boolean): Cash = js.native
  /**
    * trigger
    * Triggers supplied event on elements in collection. Data can be passed along as the second parameter.
    */
  def trigger(eventName: java.lang.String): Cash = js.native
  def trigger(eventName: java.lang.String, data: js.Any): Cash = js.native
  /**
    * val
    * Returns an inputs value. If value is supplied, sets all inputs in collection's value to the value argument.
    */
  def `val`(): js.Any = js.native
  def `val`(value: java.lang.String): Cash = js.native
  @JSName("val")
  def val_Cash(): Cash = js.native
  /**
    * width
    * Returns the width of the element.
    */
  def width(): scala.Double = js.native
}

