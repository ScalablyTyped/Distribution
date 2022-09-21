package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSiteAddressInput extends StObject {
  
  /**
    *  The type of the address you request. 
    */
  var AddressType: typings.awsSdk.outpostsMod.AddressType
  
  /**
    *  The ID or the Amazon Resource Name (ARN) of the site.   In requests, Amazon Web Services Outposts accepts the Amazon Resource Name (ARN) or an ID for Outposts and sites throughout the Outposts Query API. To address backwards compatibility, the parameter names OutpostID or SiteID remain in use. Despite the parameter name, you can make the request with an ARN. 
    */
  var SiteId: typings.awsSdk.outpostsMod.SiteId
}
object GetSiteAddressInput {
  
  inline def apply(AddressType: AddressType, SiteId: SiteId): GetSiteAddressInput = {
    val __obj = js.Dynamic.literal(AddressType = AddressType.asInstanceOf[js.Any], SiteId = SiteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSiteAddressInput]
  }
  
  extension [Self <: GetSiteAddressInput](x: Self) {
    
    inline def setAddressType(value: AddressType): Self = StObject.set(x, "AddressType", value.asInstanceOf[js.Any])
    
    inline def setSiteId(value: SiteId): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
  }
}
