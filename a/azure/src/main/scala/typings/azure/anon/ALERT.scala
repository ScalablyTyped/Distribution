package typings.azure.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ALERT extends js.Object {
  var ALERT: String = js.native
  var CRITICAL: String = js.native
  var DEBUG: String = js.native
  var EMERGENCY: String = js.native
  var ERROR: String = js.native
  var INFO: String = js.native
  var NOTICE: String = js.native
  var WARNING: String = js.native
}

object ALERT {
  @scala.inline
  def apply(
    ALERT: String,
    CRITICAL: String,
    DEBUG: String,
    EMERGENCY: String,
    ERROR: String,
    INFO: String,
    NOTICE: String,
    WARNING: String
  ): ALERT = {
    val __obj = js.Dynamic.literal(ALERT = ALERT.asInstanceOf[js.Any], CRITICAL = CRITICAL.asInstanceOf[js.Any], DEBUG = DEBUG.asInstanceOf[js.Any], EMERGENCY = EMERGENCY.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], NOTICE = NOTICE.asInstanceOf[js.Any], WARNING = WARNING.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALERT]
  }
  @scala.inline
  implicit class ALERTOps[Self <: ALERT] (val x: Self) extends AnyVal {
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
    def setALERT(value: String): Self = this.set("ALERT", value.asInstanceOf[js.Any])
    @scala.inline
    def setCRITICAL(value: String): Self = this.set("CRITICAL", value.asInstanceOf[js.Any])
    @scala.inline
    def setDEBUG(value: String): Self = this.set("DEBUG", value.asInstanceOf[js.Any])
    @scala.inline
    def setEMERGENCY(value: String): Self = this.set("EMERGENCY", value.asInstanceOf[js.Any])
    @scala.inline
    def setERROR(value: String): Self = this.set("ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setINFO(value: String): Self = this.set("INFO", value.asInstanceOf[js.Any])
    @scala.inline
    def setNOTICE(value: String): Self = this.set("NOTICE", value.asInstanceOf[js.Any])
    @scala.inline
    def setWARNING(value: String): Self = this.set("WARNING", value.asInstanceOf[js.Any])
  }
  
}

