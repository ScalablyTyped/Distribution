package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMasterAccountResponse extends js.Object {
  /**
    * The master account details.
    */
  var Master: typings.awsSdk.guarddutyMod.Master = js.native
}

object GetMasterAccountResponse {
  @scala.inline
  def apply(Master: Master): GetMasterAccountResponse = {
    val __obj = js.Dynamic.literal(Master = Master.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMasterAccountResponse]
  }
  @scala.inline
  implicit class GetMasterAccountResponseOps[Self <: GetMasterAccountResponse] (val x: Self) extends AnyVal {
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
    def setMaster(value: Master): Self = this.set("Master", value.asInstanceOf[js.Any])
  }
  
}

