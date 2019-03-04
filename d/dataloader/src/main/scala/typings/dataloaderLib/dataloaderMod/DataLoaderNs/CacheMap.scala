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
    val __obj = js.Dynamic.literal(clear = clear, delete = delete, get = get, set = set)
  
    __obj.asInstanceOf[CacheMap[K, V]]
  }
}

