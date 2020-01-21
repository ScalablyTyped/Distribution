package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobFlowInstancesConfig extends js.Object {
  /**
    * A list of additional Amazon EC2 security group IDs for the master node.
    */
  var AdditionalMasterSecurityGroups: js.UndefOr[SecurityGroupsList] = js.native
  /**
    * A list of additional Amazon EC2 security group IDs for the core and task nodes.
    */
  var AdditionalSlaveSecurityGroups: js.UndefOr[SecurityGroupsList] = js.native
  /**
    * The name of the EC2 key pair that can be used to ssh to the master node as the user called "hadoop."
    */
  var Ec2KeyName: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * Applies to clusters that use the uniform instance group configuration. To launch the cluster in Amazon Virtual Private Cloud (Amazon VPC), set this parameter to the identifier of the Amazon VPC subnet where you want the cluster to launch. If you do not specify this value and your account supports EC2-Classic, the cluster launches in EC2-Classic.
    */
  var Ec2SubnetId: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * Applies to clusters that use the instance fleet configuration. When multiple EC2 subnet IDs are specified, Amazon EMR evaluates them and launches instances in the optimal subnet.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. 
    */
  var Ec2SubnetIds: js.UndefOr[XmlStringMaxLen256List] = js.native
  /**
    * The identifier of the Amazon EC2 security group for the master node.
    */
  var EmrManagedMasterSecurityGroup: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The identifier of the Amazon EC2 security group for the core and task nodes.
    */
  var EmrManagedSlaveSecurityGroup: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * Applies only to Amazon EMR release versions earlier than 4.0. The Hadoop version for the cluster. Valid inputs are "0.18" (deprecated), "0.20" (deprecated), "0.20.205" (deprecated), "1.0.3", "2.2.0", or "2.4.0". If you do not set this value, the default of 0.18 is used, unless the AmiVersion parameter is set in the RunJobFlow call, in which case the default version of Hadoop for that AMI version is used.
    */
  var HadoopVersion: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The number of EC2 instances in the cluster.
    */
  var InstanceCount: js.UndefOr[Integer] = js.native
  /**
    *  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.  Describes the EC2 instances and instance configurations for clusters that use the instance fleet configuration.
    */
  var InstanceFleets: js.UndefOr[InstanceFleetConfigList] = js.native
  /**
    * Configuration for the instance groups in a cluster.
    */
  var InstanceGroups: js.UndefOr[InstanceGroupConfigList] = js.native
  /**
    * Specifies whether the cluster should remain available after completing all steps.
    */
  var KeepJobFlowAliveWhenNoSteps: js.UndefOr[Boolean] = js.native
  /**
    * The EC2 instance type of the master node.
    */
  var MasterInstanceType: js.UndefOr[InstanceType] = js.native
  /**
    * The Availability Zone in which the cluster runs.
    */
  var Placement: js.UndefOr[PlacementType] = js.native
  /**
    * The identifier of the Amazon EC2 security group for the Amazon EMR service to access clusters in VPC private subnets.
    */
  var ServiceAccessSecurityGroup: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The EC2 instance type of the core and task nodes.
    */
  var SlaveInstanceType: js.UndefOr[InstanceType] = js.native
  /**
    * Specifies whether to lock the cluster to prevent the Amazon EC2 instances from being terminated by API call, user intervention, or in the event of a job-flow error.
    */
  var TerminationProtected: js.UndefOr[Boolean] = js.native
}

object JobFlowInstancesConfig {
  @scala.inline
  def apply(
    AdditionalMasterSecurityGroups: SecurityGroupsList = null,
    AdditionalSlaveSecurityGroups: SecurityGroupsList = null,
    Ec2KeyName: XmlStringMaxLen256 = null,
    Ec2SubnetId: XmlStringMaxLen256 = null,
    Ec2SubnetIds: XmlStringMaxLen256List = null,
    EmrManagedMasterSecurityGroup: XmlStringMaxLen256 = null,
    EmrManagedSlaveSecurityGroup: XmlStringMaxLen256 = null,
    HadoopVersion: XmlStringMaxLen256 = null,
    InstanceCount: Int | Double = null,
    InstanceFleets: InstanceFleetConfigList = null,
    InstanceGroups: InstanceGroupConfigList = null,
    KeepJobFlowAliveWhenNoSteps: js.UndefOr[scala.Boolean] = js.undefined,
    MasterInstanceType: InstanceType = null,
    Placement: PlacementType = null,
    ServiceAccessSecurityGroup: XmlStringMaxLen256 = null,
    SlaveInstanceType: InstanceType = null,
    TerminationProtected: js.UndefOr[scala.Boolean] = js.undefined
  ): JobFlowInstancesConfig = {
    val __obj = js.Dynamic.literal()
    if (AdditionalMasterSecurityGroups != null) __obj.updateDynamic("AdditionalMasterSecurityGroups")(AdditionalMasterSecurityGroups.asInstanceOf[js.Any])
    if (AdditionalSlaveSecurityGroups != null) __obj.updateDynamic("AdditionalSlaveSecurityGroups")(AdditionalSlaveSecurityGroups.asInstanceOf[js.Any])
    if (Ec2KeyName != null) __obj.updateDynamic("Ec2KeyName")(Ec2KeyName.asInstanceOf[js.Any])
    if (Ec2SubnetId != null) __obj.updateDynamic("Ec2SubnetId")(Ec2SubnetId.asInstanceOf[js.Any])
    if (Ec2SubnetIds != null) __obj.updateDynamic("Ec2SubnetIds")(Ec2SubnetIds.asInstanceOf[js.Any])
    if (EmrManagedMasterSecurityGroup != null) __obj.updateDynamic("EmrManagedMasterSecurityGroup")(EmrManagedMasterSecurityGroup.asInstanceOf[js.Any])
    if (EmrManagedSlaveSecurityGroup != null) __obj.updateDynamic("EmrManagedSlaveSecurityGroup")(EmrManagedSlaveSecurityGroup.asInstanceOf[js.Any])
    if (HadoopVersion != null) __obj.updateDynamic("HadoopVersion")(HadoopVersion.asInstanceOf[js.Any])
    if (InstanceCount != null) __obj.updateDynamic("InstanceCount")(InstanceCount.asInstanceOf[js.Any])
    if (InstanceFleets != null) __obj.updateDynamic("InstanceFleets")(InstanceFleets.asInstanceOf[js.Any])
    if (InstanceGroups != null) __obj.updateDynamic("InstanceGroups")(InstanceGroups.asInstanceOf[js.Any])
    if (!js.isUndefined(KeepJobFlowAliveWhenNoSteps)) __obj.updateDynamic("KeepJobFlowAliveWhenNoSteps")(KeepJobFlowAliveWhenNoSteps.asInstanceOf[js.Any])
    if (MasterInstanceType != null) __obj.updateDynamic("MasterInstanceType")(MasterInstanceType.asInstanceOf[js.Any])
    if (Placement != null) __obj.updateDynamic("Placement")(Placement.asInstanceOf[js.Any])
    if (ServiceAccessSecurityGroup != null) __obj.updateDynamic("ServiceAccessSecurityGroup")(ServiceAccessSecurityGroup.asInstanceOf[js.Any])
    if (SlaveInstanceType != null) __obj.updateDynamic("SlaveInstanceType")(SlaveInstanceType.asInstanceOf[js.Any])
    if (!js.isUndefined(TerminationProtected)) __obj.updateDynamic("TerminationProtected")(TerminationProtected.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobFlowInstancesConfig]
  }
}

