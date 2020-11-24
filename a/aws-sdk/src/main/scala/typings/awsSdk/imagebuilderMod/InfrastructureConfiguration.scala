package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfrastructureConfiguration extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the infrastructure configuration.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.native
  
  /**
    * The date on which the infrastructure configuration was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.native
  
  /**
    * The date on which the infrastructure configuration was last updated.
    */
  var dateUpdated: js.UndefOr[DateTime] = js.native
  
  /**
    * The description of the infrastructure configuration.
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The instance profile of the infrastructure configuration.
    */
  var instanceProfileName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The instance types of the infrastructure configuration.
    */
  var instanceTypes: js.UndefOr[InstanceTypeList] = js.native
  
  /**
    * The EC2 key pair of the infrastructure configuration.
    */
  var keyPair: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The logging configuration of the infrastructure configuration.
    */
  var logging: js.UndefOr[Logging] = js.native
  
  /**
    * The name of the infrastructure configuration.
    */
  var name: js.UndefOr[ResourceName] = js.native
  
  /**
    * The tags attached to the resource created by Image Builder.
    */
  var resourceTags: js.UndefOr[ResourceTagMap] = js.native
  
  /**
    * The security group IDs of the infrastructure configuration.
    */
  var securityGroupIds: js.UndefOr[SecurityGroupIds] = js.native
  
  /**
    * The SNS topic Amazon Resource Name (ARN) of the infrastructure configuration.
    */
  var snsTopicArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The subnet ID of the infrastructure configuration.
    */
  var subnetId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The tags of the infrastructure configuration.
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The terminate instance on failure configuration of the infrastructure configuration.
    */
  var terminateInstanceOnFailure: js.UndefOr[NullableBoolean] = js.native
}
object InfrastructureConfiguration {
  
  @scala.inline
  def apply(): InfrastructureConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfrastructureConfiguration]
  }
  
  @scala.inline
  implicit class InfrastructureConfigurationOps[Self <: InfrastructureConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: ImageBuilderArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setDateCreated(value: DateTime): Self = this.set("dateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateCreated: Self = this.set("dateCreated", js.undefined)
    
    @scala.inline
    def setDateUpdated(value: DateTime): Self = this.set("dateUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateUpdated: Self = this.set("dateUpdated", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setInstanceProfileName(value: NonEmptyString): Self = this.set("instanceProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceProfileName: Self = this.set("instanceProfileName", js.undefined)
    
    @scala.inline
    def setInstanceTypesVarargs(value: InstanceType*): Self = this.set("instanceTypes", js.Array(value :_*))
    
    @scala.inline
    def setInstanceTypes(value: InstanceTypeList): Self = this.set("instanceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceTypes: Self = this.set("instanceTypes", js.undefined)
    
    @scala.inline
    def setKeyPair(value: NonEmptyString): Self = this.set("keyPair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPair: Self = this.set("keyPair", js.undefined)
    
    @scala.inline
    def setLogging(value: Logging): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setResourceTags(value: ResourceTagMap): Self = this.set("resourceTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceTags: Self = this.set("resourceTags", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: NonEmptyString*): Self = this.set("securityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIds): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("securityGroupIds", js.undefined)
    
    @scala.inline
    def setSnsTopicArn(value: NonEmptyString): Self = this.set("snsTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnsTopicArn: Self = this.set("snsTopicArn", js.undefined)
    
    @scala.inline
    def setSubnetId(value: NonEmptyString): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetId: Self = this.set("subnetId", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTerminateInstanceOnFailure(value: NullableBoolean): Self = this.set("terminateInstanceOnFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminateInstanceOnFailure: Self = this.set("terminateInstanceOnFailure", js.undefined)
  }
}
