package typings.azure.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Se extends js.Object {
  var se: String = js.native
  var sig: String = js.native
  var sp: String = js.native
  var sr: String = js.native
  var sv: String = js.native
}

object Se {
  @scala.inline
  def apply(se: String, sig: String, sp: String, sr: String, sv: String): Se = {
    val __obj = js.Dynamic.literal(se = se.asInstanceOf[js.Any], sig = sig.asInstanceOf[js.Any], sp = sp.asInstanceOf[js.Any], sr = sr.asInstanceOf[js.Any], sv = sv.asInstanceOf[js.Any])
    __obj.asInstanceOf[Se]
  }
  @scala.inline
  implicit class SeOps[Self <: Se] (val x: Self) extends AnyVal {
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
    def setSe(value: String): Self = this.set("se", value.asInstanceOf[js.Any])
    @scala.inline
    def setSig(value: String): Self = this.set("sig", value.asInstanceOf[js.Any])
    @scala.inline
    def setSp(value: String): Self = this.set("sp", value.asInstanceOf[js.Any])
    @scala.inline
    def setSr(value: String): Self = this.set("sr", value.asInstanceOf[js.Any])
    @scala.inline
    def setSv(value: String): Self = this.set("sv", value.asInstanceOf[js.Any])
  }
  
}

