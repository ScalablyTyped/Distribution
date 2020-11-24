package typings.beanstalkd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeanstalkdStats extends js.Object {
  
  /** The index of the current binlog file being written to. If binlog is not active this value will be 0. */
  var `binlog-current-index`: Double = js.native
  
  /** The maximum size in bytes a binlog file is allowed to get before a new binlog file is opened. */
  var `binlog-max-size`: Double = js.native
  
  /** The index of the oldest binlog file needed to store the current jobs. */
  var `binlog-oldest-index`: Double = js.native
  
  /** The cumulative number of records written as part of compaction. */
  var `binlog-records-migrated`: Double = js.native
  
  /** The cumulative number of records written to the binlog. */
  var `binlog-records-written`: Double = js.native
  
  /** The cumulative number of bury commands. */
  var `cmd-bury`: Double = js.native
  
  /** The cumulative number of delete commands. */
  var `cmd-delete`: Double = js.native
  
  /** The cumulative number of ignore commands. */
  var `cmd-ignore`: Double = js.native
  
  /** The cumulative number of kick commands. */
  var `cmd-kick`: Double = js.native
  
  /** The cumulative number of list-tube-used commands. */
  var `cmd-list-tube-used`: Double = js.native
  
  /** The cumulative number of list-tubes commands. */
  var `cmd-list-tubes`: Double = js.native
  
  /** The cumulative number of list-tubes-watched commands. */
  var `cmd-list-tubes-watched`: Double = js.native
  
  /** The cumulative number of pause-tube commands. */
  var `cmd-pause-tube`: Double = js.native
  
  /** The cumulative number of peek commands. */
  var `cmd-peek`: Double = js.native
  
  /** The cumulative number of peek-buried commands. */
  var `cmd-peek-buried`: Double = js.native
  
  /** The cumulative number of peek-delayed commands. */
  var `cmd-peek-delayed`: Double = js.native
  
  /** The cumulative number of peek-ready commands. */
  var `cmd-peek-ready`: Double = js.native
  
  /** The cumulative number of put commands. */
  var `cmd-put`: Double = js.native
  
  /** The cumulative number of release commands. */
  var `cmd-release`: Double = js.native
  
  /** The cumulative number of reserve commands. */
  var `cmd-reserve`: Double = js.native
  
  /** The cumulative number of stats commands. */
  var `cmd-stats`: Double = js.native
  
  /** The cumulative number of stats-job commands. */
  var `cmd-stats-job`: Double = js.native
  
  /** The cumulative number of stats-tube commands. */
  var `cmd-stats-tube`: Double = js.native
  
  /** The cumulative number of use commands. */
  var `cmd-use`: Double = js.native
  
  /** The cumulative number of watch commands. */
  var `cmd-watch`: Double = js.native
  
  /** The number of currently open connections. */
  var `current-connections`: Double = js.native
  
  /** The number of buried jobs. */
  var `current-jobs-buried`: Double = js.native
  
  /** The number of delayed jobs. */
  var `current-jobs-delayed`: Double = js.native
  
  /** The number of jobs in the ready queue. */
  var `current-jobs-ready`: Double = js.native
  
  /** The number of jobs reserved by all clients. */
  var `current-jobs-reserved`: Double = js.native
  
  /** The number of ready jobs with priority < 1024. */
  var `current-jobs-urgent`: Double = js.native
  
  /** The number of open connections that have each issued at least one put command. */
  var `current-producers`: Double = js.native
  
  /** The number of currently-existing tubes. */
  var `current-tubes`: Double = js.native
  
  /** The number of open connections that have issued a reserve command but not yet received a response. */
  var `current-waiting`: Double = js.native
  
  /** The number of open connections that have each issued at least one reserve command. */
  var `current-workers`: Double = js.native
  
  /** Set to "true" if the server is in drain mode, "false" otherwise. */
  var draining: Boolean = js.native
  
  /** The hostname of the machine as determined by uname. */
  var hostname: String = js.native
  
  /** A random id string for this server process, generated every time beanstalkd process starts. */
  var id: String = js.native
  
  /** The cumulative count of times a job has timed out. */
  var `job-timeouts`: Double = js.native
  
  /** The maximum number of bytes in a job. */
  var `max-job-size`: Double = js.native
  
  /** The OS version as determined by uname */
  var os: String = js.native
  
  /** The process id of the server. */
  var pid: String = js.native
  
  /** The machine architecture as determined by uname */
  var platform: String = js.native
  
  /** The cumulative system CPU time of this process in seconds and microseconds. */
  var `rusage-stime`: Double = js.native
  
  /** The cumulative user CPU time of this process in seconds and microseconds. */
  var `rusage-utime`: Double = js.native
  
  /** The cumulative count of connections. */
  var `total-connections`: Double = js.native
  
  /** The cumulative count of jobs created. */
  var `total-jobs`: Double = js.native
  
  /** The number of seconds since this server process started running. */
  var uptime: Double = js.native
  
  /** The version string of the server. */
  var version: String = js.native
}
object BeanstalkdStats {
  
