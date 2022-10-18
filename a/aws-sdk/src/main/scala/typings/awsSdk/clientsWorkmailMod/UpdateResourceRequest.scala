package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResourceRequest extends StObject {
  
  /**
    * The resource's booking options to be updated.
    */
  var BookingOptions: js.UndefOr[typings.awsSdk.clientsWorkmailMod.BookingOptions] = js.undefined
  
  /**
    * The name of the resource to be updated.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The identifier associated with the organization for which the resource is updated.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
  
  /**
    * The identifier of the resource to be updated.
    */
  var ResourceId: typings.awsSdk.clientsWorkmailMod.ResourceId
}
object UpdateResourceRequest {
  
  inline def apply(OrganizationId: OrganizationId, ResourceId: ResourceId): UpdateResourceRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResourceRequest]
  }
  
  extension [Self <: UpdateResourceRequest](x: Self) {
    
    inline def setBookingOptions(value: BookingOptions): Self = StObject.set(x, "BookingOptions", value.asInstanceOf[js.Any])
    
    inline def setBookingOptionsUndefined: Self = StObject.set(x, "BookingOptions", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
