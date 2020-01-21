package typings.datastoreLevel.mod

import typings.abstractLeveldown.mod.AbstractIterator
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.interfaceDatastore.mod.Batch
import typings.interfaceDatastore.mod.Datastore
import typings.interfaceDatastore.mod.Key
import typings.interfaceDatastore.mod.Query
import typings.interfaceDatastore.mod.Result
import typings.levelup.mod.LevelUp
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelDatastore[Value] extends Datastore[Value] {
  var db: LevelUp[AbstractLevelDOWN[String, Value], AbstractIterator[String, Value]]
}

object LevelDatastore {
  @scala.inline
  def apply[Value](
    batch: () => Batch[Value],
    close: () => js.Promise[Unit],
    db: LevelUp[AbstractLevelDOWN[String, Value], AbstractIterator[String, Value]],
    delete: Key => js.Promise[Unit],
    get: Key => js.Promise[Value],
    has: Key => js.Promise[Boolean],
    open: () => js.Promise[Unit],
    put: (Key, Value) => js.Promise[Unit],
    query: Query[Value] => AsyncIterable[Result[Value]]
  ): LevelDatastore[Value] = {
    val __obj = js.Dynamic.literal(batch = js.Any.fromFunction0(batch), close = js.Any.fromFunction0(close), db = db.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), open = js.Any.fromFunction0(open), put = js.Any.fromFunction2(put), query = js.Any.fromFunction1(query))
  
    __obj.asInstanceOf[LevelDatastore[Value]]
  }
}

