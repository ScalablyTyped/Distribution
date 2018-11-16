package typings
package dbDotJsLib.DbJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedObjectStoreServer[T] extends js.Object {
  def add(entities: T*): stdLib.Promise[js.Array[T]] = js.native
  def add(entity: T): stdLib.Promise[T] = js.native
  def add[TKey, TValue](entity: KeyValuePair[TKey, TValue]): stdLib.Promise[KeyValuePair[TKey, TValue]] = js.native
  @JSName("add")
  def add_TKeyTValue[TKey, TValue](entities: (KeyValuePair[TKey, TValue])*): stdLib.Promise[js.Array[KeyValuePair[TKey, TValue]]] = js.native
  def clear(): stdLib.Promise[scala.Unit] = js.native
  def count(key: js.Any): stdLib.Promise[scala.Double] = js.native
  def get(key: js.Any): stdLib.Promise[T] = js.native
  def query(): IndexQuery[T] = js.native
  def query(index: java.lang.String): IndexQuery[T] = js.native
  def remove[TKey](key: TKey): stdLib.Promise[TKey] = js.native
  def remove[TKey](keys: TKey*): stdLib.Promise[js.Array[TKey]] = js.native
  def update(entities: T*): stdLib.Promise[js.Array[T]] = js.native
  def update(entity: T): stdLib.Promise[T] = js.native
  def update[TKey, TValue](entity: KeyValuePair[TKey, TValue]): stdLib.Promise[KeyValuePair[TKey, TValue]] = js.native
  @JSName("update")
  def update_TKeyTValue[TKey, TValue](entities: (KeyValuePair[TKey, TValue])*): stdLib.Promise[js.Array[KeyValuePair[TKey, TValue]]] = js.native
}

