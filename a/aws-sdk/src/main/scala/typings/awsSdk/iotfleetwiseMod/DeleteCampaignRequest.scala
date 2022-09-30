package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCampaignRequest extends StObject {
  
  /**
    *  The name of the campaign to delete. 
    */
  var name: campaignName
}
object DeleteCampaignRequest {
  
  inline def apply(name: campaignName): DeleteCampaignRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCampaignRequest]
  }
  
  extension [Self <: DeleteCampaignRequest](x: Self) {
    
    inline def setName(value: campaignName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
