package typings.cash

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CashStatic
  * Static declaration for CashJs accessible directly using Cash object or $
  */
@js.native
trait CashStatic extends js.Object {
  /**
    * fn: use to extend cash for plugin development
    * @type property
    */
  var fn: js.Any = js.native
  def apply(elementArray: js.Array[Element]): Cash = js.native
  def apply(element: Element): Cash = js.native
  /**
    * selector declaration for Cash to use $(<argument>)
    */
  def apply(selector: String): Cash = js.native
  def apply(selector: String, context: Cash): Cash = js.native
  def apply(selector: String, context: Element): Cash = js.native
  /**
    * each
    * Iterates through a collection and calls the callback method on each.
    * @type method
    * @argument collection Array, callback Function
    * @return Array
    */
  def each(collection: js.Array[_], callback: js.Function): js.Array[_] = js.native
  /**
    * extend
    * Extends target object with properties from the source object. If no target is provided, cash itself will be extended.
    * @type method
    * @argument target any, source any
    */
  def extend(target: js.Any, source: js.Any): js.Any = js.native
  /**
    * isArray
    * Check if the argument is an array.
    * @type method
    * @argument any
    * @return boolean
    */
  def isArray(n: js.Any): Boolean = js.native
  /**
    * isFunction
    * Check if the argument is a function.
    * @type method
    * @argument any
    * @return boolean
    */
  def isFunction(n: js.Any): Boolean = js.native
  /**
    * isNumeric
    * Check if the argument is numeric.
    * @type method
    * @type method
    * @argument any
    * @return boolean
    */
  def isNumeric(n: js.Any): Boolean = js.native
  /**
    * isString
    * Check if the argument is a string.
    * @type method
    * @argument str any
    * @return boolean
    */
  def isString(str: js.Any): Boolean = js.native
  /**
    * matches
    * Checks a selector against an element, returning a boolean value for match.
    * @type method
    * @argument element Cash, selector string
    * @return boolean
    */
  def matches(element: Cash, selector: String): Boolean = js.native
  /**
    * parseHTML
    * Returns a collection from an HTML string.
    * @type method
    * @argument htmlString string
    * @return Cash
    */
  def parseHTML(htmlString: String): Cash = js.native
}

