package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cavv extends js.Object {
  var cavv: js.UndefOr[String] = js.native
  var eciFlag: String = js.native
  var threeDSecureVision: js.UndefOr[String] = js.native
  var xid: js.UndefOr[String] = js.native
}

object Cavv {
  @scala.inline
  def apply(eciFlag: String): Cavv = {
    val __obj = js.Dynamic.literal(eciFlag = eciFlag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cavv]
  }
  @scala.inline
  implicit class CavvOps[Self <: Cavv] (val x: Self) extends AnyVal {
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
    def setEciFlag(value: String): Self = this.set("eciFlag", value.asInstanceOf[js.Any])
    @scala.inline
    def setCavv(value: String): Self = this.set("cavv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCavv: Self = this.set("cavv", js.undefined)
    @scala.inline
    def setThreeDSecureVision(value: String): Self = this.set("threeDSecureVision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreeDSecureVision: Self = this.set("threeDSecureVision", js.undefined)
    @scala.inline
    def setXid(value: String): Self = this.set("xid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXid: Self = this.set("xid", js.undefined)
  }
  
}

