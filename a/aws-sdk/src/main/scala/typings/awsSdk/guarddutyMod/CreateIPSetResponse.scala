package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIPSetResponse extends js.Object {
  /**
    * The ID of the IPSet resource.
    */
  var IpSetId: String = js.native
}

object CreateIPSetResponse {
  @scala.inline
  def apply(IpSetId: String): CreateIPSetResponse = {
    val __obj = js.Dynamic.literal(IpSetId = IpSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIPSetResponse]
  }
  @scala.inline
  implicit class CreateIPSetResponseOps[Self <: CreateIPSetResponse] (val x: Self) extends AnyVal {
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
    def setIpSetId(value: String): Self = this.set("IpSetId", value.asInstanceOf[js.Any])
  }
  
}

