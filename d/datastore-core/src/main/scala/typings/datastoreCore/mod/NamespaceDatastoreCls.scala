package typings.datastoreCore.mod

import typings.interfaceDatastore.mod.Batch
import typings.interfaceDatastore.mod.Datastore
import typings.interfaceDatastore.mod.Key
import typings.interfaceDatastore.mod.Query
import typings.interfaceDatastore.mod.Result
import typings.node.Buffer
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("datastore-core", "NamespaceDatastore")
@js.native
class NamespaceDatastoreCls protected () extends NamespaceDatastore[Buffer] {
  def this(child: Datastore[_], prefix: Key) = this()
  /* CompleteClass */
  override var child: Datastore[Buffer] = js.native
  /* CompleteClass */
  override var prefix: Key = js.native
  /* CompleteClass */
  override var transform: Transform = js.native
  /* CompleteClass */
  override def batch(): Batch[Buffer] = js.native
  /* CompleteClass */
  override def close(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def delete(key: Key): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def get(key: Key): js.Promise[Buffer] = js.native
  /* CompleteClass */
  override def has(key: Key): js.Promise[Boolean] = js.native
  /* CompleteClass */
  override def open(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def put(key: Key, `val`: Buffer): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def query(q: Query[Buffer]): AsyncIterable[Result[Buffer]] = js.native
}

