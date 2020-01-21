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

@JSImport("datastore-core", "KeytransformDatastore")
@js.native
class KeytransformDatastoreCls[Value] protected () extends KeytransformDatastore[Value] {
  def this(child: Datastore[Value], transform: Transform) = this()
  /* CompleteClass */
  override var child: Datastore[Value] = js.native
  /* CompleteClass */
  override var transform: Transform = js.native
  /* CompleteClass */
  override def batch(): Batch[Value] = js.native
  /* CompleteClass */
  override def close(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def delete(key: Key): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def get(key: Key): js.Promise[Value] = js.native
  /* CompleteClass */
  override def has(key: Key): js.Promise[Boolean] = js.native
  /* CompleteClass */
  override def open(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def put(key: Key, `val`: Value): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def query(q: Query[Value]): AsyncIterable[Result[Value]] = js.native
}

