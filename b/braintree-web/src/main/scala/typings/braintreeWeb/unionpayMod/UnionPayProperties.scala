package typings.braintreeWeb.unionpayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnionPayProperties extends js.Object {
  var isSupported: Boolean = js.native
  var supportsTwoStepAuthAndCapture: Boolean = js.native
}

object UnionPayProperties {
  @scala.inline
  def apply(isSupported: Boolean, supportsTwoStepAuthAndCapture: Boolean): UnionPayProperties = {
    val __obj = js.Dynamic.literal(isSupported = isSupported.asInstanceOf[js.Any], supportsTwoStepAuthAndCapture = supportsTwoStepAuthAndCapture.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnionPayProperties]
  }
  @scala.inline
  implicit class UnionPayPropertiesOps[Self <: UnionPayProperties] (val x: Self) extends AnyVal {
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
    def setIsSupported(value: Boolean): Self = this.set("isSupported", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsTwoStepAuthAndCapture(value: Boolean): Self = this.set("supportsTwoStepAuthAndCapture", value.asInstanceOf[js.Any])
  }
  
}

