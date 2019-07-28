package typings.cachefactory.cachefactoryMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cachefactory", "Cache")
@js.native
class Cache () extends js.Object {
  var id: String = js.native
  def destroy(): Unit = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def get(key: String): js.Any = js.native
  def get(key: String, options: GetPutOptions): js.Any = js.native
  def get(key: Double): js.Any = js.native
  def get(key: Double, options: GetPutOptions): js.Any = js.native
  def info(key: String): CacheInfo | ItemInfo = js.native
  def info(key: Double): CacheInfo | ItemInfo = js.native
  def keySet(): StringDictionary[String | Double] = js.native
  def keys(): js.Array[String | Double] = js.native
  def put(key: String, value: js.Any): js.Any = js.native
  def put(key: String, value: js.Any, options: GetPutOptions): js.Any = js.native
  def put(key: Double, value: js.Any): js.Any = js.native
  def put(key: Double, value: js.Any, options: GetPutOptions): js.Any = js.native
  def remove(key: String): js.Any = js.native
  def remove(key: Double): js.Any = js.native
  def removeAll(): Unit = js.native
  def removeExpired(): StringDictionary[js.Any] = js.native
  def setCacheFlushInterval(cacheFlushInterval: Double): Unit = js.native
  def setCapacity(capacity: Double): Unit = js.native
  def setDeleteOnExpire(deleteOnExpire: DeleteOnExpire): Unit = js.native
  def setDeleteOnExpire(deleteOnExpire: DeleteOnExpire, setRecycleFreq: Boolean): Unit = js.native
  def setMaxAge(maxAge: Double): Unit = js.native
  def setOnExpire(onExpire: js.Function): js.Any = js.native
  def setOptions(cacheOptions: CacheOptions): Unit = js.native
  def setOptions(cacheOptions: CacheOptions, strict: Boolean): Unit = js.native
  def setRecycleFreq(recycleFreq: Boolean): Unit = js.native
  def setStorageMode(storageMode: StorageMode): Unit = js.native
  def setStorageMode(storageMode: StorageMode, storageImpl: StorageImpl): Unit = js.native
  def touch(key: String): Unit = js.native
  def touch(key: Double): Unit = js.native
  def values(): js.Array[_] = js.native
}

