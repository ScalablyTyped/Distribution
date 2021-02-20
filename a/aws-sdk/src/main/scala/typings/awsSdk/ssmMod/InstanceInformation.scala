package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceInformation extends StObject {
  
  /**
    * The activation ID created by Systems Manager when the server or VM was registered.
    */
  var ActivationId: js.UndefOr[typings.awsSdk.ssmMod.ActivationId] = js.native
  
  /**
    * The version of SSM Agent running on your Linux instance. 
    */
  var AgentVersion: js.UndefOr[Version] = js.native
  
  /**
    * Information about the association.
    */
  var AssociationOverview: js.UndefOr[InstanceAggregatedAssociationOverview] = js.native
  
  /**
    * The status of the association.
    */
  var AssociationStatus: js.UndefOr[StatusName] = js.native
  
  /**
    * The fully qualified host name of the managed instance.
    */
  var ComputerName: js.UndefOr[typings.awsSdk.ssmMod.ComputerName] = js.native
  
  /**
    * The IP address of the managed instance.
    */
  var IPAddress: js.UndefOr[typings.awsSdk.ssmMod.IPAddress] = js.native
  
  /**
    * The Amazon Identity and Access Management (IAM) role assigned to the on-premises Systems Manager managed instance. This call does not return the IAM role for EC2 instances. To retrieve the IAM role for an EC2 instance, use the Amazon EC2 DescribeInstances action. For information, see DescribeInstances in the Amazon EC2 API Reference or describe-instances in the AWS CLI Command Reference.
    */
  var IamRole: js.UndefOr[typings.awsSdk.ssmMod.IamRole] = js.native
  
  /**
    * The instance ID. 
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ssmMod.InstanceId] = js.native
  
  /**
    * Indicates whether the latest version of SSM Agent is running on your Linux Managed Instance. This field does not indicate whether or not the latest version is installed on Windows managed instances, because some older versions of Windows Server use the EC2Config service to process SSM requests.
    */
  var IsLatestVersion: js.UndefOr[Boolean] = js.native
  
  /**
    * The date the association was last run.
    */
  var LastAssociationExecutionDate: js.UndefOr[DateTime] = js.native
  
  /**
    * The date and time when agent last pinged Systems Manager service. 
    */
  var LastPingDateTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The last date the association was successfully run.
    */
  var LastSuccessfulAssociationExecutionDate: js.UndefOr[DateTime] = js.native
  
  /**
    * The name assigned to an on-premises server or virtual machine (VM) when it is activated as a Systems Manager managed instance. The name is specified as the DefaultInstanceName property using the CreateActivation command. It is applied to the managed instance by specifying the Activation Code and Activation ID when you install SSM Agent on the instance, as explained in Install SSM Agent for a hybrid environment (Linux) and Install SSM Agent for a hybrid environment (Windows). To retrieve the Name tag of an EC2 instance, use the Amazon EC2 DescribeInstances action. For information, see DescribeInstances in the Amazon EC2 API Reference or describe-instances in the AWS CLI Command Reference.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * Connection status of SSM Agent.   The status Inactive has been deprecated and is no longer in use. 
    */
  var PingStatus: js.UndefOr[typings.awsSdk.ssmMod.PingStatus] = js.native
  
  /**
    * The name of the operating system platform running on your instance. 
    */
  var PlatformName: js.UndefOr[String] = js.native
  
  /**
    * The operating system platform type. 
    */
  var PlatformType: js.UndefOr[typings.awsSdk.ssmMod.PlatformType] = js.native
  
  /**
    * The version of the OS platform running on your instance. 
    */
  var PlatformVersion: js.UndefOr[String] = js.native
  
  /**
    * The date the server or VM was registered with AWS as a managed instance.
    */
  var RegistrationDate: js.UndefOr[DateTime] = js.native
  
  /**
    * The type of instance. Instances are either EC2 instances or managed instances. 
    */
  var ResourceType: js.UndefOr[typings.awsSdk.ssmMod.ResourceType] = js.native
}
object InstanceInformation {
  
  @scala.inline
  def apply(): InstanceInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceInformation]
  }
  
  @scala.inline
  implicit class InstanceInformationMutableBuilder[Self <: InstanceInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivationId(value: ActivationId): Self = StObject.set(x, "ActivationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivationIdUndefined: Self = StObject.set(x, "ActivationId", js.undefined)
    
    @scala.inline
    def setAgentVersion(value: Version): Self = StObject.set(x, "AgentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentVersionUndefined: Self = StObject.set(x, "AgentVersion", js.undefined)
    
    @scala.inline
    def setAssociationOverview(value: InstanceAggregatedAssociationOverview): Self = StObject.set(x, "AssociationOverview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationOverviewUndefined: Self = StObject.set(x, "AssociationOverview", js.undefined)
    
    @scala.inline
    def setAssociationStatus(value: StatusName): Self = StObject.set(x, "AssociationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationStatusUndefined: Self = StObject.set(x, "AssociationStatus", js.undefined)
    
    @scala.inline
    def setComputerName(value: ComputerName): Self = StObject.set(x, "ComputerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputerNameUndefined: Self = StObject.set(x, "ComputerName", js.undefined)
    
    @scala.inline
    def setIPAddress(value: IPAddress): Self = StObject.set(x, "IPAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPAddressUndefined: Self = StObject.set(x, "IPAddress", js.undefined)
    
    @scala.inline
    def setIamRole(value: IamRole): Self = StObject.set(x, "IamRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamRoleUndefined: Self = StObject.set(x, "IamRole", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setIsLatestVersion(value: Boolean): Self = StObject.set(x, "IsLatestVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLatestVersionUndefined: Self = StObject.set(x, "IsLatestVersion", js.undefined)
    
    @scala.inline
    def setLastAssociationExecutionDate(value: DateTime): Self = StObject.set(x, "LastAssociationExecutionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAssociationExecutionDateUndefined: Self = StObject.set(x, "LastAssociationExecutionDate", js.undefined)
    
    @scala.inline
    def setLastPingDateTime(value: DateTime): Self = StObject.set(x, "LastPingDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastPingDateTimeUndefined: Self = StObject.set(x, "LastPingDateTime", js.undefined)
    
    @scala.inline
    def setLastSuccessfulAssociationExecutionDate(value: DateTime): Self = StObject.set(x, "LastSuccessfulAssociationExecutionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSuccessfulAssociationExecutionDateUndefined: Self = StObject.set(x, "LastSuccessfulAssociationExecutionDate", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setPingStatus(value: PingStatus): Self = StObject.set(x, "PingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPingStatusUndefined: Self = StObject.set(x, "PingStatus", js.undefined)
    
    @scala.inline
    def setPlatformName(value: String): Self = StObject.set(x, "PlatformName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformNameUndefined: Self = StObject.set(x, "PlatformName", js.undefined)
    
    @scala.inline
    def setPlatformType(value: PlatformType): Self = StObject.set(x, "PlatformType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformTypeUndefined: Self = StObject.set(x, "PlatformType", js.undefined)
    
    @scala.inline
    def setPlatformVersion(value: String): Self = StObject.set(x, "PlatformVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformVersionUndefined: Self = StObject.set(x, "PlatformVersion", js.undefined)
    
    @scala.inline
    def setRegistrationDate(value: DateTime): Self = StObject.set(x, "RegistrationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationDateUndefined: Self = StObject.set(x, "RegistrationDate", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
