package typings.beanstalkdWorker.mod

import typings.beanstalkd.mod.BeanstalkdJobStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Job extends js.Object {
  var id: String = js.native
  var tube: String = js.native
  /**
    * Executes given command on the Tube that contains the Job.
    *
    * @param command The command to execute.
    * @param args The arguments for the command.
    */
  def command(command: String, args: js.Any*): js.Promise[_] = js.native
  /**
    * Wait for this job to be done.
    * If provided, calls the `onPoll` handler on each check (500ms).
    *
    * @param onPoll The poll handler called on each check.
    */
  def done(): js.Promise[Unit] = js.native
  def done(onPoll: JobPollHandler): js.Promise[Unit] = js.native
  /**
    * Requests stats for this job.
    * If `catchNotFound` is true, and `NOT_FOUND` error is thrown, returns null.
    *
    * @param catchNotFound Whether to catch `NOT_FOUND` error and return null.
    */
  def stats(): js.Promise[BeanstalkdJobStats] = js.native
  def stats(catchNotFound: Boolean): js.Promise[BeanstalkdJobStats] = js.native
  /** Query current status for this Job. */
  def status(): js.Promise[JobStatus] = js.native
}

