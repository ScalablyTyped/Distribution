package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheSecurityGroup extends js.Object {
  
  /**
    * The ARN of the cache security group,
    */
  var ARN: js.UndefOr[String] = js.native
  
  /**
    * The name of the cache security group.
    */
  var CacheSecurityGroupName: js.UndefOr[String] = js.native
  
  /**
    * The description of the cache security group.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * A list of Amazon EC2 security groups that are associated with this cache security group.
    */
  var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.native
  
  /**
    * The AWS account ID of the cache security group owner.
    */
  var OwnerId: js.UndefOr[String] = js.native
}
object CacheSecurityGroup {
  
  @scala.inline
  def apply(): CacheSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheSecurityGroup]
  }
  
  @scala.inline
  implicit class CacheSecurityGroupOps[Self <: CacheSecurityGroup] (val x: Self) extends AnyVal {
    
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
    def setARN(value: String): Self = this.set("ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteARN: Self = this.set("ARN", js.undefined)
    
    @scala.inline
    def setCacheSecurityGroupName(value: String): Self = this.set("CacheSecurityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheSecurityGroupName: Self = this.set("CacheSecurityGroupName", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setEC2SecurityGroupsVarargs(value: EC2SecurityGroup*): Self = this.set("EC2SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setEC2SecurityGroups(value: EC2SecurityGroupList): Self = this.set("EC2SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEC2SecurityGroups: Self = this.set("EC2SecurityGroups", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
  }
}
