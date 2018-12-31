package typings
package backboneDashFetchDashCacheLib.backboneDashFetchDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  var _superMethods: SuperMethods = js.native
  /**
    * Global flag to enable/disable caching
    */
  var enabled: scala.Boolean = js.native
  /**
    * By default the cache is persisted in localStorage (if available).
    * Set Backbone.fetchCache.localStorage = false to disable this.
    */
  var localStorage: scala.Boolean = js.native
  /**
    * Sometimes you just need to clear a cached item manually.
    * Backbone.fetchCache.clearItem() can be called safely from anywhere
    * in your application. It will take your backbone Model or Collection,
    * a function that returns the key String, or the key String itself. If
    * you pass in a Model or Collection, the .getCacheKey() method will be
    * checked before the url property.
    */
  def clearItem(args: js.Any*): js.Any = js.native
  def getCache(key: backboneDashFetchDashCacheLib.GetCacheKeyOptions): Cache = js.native
  def getCache(key: backboneDashFetchDashCacheLib.GetCacheKeyOptions, opts: GetCacheOptions): Cache = js.native
  /**
    * You can explicitly fetch a cached item, without having to call the
    * models/collection fetch. This might be useful for debugging and
    * testing.
    */
  def getCache(key: js.Function0[java.lang.String]): Cache = js.native
  def getCache(key: js.Function0[java.lang.String], opts: GetCacheOptions): Cache = js.native
  def getCacheKey(key: backboneDashFetchDashCacheLib.GetCacheKeyOptions): java.lang.String = js.native
  def getCacheKey(key: backboneDashFetchDashCacheLib.GetCacheKeyOptions, opts: GetCacheOptions): java.lang.String = js.native
  def getCacheKey(key: js.Function0[java.lang.String]): java.lang.String = js.native
  def getCacheKey(key: js.Function0[java.lang.String], opts: GetCacheOptions): java.lang.String = js.native
  def getLastSync(key: backboneDashFetchDashCacheLib.GetCacheKeyOptions): scala.Double = js.native
  def getLastSync(key: backboneDashFetchDashCacheLib.GetCacheKeyOptions, opts: GetCacheOptions): scala.Double = js.native
  /**
    * If you want to know when was the last (server) sync of a given key, you can use.
    */
  def getLastSync(key: js.Function0[java.lang.String]): scala.Double = js.native
  def getLastSync(key: js.Function0[java.lang.String], opts: GetCacheOptions): scala.Double = js.native
  def getLocalStorage(): scala.Unit = js.native
  def getLocalStorageKey(): java.lang.String = js.native
  /**
    * When setting items in localStorage, the browser may throw a
    * QUOTA_EXCEEDED_ERR, meaning the store is full. Backbone.fetchCache
    * tries to work around this problem by deleting what it considers the
    * most stale item to make space for the new data. The staleness of
    * data is determined by the sorting function priorityFn, which by
    * default returns the oldest item.
    */
  def priorityFn(a: Cache, b: Cache): scala.Double = js.native
  def reset(): scala.Unit = js.native
  def setCache(instance: backboneDashFetchDashCacheLib.GetCacheKeyOptions): scala.Unit = js.native
  def setCache(instance: backboneDashFetchDashCacheLib.GetCacheKeyOptions, opts: SetCacheOptions): scala.Unit = js.native
  def setCache(instance: backboneDashFetchDashCacheLib.GetCacheKeyOptions, opts: SetCacheOptions, attrs: js.Any): scala.Unit = js.native
  def setCache(instance: js.Function0[java.lang.String]): scala.Unit = js.native
  def setCache(instance: js.Function0[java.lang.String], opts: SetCacheOptions): scala.Unit = js.native
  def setCache(instance: js.Function0[java.lang.String], opts: SetCacheOptions, attrs: js.Any): scala.Unit = js.native
  def setLocalStorage(args: js.Any*): js.Any = js.native
}