  @scala.inline
  def apply(
    `binlog-current-index`: Double,
    `binlog-max-size`: Double,
    `binlog-oldest-index`: Double,
    `binlog-records-migrated`: Double,
    `binlog-records-written`: Double,
    `cmd-bury`: Double,
    `cmd-delete`: Double,
    `cmd-ignore`: Double,
    `cmd-kick`: Double,
    `cmd-list-tube-used`: Double,
    `cmd-list-tubes`: Double,
    `cmd-list-tubes-watched`: Double,
    `cmd-pause-tube`: Double,
    `cmd-peek`: Double,
    `cmd-peek-buried`: Double,
    `cmd-peek-delayed`: Double,
    `cmd-peek-ready`: Double,
    `cmd-put`: Double,
    `cmd-release`: Double,
    `cmd-reserve`: Double,
    `cmd-stats`: Double,
    `cmd-stats-job`: Double,
    `cmd-stats-tube`: Double,
    `cmd-use`: Double,
    `cmd-watch`: Double,
    `current-connections`: Double,
    `current-jobs-buried`: Double,
    `current-jobs-delayed`: Double,
    `current-jobs-ready`: Double,
    `current-jobs-reserved`: Double,
    `current-jobs-urgent`: Double,
    `current-producers`: Double,
    `current-tubes`: Double,
    `current-waiting`: Double,
    `current-workers`: Double,
    draining: Boolean,
    hostname: String,
    id: String,
    `job-timeouts`: Double,
    `max-job-size`: Double,
    os: String,
    pid: String,
    platform: String,
    `rusage-stime`: Double,
    `rusage-utime`: Double,
    `total-connections`: Double,
    `total-jobs`: Double,
    uptime: Double,
    version: String
  ): BeanstalkdStats = {
    val __obj = js.Dynamic.literal(draining = draining.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], uptime = uptime.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("binlog-current-index")(`binlog-current-index`.asInstanceOf[js.Any])
    __obj.updateDynamic("binlog-max-size")(`binlog-max-size`.asInstanceOf[js.Any])
    __obj.updateDynamic("binlog-oldest-index")(`binlog-oldest-index`.asInstanceOf[js.Any])
    __obj.updateDynamic("binlog-records-migrated")(`binlog-records-migrated`.asInstanceOf[js.Any])
    __obj.updateDynamic("binlog-records-written")(`binlog-records-written`.asInstanceOf[js.Any])
    __obj.updateDynamic("cmd-bury")(`cmd-bury`.asInstanceOf[js.Any])
    __obj.updateDynamic("cmd-delete")(`cmd-delete`.asInstanceOf[js.Any])
    __obj.updateDynamic("cmd-ignore")(`cmd-ignore`.asInstanceOf[js.Any])
    __obj.updateDynamic("cmd-kick")(`cmd-kick`.asInstanceOf[js.Any])
    __obj.updateDynamic("cmd-list-tube-used")(`cmd-list-tube-used`.asInstanceOf[js.Any])
    __obj.updateDynamic("cmd-list-tubes")(`cmd-list-tubes`.asInstanceOf[js.Any])
    __obj.updateDynamic("cmd-list-tubes-watched")(`cmd-list-tubes-watched`.asInstanceOf[js.Any])
    __obj.updateDynamic("cmd-pause-tube")(`cmd-pause-tube`.asInstanceOf[js.Any])
    __obj.updateDynamic("cmd-peek")(`cmd-peek`.asInstanceOf[js.Any])
    __obj.updateDynamic("cmd-peek-buried")(`cmd-peek-buried`.asInstanceOf[js.Any])
    __obj.updateDynamic("cmd-peek-delayed")(`cmd-peek-delayed`.asInstanceOf[js.Any])
    __obj.updateDynamic("cmd-peek-ready")(`cmd-peek-ready`.asInstanceOf[js.Any])
    __obj.updateDynamic("cmd-put")(`cmd-put`.asInstanceOf[js.Any])
    __obj.updateDynamic("cmd-release")(`cmd-release`.asInstanceOf[js.Any])
    __obj.updateDynamic("cmd-reserve")(`cmd-reserve`.asInstanceOf[js.Any])
    __obj.updateDynamic("cmd-stats")(`cmd-stats`.asInstanceOf[js.Any])
    __obj.updateDynamic("cmd-stats-job")(`cmd-stats-job`.asInstanceOf[js.Any])
    __obj.updateDynamic("cmd-stats-tube")(`cmd-stats-tube`.asInstanceOf[js.Any])
    __obj.updateDynamic("cmd-use")(`cmd-use`.asInstanceOf[js.Any])
    __obj.updateDynamic("cmd-watch")(`cmd-watch`.asInstanceOf[js.Any])
    __obj.updateDynamic("current-connections")(`current-connections`.asInstanceOf[js.Any])
    __obj.updateDynamic("current-jobs-buried")(`current-jobs-buried`.asInstanceOf[js.Any])
    __obj.updateDynamic("current-jobs-delayed")(`current-jobs-delayed`.asInstanceOf[js.Any])
    __obj.updateDynamic("current-jobs-ready")(`current-jobs-ready`.asInstanceOf[js.Any])
    __obj.updateDynamic("current-jobs-reserved")(`current-jobs-reserved`.asInstanceOf[js.Any])
    __obj.updateDynamic("current-jobs-urgent")(`current-jobs-urgent`.asInstanceOf[js.Any])
    __obj.updateDynamic("current-producers")(`current-producers`.asInstanceOf[js.Any])
    __obj.updateDynamic("current-tubes")(`current-tubes`.asInstanceOf[js.Any])
    __obj.updateDynamic("current-waiting")(`current-waiting`.asInstanceOf[js.Any])
    __obj.updateDynamic("current-workers")(`current-workers`.asInstanceOf[js.Any])
    __obj.updateDynamic("job-timeouts")(`job-timeouts`.asInstanceOf[js.Any])
    __obj.updateDynamic("max-job-size")(`max-job-size`.asInstanceOf[js.Any])
    __obj.updateDynamic("rusage-stime")(`rusage-stime`.asInstanceOf[js.Any])
    __obj.updateDynamic("rusage-utime")(`rusage-utime`.asInstanceOf[js.Any])
    __obj.updateDynamic("total-connections")(`total-connections`.asInstanceOf[js.Any])
    __obj.updateDynamic("total-jobs")(`total-jobs`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeanstalkdStats]
  }
  
