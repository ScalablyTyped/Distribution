package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogTargetConfiguration extends js.Object {
  /**
    * The logging level.
    */
  var logLevel: js.UndefOr[LogLevel] = js.native
  /**
    * A log target
    */
  var logTarget: js.UndefOr[LogTarget] = js.native
}

object LogTargetConfiguration {
  @scala.inline
  def apply(): LogTargetConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogTargetConfiguration]
  }
  @scala.inline
  implicit class LogTargetConfigurationOps[Self <: LogTargetConfiguration] (val x: Self) extends AnyVal {
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
    def setLogLevel(value: LogLevel): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    @scala.inline
    def setLogTarget(value: LogTarget): Self = this.set("logTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogTarget: Self = this.set("logTarget", js.undefined)
  }
  
}

