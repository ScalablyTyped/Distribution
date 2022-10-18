package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOrganizationResponse extends StObject {
  
  /**
    * The organization ID.
    */
  var OrganizationId: js.UndefOr[typings.awsSdk.clientsWorkmailMod.OrganizationId] = js.undefined
}
object CreateOrganizationResponse {
  
  inline def apply(): CreateOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOrganizationResponse]
  }
  
  extension [Self <: CreateOrganizationResponse](x: Self) {
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationIdUndefined: Self = StObject.set(x, "OrganizationId", js.undefined)
  }
}
