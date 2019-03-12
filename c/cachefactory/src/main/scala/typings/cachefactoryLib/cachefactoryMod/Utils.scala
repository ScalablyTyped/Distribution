package typings
package cachefactoryLib.cachefactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utils extends js.Object {
  var Promise: js.UndefOr[stdLib.PromiseConstructor] = js.undefined
  def equals(a: js.Any, b: js.Any): scala.Boolean
  def fromJson(value: java.lang.String): js.Any
  def isFunction(value: js.Any): scala.Boolean
  def isNumber(value: js.Any): scala.Boolean
  def isObject(value: js.Any): scala.Boolean
  def isString(value: js.Any): scala.Boolean
}

object Utils {
  @scala.inline
  def apply(
    equals: (js.Any, js.Any) => scala.Boolean,
    fromJson: java.lang.String => js.Any,
    isFunction: js.Any => scala.Boolean,
    isNumber: js.Any => scala.Boolean,
    isObject: js.Any => scala.Boolean,
    isString: js.Any => scala.Boolean,
    Promise: stdLib.PromiseConstructor = null
  ): Utils = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction2(equals), fromJson = js.Any.fromFunction1(fromJson), isFunction = js.Any.fromFunction1(isFunction), isNumber = js.Any.fromFunction1(isNumber), isObject = js.Any.fromFunction1(isObject), isString = js.Any.fromFunction1(isString))
    if (Promise != null) __obj.updateDynamic("Promise")(Promise)
    __obj.asInstanceOf[Utils]
  }
}

