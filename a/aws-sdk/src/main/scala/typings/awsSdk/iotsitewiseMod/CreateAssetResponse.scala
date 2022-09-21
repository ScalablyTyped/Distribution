package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssetResponse extends StObject {
  
  /**
    * The ARN of the asset, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId} 
    */
  var assetArn: ARN
  
  /**
    * The ID of the asset. This ID uniquely identifies the asset within IoT SiteWise and can be used with other IoT SiteWise APIs.
    */
  var assetId: ID
  
  /**
    * The status of the asset, which contains a state (CREATING after successfully calling this operation) and any error message.
    */
  var assetStatus: AssetStatus
}
object CreateAssetResponse {
  
  inline def apply(assetArn: ARN, assetId: ID, assetStatus: AssetStatus): CreateAssetResponse = {
    val __obj = js.Dynamic.literal(assetArn = assetArn.asInstanceOf[js.Any], assetId = assetId.asInstanceOf[js.Any], assetStatus = assetStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssetResponse]
  }
  
  extension [Self <: CreateAssetResponse](x: Self) {
    
    inline def setAssetArn(value: ARN): Self = StObject.set(x, "assetArn", value.asInstanceOf[js.Any])
    
    inline def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setAssetStatus(value: AssetStatus): Self = StObject.set(x, "assetStatus", value.asInstanceOf[js.Any])
  }
}
