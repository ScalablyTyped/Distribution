package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOutpostInput extends StObject {
  
  var Description: js.UndefOr[OutpostDescription] = js.undefined
  
  var Name: js.UndefOr[OutpostName] = js.undefined
  
  /**
    *  The ID or the Amazon Resource Name (ARN) of the Outpost.   In requests, Amazon Web Services Outposts accepts the Amazon Resource Name (ARN) or an ID for Outposts and sites throughout the Outposts Query API. To address backwards compatibility, the parameter names OutpostID or SiteID remain in use. Despite the parameter name, you can make the request with an ARN. 
    */
  var OutpostId: typings.awsSdk.outpostsMod.OutpostId
  
  /**
    *  The type of hardware for this Outpost. 
    */
  var SupportedHardwareType: js.UndefOr[typings.awsSdk.outpostsMod.SupportedHardwareType] = js.undefined
}
object UpdateOutpostInput {
  
  inline def apply(OutpostId: OutpostId): UpdateOutpostInput = {
    val __obj = js.Dynamic.literal(OutpostId = OutpostId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOutpostInput]
  }
  
  extension [Self <: UpdateOutpostInput](x: Self) {
    
    inline def setDescription(value: OutpostDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: OutpostName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOutpostId(value: OutpostId): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
    
    inline def setSupportedHardwareType(value: SupportedHardwareType): Self = StObject.set(x, "SupportedHardwareType", value.asInstanceOf[js.Any])
    
    inline def setSupportedHardwareTypeUndefined: Self = StObject.set(x, "SupportedHardwareType", js.undefined)
  }
}
