package typings
package bullLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bullMod {
  type ActiveEventCallback[T] = js.Function2[/* job */ Job[T], /* jobPromise */ js.UndefOr[JobPromise], scala.Unit]
  type CleanedEventCallback[T] = js.Function2[/* jobs */ js.Array[Job[T]], /* status */ JobStatusClean, scala.Unit]
  type CompletedEventCallback[T] = js.Function2[/* job */ Job[T], /* result */ js.Any, scala.Unit]
  type DoneCallback = js.Function2[
    /* error */ js.UndefOr[stdLib.Error | scala.Null], 
    /* value */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type ErrorEventCallback = js.Function1[/* error */ stdLib.Error, scala.Unit]
  type EventCallback = js.Function0[scala.Unit]
  type FailedEventCallback[T] = js.Function2[/* job */ Job[T], /* error */ stdLib.Error, scala.Unit]
  type JobId = scala.Double | java.lang.String
  type ProcessCallbackFunction[T] = js.Function2[/* job */ Job[T], /* done */ DoneCallback, scala.Unit]
  type ProcessPromiseFunction[T] = js.Function1[/* job */ Job[T], js.Promise[scala.Unit]]
  type ProgressEventCallback[T] = js.Function2[/* job */ Job[T], /* progress */ js.Any, scala.Unit]
  type RemovedEventCallback[T] = js.Function1[/* job */ Job[T], scala.Unit]
  type StalledEventCallback[T] = js.Function1[/* job */ Job[T], scala.Unit]
  type WaitingEventCallback = js.Function1[/* jobId */ JobId, scala.Unit]
}
