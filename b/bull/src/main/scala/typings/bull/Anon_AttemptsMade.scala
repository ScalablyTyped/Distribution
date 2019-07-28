package typings.bull

import typings.bull.bullMod.JobId
import typings.bull.bullMod.JobOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttemptsMade[T] extends js.Object {
  var attemptsMade: Double
  var data: T
  var delay: Double
  var failedReason: js.Any
  var finishedOn: Double | Null
  var id: JobId
  var name: String
  var opts: JobOptions
  var processedOn: Double | Null
  var progress: Double
  var returnvalue: js.Any
  var stacktrace: js.Array[String] | Null
  var timestamp: Double
}

object Anon_AttemptsMade {
  @scala.inline
  def apply[T](
    attemptsMade: Double,
    data: T,
    delay: Double,
    failedReason: js.Any,
    id: JobId,
    name: String,
    opts: JobOptions,
    progress: Double,
    returnvalue: js.Any,
    timestamp: Double,
    finishedOn: Int | Double = null,
    processedOn: Int | Double = null,
    stacktrace: js.Array[String] = null
  ): Anon_AttemptsMade[T] = {
    val __obj = js.Dynamic.literal(attemptsMade = attemptsMade, data = data.asInstanceOf[js.Any], delay = delay, failedReason = failedReason, id = id.asInstanceOf[js.Any], name = name, opts = opts, progress = progress, returnvalue = returnvalue, timestamp = timestamp)
    if (finishedOn != null) __obj.updateDynamic("finishedOn")(finishedOn.asInstanceOf[js.Any])
    if (processedOn != null) __obj.updateDynamic("processedOn")(processedOn.asInstanceOf[js.Any])
    if (stacktrace != null) __obj.updateDynamic("stacktrace")(stacktrace)
    __obj.asInstanceOf[Anon_AttemptsMade[T]]
  }
}

