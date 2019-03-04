package typings
package bidirectionalDashMapLib.bidirectionalDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BiMap[TValue] extends js.Object {
  var size: scala.Double
  def clear(): scala.Unit
  def delete(key: java.lang.String): scala.Unit
  def deleteValue(value: TValue): scala.Unit
  def entries(): stdLib.IterableIterator[js.Tuple2[java.lang.String, TValue]]
  def get(key: java.lang.String): TValue
  def getKey(value: TValue): java.lang.String
  def has(key: java.lang.String): scala.Boolean
  def hasValue(value: TValue): scala.Boolean
  def keys(): stdLib.IterableIterator[java.lang.String]
  def set(key: java.lang.String, value: TValue): scala.Unit
  def values(): stdLib.IterableIterator[TValue]
}

object BiMap {
  @scala.inline
  def apply[TValue](
    clear: js.Function0[scala.Unit],
    delete: js.Function1[java.lang.String, scala.Unit],
    deleteValue: js.Function1[TValue, scala.Unit],
    entries: js.Function0[stdLib.IterableIterator[js.Tuple2[java.lang.String, TValue]]],
    get: js.Function1[java.lang.String, TValue],
    getKey: js.Function1[TValue, java.lang.String],
    has: js.Function1[java.lang.String, scala.Boolean],
    hasValue: js.Function1[TValue, scala.Boolean],
    keys: js.Function0[stdLib.IterableIterator[java.lang.String]],
    set: js.Function2[java.lang.String, TValue, scala.Unit],
    size: scala.Double,
    values: js.Function0[stdLib.IterableIterator[TValue]]
  ): BiMap[TValue] = {
    val __obj = js.Dynamic.literal(clear = clear, delete = delete, deleteValue = deleteValue, entries = entries, get = get, getKey = getKey, has = has, hasValue = hasValue, keys = keys, set = set, size = size, values = values)
  
    __obj.asInstanceOf[BiMap[TValue]]
  }
}

