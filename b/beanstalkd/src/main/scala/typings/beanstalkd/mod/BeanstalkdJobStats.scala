package typings.beanstalkd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeanstalkdJobStats extends js.Object {
  /** The time in seconds since the put command that created this job. */
  var age: Double = js.native
  /** The number of times this job has been buried. */
  var buries: Double = js.native
  /** The integer number of seconds to wait before putting this job in the ready queue. */
  var delay: Double = js.native
  /**
    * The number of the earliest binlog file containing this job.
    * If -b wasn't used, this will be 0.
    */
  var file: Double = js.native
  /** The job id. */
  var id: String = js.native
  /** The number of times this job has been kicked. */
  var kicks: Double = js.native
  /** The priority value set by the put, release, or bury commands. */
  var pri: Double = js.native
  /** The number of times a client has released this job from a reservation. */
  var releases: Double = js.native
  /** The number of times this job has been reserved. */
  var reserves: Double = js.native
  /** The job state. */
  var state: String = js.native
  /**
    * The number of seconds left until the server puts this job into the ready queue.
    * This number is only meaningful if the job is reserved or delayed.
    * If the job is reserved and this amount of time elapses before its state changes, it is considered to have timed out.
    */
  var `time-left`: Double = js.native
  /** The number of times this job has timed out during a reservation. */
  var timeouts: Double = js.native
  /** Time to run: The integer number of seconds a worker is allowed to run this job. */
  var ttr: Double = js.native
  /** The name of the tube that contains this job. */
  var tube: String = js.native
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
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], buries = buries.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kicks = kicks.asInstanceOf[js.Any], pri = pri.asInstanceOf[js.Any], releases = releases.asInstanceOf[js.Any], reserves = reserves.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timeouts = timeouts.asInstanceOf[js.Any], ttr = ttr.asInstanceOf[js.Any], tube = tube.asInstanceOf[js.Any])
    __obj.updateDynamic("time-left")(`time-left`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeanstalkdJobStats]
  }
  @scala.inline
  implicit class BeanstalkdJobStatsOps[Self <: BeanstalkdJobStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAge(value: Double): Self = this.set("age", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuries(value: Double): Self = this.set("buries", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile(value: Double): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKicks(value: Double): Self = this.set("kicks", value.asInstanceOf[js.Any])
    @scala.inline
    def setPri(value: Double): Self = this.set("pri", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleases(value: Double): Self = this.set("releases", value.asInstanceOf[js.Any])
    @scala.inline
    def setReserves(value: Double): Self = this.set("reserves", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def `setTime-left`(value: Double): Self = this.set("time-left", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeouts(value: Double): Self = this.set("timeouts", value.asInstanceOf[js.Any])
    @scala.inline
    def setTtr(value: Double): Self = this.set("ttr", value.asInstanceOf[js.Any])
    @scala.inline
    def setTube(value: String): Self = this.set("tube", value.asInstanceOf[js.Any])
  }
  
}

