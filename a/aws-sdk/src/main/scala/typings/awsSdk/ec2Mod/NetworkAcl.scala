package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkAcl extends js.Object {
  
  /**
    * Any associations between the network ACL and one or more subnets
    */
  var Associations: js.UndefOr[NetworkAclAssociationList] = js.native
  
  /**
    * One or more entries (rules) in the network ACL.
    */
  var Entries: js.UndefOr[NetworkAclEntryList] = js.native
  
  /**
    * Indicates whether this is the default network ACL for the VPC.
    */
  var IsDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the network ACL.
    */
  var NetworkAclId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the AWS account that owns the network ACL.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * Any tags assigned to the network ACL.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The ID of the VPC for the network ACL.
    */
  var VpcId: js.UndefOr[String] = js.native
}
object NetworkAcl {
  
  @scala.inline
  def apply(): NetworkAcl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkAcl]
  }
  
  @scala.inline
  implicit class NetworkAclOps[Self <: NetworkAcl] (val x: Self) extends AnyVal {
    
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
    def setAssociationsVarargs(value: NetworkAclAssociation*): Self = this.set("Associations", js.Array(value :_*))
    
    @scala.inline
    def setAssociations(value: NetworkAclAssociationList): Self = this.set("Associations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociations: Self = this.set("Associations", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: NetworkAclEntry*): Self = this.set("Entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: NetworkAclEntryList): Self = this.set("Entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntries: Self = this.set("Entries", js.undefined)
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("IsDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDefault: Self = this.set("IsDefault", js.undefined)
    
    @scala.inline
    def setNetworkAclId(value: String): Self = this.set("NetworkAclId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkAclId: Self = this.set("NetworkAclId", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
}
