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
  def apply[K, V](clear: () => js.Any, delete: K => js.Any, get: K => V | scala.Unit, set: (K, V) => js.Any): CacheMap[K, V] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[CacheMap[K, V]]
  }
}

