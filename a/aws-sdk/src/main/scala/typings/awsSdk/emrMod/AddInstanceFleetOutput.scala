package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddInstanceFleetOutput extends js.Object {
  /**
    * The Amazon Resource Name of the cluster.
    */
  var ClusterArn: js.UndefOr[ArnType] = js.native
  /**
    * The unique identifier of the cluster.
    */
  var ClusterId: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The unique identifier of the instance fleet.
    */
  var InstanceFleetId: js.UndefOr[typings.awsSdk.emrMod.InstanceFleetId] = js.native
}

object AddInstanceFleetOutput {
  @scala.inline
  def apply(): AddInstanceFleetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddInstanceFleetOutput]
  }
  @scala.inline
  implicit class AddInstanceFleetOutputOps[Self <: AddInstanceFleetOutput] (val x: Self) extends AnyVal {
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
    def setClusterArn(value: ArnType): Self = this.set("ClusterArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterArn: Self = this.set("ClusterArn", js.undefined)
    @scala.inline
    def setClusterId(value: XmlStringMaxLen256): Self = this.set("ClusterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterId: Self = this.set("ClusterId", js.undefined)
    @scala.inline
    def setInstanceFleetId(value: InstanceFleetId): Self = this.set("InstanceFleetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceFleetId: Self = this.set("InstanceFleetId", js.undefined)
  }
  
}

