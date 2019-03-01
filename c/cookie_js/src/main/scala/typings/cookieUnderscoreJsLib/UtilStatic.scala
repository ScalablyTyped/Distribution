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
    decode: js.Function1[java.lang.String, java.lang.String],
    encode: js.Function1[java.lang.String, java.lang.String],
    getKeys: js.Function1[js.Object, js.Array[_]],
    isArray: js.Function1[js.Any, scala.Boolean],
    isObject: js.Function1[js.Any, scala.Boolean],
    retrieve: js.Function2[java.lang.String, java.lang.String, java.lang.String],
    toArray: js.Function1[/* repeated */ js.Any, js.Array[_]]
  ): UtilStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decode")(decode)
    __obj.updateDynamic("encode")(encode)
    __obj.updateDynamic("getKeys")(getKeys)
    __obj.updateDynamic("isArray")(isArray)
    __obj.updateDynamic("isObject")(isObject)
    __obj.updateDynamic("retrieve")(retrieve)
    __obj.updateDynamic("toArray")(toArray)
    __obj.asInstanceOf[UtilStatic]
  }
}

