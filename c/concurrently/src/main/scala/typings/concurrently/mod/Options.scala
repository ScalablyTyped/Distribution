package typings.concurrently.mod

import typings.concurrently.concurrentlyStrings.command
import typings.concurrently.concurrentlyStrings.failure
import typings.concurrently.concurrentlyStrings.first
import typings.concurrently.concurrentlyStrings.index
import typings.concurrently.concurrentlyStrings.last
import typings.concurrently.concurrentlyStrings.name
import typings.concurrently.concurrentlyStrings.none
import typings.concurrently.concurrentlyStrings.pid
import typings.concurrently.concurrentlyStrings.success
import typings.concurrently.concurrentlyStrings.time
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** the default input target when reading from `inputStream`. Default: `0`. */
  var defaultInputTarget: js.UndefOr[Double] = js.native
  /** a Readable stream to read the input from, eg `process.stdin` */
  var inputStream: js.UndefOr[ReadableStream] = js.native
  /** an array of exiting conditions that will cause a process to kill others. Can contain any of success or failure. */
  var killOthers: js.UndefOr[js.Array[success | failure]] = js.native
  /**
    * how many processes should run at once
    * @default 0
    */
  var maxProcesses: js.UndefOr[Double] = js.native
  /**  a Writable stream to write logs to. Default: `process.stdout` */
  var outputStream: js.UndefOr[WritableStream] = js.native
  /**
    * the prefix type to use when logging processes output.
    */
  var prefix: js.UndefOr[index | pid | time | command | name | none | String] = js.native
  /** how many characters to show when prefixing with `command`. Default: `10` */
  var prefixLength: js.UndefOr[Double] = js.native
  /** whether raw mode should be used, meaning strictly process output will be logged, without any prefixes, colouring or extra stuff. */
  var raw: js.UndefOr[Boolean] = js.native
  /** how many milliseconds to wait between process restarts. Default: 0 */
  var restartDelay: js.UndefOr[Double] = js.native
  /** how many attempts to restart a process that dies will be made. Default: `0` */
  var restartTries: js.UndefOr[Double] = js.native
  /** the condition to consider the run was successful. */
  var successCondition: js.UndefOr[first | last] = js.native
  /** a date-fns format to use when prefixing with time. Default: `yyyy-MM-dd HH:mm:ss.ZZZ` */
  var timestampFormat: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setDefaultInputTarget(value: Double): Self = this.set("defaultInputTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultInputTarget: Self = this.set("defaultInputTarget", js.undefined)
    @scala.inline
    def setInputStream(value: ReadableStream): Self = this.set("inputStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputStream: Self = this.set("inputStream", js.undefined)
    @scala.inline
    def setKillOthersVarargs(value: (success | failure)*): Self = this.set("killOthers", js.Array(value :_*))
    @scala.inline
    def setKillOthers(value: js.Array[success | failure]): Self = this.set("killOthers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKillOthers: Self = this.set("killOthers", js.undefined)
    @scala.inline
    def setMaxProcesses(value: Double): Self = this.set("maxProcesses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxProcesses: Self = this.set("maxProcesses", js.undefined)
    @scala.inline
    def setOutputStream(value: WritableStream): Self = this.set("outputStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputStream: Self = this.set("outputStream", js.undefined)
    @scala.inline
    def setPrefix(value: index | pid | time | command | name | none | String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setPrefixLength(value: Double): Self = this.set("prefixLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixLength: Self = this.set("prefixLength", js.undefined)
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    @scala.inline
    def setRestartDelay(value: Double): Self = this.set("restartDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestartDelay: Self = this.set("restartDelay", js.undefined)
    @scala.inline
    def setRestartTries(value: Double): Self = this.set("restartTries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestartTries: Self = this.set("restartTries", js.undefined)
    @scala.inline
    def setSuccessCondition(value: first | last): Self = this.set("successCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessCondition: Self = this.set("successCondition", js.undefined)
    @scala.inline
    def setTimestampFormat(value: String): Self = this.set("timestampFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestampFormat: Self = this.set("timestampFormat", js.undefined)
  }
  
}

