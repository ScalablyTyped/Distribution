package typings.dataloader.mod

import typings.std.ArrayLike
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataLoader[K, V, C] extends js.Object {
  /**
    * Clears the value at `key` from the cache, if it exists. Returns itself for
    * method chaining.
    */
  def clear(key: K): this.type = js.native
  /**
    * Clears the entire cache. To be used when some event results in unknown
    * invalidations across this particular `DataLoader`. Returns itself for
    * method chaining.
    */
  def clearAll(): this.type = js.native
  /**
    * Loads a key, returning a `Promise` for the value represented by that key.
    */
  def load(key: K): js.Promise[V] = js.native
  /**
    * Loads multiple keys, promising an array of values:
    *
    *     var [ a, b ] = await myLoader.loadMany([ 'a', 'b' ]);
    *
    * This is equivalent to the more verbose:
    *
    *     var [ a, b ] = await Promise.all([
    *       myLoader.load('a'),
    *       myLoader.load('b')
    *     ]);
    *
    */
  def loadMany(keys: ArrayLike[K]): js.Promise[js.Array[V | Error]] = js.native
  /**
    * Adds the provied key and value to the cache. If the key already exists, no
    * change is made. Returns itself for method chaining.
    */
  def prime(key: K, value: V): this.type = js.native
  def prime(key: K, value: Error): this.type = js.native
}

