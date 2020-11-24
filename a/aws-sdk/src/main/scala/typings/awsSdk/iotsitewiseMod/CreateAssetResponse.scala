package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAssetResponse extends js.Object {
  
  /**
    * The ARN of the asset, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId} 
    */
  var assetArn: ARN = js.native
  
  /**
    * The ID of the asset. This ID uniquely identifies the asset within AWS IoT SiteWise and can be used with other AWS IoT SiteWise APIs.
    */
  var assetId: ID = js.native
  
  /**
    * The status of the asset, which contains a state (CREATING after successfully calling this operation) and any error message.
    */
  var assetStatus: AssetStatus = js.native
}
object CreateAssetResponse {
  
  @scala.inline
  def apply(assetArn: ARN, assetId: ID, assetStatus: AssetStatus): CreateAssetResponse = {
    val __obj = js.Dynamic.literal(assetArn = assetArn.asInstanceOf[js.Any], assetId = assetId.asInstanceOf[js.Any], assetStatus = assetStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssetResponse]
  }
  
  @scala.inline
  implicit class CreateAssetResponseOps[Self <: CreateAssetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssetArn(value: ARN): Self = this.set("assetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetId(value: ID): Self = this.set("assetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetStatus(value: AssetStatus): Self = this.set("assetStatus", value.asInstanceOf[js.Any])
  }
}
