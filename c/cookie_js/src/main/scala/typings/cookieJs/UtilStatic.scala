package typings.cookieJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UtilStatic extends js.Object {
  def decode(value: String): String
  def encode(value: String): String
  def getKeys(value: js.Object): js.Array[_]
  def isArray(value: js.Any): Boolean
  def isObject(value: js.Any): Boolean
  def retrieve(x: String, y: String): String
  def toArray(args: js.Any*): js.Array[_]
}

object UtilStatic {
  @scala.inline
  def apply(
    decode: String => String,
    encode: String => String,
    getKeys: js.Object => js.Array[_],
    isArray: js.Any => Boolean,
    isObject: js.Any => Boolean,
    retrieve: (String, String) => String,
    toArray: /* repeated */ js.Any => js.Array[_]
  ): UtilStatic = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), getKeys = js.Any.fromFunction1(getKeys), isArray = js.Any.fromFunction1(isArray), isObject = js.Any.fromFunction1(isObject), retrieve = js.Any.fromFunction2(retrieve), toArray = js.Any.fromFunction1(toArray))
    __obj.asInstanceOf[UtilStatic]
  }
}

