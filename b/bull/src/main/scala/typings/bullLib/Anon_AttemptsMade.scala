package typings
package bullLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttemptsMade[T] extends js.Object {
  var attemptsMade: scala.Double
  var data: T
  var delay: scala.Double
  var failedReason: js.Any
  var finishedOn: scala.Double | scala.Null
  var id: bullLib.bullMod.JobId
  var name: java.lang.String
  var opts: bullLib.bullMod.JobOptions
  var processedOn: scala.Double | scala.Null
  var progress: scala.Double
  var returnvalue: js.Any
  var stacktrace: js.Array[java.lang.String] | scala.Null
  var timestamp: scala.Double
}

object Anon_AttemptsMade {
  @scala.inline
  def apply[T](
    attemptsMade: scala.Double,
    data: T,
    delay: scala.Double,
    failedReason: js.Any,
    id: bullLib.bullMod.JobId,
    name: java.lang.String,
    opts: bullLib.bullMod.JobOptions,
    progress: scala.Double,
    returnvalue: js.Any,
    timestamp: scala.Double,
    finishedOn: scala.Int | scala.Double = null,
    processedOn: scala.Int | scala.Double = null,
    stacktrace: js.Array[java.lang.String] = null
  ): Anon_AttemptsMade[T] = {
    val __obj = js.Dynamic.literal(attemptsMade = attemptsMade, data = data.asInstanceOf[js.Any], delay = delay, failedReason = failedReason, id = id.asInstanceOf[js.Any], name = name, opts = opts, progress = progress, returnvalue = returnvalue, timestamp = timestamp)
    if (finishedOn != null) __obj.updateDynamic("finishedOn")(finishedOn.asInstanceOf[js.Any])
    if (processedOn != null) __obj.updateDynamic("processedOn")(processedOn.asInstanceOf[js.Any])
    if (stacktrace != null) __obj.updateDynamic("stacktrace")(stacktrace)
    __obj.asInstanceOf[Anon_AttemptsMade[T]]
  }
}

