package typings
package cookieUnderscoreJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UtilStatic extends js.Object {
  def decode(value: java.lang.String): java.lang.String
  def encode(value: java.lang.String): java.lang.String
  def getKeys(value: js.Object): js.Array[_]
  def isArray(value: js.Any): scala.Boolean
  def isObject(value: js.Any): scala.Boolean
  def retrieve(x: java.lang.String, y: java.lang.String): java.lang.String
  def toArray(args: js.Any*): js.Array[_]
}

object UtilStatic {
  @scala.inline
  def apply(
    decode: java.lang.String => java.lang.String,
    encode: java.lang.String => java.lang.String,
    getKeys: js.Object => js.Array[_],
    isArray: js.Any => scala.Boolean,
    isObject: js.Any => scala.Boolean,
    retrieve: (java.lang.String, java.lang.String) => java.lang.String,
    toArray: /* repeated */ js.Any => js.Array[_]
  ): UtilStatic = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), getKeys = js.Any.fromFunction1(getKeys), isArray = js.Any.fromFunction1(isArray), isObject = js.Any.fromFunction1(isObject), retrieve = js.Any.fromFunction2(retrieve), toArray = js.Any.fromFunction1(toArray))
  
    __obj.asInstanceOf[UtilStatic]
  }
}

