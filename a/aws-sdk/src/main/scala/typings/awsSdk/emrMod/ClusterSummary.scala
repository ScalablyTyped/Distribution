package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterSummary extends js.Object {
  /**
    * The Amazon Resource Name of the cluster.
    */
  var ClusterArn: js.UndefOr[ArnType] = js.native
  /**
    * The unique identifier for the cluster.
    */
  var Id: js.UndefOr[ClusterId] = js.native
  /**
    * The name of the cluster.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * An approximation of the cost of the cluster, represented in m1.small/hours. This value is incremented one time for every hour an m1.small instance runs. Larger instances are weighted more, so an EC2 instance that is roughly four times more expensive would result in the normalized instance hours being incremented by four. This result is only an approximation and does not reflect the actual billing rate.
    */
  var NormalizedInstanceHours: js.UndefOr[Integer] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the Outpost where the cluster is launched. 
    */
  var OutpostArn: js.UndefOr[OptionalArnType] = js.native
  /**
    * The details about the current status of the cluster.
    */
  var Status: js.UndefOr[ClusterStatus] = js.native
}

object ClusterSummary {
  @scala.inline
  def apply(): ClusterSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSummary]
  }
  @scala.inline
  implicit class ClusterSummaryOps[Self <: ClusterSummary] (val x: Self) extends AnyVal {
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
    def setId(value: ClusterId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setNormalizedInstanceHours(value: Integer): Self = this.set("NormalizedInstanceHours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalizedInstanceHours: Self = this.set("NormalizedInstanceHours", js.undefined)
    @scala.inline
    def setOutpostArn(value: OptionalArnType): Self = this.set("OutpostArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutpostArn: Self = this.set("OutpostArn", js.undefined)
    @scala.inline
    def setStatus(value: ClusterStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

