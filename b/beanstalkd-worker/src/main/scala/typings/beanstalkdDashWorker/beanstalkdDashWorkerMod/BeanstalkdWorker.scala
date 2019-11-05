package typings.beanstalkdDashWorker.beanstalkdDashWorkerMod

import typings.beanstalkd.beanstalkdMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeanstalkdWorker extends js.Object {
  var host: js.UndefOr[String] = js.native
  var options: js.UndefOr[js.Object] = js.native
  var port: js.UndefOr[Double] = js.native
  var running: Boolean = js.native
  /**
    * Create or reuse a connection to Beanstalkd with given id.
    *
    * @param id Id for the connection.
    */
  def connection(id: String): js.Promise[default] = js.native
  /**
    * Wait for the given job on specifed tube to be done.
    * If provided, calls the `onPoll` handler on each check (500ms).
    *
    * @param tube The tube that contains the job.
    * @param jobId The job id to wait for.
    * @param onPoll The poll handler called on each check.
    */
  def done(tube: String, jobId: String): js.Promise[Unit] = js.native
  def done(tube: String, jobId: String, onPoll: JobPollHandler): js.Promise[Unit] = js.native
  /**
    * Handle jobs from given Tube.
    *
    * @param tube The tube to handle jobs on.
    * @param handler The callback for handling jobs.
    * @param options The options for the handler.
    */
  def handle(tube: String, handler: TubeHandler): Unit = js.native
  def handle(tube: String, handler: TubeHandler, options: BeanstalkdHandleOptions): Unit = js.native
  /**
    * Creates a new Job representation.
    *
    * @param tube The tube to create job for.
    * @param jobId The job id for the new job.
    */
  def job(tube: String, jobId: String): Job = js.native
  /**
    * Spawn a new Job on given Tube.
    *
    * @param tube The tube to spawn new job on.
    * @param payload The message payload.
    * @param options The options for the new job.
    */
  def spawn(tube: String, payload: js.Object): js.Promise[Job] = js.native
  def spawn(tube: String, payload: js.Object, options: BeanstalkdSpawnOptions): js.Promise[Job] = js.native
  /** Enable handlers and start processing jobs, make sure handlers are setup before calling start. */
  def start(): Unit = js.native
  /** Start handling configured tubes. */
  def startTubes(): Unit = js.native
  /** Stop the Worker process and all associated tubes. */
  def stop(): js.Promise[Unit] = js.native
  /** Stop handling the configured tubes. */
  def stopTubes(): js.Promise[Unit] = js.native
  /**
    * Get or create a Tube.
    *
    * @param name The Tube name to get or create.
    */
  def tube(name: String): Tube = js.native
  /**
    * Checks if the given tube is currently working.
    *
    * @param tube The tube to check if currently working.
    */
  def working(tube: String): Boolean = js.native
}

