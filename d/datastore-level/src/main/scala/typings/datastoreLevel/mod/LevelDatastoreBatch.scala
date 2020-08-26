package typings.datastoreLevel.mod

import typings.abstractLeveldown.mod.AbstractBatch
import typings.interfaceDatastore.mod.Batch
import typings.interfaceDatastore.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LevelDatastoreBatch[Value] extends Batch[Value] {
  var ops: js.Array[AbstractBatch[String, Value]] = js.native
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
  @scala.inline
  implicit class LevelDatastoreBatchOps[Self <: LevelDatastoreBatch[_], Value] (val x: Self with LevelDatastoreBatch[Value]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOpsVarargs(value: (AbstractBatch[String, Value])*): Self = this.set("ops", js.Array(value :_*))
    @scala.inline
    def setOps(value: js.Array[AbstractBatch[String, Value]]): Self = this.set("ops", value.asInstanceOf[js.Any])
  }
  
}

