package typings.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateEnvironmentEC2Request extends js.Object {
  
  /**
    * The number of minutes until the running instance is shut down after the environment has last been used.
    */
  var automaticStopTimeMinutes: js.UndefOr[AutomaticStopTimeMinutes] = js.native
  
  /**
    * A unique, case-sensitive string that helps AWS Cloud9 to ensure this operation completes no more than one time. For more information, see Client Tokens in the Amazon EC2 API Reference.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  
  /**
    * The connection type used for connecting to an Amazon EC2 environment.
    */
  var connectionType: js.UndefOr[ConnectionType] = js.native
  
  /**
    * The description of the environment to create.
    */
  var description: js.UndefOr[EnvironmentDescription] = js.native
  
  /**
    * The type of instance to connect to the environment (for example, t2.micro).
    */
  var instanceType: InstanceType = js.native
  
  /**
    * The name of the environment to create. This name is visible to other AWS IAM users in the same AWS account.
    */
  var name: EnvironmentName = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the environment owner. This ARN can be the ARN of any AWS IAM principal. If this value is not specified, the ARN defaults to this environment's creator.
    */
  var ownerArn: js.UndefOr[UserArn] = js.native
  
  /**
    * The ID of the subnet in Amazon VPC that AWS Cloud9 will use to communicate with the Amazon EC2 instance.
    */
  var subnetId: js.UndefOr[SubnetId] = js.native
  
  /**
    * An array of key-value pairs that will be associated with the new AWS Cloud9 development environment.
    */
  var tags: js.UndefOr[TagList] = js.native
}
object CreateEnvironmentEC2Request {
  
  @scala.inline
  def apply(instanceType: InstanceType, name: EnvironmentName): CreateEnvironmentEC2Request = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentEC2Request]
  }
  
  @scala.inline
  implicit class CreateEnvironmentEC2RequestOps[Self <: CreateEnvironmentEC2Request] (val x: Self) extends AnyVal {
    
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
    def setInstanceType(value: InstanceType): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: EnvironmentName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticStopTimeMinutes(value: AutomaticStopTimeMinutes): Self = this.set("automaticStopTimeMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticStopTimeMinutes: Self = this.set("automaticStopTimeMinutes", js.undefined)
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestToken: Self = this.set("clientRequestToken", js.undefined)
    
    @scala.inline
    def setConnectionType(value: ConnectionType): Self = this.set("connectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionType: Self = this.set("connectionType", js.undefined)
    
    @scala.inline
    def setDescription(value: EnvironmentDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setOwnerArn(value: UserArn): Self = this.set("ownerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerArn: Self = this.set("ownerArn", js.undefined)
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetId: Self = this.set("subnetId", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
