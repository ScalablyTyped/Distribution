package typings.backboneDashFetchDashCache.backboneDashFetchDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  var _superMethods: SuperMethods = js.native
  /**
    * Global flag to enable/disable caching
    */
  var enabled: Boolean = js.native
  /**
    * By default the cache is persisted in localStorage (if available).
    * Set Backbone.fetchCache.localStorage = false to disable this.
    */
  var localStorage: Boolean = js.native
  /**
    * Sometimes you just need to clear a cached item manually.
    * Backbone.fetchCache.clearItem() can be called safely from anywhere
    * in your application. It will take your backbone Model or Collection,
    * a function that returns the key String, or the key String itself. If
    * you pass in a Model or Collection, the .getCacheKey() method will be
    * checked before the url property.
    */
  def clearItem(args: js.Any*): js.Any = js.native
  /**
    * You can explicitly fetch a cached item, without having to call the
    * models/collection fetch. This might be useful for debugging and
    * testing.
    */
  def getCache(key: js.Function0[String]): Cache = js.native
  def getCache(key: js.Function0[String], opts: GetCacheOptions): Cache = js.native
  def getCache(key: GetCacheKeyOptions): Cache = js.native
  def getCache(key: GetCacheKeyOptions, opts: GetCacheOptions): Cache = js.native
  def getCacheKey(key: js.Function0[String]): String = js.native
  def getCacheKey(key: js.Function0[String], opts: GetCacheOptions): String = js.native
  def getCacheKey(key: GetCacheKeyOptions): String = js.native
  def getCacheKey(key: GetCacheKeyOptions, opts: GetCacheOptions): String = js.native
  /**
    * If you want to know when was the last (server) sync of a given key, you can use.
    */
  def getLastSync(key: js.Function0[String]): Double = js.native
  def getLastSync(key: js.Function0[String], opts: GetCacheOptions): Double = js.native
  def getLastSync(key: GetCacheKeyOptions): Double = js.native
  def getLastSync(key: GetCacheKeyOptions, opts: GetCacheOptions): Double = js.native
  def getLocalStorage(): Unit = js.native
  def getLocalStorageKey(): String = js.native
  /**
    * When setting items in localStorage, the browser may throw a
    * QUOTA_EXCEEDED_ERR, meaning the store is full. Backbone.fetchCache
    * tries to work around this problem by deleting what it considers the
    * most stale item to make space for the new data. The staleness of
    * data is determined by the sorting function priorityFn, which by
    * default returns the oldest item.
    */
  def priorityFn(a: Cache, b: Cache): Double = js.native
  def reset(): Unit = js.native
  def setCache(instance: js.Function0[String]): Unit = js.native
  def setCache(instance: js.Function0[String], opts: SetCacheOptions): Unit = js.native
  def setCache(instance: js.Function0[String], opts: SetCacheOptions, attrs: js.Any): Unit = js.native
  def setCache(instance: GetCacheKeyOptions): Unit = js.native
  def setCache(instance: GetCacheKeyOptions, opts: SetCacheOptions): Unit = js.native
  def setCache(instance: GetCacheKeyOptions, opts: SetCacheOptions, attrs: js.Any): Unit = js.native
  def setLocalStorage(args: js.Any*): js.Any = js.native
}

