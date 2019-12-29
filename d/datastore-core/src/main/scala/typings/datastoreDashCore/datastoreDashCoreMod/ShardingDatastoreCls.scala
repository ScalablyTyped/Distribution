package typings.datastoreDashCore.datastoreDashCoreMod

import typings.datastoreDashCore.datastoreDashCoreMod.shard.Shard
import typings.interfaceDashDatastore.interfaceDashDatastoreMod.Batch
import typings.interfaceDashDatastore.interfaceDashDatastoreMod.Datastore
import typings.interfaceDashDatastore.interfaceDashDatastoreMod.Key
import typings.interfaceDashDatastore.interfaceDashDatastoreMod.Query
import typings.interfaceDashDatastore.interfaceDashDatastoreMod.Result
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("datastore-core", "ShardingDatastore")
@js.native
class ShardingDatastoreCls[Value] protected () extends ShardingDatastore[Value] {
  def this(stores: js.Array[Datastore[Value]]) = this()
  /* CompleteClass */
  override var child: KeytransformDatastore[Value] = js.native
  /* CompleteClass */
  override var shard: Shard = js.native
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

