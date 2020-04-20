package typings.bidirectionalMap.mod

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BiMap[TValue] extends js.Object {
  var size: Double
  def clear(): Unit
  def delete(key: String): Unit
  def deleteValue(value: TValue): Unit
  def entries(): IterableIterator[js.Tuple2[String, TValue]]
  def get(key: String): TValue
  def getKey(value: TValue): String
  def has(key: String): Boolean
  def hasValue(value: TValue): Boolean
  def keys(): IterableIterator[String]
  def set(key: String, value: TValue): Unit
  def values(): IterableIterator[TValue]
}

object BiMap {
  @scala.inline
  def apply[TValue](
    clear: () => Unit,
    delete: String => Unit,
    deleteValue: TValue => Unit,
    entries: () => IterableIterator[js.Tuple2[String, TValue]],
    get: String => TValue,
    getKey: TValue => String,
    has: String => Boolean,
    hasValue: TValue => Boolean,
    keys: () => IterableIterator[String],
    set: (String, TValue) => Unit,
    size: Double,
    values: () => IterableIterator[TValue]
  ): BiMap[TValue] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), deleteValue = js.Any.fromFunction1(deleteValue), entries = js.Any.fromFunction0(entries), get = js.Any.fromFunction1(get), getKey = js.Any.fromFunction1(getKey), has = js.Any.fromFunction1(has), hasValue = js.Any.fromFunction1(hasValue), keys = js.Any.fromFunction0(keys), set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[BiMap[TValue]]
  }
}

