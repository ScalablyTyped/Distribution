package typings.bull.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* tslint:disable:no-unnecessary-generics unified-signatures */
inline def apply[T](queueName: String): Queue[T] = ^.asInstanceOf[js.Dynamic].apply(queueName.asInstanceOf[js.Any]).asInstanceOf[Queue[T]]
inline def apply[T](queueName: String, opts: QueueOptions): Queue[T] = (^.asInstanceOf[js.Dynamic].apply(queueName.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Queue[T]]
inline def apply[T](queueName: String, url: String): Queue[T] = (^.asInstanceOf[js.Dynamic].apply(queueName.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Queue[T]]
inline def apply[T](queueName: String, url: String, opts: QueueOptions): Queue[T] = (^.asInstanceOf[js.Dynamic].apply(queueName.asInstanceOf[js.Any], url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Queue[T]]

type ActiveEventCallback[T] = js.Function2[/* job */ Job[T], /* jobPromise */ js.UndefOr[JobPromise], Unit]

type CleanedEventCallback[T] = js.Function2[/* jobs */ js.Array[Job[T]], /* status */ JobStatusClean, Unit]

type CompletedEventCallback[T] = js.Function2[/* job */ Job[T], /* result */ Any, Unit]

type DoneCallback = js.Function2[/* error */ js.UndefOr[js.Error | Null], /* value */ js.UndefOr[Any], Unit]

type ErrorEventCallback = js.Function1[/* error */ js.Error, Unit]

type EventCallback = js.Function0[Unit]

type FailedEventCallback[T] = js.Function2[/* job */ Job[T], /* error */ js.Error, Unit]

type JobId = Double | String

type ProcessCallbackFunction[T] = js.Function2[/* job */ Job[T], /* done */ DoneCallback, Unit]

type ProcessPromiseFunction[T] = js.Function1[/* job */ Job[T], js.Promise[Unit]]

type ProgressEventCallback[T] = js.Function2[/* job */ Job[T], /* progress */ Any, Unit]

type RemovedEventCallback[T] = js.Function1[/* job */ Job[T], Unit]

type StalledEventCallback[T] = js.Function1[/* job */ Job[T], Unit]

type WaitingEventCallback = js.Function1[/* jobId */ JobId, Unit]
