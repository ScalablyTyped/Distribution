package typings.datastoreCore.mod

import typings.interfaceDatastore.mod.Batch
import typings.interfaceDatastore.mod.Datastore
import typings.interfaceDatastore.mod.Key
import typings.interfaceDatastore.mod.Query
import typings.interfaceDatastore.mod.Result
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("datastore-core", "TieredDatastore")
@js.native
class TieredDatastoreCls protected () extends TieredDatastore {
  def this(stores: js.Array[Datastore[_]]) = this()
  /* CompleteClass */
  override var stores: js.Array[Datastore[_]] = js.native
  /* CompleteClass */
  override def batch(): Batch[js.Any] = js.native
  /* CompleteClass */
  override def close(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def delete(key: Key): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def get(key: Key): js.Promise[js.Any] = js.native
  /* CompleteClass */
  override def has(key: Key): js.Promise[Boolean] = js.native
  /* CompleteClass */
  override def open(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def put(key: Key, `val`: js.Any): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def query(q: Query[js.Any]): AsyncIterable[Result[js.Any]] = js.native
}

