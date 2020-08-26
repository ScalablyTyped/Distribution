package typings.browserBunyan.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ name in bunyan.bunyan.LogLevelString ]: number} */
@js.native
trait nameinLogLevelStringnumbe extends js.Object {
  var debug: Double = js.native
  var error: Double = js.native
  var fatal: Double = js.native
  var info: Double = js.native
  var trace: Double = js.native
  var warn: Double = js.native
}

object nameinLogLevelStringnumbe {
  @scala.inline
  def apply(debug: Double, error: Double, fatal: Double, info: Double, trace: Double, warn: Double): nameinLogLevelStringnumbe = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[nameinLogLevelStringnumbe]
  }
  @scala.inline
  implicit class nameinLogLevelStringnumbeOps[Self <: nameinLogLevelStringnumbe] (val x: Self) extends AnyVal {
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
    def setDebug(value: Double): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Double): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setFatal(value: Double): Self = this.set("fatal", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: Double): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrace(value: Double): Self = this.set("trace", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarn(value: Double): Self = this.set("warn", value.asInstanceOf[js.Any])
  }
  
}

