package typings.cryptojs.CryptoJS.algo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISHA3Cfg extends js.Object {
  var outputLength: js.UndefOr[Double] = js.native
}

object ISHA3Cfg {
  @scala.inline
  def apply(): ISHA3Cfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISHA3Cfg]
  }
  @scala.inline
  implicit class ISHA3CfgOps[Self <: ISHA3Cfg] (val x: Self) extends AnyVal {
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
    def setOutputLength(value: Double): Self = this.set("outputLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputLength: Self = this.set("outputLength", js.undefined)
  }
  
}

