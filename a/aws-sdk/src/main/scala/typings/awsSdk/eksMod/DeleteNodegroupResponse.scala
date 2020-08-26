package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNodegroupResponse extends js.Object {
  /**
    * The full description of your deleted node group.
    */
  var nodegroup: js.UndefOr[Nodegroup] = js.native
}

object DeleteNodegroupResponse {
  @scala.inline
  def apply(): DeleteNodegroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteNodegroupResponse]
  }
  @scala.inline
  implicit class DeleteNodegroupResponseOps[Self <: DeleteNodegroupResponse] (val x: Self) extends AnyVal {
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
    def setNodegroup(value: Nodegroup): Self = this.set("nodegroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodegroup: Self = this.set("nodegroup", js.undefined)
  }
  
}

