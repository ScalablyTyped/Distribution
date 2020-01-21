package typings.cachefactory.mod

import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utils_ extends js.Object {
  var Promise: js.UndefOr[PromiseConstructor] = js.undefined
  def equals(a: js.Any, b: js.Any): Boolean
  def fromJson(value: String): js.Any
  def isFunction(value: js.Any): Boolean
  def isNumber(value: js.Any): Boolean
  def isObject(value: js.Any): Boolean
  def isString(value: js.Any): Boolean
}

object Utils_ {
  @scala.inline
  def apply(
    equals: (js.Any, js.Any) => Boolean,
    fromJson: String => js.Any,
    isFunction: js.Any => Boolean,
    isNumber: js.Any => Boolean,
    isObject: js.Any => Boolean,
    isString: js.Any => Boolean,
    Promise: PromiseConstructor = null
  ): Utils_ = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction2(equals), fromJson = js.Any.fromFunction1(fromJson), isFunction = js.Any.fromFunction1(isFunction), isNumber = js.Any.fromFunction1(isNumber), isObject = js.Any.fromFunction1(isObject), isString = js.Any.fromFunction1(isString))
    if (Promise != null) __obj.updateDynamic("Promise")(Promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[Utils_]
  }
}

