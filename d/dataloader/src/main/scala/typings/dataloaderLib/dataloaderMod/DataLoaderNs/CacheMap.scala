package typings
package dataloaderLib.dataloaderMod.DataLoaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheMap[K, V] extends js.Object {
  def clear(): js.Any
  def delete(key: K): js.Any
  def get(key: K): V | scala.Unit
  def set(key: K, value: V): js.Any
}

object CacheMap {
  @scala.inline
  def apply[K, V](
    clear: js.Function0[js.Any],
    delete: js.Function1[K, js.Any],
    get: js.Function1[K, V | scala.Unit],
    set: js.Function2[K, V, js.Any]
  ): CacheMap[K, V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[CacheMap[K, V]]
  }
}

