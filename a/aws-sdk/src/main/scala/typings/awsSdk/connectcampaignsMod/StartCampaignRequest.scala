package typings.awsSdk.connectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartCampaignRequest extends StObject {
  
  var id: CampaignId
}
object StartCampaignRequest {
  
  inline def apply(id: CampaignId): StartCampaignRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartCampaignRequest]
  }
  
  extension [Self <: StartCampaignRequest](x: Self) {
    
    inline def setId(value: CampaignId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
