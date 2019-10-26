package typings.beanstalkd.beanstalkdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeanstalkdTubeStats extends js.Object {
  /** The cumulative number of delete commands for this tube. */
  var `cmd-delete`: Double
  /** The cumulative number of pause-tube commands for this tube. */
  var `cmd-pause-tube`: Double
  /** The number of buried jobs in this tube. */
  var `current-jobs-buried`: Double
  /** The number of delayed jobs in this tube. */
  var `current-jobs-delayed`: Double
  /** The number of jobs in the ready queue in this tube. */
  var `current-jobs-ready`: Double
  /** The number of jobs reserved by all clients in this tube. */
  var `current-jobs-reserved`: Double
  /** The number of ready jobs with priority < 1024 in this tube. */
  var `current-jobs-urgent`: Double
  /** The number of open connections that are currently using this tube. */
  var `current-using`: Double
  /** The number of open connections that have issued a reserve command while watching this tube but not yet received a response. */
  var `current-waiting`: Double
  /** The number of open connections that are currently watching this tube. */
  var `current-watching`: Double
  /** The tube's name. */
  var name: String
  /** The number of seconds the tube has been paused for. */
  var pause: Double
  /** The number of seconds until the tube is un-paused. */
  var `pause-time-left`: Double
  /** The cumulative count of jobs created in this tube in the current beanstalkd process. */
  var `total-jobs`: Double
}

object BeanstalkdTubeStats {
  @scala.inline
  def apply(
    `cmd-delete`: Double,
    `cmd-pause-tube`: Double,
    `current-jobs-buried`: Double,
    `current-jobs-delayed`: Double,
    `current-jobs-ready`: Double,
    `current-jobs-reserved`: Double,
    `current-jobs-urgent`: Double,
    `current-using`: Double,
    `current-waiting`: Double,
    `current-watching`: Double,
    name: String,
    pause: Double,
    `pause-time-left`: Double,
    `total-jobs`: Double
  ): BeanstalkdTubeStats = {
    val __obj = js.Dynamic.literal(name = name, pause = pause)
    __obj.updateDynamic("cmd-delete")(`cmd-delete`)
    __obj.updateDynamic("cmd-pause-tube")(`cmd-pause-tube`)
    __obj.updateDynamic("current-jobs-buried")(`current-jobs-buried`)
    __obj.updateDynamic("current-jobs-delayed")(`current-jobs-delayed`)
    __obj.updateDynamic("current-jobs-ready")(`current-jobs-ready`)
    __obj.updateDynamic("current-jobs-reserved")(`current-jobs-reserved`)
    __obj.updateDynamic("current-jobs-urgent")(`current-jobs-urgent`)
    __obj.updateDynamic("current-using")(`current-using`)
    __obj.updateDynamic("current-waiting")(`current-waiting`)
    __obj.updateDynamic("current-watching")(`current-watching`)
    __obj.updateDynamic("pause-time-left")(`pause-time-left`)
    __obj.updateDynamic("total-jobs")(`total-jobs`)
    __obj.asInstanceOf[BeanstalkdTubeStats]
  }
}

