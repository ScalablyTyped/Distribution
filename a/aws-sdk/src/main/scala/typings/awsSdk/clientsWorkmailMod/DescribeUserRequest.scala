package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserRequest extends StObject {
  
  /**
    * The identifier for the organization under which the user exists.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
  
  /**
    * The identifier for the user to be described.
    */
  var UserId: WorkMailIdentifier
}
object DescribeUserRequest {
  
  inline def apply(OrganizationId: OrganizationId, UserId: WorkMailIdentifier): DescribeUserRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserRequest]
  }
  
  extension [Self <: DescribeUserRequest](x: Self) {
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: WorkMailIdentifier): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
