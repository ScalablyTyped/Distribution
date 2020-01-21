package typings.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedObjectStoreServer[T] extends js.Object {
  def add(entities: T*): js.Promise[js.Array[T]] = js.native
  def add(entity: T): js.Promise[T] = js.native
  def add[TKey, TValue](entity: KeyValuePair[TKey, TValue]): js.Promise[KeyValuePair[TKey, TValue]] = js.native
  @JSName("add")
  def add_TKeyTValue[TKey, TValue](entities: (KeyValuePair[TKey, TValue])*): js.Promise[js.Array[KeyValuePair[TKey, TValue]]] = js.native
  def clear(): js.Promise[Unit] = js.native
  def count(key: js.Any): js.Promise[Double] = js.native
  def get(key: js.Any): js.Promise[T] = js.native
  def query(): IndexQuery[T] = js.native
  def query(index: String): IndexQuery[T] = js.native
  def remove[TKey](key: TKey): js.Promise[TKey] = js.native
  def remove[TKey](keys: TKey*): js.Promise[js.Array[TKey]] = js.native
  def update(entities: T*): js.Promise[js.Array[T]] = js.native
  def update(entity: T): js.Promise[T] = js.native
  def update[TKey, TValue](entity: KeyValuePair[TKey, TValue]): js.Promise[KeyValuePair[TKey, TValue]] = js.native
  @JSName("update")
  def update_TKeyTValue[TKey, TValue](entities: (KeyValuePair[TKey, TValue])*): js.Promise[js.Array[KeyValuePair[TKey, TValue]]] = js.native
}

