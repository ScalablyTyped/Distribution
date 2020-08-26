package typings.awsSdk.outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSiteInput extends js.Object {
  var SiteId: typings.awsSdk.outpostsMod.SiteId = js.native
}

object DeleteSiteInput {
  @scala.inline
  def apply(SiteId: SiteId): DeleteSiteInput = {
    val __obj = js.Dynamic.literal(SiteId = SiteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSiteInput]
  }
  @scala.inline
  implicit class DeleteSiteInputOps[Self <: DeleteSiteInput] (val x: Self) extends AnyVal {
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
    def setSiteId(value: SiteId): Self = this.set("SiteId", value.asInstanceOf[js.Any])
  }
  
}

