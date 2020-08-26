package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggerDefinitionVersion extends js.Object {
  /**
    * A list of loggers.
    */
  var Loggers: js.UndefOr[listOfLogger] = js.native
}

object LoggerDefinitionVersion {
  @scala.inline
  def apply(): LoggerDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggerDefinitionVersion]
  }
  @scala.inline
  implicit class LoggerDefinitionVersionOps[Self <: LoggerDefinitionVersion] (val x: Self) extends AnyVal {
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
    def setLoggersVarargs(value: Logger*): Self = this.set("Loggers", js.Array(value :_*))
    @scala.inline
    def setLoggers(value: listOfLogger): Self = this.set("Loggers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggers: Self = this.set("Loggers", js.undefined)
  }
  
}

