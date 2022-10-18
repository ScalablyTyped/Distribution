package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInboundDmarcSettingsRequest extends StObject {
  
  /**
    * Lists the ID of the given organization.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
}
object DescribeInboundDmarcSettingsRequest {
  
  inline def apply(OrganizationId: OrganizationId): DescribeInboundDmarcSettingsRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInboundDmarcSettingsRequest]
  }
  
  extension [Self <: DescribeInboundDmarcSettingsRequest](x: Self) {
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
