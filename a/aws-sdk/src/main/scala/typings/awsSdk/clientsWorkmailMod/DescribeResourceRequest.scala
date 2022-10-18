package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeResourceRequest extends StObject {
  
  /**
    * The identifier associated with the organization for which the resource is described.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
  
  /**
    * The identifier of the resource to be described.
    */
  var ResourceId: typings.awsSdk.clientsWorkmailMod.ResourceId
}
object DescribeResourceRequest {
  
  inline def apply(OrganizationId: OrganizationId, ResourceId: ResourceId): DescribeResourceRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResourceRequest]
  }
  
  extension [Self <: DescribeResourceRequest](x: Self) {
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
