package typings
package bullLib.bullMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BullNs {
  type ActiveEventCallback[T] = js.Function2[/* job */ Job[T], /* jobPromise */ js.UndefOr[JobPromise], scala.Unit]
  type CleanedEventCallback[T] = js.Function2[/* jobs */ js.Array[Job[T]], /* status */ JobStatusClean, scala.Unit]
  type CompletedEventCallback[T] = js.Function2[/* job */ Job[T], /* result */ js.Any, scala.Unit]
  type DoneCallback = js.Function2[
    /* error */ js.UndefOr[nodeLib.Error | scala.Null], 
    /* value */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type ErrorEventCallback = js.Function1[/* error */ nodeLib.Error, scala.Unit]
  type EventCallback = js.Function0[scala.Unit]
  type FailedEventCallback[T] = js.Function2[/* job */ Job[T], /* error */ nodeLib.Error, scala.Unit]
  type JobId = scala.Double | java.lang.String
  type ProgressEventCallback[T] = js.Function2[/* job */ Job[T], /* progress */ js.Any, scala.Unit]
  type RemovedEventCallback[T] = js.Function1[/* job */ Job[T], scala.Unit]
  type StalledEventCallback[T] = js.Function1[/* job */ Job[T], scala.Unit]
  type WaitingEventCallback = js.Function1[/* jobId */ JobId, scala.Unit]
}
