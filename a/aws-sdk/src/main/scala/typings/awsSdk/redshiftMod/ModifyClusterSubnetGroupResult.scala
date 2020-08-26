package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyClusterSubnetGroupResult extends js.Object {
  var ClusterSubnetGroup: js.UndefOr[typings.awsSdk.redshiftMod.ClusterSubnetGroup] = js.native
}

object ModifyClusterSubnetGroupResult {
  @scala.inline
  def apply(): ModifyClusterSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyClusterSubnetGroupResult]
  }
  @scala.inline
  implicit class ModifyClusterSubnetGroupResultOps[Self <: ModifyClusterSubnetGroupResult] (val x: Self) extends AnyVal {
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
    def setClusterSubnetGroup(value: ClusterSubnetGroup): Self = this.set("ClusterSubnetGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterSubnetGroup: Self = this.set("ClusterSubnetGroup", js.undefined)
  }
  
}

