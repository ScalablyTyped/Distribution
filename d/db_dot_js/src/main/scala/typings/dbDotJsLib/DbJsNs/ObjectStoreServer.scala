package typings
package dbDotJsLib.DbJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectStoreServer extends js.Object {
  def abort(listener: js.Function1[/* ev */ stdLib.Event, _]): ObjectStoreServer = js.native
  def add[T](table: java.lang.String, entities: T*): js.Promise[js.Array[T]] = js.native
  def add[T](table: java.lang.String, entity: T): js.Promise[T] = js.native
  def add[TKey, TValue](table: java.lang.String, entity: KeyValuePair[TKey, TValue]): js.Promise[KeyValuePair[TKey, TValue]] = js.native
  def addEventListener(`type`: java.lang.String, listener: ErrorListener | stdLib.EventListener): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: dbDotJsLib.dbDotJsLibStrings.abort, listener: js.Function1[/* ev */ stdLib.Event, _]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: dbDotJsLib.dbDotJsLibStrings.error, listener: js.Function1[/* err */ stdLib.Error, _]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_versionchange(
    `type`: dbDotJsLib.dbDotJsLibStrings.versionchange,
    listener: js.Function1[/* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("add")
  def add_TKeyTValue[TKey, TValue](table: java.lang.String, entities: (KeyValuePair[TKey, TValue])*): js.Promise[js.Array[KeyValuePair[TKey, TValue]]] = js.native
  def clear(table: java.lang.String): js.Promise[scala.Unit] = js.native
  def count(): js.Promise[scala.Double] = js.native
  def count(keyOrRange: js.Any): js.Promise[scala.Double] = js.native
  def count(table: java.lang.String, key: js.Any): js.Promise[scala.Double] = js.native
  def error(listener: js.Function1[/* ev */ stdLib.Error, _]): ObjectStoreServer = js.native
  def get[T](table: java.lang.String, key: js.Any): js.Promise[T] = js.native
  def query[T](table: java.lang.String): IndexQuery[T] = js.native
  def query[T](table: java.lang.String, index: java.lang.String): IndexQuery[T] = js.native
  def remove[TKey](table: java.lang.String, key: TKey): js.Promise[TKey] = js.native
  def remove[TKey](table: java.lang.String, keys: TKey*): js.Promise[js.Array[TKey]] = js.native
  def update[T](table: java.lang.String, entities: T*): js.Promise[js.Array[T]] = js.native
  def update[T](table: java.lang.String, entity: T): js.Promise[T] = js.native
  def update[TKey, TValue](table: java.lang.String, entity: KeyValuePair[TKey, TValue]): js.Promise[KeyValuePair[TKey, TValue]] = js.native
  @JSName("update")
  def update_TKeyTValue[TKey, TValue](table: java.lang.String, entities: (KeyValuePair[TKey, TValue])*): js.Promise[js.Array[KeyValuePair[TKey, TValue]]] = js.native
  def versionchange(listener: js.Function1[/* ev */ stdLib.Event, _]): ObjectStoreServer = js.native
}

