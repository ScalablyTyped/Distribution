package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCampaignRequest extends StObject {
  
  /**
    *  Specifies how to update a campaign. The action can be one of the following:    APPROVE - To approve delivering a data collection scheme to vehicles.     SUSPEND - To suspend collecting signal data.     RESUME - To resume collecting signal data.     UPDATE - To update a campaign.   
    */
  var action: UpdateCampaignAction
  
  /**
    *  A list of vehicle attributes to associate with a signal.  Default: An empty array
    */
  var dataExtraDimensions: js.UndefOr[DataExtraDimensionNodePathList] = js.undefined
  
  /**
    * The description of the campaign.
    */
  var description: js.UndefOr[typings.awsSdk.iotfleetwiseMod.description] = js.undefined
  
  /**
    *  The name of the campaign to update. 
    */
  var name: campaignName
}
object UpdateCampaignRequest {
  
  inline def apply(action: UpdateCampaignAction, name: campaignName): UpdateCampaignRequest = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCampaignRequest]
  }
  
  extension [Self <: UpdateCampaignRequest](x: Self) {
    
    inline def setAction(value: UpdateCampaignAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setDataExtraDimensions(value: DataExtraDimensionNodePathList): Self = StObject.set(x, "dataExtraDimensions", value.asInstanceOf[js.Any])
    
    inline def setDataExtraDimensionsUndefined: Self = StObject.set(x, "dataExtraDimensions", js.undefined)
    
    inline def setDataExtraDimensionsVarargs(value: NodePath*): Self = StObject.set(x, "dataExtraDimensions", js.Array(value*))
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: campaignName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
