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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeInboundDmarcSettingsRequest] (val x: Self) extends AnyVal {
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
