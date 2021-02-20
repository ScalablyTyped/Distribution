package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOrganizationalUnitResponse extends StObject {
  
  /**
    * A structure that contains details about the newly created OU.
    */
  var OrganizationalUnit: js.UndefOr[typings.awsSdk.organizationsMod.OrganizationalUnit] = js.native
}
object CreateOrganizationalUnitResponse {
  
  @scala.inline
  def apply(): CreateOrganizationalUnitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOrganizationalUnitResponse]
  }
  
  @scala.inline
  implicit class CreateOrganizationalUnitResponseMutableBuilder[Self <: CreateOrganizationalUnitResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrganizationalUnit(value: OrganizationalUnit): Self = StObject.set(x, "OrganizationalUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationalUnitUndefined: Self = StObject.set(x, "OrganizationalUnit", js.undefined)
  }
}
