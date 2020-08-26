package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePatchGroupStateRequest extends js.Object {
  /**
    * The name of the patch group whose patch snapshot should be retrieved.
    */
  var PatchGroup: typings.awsSdk.ssmMod.PatchGroup = js.native
}

object DescribePatchGroupStateRequest {
  @scala.inline
  def apply(PatchGroup: PatchGroup): DescribePatchGroupStateRequest = {
    val __obj = js.Dynamic.literal(PatchGroup = PatchGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePatchGroupStateRequest]
  }
  @scala.inline
  implicit class DescribePatchGroupStateRequestOps[Self <: DescribePatchGroupStateRequest] (val x: Self) extends AnyVal {
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
    def setPatchGroup(value: PatchGroup): Self = this.set("PatchGroup", value.asInstanceOf[js.Any])
  }
  
}

