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
    clear: () => scala.Unit,
    delete: java.lang.String => scala.Unit,
    deleteValue: TValue => scala.Unit,
    entries: () => stdLib.IterableIterator[js.Tuple2[java.lang.String, TValue]],
    get: java.lang.String => TValue,
    getKey: TValue => java.lang.String,
    has: java.lang.String => scala.Boolean,
    hasValue: TValue => scala.Boolean,
    keys: () => stdLib.IterableIterator[java.lang.String],
    set: (java.lang.String, TValue) => scala.Unit,
    size: scala.Double,
    values: () => stdLib.IterableIterator[TValue]
  ): BiMap[TValue] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), deleteValue = js.Any.fromFunction1(deleteValue), entries = js.Any.fromFunction0(entries), get = js.Any.fromFunction1(get), getKey = js.Any.fromFunction1(getKey), has = js.Any.fromFunction1(has), hasValue = js.Any.fromFunction1(hasValue), keys = js.Any.fromFunction0(keys), set = js.Any.fromFunction2(set), size = size, values = js.Any.fromFunction0(values))
  
    __obj.asInstanceOf[BiMap[TValue]]
  }
}

