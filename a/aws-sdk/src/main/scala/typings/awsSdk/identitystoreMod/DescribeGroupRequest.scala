package typings.awsSdk.identitystoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGroupRequest extends js.Object {
  
  /**
    * The identifier for a group in the identity store.
    */
  var GroupId: ResourceId = js.native
  
  /**
    * The globally unique identifier for the identity store, such as d-1234567890. In this example, d- is a fixed prefix, and 1234567890 is a randomly generated string which contains number and lower case letters. This value is generated at the time that a new identity store is created.
    */
  var IdentityStoreId: typings.awsSdk.identitystoreMod.IdentityStoreId = js.native
}
object DescribeGroupRequest {
  
  @scala.inline
  def apply(GroupId: ResourceId, IdentityStoreId: IdentityStoreId): DescribeGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], IdentityStoreId = IdentityStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGroupRequest]
  }
  
  @scala.inline
  implicit class DescribeGroupRequestOps[Self <: DescribeGroupRequest] (val x: Self) extends AnyVal {
    
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
    def setGroupId(value: ResourceId): Self = this.set("GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityStoreId(value: IdentityStoreId): Self = this.set("IdentityStoreId", value.asInstanceOf[js.Any])
  }
}
