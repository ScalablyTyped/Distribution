package typings.beanstalkd.beanstalkdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeanstalkdJobStats extends js.Object {
  /** The time in seconds since the put command that created this job. */
  var age: Double
  /** The number of times this job has been buried. */
  var buries: Double
  /** The integer number of seconds to wait before putting this job in the ready queue. */
  var delay: Double
  /**
    * The number of the earliest binlog file containing this job.
    * If -b wasn't used, this will be 0.
    */
  var file: Double
  /** The job id. */
  var id: String
  /** The number of times this job has been kicked. */
  var kicks: Double
  /** The priority value set by the put, release, or bury commands. */
  var pri: Double
  /** The number of times a client has released this job from a reservation. */
  var releases: Double
  /** The number of times this job has been reserved. */
  var reserves: Double
  /** The job state. */
  var state: String
  /**
    * The number of seconds left until the server puts this job into the ready queue.
    * This number is only meaningful if the job is reserved or delayed.
    * If the job is reserved and this amount of time elapses before its state changes, it is considered to have timed out.
    */
  var `time-left`: Double
  /** The number of times this job has timed out during a reservation. */
  var timeouts: Double
  /** Time to run: The integer number of seconds a worker is allowed to run this job. */
  var ttr: Double
  /** The name of the tube that contains this job. */
  var tube: String
}

object BeanstalkdJobStats {
  @scala.inline
  def apply(
    age: Double,
    buries: Double,
    delay: Double,
    file: Double,
    id: String,
    kicks: Double,
    pri: Double,
    releases: Double,
    reserves: Double,
    state: String,
    `time-left`: Double,
    timeouts: Double,
    ttr: Double,
    tube: String
  ): BeanstalkdJobStats = {
    val __obj = js.Dynamic.literal(age = age, buries = buries, delay = delay, file = file, id = id, kicks = kicks, pri = pri, releases = releases, reserves = reserves, state = state, timeouts = timeouts, ttr = ttr, tube = tube)
    __obj.updateDynamic("time-left")(`time-left`)
    __obj.asInstanceOf[BeanstalkdJobStats]
  }
}

