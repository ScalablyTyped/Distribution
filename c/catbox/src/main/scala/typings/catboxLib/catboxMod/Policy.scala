package typings
package catboxLib.catboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("catbox", "Policy")
@js.native
class Policy[T, O /* <: PolicyOptionVariants[T] */] protected () extends js.Object {
  def this(options: O, cache: Client[T], segment: java.lang.String) = this()
  /**
       * remove the item from cache where:
       * @param id the unique item identifier (within the policy segment).
       */
  def drop(id: catboxLib.Anon_Id): stdLib.Promise[scala.Unit] = js.native
  /**
       * remove the item from cache where:
       * @param id the unique item identifier (within the policy segment).
       */
  def drop(id: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /**
       *  retrieve an item from the cache. If the item is not
       * found and the generateFunc method was provided,
       * a new value is generated, stored in the cache, and returned.
       * Multiple concurrent requests are queued and processed once. The method arguments are:
       * @param id the unique item identifier (within the policy segment).
       * Can be a string or an object with the required 'id' key.
       */
  def get(id: catboxLib.Anon_Id): stdLib.Promise[T | scala.Null | DecoratedResult[T]] = js.native
  /**
       *  retrieve an item from the cache. If the item is not
       * found and the generateFunc method was provided,
       * a new value is generated, stored in the cache, and returned.
       * Multiple concurrent requests are queued and processed once. The method arguments are:
       * @param id the unique item identifier (within the policy segment).
       * Can be a string or an object with the required 'id' key.
       */
  def get(id: java.lang.String): stdLib.Promise[T | scala.Null | DecoratedResult[T]] = js.native
  /**
       * returns true if cache engine determines itself as ready, false if it is not ready or if
       * here is no cache engine set.
       */
  def isReady(): scala.Boolean = js.native
  /** changes the policy rules after construction (note that items already stored will not be affected) */
  def rules(options: PolicyOptions[T]): scala.Unit = js.native
  /**
       * store an item in the cache where:
       * @param id - the unique item identifier (within the policy segment).
       * @param value - the string or object value to be stored.
       * @param ttl - a time-to-live override value in milliseconds after which the item is automatically
       * removed from the cache (or is marked invalid).
       *    This should be set to 0 in order to use the caching rules configured when creating the Policy object.
       */
  def set(id: catboxLib.Anon_Id, value: T): stdLib.Promise[scala.Unit] = js.native
  /**
       * store an item in the cache where:
       * @param id - the unique item identifier (within the policy segment).
       * @param value - the string or object value to be stored.
       * @param ttl - a time-to-live override value in milliseconds after which the item is automatically
       * removed from the cache (or is marked invalid).
       *    This should be set to 0 in order to use the caching rules configured when creating the Policy object.
       */
  def set(id: catboxLib.Anon_Id, value: T, ttl: scala.Double): stdLib.Promise[scala.Unit] = js.native
  /**
       * store an item in the cache where:
       * @param id - the unique item identifier (within the policy segment).
       * @param value - the string or object value to be stored.
       * @param ttl - a time-to-live override value in milliseconds after which the item is automatically
       * removed from the cache (or is marked invalid).
       *    This should be set to 0 in order to use the caching rules configured when creating the Policy object.
       */
  def set(id: java.lang.String, value: T): stdLib.Promise[scala.Unit] = js.native
  /**
       * store an item in the cache where:
       * @param id - the unique item identifier (within the policy segment).
       * @param value - the string or object value to be stored.
       * @param ttl - a time-to-live override value in milliseconds after which the item is automatically
       * removed from the cache (or is marked invalid).
       *    This should be set to 0 in order to use the caching rules configured when creating the Policy object.
       */
  def set(id: java.lang.String, value: T, ttl: scala.Double): stdLib.Promise[scala.Unit] = js.native
  /** an object with cache statistics */
  def stats(): CacheStatisticsObject = js.native
  /**
       * given a created timestamp in milliseconds, returns the time-to-live left
       * based on the configured rules.
       */
  def ttl(created: scala.Double): scala.Double = js.native
}

