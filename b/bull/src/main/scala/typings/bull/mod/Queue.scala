package typings.bull.mod

import typings.bull.anon.Count
import typings.bull.anon.CronRepeatOptionsjobIdJob
import typings.bull.anon.Data
import typings.bull.anon.EveryRepeatOptionsjobIdJo
import typings.bull.anon.Force
import typings.bull.bullStrings.active
import typings.bull.bullStrings.cleaned
import typings.bull.bullStrings.completed
import typings.bull.bullStrings.drained
import typings.bull.bullStrings.error
import typings.bull.bullStrings.failed
import typings.bull.bullStrings.paused
import typings.bull.bullStrings.progress
import typings.bull.bullStrings.removed
import typings.bull.bullStrings.resumed
import typings.bull.bullStrings.stalled
import typings.bull.bullStrings.waiting
import typings.ioredis.mod.Pipeline
import typings.ioredis.mod.Redis
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Queue[T] extends EventEmitter {
  
  /* tslint:enable:unified-signatures */
  /**
    * Creates a new job and adds it to the queue.
    * If the queue is empty the job will be executed directly,
    * otherwise it will be placed in the queue and executed as soon as possible.
    */
  def add(data: T): js.Promise[Job[T]] = js.native
  def add(data: T, opts: JobOptions): js.Promise[Job[T]] = js.native
  /**
    * Creates a new named job and adds it to the queue.
    * If the queue is empty the job will be executed directly,
    * otherwise it will be placed in the queue and executed as soon as possible.
    */
  def add(name: String, data: T): js.Promise[Job[T]] = js.native
  def add(name: String, data: T, opts: JobOptions): js.Promise[Job[T]] = js.native
  
  /**
    * Adds an array of jobs to the queue.
    * If the queue is empty the jobs will be executed directly,
    * otherwise they will be placed in the queue and executed as soon as possible.
    * 'repeat' option is not supported in addBulk https://github.com/OptimalBits/bull/issues/1731
    */
  def addBulk(jobs: js.Array[Data[T]]): js.Promise[js.Array[Job[T]]] = js.native
  
  /**
    * Returns Queue name in base64 encoded format
    */
  def base64Name(): String = js.native
  
  /**
    * Tells the queue remove all jobs created outside of a grace period in milliseconds.
    * You can clean the jobs with the following states: completed, wait (typo for waiting), active, delayed, and failed.
    * @param grace Grace period in milliseconds.
    * @param status Status of the job to clean. Values are completed, wait, active, delayed, and failed. Defaults to completed.
    * @param limit Maximum amount of jobs to clean per call. If not provided will clean all matching jobs.
    */
  def clean(grace: Double): js.Promise[js.Array[Job[T]]] = js.native
  def clean(grace: Double, status: Unit, limit: Double): js.Promise[js.Array[Job[T]]] = js.native
  def clean(grace: Double, status: JobStatusClean): js.Promise[js.Array[Job[T]]] = js.native
  def clean(grace: Double, status: JobStatusClean, limit: Double): js.Promise[js.Array[Job[T]]] = js.native
  
  /**
    * Queue client (used to add jobs, pause queues, etc);
    */
  var client: Redis = js.native
  
  /**
    * Returns Queue name with keyPrefix (default: 'bull')
    */
  def clientName(): String = js.native
  
  // tslint:disable-line unified-signatures
  /**
    * Array of Redis clients the queue uses
    */
  var clients: js.Array[Redis] = js.native
  
  /**
    * Closes the underlying redis client. Use this to perform a graceful shutdown.
    *
    * `close` can be called from anywhere, with one caveat:
    * if called from within a job handler the queue won't close until after the job has been processed
    */
  def close(): js.Promise[Unit] = js.native
  def close(doNotWaitJobs: Boolean): js.Promise[Unit] = js.native
  
  /**
    * Returns a promise that returns the number of jobs in the queue, waiting or paused.
    * Since there may be other processes adding or processing jobs, this value may be true only for a very small amount of time.
    */
  def count(): js.Promise[Double] = js.native
  
  /**
    * Empties a queue deleting all the input lists and associated jobs.
    */
  def empty(): js.Promise[Unit] = js.native
  
  /**
    * Returns a promise that will return an array with the active jobs between start and end.
    */
  def getActive(): js.Promise[js.Array[Job[T]]] = js.native
  def getActive(start: Double): js.Promise[js.Array[Job[T]]] = js.native
  def getActive(start: Double, end: Double): js.Promise[js.Array[Job[T]]] = js.native
  def getActive(start: Unit, end: Double): js.Promise[js.Array[Job[T]]] = js.native
  
  /**
    * Returns a promise that resolves with the quantity of active jobs.
    */
  def getActiveCount(): js.Promise[Double] = js.native
  
  /**
    * Returns a promise that will return an array with the completed jobs between start and end.
    */
  def getCompleted(): js.Promise[js.Array[Job[T]]] = js.native
  def getCompleted(start: Double): js.Promise[js.Array[Job[T]]] = js.native
  def getCompleted(start: Double, end: Double): js.Promise[js.Array[Job[T]]] = js.native
  def getCompleted(start: Unit, end: Double): js.Promise[js.Array[Job[T]]] = js.native
  
  /**
    * Returns a promise that resolves with the quantity of completed jobs.
    */
  def getCompletedCount(): js.Promise[Double] = js.native
  
  /**
    * Returns a promise that will return an array with the delayed jobs between start and end.
    */
  def getDelayed(): js.Promise[js.Array[Job[T]]] = js.native
  def getDelayed(start: Double): js.Promise[js.Array[Job[T]]] = js.native
  def getDelayed(start: Double, end: Double): js.Promise[js.Array[Job[T]]] = js.native
  def getDelayed(start: Unit, end: Double): js.Promise[js.Array[Job[T]]] = js.native
  
  /**
    * Returns a promise that resolves with the quantity of delayed jobs.
    */
  def getDelayedCount(): js.Promise[Double] = js.native
  
  /**
    * Returns a promise that will return an array with the failed jobs between start and end.
    */
  def getFailed(): js.Promise[js.Array[Job[T]]] = js.native
  def getFailed(start: Double): js.Promise[js.Array[Job[T]]] = js.native
  def getFailed(start: Double, end: Double): js.Promise[js.Array[Job[T]]] = js.native
  def getFailed(start: Unit, end: Double): js.Promise[js.Array[Job[T]]] = js.native
  
  /**
    * Returns a promise that resolves with the quantity of failed jobs.
    */
  def getFailedCount(): js.Promise[Double] = js.native
  
  /**
    * Returns a promise that will return the job instance associated with the jobId parameter.
    * If the specified job cannot be located, the promise callback parameter will be set to null.
    */
  def getJob(jobId: JobId): js.Promise[Job[T] | Null] = js.native
  
  /**
    * Returns a promise that resolves with the job counts for the given queue of the given job statuses.
    */
  def getJobCountByTypes(types: js.Array[JobStatus]): js.Promise[JobCounts] = js.native
  def getJobCountByTypes(types: JobStatus): js.Promise[JobCounts] = js.native
  
  /**
    * Returns a promise that resolves with the job counts for the given queue.
    */
  def getJobCounts(): js.Promise[JobCounts] = js.native
  
  /**
    * Returns a object with the logs according to the start and end arguments. The returned count
    * value is the total amount of logs, useful for implementing pagination.
    */
  def getJobLogs(jobId: JobId): js.Promise[Count] = js.native
  def getJobLogs(jobId: JobId, start: Double): js.Promise[Count] = js.native
  def getJobLogs(jobId: JobId, start: Double, end: Double): js.Promise[Count] = js.native
  def getJobLogs(jobId: JobId, start: Unit, end: Double): js.Promise[Count] = js.native
  
  /**
    * Returns a promise that will return an array of job instances of the given job statuses.
    * Optional parameters for range and ordering are provided.
    */
  def getJobs(types: js.Array[JobStatus]): js.Promise[js.Array[Job[T]]] = js.native
  def getJobs(types: js.Array[JobStatus], start: Double): js.Promise[js.Array[Job[T]]] = js.native
  def getJobs(types: js.Array[JobStatus], start: Double, end: Double): js.Promise[js.Array[Job[T]]] = js.native
  def getJobs(types: js.Array[JobStatus], start: Double, end: Double, asc: Boolean): js.Promise[js.Array[Job[T]]] = js.native
  def getJobs(types: js.Array[JobStatus], start: Double, end: Unit, asc: Boolean): js.Promise[js.Array[Job[T]]] = js.native
  def getJobs(types: js.Array[JobStatus], start: Unit, end: Double): js.Promise[js.Array[Job[T]]] = js.native
  def getJobs(types: js.Array[JobStatus], start: Unit, end: Double, asc: Boolean): js.Promise[js.Array[Job[T]]] = js.native
  def getJobs(types: js.Array[JobStatus], start: Unit, end: Unit, asc: Boolean): js.Promise[js.Array[Job[T]]] = js.native
  
  /**
    * Returns a promise that resolves to the next job in queue.
    */
  def getNextJob(): js.Promise[js.UndefOr[Job[T]]] = js.native
  
  /**
    * Returns a promise that resolves with the quantity of paused jobs.
    */
  def getPausedCount(): js.Promise[Double] = js.native
  
  /**
    * Returns a promise that resolves to the quantity of repeatable jobs.
    */
  def getRepeatableCount(): js.Promise[Double] = js.native
  
  /**
    * Returns JobInformation of repeatable jobs (ordered descending). Provide a start and/or an end
    * index to limit the number of results. Start defaults to 0, end to -1 and asc to false.
    */
  def getRepeatableJobs(): js.Promise[js.Array[JobInformation]] = js.native
  def getRepeatableJobs(start: Double): js.Promise[js.Array[JobInformation]] = js.native
  def getRepeatableJobs(start: Double, end: Double): js.Promise[js.Array[JobInformation]] = js.native
  def getRepeatableJobs(start: Double, end: Double, asc: Boolean): js.Promise[js.Array[JobInformation]] = js.native
  def getRepeatableJobs(start: Double, end: Unit, asc: Boolean): js.Promise[js.Array[JobInformation]] = js.native
  def getRepeatableJobs(start: Unit, end: Double): js.Promise[js.Array[JobInformation]] = js.native
  def getRepeatableJobs(start: Unit, end: Double, asc: Boolean): js.Promise[js.Array[JobInformation]] = js.native
  def getRepeatableJobs(start: Unit, end: Unit, asc: Boolean): js.Promise[js.Array[JobInformation]] = js.native
  
  /**
    * Returns a promise that will return an array with the waiting jobs between start and end.
    */
  def getWaiting(): js.Promise[js.Array[Job[T]]] = js.native
  def getWaiting(start: Double): js.Promise[js.Array[Job[T]]] = js.native
  def getWaiting(start: Double, end: Double): js.Promise[js.Array[Job[T]]] = js.native
  def getWaiting(start: Unit, end: Double): js.Promise[js.Array[Job[T]]] = js.native
  
  /**
    * Returns a promise that resolves with the quantity of waiting jobs.
    */
  def getWaitingCount(): js.Promise[Double] = js.native
  
  /**
    * Returns Redis clients array which belongs to current Queue
    */
  def getWorkers(): js.Promise[js.Array[Redis]] = js.native
  
  /**
    * Returns a promise that resolves with a boolean if queue is paused
    */
  def isPaused(): js.Promise[Boolean] = js.native
  def isPaused(isLocal: Boolean): js.Promise[Boolean] = js.native
  
  /**
    * Returns a promise that resolves when Redis is connected and the queue is ready to accept jobs.
    * This replaces the `ready` event emitted on Queue in previous verisons.
    */
  def isReady(): js.Promise[this.type] = js.native
  
  /**
    * Returns a promise that marks the start of a transaction block.
    */
  def multi(): Pipeline = js.native
  
  /**
    * The name of the queue
    */
  var name: String = js.native
  
  /**
    * ???
    */
  def nextRepeatableJob(name: String, data: Any, opts: JobOptions): js.Promise[Job[T]] = js.native
  
  /**
    * Completely destroys the queue and all of its contents irreversibly.
    * @param ops.force Obliterate the queue even if there are active jobs
    */
  def obliterate(): js.Promise[Unit] = js.native
  def obliterate(ops: Force): js.Promise[Unit] = js.native
  
  /**
    * A job has started. You can use `jobPromise.cancel()` to abort it
    */
  @JSName("on")
  def on_active(event: active, callback: ActiveEventCallback[T]): this.type = js.native
  /**
    * Old jobs have been cleaned from the queue.
    * `jobs` is an array of jobs that were removed, and `type` is the type of those jobs.
    *
    * @see Queue#clean() for details
    */
  @JSName("on")
  def on_cleaned(event: cleaned, callback: CleanedEventCallback[T]): this.type = js.native
  /**
    * A job successfully completed with a `result`
    */
  @JSName("on")
  def on_completed(event: completed, callback: CompletedEventCallback[T]): this.type = js.native
  /**
    * Emitted every time the queue has processed all the waiting jobs
    * (even if there can be some delayed jobs not yet processed)
    */
  @JSName("on")
  def on_drained(event: drained, callback: EventCallback): this.type = js.native
  /**
    * An error occured
    */
  @JSName("on")
  def on_error(event: error, callback: ErrorEventCallback): this.type = js.native
  /**
    * A job failed with `err` as the reason
    */
  @JSName("on")
  def on_failed(event: failed, callback: FailedEventCallback[T]): this.type = js.native
  /**
    * The queue has been paused
    */
  @JSName("on")
  def on_paused(event: paused, callback: EventCallback): this.type = js.native
  /**
    * A job's progress was updated
    */
  @JSName("on")
  def on_progress(event: progress, callback: ProgressEventCallback[T]): this.type = js.native
  // tslint:disable-line unified-signatures
  /**
    * A job successfully removed.
    */
  @JSName("on")
  def on_removed(event: removed, callback: RemovedEventCallback[T]): this.type = js.native
  /**
    * The queue has been resumed
    */
  @JSName("on")
  def on_resumed(event: resumed, callback: EventCallback): this.type = js.native
  /**
    * A job has been marked as stalled.
    * This is useful for debugging job workers that crash or pause the event loop.
    */
  @JSName("on")
  def on_stalled(event: stalled, callback: StalledEventCallback[T]): this.type = js.native
  /**
    * A Job is waiting to be processed as soon as a worker is idling.
    */
  @JSName("on")
  def on_waiting(event: waiting, callback: WaitingEventCallback): this.type = js.native
  
  /**
    * Returns Redis clients array which belongs to current Queue from string with all redis clients
    *
    * @param list String with all redis clients
    */
  def parseClientList(list: String): js.Array[Redis] = js.native
  
  /**
    * Returns a promise that resolves when the queue is paused.
    *
    * A paused queue will not process new jobs until resumed, but current jobs being processed will continue until
    * they are finalized. The pause can be either global or local. If global, all workers in all queue instances
    * for a given queue will be paused. If local, just this worker will stop processing new jobs after the current
    * lock expires. This can be useful to stop a worker from taking new jobs prior to shutting down.
    *
    * If doNotWaitActive is true, pause will not wait for any active jobs to finish before resolving. Otherwise, pause
    * will wait for active jobs to finish. See Queue#whenCurrentJobsFinished for more information.
    *
    * Pausing a queue that is already paused does nothing.
    */
  def pause(): js.Promise[Unit] = js.native
  def pause(isLocal: Boolean): js.Promise[Unit] = js.native
  def pause(isLocal: Boolean, doNotWaitActive: Boolean): js.Promise[Unit] = js.native
  def pause(isLocal: Unit, doNotWaitActive: Boolean): js.Promise[Unit] = js.native
  
  def process(callback: String): js.Promise[Unit] = js.native
  /* tslint:disable:unified-signatures */
  /**
    * Defines a processing function for the jobs placed into a given Queue.
    *
    * The callback is called everytime a job is placed in the queue.
    * It is passed an instance of the job as first argument.
    *
    * If the callback signature contains the second optional done argument,
    * the callback will be passed a done callback to be called after the job has been completed.
    * The done callback can be called with an Error instance, to signal that the job did not complete successfully,
    * or with a result as second argument (e.g.: done(null, result);) when the job is successful.
    * Errors will be passed as a second argument to the "failed" event; results, as a second argument to the "completed" event.
    *
    * If, however, the callback signature does not contain the done argument,
    * a promise must be returned to signal job completion.
    * If the promise is rejected, the error will be passed as a second argument to the "failed" event.
    * If it is resolved, its value will be the "completed" event's second argument.
    */
  def process(callback: ProcessCallbackFunction[T]): js.Promise[Unit] = js.native
  def process(callback: ProcessPromiseFunction[T]): js.Promise[Unit] = js.native
  def process(concurrency: Double, callback: String): js.Promise[Unit] = js.native
  /**
    * Defines a processing function for the jobs placed into a given Queue.
    *
    * The callback is called everytime a job is placed in the queue.
    * It is passed an instance of the job as first argument.
    *
    * If the callback signature contains the second optional done argument,
    * the callback will be passed a done callback to be called after the job has been completed.
    * The done callback can be called with an Error instance, to signal that the job did not complete successfully,
    * or with a result as second argument (e.g.: done(null, result);) when the job is successful.
    * Errors will be passed as a second argument to the "failed" event; results, as a second argument to the "completed" event.
    *
    * If, however, the callback signature does not contain the done argument,
    * a promise must be returned to signal job completion.
    * If the promise is rejected, the error will be passed as a second argument to the "failed" event.
    * If it is resolved, its value will be the "completed" event's second argument.
    *
    * @param concurrency Bull will then call your handler in parallel respecting this maximum value.
    */
  def process(concurrency: Double, callback: ProcessCallbackFunction[T]): js.Promise[Unit] = js.native
  def process(concurrency: Double, callback: ProcessPromiseFunction[T]): js.Promise[Unit] = js.native
  def process(name: String, callback: String): js.Promise[Unit] = js.native
  /**
    * Defines a processing function for the jobs placed into a given Queue.
    *
    * The callback is called everytime a job is placed in the queue.
    * It is passed an instance of the job as first argument.
    *
    * If the callback signature contains the second optional done argument,
    * the callback will be passed a done callback to be called after the job has been completed.
    * The done callback can be called with an Error instance, to signal that the job did not complete successfully,
    * or with a result as second argument (e.g.: done(null, result);) when the job is successful.
    * Errors will be passed as a second argument to the "failed" event; results, as a second argument to the "completed" event.
    *
    * If, however, the callback signature does not contain the done argument,
    * a promise must be returned to signal job completion.
    * If the promise is rejected, the error will be passed as a second argument to the "failed" event.
    * If it is resolved, its value will be the "completed" event's second argument.
    *
    * @param name Bull will only call the handler if the job name matches
    */
  def process(name: String, callback: ProcessCallbackFunction[T]): js.Promise[Unit] = js.native
  def process(name: String, callback: ProcessPromiseFunction[T]): js.Promise[Unit] = js.native
  def process(name: String, concurrency: Double, callback: String): js.Promise[Unit] = js.native
  /**
    * Defines a processing function for the jobs placed into a given Queue.
    *
    * The callback is called everytime a job is placed in the queue.
    * It is passed an instance of the job as first argument.
    *
    * If the callback signature contains the second optional done argument,
    * the callback will be passed a done callback to be called after the job has been completed.
    * The done callback can be called with an Error instance, to signal that the job did not complete successfully,
    * or with a result as second argument (e.g.: done(null, result);) when the job is successful.
    * Errors will be passed as a second argument to the "failed" event; results, as a second argument to the "completed" event.
    *
    * If, however, the callback signature does not contain the done argument,
    * a promise must be returned to signal job completion.
    * If the promise is rejected, the error will be passed as a second argument to the "failed" event.
    * If it is resolved, its value will be the "completed" event's second argument.
    *
    * @param name Bull will only call the handler if the job name matches
    * @param concurrency Bull will then call your handler in parallel respecting this maximum value.
    */
  def process(name: String, concurrency: Double, callback: ProcessCallbackFunction[T]): js.Promise[Unit] = js.native
  def process(name: String, concurrency: Double, callback: ProcessPromiseFunction[T]): js.Promise[Unit] = js.native
  
  /**
    * Removes all the jobs which jobId matches the given pattern. The pattern must follow redis glob-style pattern
    * (syntax)[redis.io/commands/keys]
    */
  def removeJobs(pattern: String): js.Promise[Unit] = js.native
  
  /**
    * Removes a given repeatable job. The RepeatOptions and JobId needs to be the same as the ones
    * used for the job when it was added.
    *
    * name: The name of the to be removed job
    */
  def removeRepeatable(name: String, repeat: CronRepeatOptionsjobIdJob): js.Promise[Unit] = js.native
  def removeRepeatable(name: String, repeat: EveryRepeatOptionsjobIdJo): js.Promise[Unit] = js.native
  /**
    * Removes a given repeatable job. The RepeatOptions and JobId needs to be the same as the ones
    * used for the job when it was added.
    */
  def removeRepeatable(repeat: CronRepeatOptionsjobIdJob): js.Promise[Unit] = js.native
  def removeRepeatable(repeat: EveryRepeatOptionsjobIdJo): js.Promise[Unit] = js.native
  
  /**
    * Removes a given repeatable job by key.
    */
  def removeRepeatableByKey(key: String): js.Promise[Unit] = js.native
  
  /**
    * Returns a promise that resolves when the queue is resumed after being paused.
    *
    * The resume can be either local or global. If global, all workers in all queue instances for a given queue
    * will be resumed. If local, only this worker will be resumed. Note that resuming a queue globally will not
    * resume workers that have been paused locally; for those, resume(true) must be called directly on their
    * instances.
    *
    * Resuming a queue that is not paused does nothing.
    */
  def resume(): js.Promise[Unit] = js.native
  def resume(isLocal: Boolean): js.Promise[Unit] = js.native
  
  /**
    * Set clientName to Redis.client
    */
  def setWorkerName(): js.Promise[Any] = js.native
  
  /**
    * Returns the queue specific key.
    */
  def toKey(queueType: String): String = js.native
  
  /**
    * Returns a promise that resolves when active jobs are finished
    */
  def whenCurrentJobsFinished(): js.Promise[Unit] = js.native
}
