package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartNetworkInsightsAnalysisRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to ensure idempotency.
    */
  var ClientToken: String
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Names (ARN) of the resources that the path must traverse.
    */
  var FilterInArns: js.UndefOr[ArnList] = js.undefined
  
  /**
    * The ID of the path.
    */
  var NetworkInsightsPathId: typings.awsSdk.ec2Mod.NetworkInsightsPathId
  
  /**
    * The tags to apply.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object StartNetworkInsightsAnalysisRequest {
  
  inline def apply(ClientToken: String, NetworkInsightsPathId: NetworkInsightsPathId): StartNetworkInsightsAnalysisRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], NetworkInsightsPathId = NetworkInsightsPathId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartNetworkInsightsAnalysisRequest]
  }
  
  extension [Self <: StartNetworkInsightsAnalysisRequest](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilterInArns(value: ArnList): Self = StObject.set(x, "FilterInArns", value.asInstanceOf[js.Any])
    
    inline def setFilterInArnsUndefined: Self = StObject.set(x, "FilterInArns", js.undefined)
    
    inline def setFilterInArnsVarargs(value: ResourceArn*): Self = StObject.set(x, "FilterInArns", js.Array(value*))
    
    inline def setNetworkInsightsPathId(value: NetworkInsightsPathId): Self = StObject.set(x, "NetworkInsightsPathId", value.asInstanceOf[js.Any])
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
  }
}
