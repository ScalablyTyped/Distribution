package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchLogsLogStream extends js.Object {
  /**
    * Specifies the max number of log events in a batch, up to 10000. The default value is 1000.
    */
  var BatchCount: js.UndefOr[Integer] = js.native
  /**
    * Specifies the maximum size of log events in a batch, in bytes, up to 1048576 bytes. The default value is 32768 bytes. This size is calculated as the sum of all event messages in UTF-8, plus 26 bytes for each log event.
    */
  var BatchSize: js.UndefOr[Integer] = js.native
  /**
    * Specifies the time duration for the batching of log events. The minimum value is 5000ms and default value is 5000ms.
    */
  var BufferDuration: js.UndefOr[Integer] = js.native
  /**
    * Specifies how the time stamp is extracted from logs. For more information, see the CloudWatch Logs Agent Reference.
    */
  var DatetimeFormat: js.UndefOr[String] = js.native
  /**
    * Specifies the encoding of the log file so that the file can be read correctly. The default is utf_8. Encodings supported by Python codecs.decode() can be used here.
    */
  var Encoding: js.UndefOr[CloudWatchLogsEncoding] = js.native
  /**
    * Specifies log files that you want to push to CloudWatch Logs.  File can point to a specific file or multiple files (by using wild card characters such as /var/log/system.log*). Only the latest file is pushed to CloudWatch Logs, based on file modification time. We recommend that you use wild card characters to specify a series of files of the same type, such as access_log.2014-06-01-01, access_log.2014-06-01-02, and so on by using a pattern like access_log.*. Don't use a wildcard to match multiple file types, such as access_log_80 and access_log_443. To specify multiple, different file types, add another log stream entry to the configuration file, so that each log file type is stored in a different log group. Zipped files are not supported.
    */
  var File: js.UndefOr[String] = js.native
  /**
    * Specifies the range of lines for identifying a file. The valid values are one number, or two dash-delimited numbers, such as '1', '2-5'. The default value is '1', meaning the first line is used to calculate the fingerprint. Fingerprint lines are not sent to CloudWatch Logs unless all specified lines are available.
    */
  var FileFingerprintLines: js.UndefOr[String] = js.native
  /**
    * Specifies where to start to read data (start_of_file or end_of_file). The default is start_of_file. This setting is only used if there is no state persisted for that log stream.
    */
  var InitialPosition: js.UndefOr[CloudWatchLogsInitialPosition] = js.native
  /**
    * Specifies the destination log group. A log group is created automatically if it doesn't already exist. Log group names can be between 1 and 512 characters long. Allowed characters include a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), '/' (forward slash), and '.' (period).
    */
  var LogGroupName: js.UndefOr[String] = js.native
  /**
    * Specifies the pattern for identifying the start of a log message.
    */
  var MultiLineStartPattern: js.UndefOr[String] = js.native
  /**
    * Specifies the time zone of log event time stamps.
    */
  var TimeZone: js.UndefOr[CloudWatchLogsTimeZone] = js.native
}

object CloudWatchLogsLogStream {
  @scala.inline
  def apply(): CloudWatchLogsLogStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchLogsLogStream]
  }
  @scala.inline
  implicit class CloudWatchLogsLogStreamOps[Self <: CloudWatchLogsLogStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBatchCount(value: Integer): Self = this.set("BatchCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchCount: Self = this.set("BatchCount", js.undefined)
    @scala.inline
    def setBatchSize(value: Integer): Self = this.set("BatchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchSize: Self = this.set("BatchSize", js.undefined)
    @scala.inline
    def setBufferDuration(value: Integer): Self = this.set("BufferDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBufferDuration: Self = this.set("BufferDuration", js.undefined)
    @scala.inline
    def setDatetimeFormat(value: String): Self = this.set("DatetimeFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatetimeFormat: Self = this.set("DatetimeFormat", js.undefined)
    @scala.inline
    def setEncoding(value: CloudWatchLogsEncoding): Self = this.set("Encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("Encoding", js.undefined)
    @scala.inline
    def setFile(value: String): Self = this.set("File", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("File", js.undefined)
    @scala.inline
    def setFileFingerprintLines(value: String): Self = this.set("FileFingerprintLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileFingerprintLines: Self = this.set("FileFingerprintLines", js.undefined)
    @scala.inline
    def setInitialPosition(value: CloudWatchLogsInitialPosition): Self = this.set("InitialPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialPosition: Self = this.set("InitialPosition", js.undefined)
    @scala.inline
    def setLogGroupName(value: String): Self = this.set("LogGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogGroupName: Self = this.set("LogGroupName", js.undefined)
    @scala.inline
    def setMultiLineStartPattern(value: String): Self = this.set("MultiLineStartPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiLineStartPattern: Self = this.set("MultiLineStartPattern", js.undefined)
    @scala.inline
    def setTimeZone(value: CloudWatchLogsTimeZone): Self = this.set("TimeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZone: Self = this.set("TimeZone", js.undefined)
  }
  
}

