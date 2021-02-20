package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOrganizationResponse extends StObject {
  
  /**
    * A structure that contains details about the newly created organization.
    */
  var Organization: js.UndefOr[typings.awsSdk.organizationsMod.Organization] = js.native
}
object CreateOrganizationResponse {
  
  @scala.inline
  def apply(): CreateOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOrganizationResponse]
  }
  
  @scala.inline
  implicit class CreateOrganizationResponseMutableBuilder[Self <: CreateOrganizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrganization(value: Organization): Self = StObject.set(x, "Organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationUndefined: Self = StObject.set(x, "Organization", js.undefined)
  }
}
