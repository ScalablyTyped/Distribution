package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): JobFlowInstancesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobFlowInstancesConfig]
  }
  
  @scala.inline
  implicit class JobFlowInstancesConfigOps[Self <: JobFlowInstancesConfig] (val x: Self) extends AnyVal {
    
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
    def setAdditionalMasterSecurityGroupsVarargs(value: XmlStringMaxLen256*): Self = this.set("AdditionalMasterSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalMasterSecurityGroups(value: SecurityGroupsList): Self = this.set("AdditionalMasterSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalMasterSecurityGroups: Self = this.set("AdditionalMasterSecurityGroups", js.undefined)
    
    @scala.inline
    def setAdditionalSlaveSecurityGroupsVarargs(value: XmlStringMaxLen256*): Self = this.set("AdditionalSlaveSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalSlaveSecurityGroups(value: SecurityGroupsList): Self = this.set("AdditionalSlaveSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalSlaveSecurityGroups: Self = this.set("AdditionalSlaveSecurityGroups", js.undefined)
    
    @scala.inline
    def setEc2KeyName(value: XmlStringMaxLen256): Self = this.set("Ec2KeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEc2KeyName: Self = this.set("Ec2KeyName", js.undefined)
    
    @scala.inline
    def setEc2SubnetId(value: XmlStringMaxLen256): Self = this.set("Ec2SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEc2SubnetId: Self = this.set("Ec2SubnetId", js.undefined)
    
    @scala.inline
    def setEc2SubnetIdsVarargs(value: XmlStringMaxLen256*): Self = this.set("Ec2SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setEc2SubnetIds(value: XmlStringMaxLen256List): Self = this.set("Ec2SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEc2SubnetIds: Self = this.set("Ec2SubnetIds", js.undefined)
    
    @scala.inline
    def setEmrManagedMasterSecurityGroup(value: XmlStringMaxLen256): Self = this.set("EmrManagedMasterSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmrManagedMasterSecurityGroup: Self = this.set("EmrManagedMasterSecurityGroup", js.undefined)
    
    @scala.inline
    def setEmrManagedSlaveSecurityGroup(value: XmlStringMaxLen256): Self = this.set("EmrManagedSlaveSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmrManagedSlaveSecurityGroup: Self = this.set("EmrManagedSlaveSecurityGroup", js.undefined)
    
    @scala.inline
    def setHadoopVersion(value: XmlStringMaxLen256): Self = this.set("HadoopVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHadoopVersion: Self = this.set("HadoopVersion", js.undefined)
    
    @scala.inline
    def setInstanceCount(value: Integer): Self = this.set("InstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceCount: Self = this.set("InstanceCount", js.undefined)
    
    @scala.inline
    def setInstanceFleetsVarargs(value: InstanceFleetConfig*): Self = this.set("InstanceFleets", js.Array(value :_*))
    
    @scala.inline
    def setInstanceFleets(value: InstanceFleetConfigList): Self = this.set("InstanceFleets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceFleets: Self = this.set("InstanceFleets", js.undefined)
    
    @scala.inline
    def setInstanceGroupsVarargs(value: InstanceGroupConfig*): Self = this.set("InstanceGroups", js.Array(value :_*))
    
    @scala.inline
    def setInstanceGroups(value: InstanceGroupConfigList): Self = this.set("InstanceGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceGroups: Self = this.set("InstanceGroups", js.undefined)
    
    @scala.inline
    def setKeepJobFlowAliveWhenNoSteps(value: Boolean): Self = this.set("KeepJobFlowAliveWhenNoSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepJobFlowAliveWhenNoSteps: Self = this.set("KeepJobFlowAliveWhenNoSteps", js.undefined)
    
    @scala.inline
    def setMasterInstanceType(value: InstanceType): Self = this.set("MasterInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterInstanceType: Self = this.set("MasterInstanceType", js.undefined)
    
    @scala.inline
    def setPlacement(value: PlacementType): Self = this.set("Placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("Placement", js.undefined)
    
    @scala.inline
    def setServiceAccessSecurityGroup(value: XmlStringMaxLen256): Self = this.set("ServiceAccessSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccessSecurityGroup: Self = this.set("ServiceAccessSecurityGroup", js.undefined)
    
    @scala.inline
    def setSlaveInstanceType(value: InstanceType): Self = this.set("SlaveInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlaveInstanceType: Self = this.set("SlaveInstanceType", js.undefined)
    
    @scala.inline
    def setTerminationProtected(value: Boolean): Self = this.set("TerminationProtected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminationProtected: Self = this.set("TerminationProtected", js.undefined)
  }
}
