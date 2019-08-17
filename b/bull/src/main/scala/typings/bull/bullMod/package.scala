package typings.bull

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bullMod {
  import typings.std.Error

  type ActiveEventCallback[T] = js.Function2[/* job */ Job[T], /* jobPromise */ js.UndefOr[JobPromise], Unit]
  type CleanedEventCallback[T] = js.Function2[/* jobs */ js.Array[Job[T]], /* status */ JobStatusClean, Unit]
  type CompletedEventCallback[T] = js.Function2[/* job */ Job[T], /* result */ js.Any, Unit]
  type DoneCallback = js.Function2[/* error */ js.UndefOr[Error | Null], /* value */ js.UndefOr[js.Any], Unit]
  type ErrorEventCallback = js.Function1[/* error */ Error, Unit]
  type EventCallback = js.Function0[Unit]
  type FailedEventCallback[T] = js.Function2[/* job */ Job[T], /* error */ Error, Unit]
  type JobId = Double | String
  type ProcessCallbackFunction[T] = js.Function2[/* job */ Job[T], /* done */ DoneCallback, Unit]
  type ProcessPromiseFunction[T] = js.Function1[/* job */ Job[T], js.Promise[Unit]]
  type ProgressEventCallback[T] = js.Function2[/* job */ Job[T], /* progress */ js.Any, Unit]
  type RemovedEventCallback[T] = js.Function1[/* job */ Job[T], Unit]
  type StalledEventCallback[T] = js.Function1[/* job */ Job[T], Unit]
  type WaitingEventCallback = js.Function1[/* jobId */ JobId, Unit]
}
