package typings.catbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("catbox", "Policy")
@js.native
class Policy[T, O /* <: PolicyOptionVariants[T] */] protected () extends js.Object {
  def this(options: O, cache: Client[T], segment: String) = this()
  /**
    * remove the item from cache where:
    * @param id the unique item identifier (within the policy segment).
    */
  def drop(id: Id): js.Promise[Unit] = js.native
  /**
    *  retrieve an item from the cache. If the item is not
    * found and the generateFunc method was provided,
    * a new value is generated, stored in the cache, and returned.
    * Multiple concurrent requests are queued and processed once. The method arguments are:
    * @param id the unique item identifier (within the policy segment).
    * Can be a string or an object with the required 'id' key.
    */
  def get(id: Id): js.Promise[T | Null | DecoratedResult[T]] = js.native
  /**
    * returns true if cache engine determines itself as ready, false if it is not ready or if
    * here is no cache engine set.
    */
  def isReady(): Boolean = js.native
  /** changes the policy rules after construction (note that items already stored will not be affected) */
  def rules(options: PolicyOptions[T]): Unit = js.native
  /**
    * store an item in the cache where:
    * @param id - the unique item identifier (within the policy segment).
    * @param value - the string or object value to be stored.
    * @param ttl - a time-to-live override value in milliseconds after which the item is automatically
    * removed from the cache (or is marked invalid).
    *    This should be set to 0 in order to use the caching rules configured when creating the Policy object.
    */
  def set(id: Id, value: T): js.Promise[Unit] = js.native
  def set(id: Id, value: T, ttl: Double): js.Promise[Unit] = js.native
  /** an object with cache statistics */
  def stats(): CacheStatisticsObject = js.native
  /**
    * given a created timestamp in milliseconds, returns the time-to-live left
    * based on the configured rules.
    */
  def ttl(created: Double): Double = js.native
}

