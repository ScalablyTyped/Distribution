package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOrganizationResponse extends StObject {
  
  /**
    * The organization ID.
    */
  var OrganizationId: js.UndefOr[typings.awsSdk.workmailMod.OrganizationId] = js.undefined
  
  /**
    * The state of the organization.
    */
  var State: js.UndefOr[String] = js.undefined
}
object DeleteOrganizationResponse {
  
  @scala.inline
  def apply(): DeleteOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteOrganizationResponse]
  }
  
  @scala.inline
  implicit class DeleteOrganizationResponseMutableBuilder[Self <: DeleteOrganizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationIdUndefined: Self = StObject.set(x, "OrganizationId", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
