package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSiteAddressInput extends StObject {
  
  /**
    *  The address for the site. 
    */
  var Address: typings.awsSdk.outpostsMod.Address
  
  /**
    *  The type of the address. 
    */
  var AddressType: typings.awsSdk.outpostsMod.AddressType
  
  /**
    *  The ID or the Amazon Resource Name (ARN) of the site.   In requests, Amazon Web Services Outposts accepts the Amazon Resource Name (ARN) or an ID for Outposts and sites throughout the Outposts Query API. To address backwards compatibility, the parameter names OutpostID or SiteID remain in use. Despite the parameter name, you can make the request with an ARN. 
    */
  var SiteId: typings.awsSdk.outpostsMod.SiteId
}
object UpdateSiteAddressInput {
  
  inline def apply(Address: Address, AddressType: AddressType, SiteId: SiteId): UpdateSiteAddressInput = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], AddressType = AddressType.asInstanceOf[js.Any], SiteId = SiteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSiteAddressInput]
  }
  
  extension [Self <: UpdateSiteAddressInput](x: Self) {
    
    inline def setAddress(value: Address): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressType(value: AddressType): Self = StObject.set(x, "AddressType", value.asInstanceOf[js.Any])
    
    inline def setSiteId(value: SiteId): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
  }
}