  @scala.inline
  implicit class BeanstalkdStatsOps[Self <: BeanstalkdStats] (val x: Self) extends AnyVal {
    
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
    def `setBinlog-current-index`(value: Double): Self = this.set("binlog-current-index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBinlog-max-size`(value: Double): Self = this.set("binlog-max-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBinlog-oldest-index`(value: Double): Self = this.set("binlog-oldest-index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBinlog-records-migrated`(value: Double): Self = this.set("binlog-records-migrated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBinlog-records-written`(value: Double): Self = this.set("binlog-records-written", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCmd-bury`(value: Double): Self = this.set("cmd-bury", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCmd-delete`(value: Double): Self = this.set("cmd-delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCmd-ignore`(value: Double): Self = this.set("cmd-ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCmd-kick`(value: Double): Self = this.set("cmd-kick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCmd-list-tube-used`(value: Double): Self = this.set("cmd-list-tube-used", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCmd-list-tubes`(value: Double): Self = this.set("cmd-list-tubes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCmd-list-tubes-watched`(value: Double): Self = this.set("cmd-list-tubes-watched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCmd-pause-tube`(value: Double): Self = this.set("cmd-pause-tube", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCmd-peek`(value: Double): Self = this.set("cmd-peek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCmd-peek-buried`(value: Double): Self = this.set("cmd-peek-buried", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCmd-peek-delayed`(value: Double): Self = this.set("cmd-peek-delayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCmd-peek-ready`(value: Double): Self = this.set("cmd-peek-ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCmd-put`(value: Double): Self = this.set("cmd-put", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCmd-release`(value: Double): Self = this.set("cmd-release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCmd-reserve`(value: Double): Self = this.set("cmd-reserve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCmd-stats`(value: Double): Self = this.set("cmd-stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCmd-stats-job`(value: Double): Self = this.set("cmd-stats-job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCmd-stats-tube`(value: Double): Self = this.set("cmd-stats-tube", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCmd-use`(value: Double): Self = this.set("cmd-use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCmd-watch`(value: Double): Self = this.set("cmd-watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCurrent-connections`(value: Double): Self = this.set("current-connections", value.asInstanceOf[js.Any])
    
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
    def `setCurrent-producers`(value: Double): Self = this.set("current-producers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCurrent-tubes`(value: Double): Self = this.set("current-tubes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCurrent-waiting`(value: Double): Self = this.set("current-waiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCurrent-workers`(value: Double): Self = this.set("current-workers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraining(value: Boolean): Self = this.set("draining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-timeouts`(value: Double): Self = this.set("job-timeouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-job-size`(value: Double): Self = this.set("max-job-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: String): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPid(value: String): Self = this.set("pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRusage-stime`(value: Double): Self = this.set("rusage-stime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRusage-utime`(value: Double): Self = this.set("rusage-utime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTotal-connections`(value: Double): Self = this.set("total-connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTotal-jobs`(value: Double): Self = this.set("total-jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUptime(value: Double): Self = this.set("uptime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
