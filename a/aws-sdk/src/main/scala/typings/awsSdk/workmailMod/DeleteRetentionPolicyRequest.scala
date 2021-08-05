package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRetentionPolicyRequest extends StObject {
  
  /**
    * The retention policy ID.
    */
  var Id: ShortString
  
  /**
    * The organization ID.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId
}
object DeleteRetentionPolicyRequest {
  
  inline def apply(Id: ShortString, OrganizationId: OrganizationId): DeleteRetentionPolicyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRetentionPolicyRequest]
  }
  
  extension [Self <: DeleteRetentionPolicyRequest](x: Self) {
    
    inline def setId(value: ShortString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
