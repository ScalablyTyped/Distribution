package typings.beanstalkdDashWorker.beanstalkdDashWorkerMod

import typings.beanstalkdDashWorker.beanstalkdDashWorkerNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatcherJob extends Job {
  /**
    * Advanced use only! Mainly internal usage.
    * Cancel the configured timeout.
    */
  def cancelTimeout(): Unit = js.native
  /**
    * Spawn a new child Job on given Tube and make this Job to wait for its resolution.
    * This automatically touch this Job during the wait time.
    *
    * @param tube The tube to spawn new job on.
    * @param payload The message payload.
    * @param options The options for the new job.
    */
  def child(tube: String, payload: js.Object): js.Promise[Unit] = js.native
  def child(tube: String, payload: js.Object, options: BeanstalkdSpawnOptions): js.Promise[Unit] = js.native
  /**
    * Puts current job back in queue with delay (in milliseconds), does not affect retries counter.
    *
    * @param delay The time to delay (in milliseconds).
    * @param exponent The exponent to for calculating the final delay (delay^exponent).
    */
  def delay(): js.Promise[`1`] = js.native
  def delay(delay: Double): js.Promise[`1`] = js.native
  def delay(delay: Double, exponent: Double): js.Promise[`1`] = js.native
  /**
    * Advanced use only! Mainly internal usage.
    * Reset the configured timeout.
    */
  def refreshTimeout(): Unit = js.native
  /**
    * Spawn a new Job on given Tube.
    *
    * @param tube The tube to spawn new job on.
    * @param payload The message payload.
    * @param options The options for the new job.
    */
  def spawn(tube: String, payload: js.Object): js.Promise[Job] = js.native
  def spawn(tube: String, payload: js.Object, options: BeanstalkdSpawnOptions): js.Promise[Job] = js.native
  /**
    * Initialize a timeout with given delay for this Job.
    *
    * @param delay The delay to wait before rejecting the Promise.
    */
  def timeout(delay: Double): js.Promise[scala.Nothing] = js.native
  /**
    * Initialize a timeout with given delay for specified action.
    *
    * @param delay The delay to wait before rejecting the Promise.
    * @param action The Promise to check for timeout resolution.
    */
  def timeout[T](delay: Double, action: T): js.Promise[T] = js.native
  def timeout[T](delay: Double, action: js.Promise[T]): js.Promise[T] = js.native
  /** Inform the server that the client is still processing this job, thus requesting more time to work on it. */
  def touch(): Unit = js.native
  /**
    * Wait for the given job on specifed tube to be done.
    * This automatically touch this Job during the wait time.
    *
    * @param tube The tube that contains the job.
    * @param jobId The job id to wait for.
    */
  def wait(tube: String, jobId: String): js.Promise[Unit] = js.native
}

