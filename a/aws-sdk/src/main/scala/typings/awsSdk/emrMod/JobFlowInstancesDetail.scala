package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobFlowInstancesDetail extends js.Object {
  /**
    * The name of an Amazon EC2 key pair that can be used to ssh to the master node.
    */
  var Ec2KeyName: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * For clusters launched within Amazon Virtual Private Cloud, this is the identifier of the subnet where the cluster was launched.
    */
  var Ec2SubnetId: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The Hadoop version for the cluster.
    */
  var HadoopVersion: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The number of Amazon EC2 instances in the cluster. If the value is 1, the same instance serves as both the master and core and task node. If the value is greater than 1, one instance is the master node and all others are core and task nodes.
    */
  var InstanceCount: Integer = js.native
  /**
    * Details about the instance groups in a cluster.
    */
  var InstanceGroups: js.UndefOr[InstanceGroupDetailList] = js.native
  /**
    * Specifies whether the cluster should remain available after completing all steps.
    */
  var KeepJobFlowAliveWhenNoSteps: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon EC2 instance identifier of the master node.
    */
  var MasterInstanceId: js.UndefOr[XmlString] = js.native
  /**
    * The Amazon EC2 master node instance type.
    */
  var MasterInstanceType: InstanceType = js.native
  /**
    * The DNS name of the master node. If the cluster is on a private subnet, this is the private DNS name. On a public subnet, this is the public DNS name.
    */
  var MasterPublicDnsName: js.UndefOr[XmlString] = js.native
  /**
    * An approximation of the cost of the cluster, represented in m1.small/hours. This value is incremented one time for every hour that an m1.small runs. Larger instances are weighted more, so an Amazon EC2 instance that is roughly four times more expensive would result in the normalized instance hours being incremented by four. This result is only an approximation and does not reflect the actual billing rate.
    */
  var NormalizedInstanceHours: js.UndefOr[Integer] = js.native
  /**
    * The Amazon EC2 Availability Zone for the cluster.
    */
  var Placement: js.UndefOr[PlacementType] = js.native
  /**
    * The Amazon EC2 core and task node instance type.
    */
  var SlaveInstanceType: InstanceType = js.native
  /**
    * Specifies whether the Amazon EC2 instances in the cluster are protected from termination by API calls, user intervention, or in the event of a job-flow error.
    */
  var TerminationProtected: js.UndefOr[Boolean] = js.native
}

object JobFlowInstancesDetail {
  @scala.inline
  def apply(InstanceCount: Integer, MasterInstanceType: InstanceType, SlaveInstanceType: InstanceType): JobFlowInstancesDetail = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount.asInstanceOf[js.Any], MasterInstanceType = MasterInstanceType.asInstanceOf[js.Any], SlaveInstanceType = SlaveInstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobFlowInstancesDetail]
  }
  @scala.inline
  implicit class JobFlowInstancesDetailOps[Self <: JobFlowInstancesDetail] (val x: Self) extends AnyVal {
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
    def setInstanceCount(value: Integer): Self = this.set("InstanceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setMasterInstanceType(value: InstanceType): Self = this.set("MasterInstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlaveInstanceType(value: InstanceType): Self = this.set("SlaveInstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setEc2KeyName(value: XmlStringMaxLen256): Self = this.set("Ec2KeyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEc2KeyName: Self = this.set("Ec2KeyName", js.undefined)
    @scala.inline
    def setEc2SubnetId(value: XmlStringMaxLen256): Self = this.set("Ec2SubnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEc2SubnetId: Self = this.set("Ec2SubnetId", js.undefined)
    @scala.inline
    def setHadoopVersion(value: XmlStringMaxLen256): Self = this.set("HadoopVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHadoopVersion: Self = this.set("HadoopVersion", js.undefined)
    @scala.inline
    def setInstanceGroupsVarargs(value: InstanceGroupDetail*): Self = this.set("InstanceGroups", js.Array(value :_*))
    @scala.inline
    def setInstanceGroups(value: InstanceGroupDetailList): Self = this.set("InstanceGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceGroups: Self = this.set("InstanceGroups", js.undefined)
    @scala.inline
    def setKeepJobFlowAliveWhenNoSteps(value: Boolean): Self = this.set("KeepJobFlowAliveWhenNoSteps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepJobFlowAliveWhenNoSteps: Self = this.set("KeepJobFlowAliveWhenNoSteps", js.undefined)
    @scala.inline
    def setMasterInstanceId(value: XmlString): Self = this.set("MasterInstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterInstanceId: Self = this.set("MasterInstanceId", js.undefined)
    @scala.inline
    def setMasterPublicDnsName(value: XmlString): Self = this.set("MasterPublicDnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterPublicDnsName: Self = this.set("MasterPublicDnsName", js.undefined)
    @scala.inline
    def setNormalizedInstanceHours(value: Integer): Self = this.set("NormalizedInstanceHours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalizedInstanceHours: Self = this.set("NormalizedInstanceHours", js.undefined)
    @scala.inline
    def setPlacement(value: PlacementType): Self = this.set("Placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("Placement", js.undefined)
    @scala.inline
    def setTerminationProtected(value: Boolean): Self = this.set("TerminationProtected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminationProtected: Self = this.set("TerminationProtected", js.undefined)
  }
  
}

