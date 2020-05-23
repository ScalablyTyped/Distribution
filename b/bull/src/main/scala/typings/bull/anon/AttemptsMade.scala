package typings.bull.anon

import typings.bull.mod.JobOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttemptsMade[T] extends js.Object {
  var attemptsMade: Double
  var data: T
  var delay: Double
  var failedReason: js.Any
  var finishedOn: Double | Null
  var id: typings.bull.mod.JobId
  var name: String
  var opts: JobOptions
  var processedOn: Double | Null
  var progress: Double
  var returnvalue: js.Any
  var stacktrace: js.Array[String] | Null
  var timestamp: Double
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
    timestamp: Double,
    finishedOn: Double = null.asInstanceOf[Double],
    processedOn: Double = null.asInstanceOf[Double],
    stacktrace: js.Array[String] = null
  ): AttemptsMade[T] = {
    val __obj = js.Dynamic.literal(attemptsMade = attemptsMade.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], failedReason = failedReason.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], returnvalue = returnvalue.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], finishedOn = finishedOn.asInstanceOf[js.Any], processedOn = processedOn.asInstanceOf[js.Any], stacktrace = stacktrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttemptsMade[T]]
  }
}

