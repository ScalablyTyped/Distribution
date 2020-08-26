package typings.cordovaPluginCamera.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DATAURL extends js.Object {
  var DATA_URL: Double = js.native
  var FILE_URI: Double = js.native
  var NATIVE_URI: Double = js.native
}

object DATAURL {
  @scala.inline
  def apply(DATA_URL: Double, FILE_URI: Double, NATIVE_URI: Double): DATAURL = {
    val __obj = js.Dynamic.literal(DATA_URL = DATA_URL.asInstanceOf[js.Any], FILE_URI = FILE_URI.asInstanceOf[js.Any], NATIVE_URI = NATIVE_URI.asInstanceOf[js.Any])
    __obj.asInstanceOf[DATAURL]
  }
  @scala.inline
  implicit class DATAURLOps[Self <: DATAURL] (val x: Self) extends AnyVal {
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
    def setDATA_URL(value: Double): Self = this.set("DATA_URL", value.asInstanceOf[js.Any])
    @scala.inline
    def setFILE_URI(value: Double): Self = this.set("FILE_URI", value.asInstanceOf[js.Any])
    @scala.inline
    def setNATIVE_URI(value: Double): Self = this.set("NATIVE_URI", value.asInstanceOf[js.Any])
  }
  
}

