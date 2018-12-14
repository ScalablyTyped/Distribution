package typings
package cachefactoryLib.cachefactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cachefactory", "Cache")
@js.native
class Cache () extends js.Object {
  var id: java.lang.String = js.native
  def destroy(): scala.Unit = js.native
  def disable(): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def get(key: java.lang.String): js.Any = js.native
  def get(key: java.lang.String, options: GetPutOptions): js.Any = js.native
  def get(key: scala.Double): js.Any = js.native
  def get(key: scala.Double, options: GetPutOptions): js.Any = js.native
  def info(key: java.lang.String): CacheInfo | ItemInfo = js.native
  def info(key: scala.Double): CacheInfo | ItemInfo = js.native
  def keySet(): org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double] = js.native
  def keys(): js.Array[java.lang.String | scala.Double] = js.native
  def put(key: java.lang.String, value: js.Any): js.Any = js.native
  def put(key: java.lang.String, value: js.Any, options: GetPutOptions): js.Any = js.native
  def put(key: scala.Double, value: js.Any): js.Any = js.native
  def put(key: scala.Double, value: js.Any, options: GetPutOptions): js.Any = js.native
  def remove(key: java.lang.String): js.Any = js.native
  def remove(key: scala.Double): js.Any = js.native
  def removeAll(): scala.Unit = js.native
  def removeExpired(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def setCacheFlushInterval(cacheFlushInterval: scala.Double): scala.Unit = js.native
  def setCapacity(capacity: scala.Double): scala.Unit = js.native
  def setDeleteOnExpire(deleteOnExpire: DeleteOnExpire): scala.Unit = js.native
  def setDeleteOnExpire(deleteOnExpire: DeleteOnExpire, setRecycleFreq: scala.Boolean): scala.Unit = js.native
  def setMaxAge(maxAge: scala.Double): scala.Unit = js.native
  def setOnExpire(onExpire: js.Function): js.Any = js.native
  def setOptions(cacheOptions: CacheOptions): scala.Unit = js.native
  def setOptions(cacheOptions: CacheOptions, strict: scala.Boolean): scala.Unit = js.native
  def setRecycleFreq(recycleFreq: scala.Boolean): scala.Unit = js.native
  def setStorageMode(storageMode: StorageMode): scala.Unit = js.native
  def setStorageMode(storageMode: StorageMode, storageImpl: StorageImpl): scala.Unit = js.native
  def touch(key: java.lang.String): scala.Unit = js.native
  def touch(key: scala.Double): scala.Unit = js.native
  def values(): js.Array[_] = js.native
}

