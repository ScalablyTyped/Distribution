package typings.dataloader.dataloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dataloader", JSImport.Namespace)
@js.native
class ^[K, V] protected () extends DataLoader[K, V] {
  def this(batchLoadFn: BatchLoadFn[K, V]) = this()
  def this(batchLoadFn: BatchLoadFn[K, V], options: Options[K, V]) = this()
  /**
    * Clears the value at `key` from the cache, if it exists. Returns itself for
    * method chaining.
    */
  /* CompleteClass */
  override def clear(key: K): DataLoader[K, V] = js.native
  /**
    * Clears the entire cache. To be used when some event results in unknown
    * invalidations across this particular `DataLoader`. Returns itself for
    * method chaining.
    */
  /* CompleteClass */
  override def clearAll(): DataLoader[K, V] = js.native
  /**
    * Loads a key, returning a `Promise` for the value represented by that key.
    */
  /* CompleteClass */
  override def load(key: K): js.Promise[V] = js.native
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
  /* CompleteClass */
  override def loadMany(keys: js.Array[K]): js.Promise[js.Array[V]] = js.native
  /**
    * Adds the provied key and value to the cache. If the key already exists, no
    * change is made. Returns itself for method chaining.
    */
  /* CompleteClass */
  override def prime(key: K, value: V): DataLoader[K, V] = js.native
}

