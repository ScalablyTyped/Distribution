package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReplicaAction extends js.Object {
  /**
    * The Region of the replica to be removed.
    */
  var RegionName: typings.awsSdk.documentClientMod.DocumentClient.RegionName = js.native
}

object DeleteReplicaAction {
  @scala.inline
  def apply(RegionName: RegionName): DeleteReplicaAction = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicaAction]
  }
  @scala.inline
  implicit class DeleteReplicaActionOps[Self <: DeleteReplicaAction] (val x: Self) extends AnyVal {
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
    def setRegionName(value: RegionName): Self = this.set("RegionName", value.asInstanceOf[js.Any])
  }
  
}

