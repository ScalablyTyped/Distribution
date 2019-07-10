package typings
package bullLib.bullMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Job[T] extends js.Object {
  /**
    * How many attempts where made to run this job
    */
  var attemptsMade: scala.Double = js.native
  /**
    * The custom data passed when the job was created
    */
  var data: T = js.native
  /**
    * When this job was completed (unix milliseconds)
    */
  var finishedOn: js.UndefOr[scala.Double] = js.native
  var id: JobId = js.native
  /**
    * The named processor name
    */
  var name: java.lang.String = js.native
  /**
    * Options of the job
    */
  var opts: JobOptions = js.native
  /**
    * When this job was started (unix milliseconds)
    */
  var processedOn: js.UndefOr[scala.Double] = js.native
  /**
    * Which queue this job was part of
    */
  var queue: Queue[T] = js.native
  var returnvalue: js.Any = js.native
  /**
    * The stacktrace for any errors
    */
  var stacktrace: js.Array[java.lang.String] = js.native
  var timestamp: scala.Double = js.native
  /**
    * Ensure this job is never ran again even if attemptsMade is less than job.attempts.
    */
  def discard(): js.Promise[scala.Unit] = js.native
  /**
    * Returns a promise that resolves to the returned data when the job has been finished.
    * TODO: Add a watchdog to check if the job has finished periodically.
    * since pubsub does not give any guarantees.
    */
  def finished(): js.Promise[_] = js.native
  /**
    * Returns a promise resolving to the current job's status.
    * Please take note that the implementation of this method is not very efficient, nor is
    * it atomic. If your queue does have a very large quantity of jobs, you may want to
    * avoid using this method.
    */
  def getState(): js.Promise[JobStatus] = js.native
  /**
    * Returns a promise resolving to a boolean which, if true, current job's state is active
    */
  def isActive(): js.Promise[scala.Boolean] = js.native
  /**
    * Returns a promise resolving to a boolean which, if true, current job's state is completed
    */
  def isCompleted(): js.Promise[scala.Boolean] = js.native
  /**
    * Returns a promise resolving to a boolean which, if true, current job's state is delayed
    */
  def isDelayed(): js.Promise[scala.Boolean] = js.native
  /**
    * Returns a promise resolving to a boolean which, if true, current job's state is failed
    */
  def isFailed(): js.Promise[scala.Boolean] = js.native
  /**
    * Returns a promise resolving to a boolean which, if true, current job's state is paused
    */
  def isPaused(): js.Promise[scala.Boolean] = js.native
  /**
    * Returns a promise resolving to a boolean which, if true, current job's state is stuck
    */
  def isStuck(): js.Promise[scala.Boolean] = js.native
  /**
    * Returns a promise resolving to a boolean which, if true, current job's state is wait
    */
  def isWaiting(): js.Promise[scala.Boolean] = js.native
  /**
    * The lock id of the job
    */
  def lockKey(): java.lang.String = js.native
  /**
    * Logs one row of log data.
    *
    * @param row String with log data to be logged.
    */
  def log(row: java.lang.String): js.Promise[_] = js.native
  /**
    * Moves a job to the `completed` queue. Pulls a job from 'waiting' to 'active'
    * and returns a tuple containing the next jobs data and id. If no job is in the `waiting` queue, returns null.
    */
  def moveToCompleted(): js.Promise[(js.Tuple2[_, JobId]) | scala.Null] = js.native
  def moveToCompleted(returnValue: java.lang.String): js.Promise[(js.Tuple2[_, JobId]) | scala.Null] = js.native
  def moveToCompleted(returnValue: java.lang.String, ignoreLock: scala.Boolean): js.Promise[(js.Tuple2[_, JobId]) | scala.Null] = js.native
  /**
    * Moves a job to the `failed` queue. Pulls a job from 'waiting' to 'active'
    * and returns a tuple containing the next jobs data and id. If no job is in the `waiting` queue, returns null.
    */
  def moveToFailed(errorInfo: bullLib.Anon_Message): js.Promise[(js.Tuple2[_, JobId]) | scala.Null] = js.native
  def moveToFailed(errorInfo: bullLib.Anon_Message, ignoreLock: scala.Boolean): js.Promise[(js.Tuple2[_, JobId]) | scala.Null] = js.native
  /**
    * Report progress on a job
    */
  def progress(value: js.Any): js.Promise[scala.Unit] = js.native
  /**
    * Promotes a job that is currently "delayed" to the "waiting" state and executed as soon as possible.
    */
  def promote(): js.Promise[scala.Unit] = js.native
  /**
    * Releases the lock on the job. Only locks owned by the queue instance can be released.
    */
  def releaseLock(): js.Promise[scala.Unit] = js.native
  /**
    * Removes a job from the queue and from any lists it may be included in.
    * The returned promise resolves when the job has been removed.
    */
  def remove(): js.Promise[scala.Unit] = js.native
  /**
    * Re-run a job that has failed. The returned promise resolves when the job
    * has been scheduled for retry.
    */
  def retry(): js.Promise[scala.Unit] = js.native
  /**
    * Takes a lock for this job so that no other queue worker can process it at the same time.
    */
  def takeLock(): js.Promise[scala.Double | bullLib.bullLibNumbers.`false`] = js.native
  /**
    * Get job properties as Json Object
    */
  def toJSON(): bullLib.Anon_AttemptsMade[T] = js.native
  /**
    * Update a specific job's data. Promise resolves when the job has been updated.
    */
  def update(data: js.Any): js.Promise[scala.Unit] = js.native
}

