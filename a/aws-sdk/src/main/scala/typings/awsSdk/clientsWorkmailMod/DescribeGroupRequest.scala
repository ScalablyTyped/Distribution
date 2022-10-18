package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGroupRequest extends StObject {
  
  /**
    * The identifier for the group to be described.
    */
  var GroupId: WorkMailIdentifier
  
  /**
    * The identifier for the organization under which the group exists.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
}
object DescribeGroupRequest {
  
  inline def apply(GroupId: WorkMailIdentifier, OrganizationId: OrganizationId): DescribeGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGroupRequest]
  }
  
  extension [Self <: DescribeGroupRequest](x: Self) {
    
    inline def setGroupId(value: WorkMailIdentifier): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
