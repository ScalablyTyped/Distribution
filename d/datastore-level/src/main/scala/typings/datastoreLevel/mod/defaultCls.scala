package typings.datastoreLevel.mod

import typings.abstractLeveldown.mod.AbstractIterator
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.interfaceDatastore.mod.Batch
import typings.interfaceDatastore.mod.Key
import typings.interfaceDatastore.mod.Query
import typings.interfaceDatastore.mod.Result
import typings.levelup.mod.LevelUp
import typings.node.Buffer
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("datastore-level", JSImport.Default)
@js.native
class defaultCls protected () extends LevelDatastore[Buffer] {
  def this(path: String) = this()
  def this(path: String, options: LevelDatastoreOptions) = this()
  /* CompleteClass */
  override var db: LevelUp[AbstractLevelDOWN[String, Buffer], AbstractIterator[String, Buffer]] = js.native
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

