package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateResourceRequest extends StObject {
  
  /**
    * The resource's booking options to be updated.
    */
  var BookingOptions: js.UndefOr[typings.awsSdk.workmailMod.BookingOptions] = js.native
  
  /**
    * The name of the resource to be updated.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  
  /**
    * The identifier associated with the organization for which the resource is updated.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
  
  /**
    * The identifier of the resource to be updated.
    */
  var ResourceId: typings.awsSdk.workmailMod.ResourceId = js.native
}
object UpdateResourceRequest {
  
  @scala.inline
  def apply(OrganizationId: OrganizationId, ResourceId: ResourceId): UpdateResourceRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResourceRequest]
  }
  
  @scala.inline
  implicit class UpdateResourceRequestMutableBuilder[Self <: UpdateResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBookingOptions(value: BookingOptions): Self = StObject.set(x, "BookingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookingOptionsUndefined: Self = StObject.set(x, "BookingOptions", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
