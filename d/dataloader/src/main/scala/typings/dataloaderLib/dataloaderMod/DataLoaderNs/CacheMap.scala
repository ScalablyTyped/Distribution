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

