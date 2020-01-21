package typings.dbJs.DbJs

import typings.dbJs.dbJsStrings.abort
import typings.dbJs.dbJsStrings.error
import typings.dbJs.dbJsStrings.versionchange
import typings.std.Error
import typings.std.EventListener
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectStoreServer extends js.Object {
  def abort(listener: js.Function1[/* ev */ Event_, _]): ObjectStoreServer = js.native
  def add[T](table: String, entities: T*): js.Promise[js.Array[T]] = js.native
  def add[T](table: String, entity: T): js.Promise[T] = js.native
  def add[TKey, TValue](table: String, entity: KeyValuePair[TKey, TValue]): js.Promise[KeyValuePair[TKey, TValue]] = js.native
  def addEventListener(`type`: String, listener: ErrorListener | EventListener): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.Function1[/* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.Function1[/* err */ Error, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_versionchange(`type`: versionchange, listener: js.Function1[/* ev */ Event_, _]): Unit = js.native
  @JSName("add")
  def add_TKeyTValue[TKey, TValue](table: String, entities: (KeyValuePair[TKey, TValue])*): js.Promise[js.Array[KeyValuePair[TKey, TValue]]] = js.native
  def clear(table: String): js.Promise[Unit] = js.native
  def count(): js.Promise[Double] = js.native
  def count(keyOrRange: js.Any): js.Promise[Double] = js.native
  def count(table: String, key: js.Any): js.Promise[Double] = js.native
  def error(listener: js.Function1[/* ev */ Error, _]): ObjectStoreServer = js.native
  def get[T](table: String, key: js.Any): js.Promise[T] = js.native
  def query[T](table: String): IndexQuery[T] = js.native
  def query[T](table: String, index: String): IndexQuery[T] = js.native
  def remove[TKey](table: String, key: TKey): js.Promise[TKey] = js.native
  def remove[TKey](table: String, keys: TKey*): js.Promise[js.Array[TKey]] = js.native
  def update[T](table: String, entities: T*): js.Promise[js.Array[T]] = js.native
  def update[T](table: String, entity: T): js.Promise[T] = js.native
  def update[TKey, TValue](table: String, entity: KeyValuePair[TKey, TValue]): js.Promise[KeyValuePair[TKey, TValue]] = js.native
  @JSName("update")
  def update_TKeyTValue[TKey, TValue](table: String, entities: (KeyValuePair[TKey, TValue])*): js.Promise[js.Array[KeyValuePair[TKey, TValue]]] = js.native
  def versionchange(listener: js.Function1[/* ev */ Event_, _]): ObjectStoreServer = js.native
}

