package typings.datastoreDashLevel.datastoreDashLevelMod

import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractBatch
import typings.interfaceDashDatastore.interfaceDashDatastoreMod.Batch
import typings.interfaceDashDatastore.interfaceDashDatastoreMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelDatastoreBatch[Value] extends Batch[Value] {
  var ops: js.Array[AbstractBatch[String, Value]]
}

object LevelDatastoreBatch {
  @scala.inline
  def apply[Value](
    commit: () => js.Promise[Unit],
    delete: Key => Unit,
    ops: js.Array[AbstractBatch[String, Value]],
    put: (Key, Value) => Unit
  ): LevelDatastoreBatch[Value] = {
    val __obj = js.Dynamic.literal(commit = js.Any.fromFunction0(commit), delete = js.Any.fromFunction1(delete), ops = ops.asInstanceOf[js.Any], put = js.Any.fromFunction2(put))
  
    __obj.asInstanceOf[LevelDatastoreBatch[Value]]
  }
}

