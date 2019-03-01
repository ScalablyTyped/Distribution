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
    equals: js.Function2[js.Any, js.Any, scala.Boolean],
    fromJson: js.Function1[java.lang.String, js.Any],
    isFunction: js.Function1[js.Any, scala.Boolean],
    isNumber: js.Function1[js.Any, scala.Boolean],
    isObject: js.Function1[js.Any, scala.Boolean],
    isString: js.Function1[js.Any, scala.Boolean],
    Promise: stdLib.PromiseConstructor = null
  ): Utils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("equals")(equals)
    __obj.updateDynamic("fromJson")(fromJson)
    __obj.updateDynamic("isFunction")(isFunction)
    __obj.updateDynamic("isNumber")(isNumber)
    __obj.updateDynamic("isObject")(isObject)
    __obj.updateDynamic("isString")(isString)
    if (Promise != null) __obj.updateDynamic("Promise")(Promise)
    __obj.asInstanceOf[Utils]
  }
}

