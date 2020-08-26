package typings.bull.anon

import typings.bull.mod.JobOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttemptsMade[T] extends js.Object {
  var attemptsMade: Double = js.native
  var data: T = js.native
  var delay: Double = js.native
  var failedReason: js.Any = js.native
  var finishedOn: Double | Null = js.native
  var id: typings.bull.mod.JobId = js.native
  var name: String = js.native
  var opts: JobOptions = js.native
  var processedOn: Double | Null = js.native
  var progress: Double = js.native
  var returnvalue: js.Any = js.native
  var stacktrace: js.Array[String] | Null = js.native
  var timestamp: Double = js.native
}

object AttemptsMade {
  @scala.inline
  def apply[T](
    attemptsMade: Double,
    data: T,
    delay: Double,
    failedReason: js.Any,
    id: typings.bull.mod.JobId,
    name: String,
    opts: JobOptions,
    progress: Double,
    returnvalue: js.Any,
    timestamp: Double
  ): AttemptsMade[T] = {
    val __obj = js.Dynamic.literal(attemptsMade = attemptsMade.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], failedReason = failedReason.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], returnvalue = returnvalue.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttemptsMade[T]]
  }
  @scala.inline
  implicit class AttemptsMadeOps[Self <: AttemptsMade[_], T] (val x: Self with AttemptsMade[T]) extends AnyVal {
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
    def setAttemptsMade(value: Double): Self = this.set("attemptsMade", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailedReason(value: js.Any): Self = this.set("failedReason", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: typings.bull.mod.JobId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpts(value: JobOptions): Self = this.set("opts", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnvalue(value: js.Any): Self = this.set("returnvalue", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinishedOn(value: Double): Self = this.set("finishedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinishedOnNull: Self = this.set("finishedOn", null)
    @scala.inline
    def setProcessedOn(value: Double): Self = this.set("processedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessedOnNull: Self = this.set("processedOn", null)
    @scala.inline
    def setStacktraceVarargs(value: String*): Self = this.set("stacktrace", js.Array(value :_*))
    @scala.inline
    def setStacktrace(value: js.Array[String]): Self = this.set("stacktrace", value.asInstanceOf[js.Any])
    @scala.inline
    def setStacktraceNull: Self = this.set("stacktrace", null)
  }
  
}

