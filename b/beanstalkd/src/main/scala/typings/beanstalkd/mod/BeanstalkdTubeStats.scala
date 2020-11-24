package typings.beanstalkd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeanstalkdTubeStats extends js.Object {
  
  /** The cumulative number of delete commands for this tube. */
  var `cmd-delete`: Double = js.native
  
  /** The cumulative number of pause-tube commands for this tube. */
  var `cmd-pause-tube`: Double = js.native
  
  /** The number of buried jobs in this tube. */
  var `current-jobs-buried`: Double = js.native
  
  /** The number of delayed jobs in this tube. */
  var `current-jobs-delayed`: Double = js.native
  
  /** The number of jobs in the ready queue in this tube. */
  var `current-jobs-ready`: Double = js.native
  
  /** The number of jobs reserved by all clients in this tube. */
  var `current-jobs-reserved`: Double = js.native
  
  /** The number of ready jobs with priority < 1024 in this tube. */
  var `current-jobs-urgent`: Double = js.native
  
  /** The number of open connections that are currently using this tube. */
  var `current-using`: Double = js.native
  
  /** The number of open connections that have issued a reserve command while watching this tube but not yet received a response. */
  var `current-waiting`: Double = js.native
  
  /** The number of open connections that are currently watching this tube. */
  var `current-watching`: Double = js.native
  
  /** The tube's name. */
  var name: String = js.native
  
  /** The number of seconds the tube has been paused for. */
  var pause: Double = js.native
  
  /** The number of seconds until the tube is un-paused. */
  var `pause-time-left`: Double = js.native
  
  /** The cumulative count of jobs created in this tube in the current beanstalkd process. */
  var `total-jobs`: Double = js.native
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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any])
    __obj.updateDynamic("cmd-delete")(`cmd-delete`.asInstanceOf[js.Any])
    __obj.updateDynamic("cmd-pause-tube")(`cmd-pause-tube`.asInstanceOf[js.Any])
    __obj.updateDynamic("current-jobs-buried")(`current-jobs-buried`.asInstanceOf[js.Any])
    __obj.updateDynamic("current-jobs-delayed")(`current-jobs-delayed`.asInstanceOf[js.Any])
    __obj.updateDynamic("current-jobs-ready")(`current-jobs-ready`.asInstanceOf[js.Any])
    __obj.updateDynamic("current-jobs-reserved")(`current-jobs-reserved`.asInstanceOf[js.Any])
    __obj.updateDynamic("current-jobs-urgent")(`current-jobs-urgent`.asInstanceOf[js.Any])
    __obj.updateDynamic("current-using")(`current-using`.asInstanceOf[js.Any])
    __obj.updateDynamic("current-waiting")(`current-waiting`.asInstanceOf[js.Any])
    __obj.updateDynamic("current-watching")(`current-watching`.asInstanceOf[js.Any])
    __obj.updateDynamic("pause-time-left")(`pause-time-left`.asInstanceOf[js.Any])
    __obj.updateDynamic("total-jobs")(`total-jobs`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeanstalkdTubeStats]
  }
  
  @scala.inline
  implicit class BeanstalkdTubeStatsOps[Self <: BeanstalkdTubeStats] (val x: Self) extends AnyVal {
    
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
    def `setCmd-delete`(value: Double): Self = this.set("cmd-delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCmd-pause-tube`(value: Double): Self = this.set("cmd-pause-tube", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCurrent-jobs-buried`(value: Double): Self = this.set("current-jobs-buried", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCurrent-jobs-delayed`(value: Double): Self = this.set("current-jobs-delayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCurrent-jobs-ready`(value: Double): Self = this.set("current-jobs-ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCurrent-jobs-reserved`(value: Double): Self = this.set("current-jobs-reserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCurrent-jobs-urgent`(value: Double): Self = this.set("current-jobs-urgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCurrent-using`(value: Double): Self = this.set("current-using", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCurrent-waiting`(value: Double): Self = this.set("current-waiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCurrent-watching`(value: Double): Self = this.set("current-watching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause(value: Double): Self = this.set("pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPause-time-left`(value: Double): Self = this.set("pause-time-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTotal-jobs`(value: Double): Self = this.set("total-jobs", value.asInstanceOf[js.Any])
  }
}
