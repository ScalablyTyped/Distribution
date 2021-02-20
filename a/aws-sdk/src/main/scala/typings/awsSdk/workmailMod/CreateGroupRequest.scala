package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGroupRequest extends StObject {
  
  /**
    * The name of the group.
    */
  var Name: GroupName = js.native
  
  /**
    * The organization under which the group is to be created.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
}
object CreateGroupRequest {
  
  @scala.inline
  def apply(Name: GroupName, OrganizationId: OrganizationId): CreateGroupRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupRequest]
  }
  
  @scala.inline
  implicit class CreateGroupRequestMutableBuilder[Self <: CreateGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: GroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
