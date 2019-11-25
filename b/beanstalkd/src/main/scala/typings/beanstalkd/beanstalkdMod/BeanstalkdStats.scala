package typings.beanstalkd.beanstalkdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeanstalkdStats extends js.Object {
  /** The index of the current binlog file being written to. If binlog is not active this value will be 0. */
  var `binlog-current-index`: Double
  /** The maximum size in bytes a binlog file is allowed to get before a new binlog file is opened. */
  var `binlog-max-size`: Double
  /** The index of the oldest binlog file needed to store the current jobs. */
  var `binlog-oldest-index`: Double
  /** The cumulative number of records written as part of compaction. */
  var `binlog-records-migrated`: Double
  /** The cumulative number of records written to the binlog. */
  var `binlog-records-written`: Double
  /** The cumulative number of bury commands. */
  var `cmd-bury`: Double
  /** The cumulative number of delete commands. */
  var `cmd-delete`: Double
  /** The cumulative number of ignore commands. */
  var `cmd-ignore`: Double
  /** The cumulative number of kick commands. */
  var `cmd-kick`: Double
  /** The cumulative number of list-tube-used commands. */
  var `cmd-list-tube-used`: Double
  /** The cumulative number of list-tubes commands. */
  var `cmd-list-tubes`: Double
  /** The cumulative number of list-tubes-watched commands. */
  var `cmd-list-tubes-watched`: Double
  /** The cumulative number of pause-tube commands. */
  var `cmd-pause-tube`: Double
  /** The cumulative number of peek commands. */
  var `cmd-peek`: Double
  /** The cumulative number of peek-buried commands. */
  var `cmd-peek-buried`: Double
  /** The cumulative number of peek-delayed commands. */
  var `cmd-peek-delayed`: Double
  /** The cumulative number of peek-ready commands. */
  var `cmd-peek-ready`: Double
  /** The cumulative number of put commands. */
  var `cmd-put`: Double
  /** The cumulative number of release commands. */
  var `cmd-release`: Double
  /** The cumulative number of reserve commands. */
  var `cmd-reserve`: Double
  /** The cumulative number of stats commands. */
  var `cmd-stats`: Double
  /** The cumulative number of stats-job commands. */
  var `cmd-stats-job`: Double
  /** The cumulative number of stats-tube commands. */
  var `cmd-stats-tube`: Double
  /** The cumulative number of use commands. */
  var `cmd-use`: Double
  /** The cumulative number of watch commands. */
  var `cmd-watch`: Double
  /** The number of currently open connections. */
  var `current-connections`: Double
  /** The number of buried jobs. */
  var `current-jobs-buried`: Double
  /** The number of delayed jobs. */
  var `current-jobs-delayed`: Double
  /** The number of jobs in the ready queue. */
  var `current-jobs-ready`: Double
  /** The number of jobs reserved by all clients. */
  var `current-jobs-reserved`: Double
  /** The number of ready jobs with priority < 1024. */
  var `current-jobs-urgent`: Double
  /** The number of open connections that have each issued at least one put command. */
  var `current-producers`: Double
  /** The number of currently-existing tubes. */
  var `current-tubes`: Double
  /** The number of open connections that have issued a reserve command but not yet received a response. */
  var `current-waiting`: Double
  /** The number of open connections that have each issued at least one reserve command. */
  var `current-workers`: Double
  /** Set to "true" if the server is in drain mode, "false" otherwise. */
  var draining: Boolean
  /** The hostname of the machine as determined by uname. */
  var hostname: String
  /** A random id string for this server process, generated every time beanstalkd process starts. */
  var id: String
  /** The cumulative count of times a job has timed out. */
  var `job-timeouts`: Double
  /** The maximum number of bytes in a job. */
  var `max-job-size`: Double
  /** The OS version as determined by uname */
  var os: String
  /** The process id of the server. */
  var pid: String
  /** The machine architecture as determined by uname */
  var platform: String
  /** The cumulative system CPU time of this process in seconds and microseconds. */
  var `rusage-stime`: Double
  /** The cumulative user CPU time of this process in seconds and microseconds. */
  var `rusage-utime`: Double
  /** The cumulative count of connections. */
  var `total-connections`: Double
  /** The cumulative count of jobs created. */
  var `total-jobs`: Double
  /** The number of seconds since this server process started running. */
  var uptime: Double
  /** The version string of the server. */
  var version: String
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
}

