package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOpsItemResponse extends js.Object {
  /**
    * The OpsItem.
    */
  var OpsItem: js.UndefOr[typings.awsSdk.ssmMod.OpsItem] = js.native
}

object GetOpsItemResponse {
  @scala.inline
  def apply(): GetOpsItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpsItemResponse]
  }
  @scala.inline
  implicit class GetOpsItemResponseOps[Self <: GetOpsItemResponse] (val x: Self) extends AnyVal {
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
    def setOpsItem(value: OpsItem): Self = this.set("OpsItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpsItem: Self = this.set("OpsItem", js.undefined)
  }
  
}

