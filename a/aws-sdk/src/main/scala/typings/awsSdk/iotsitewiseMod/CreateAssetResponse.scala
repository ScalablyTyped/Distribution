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
    * The ID of the asset. This ID uniquely identifies the asset within AWS IoT SiteWise and can be used with other AWS IoT SiteWise APIs.
    */
  var assetId: ID
  
  /**
    * The status of the asset, which contains a state (CREATING after successfully calling this operation) and any error message.
    */
  var assetStatus: AssetStatus
}
object CreateAssetResponse {
  
  @scala.inline
  def apply(assetArn: ARN, assetId: ID, assetStatus: AssetStatus): CreateAssetResponse = {
    val __obj = js.Dynamic.literal(assetArn = assetArn.asInstanceOf[js.Any], assetId = assetId.asInstanceOf[js.Any], assetStatus = assetStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssetResponse]
  }
  
  @scala.inline
  implicit class CreateAssetResponseMutableBuilder[Self <: CreateAssetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetArn(value: ARN): Self = StObject.set(x, "assetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetStatus(value: AssetStatus): Self = StObject.set(x, "assetStatus", value.asInstanceOf[js.Any])
  }
}
