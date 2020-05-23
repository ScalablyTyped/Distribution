package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * The status of the asset, which contains a state (CREATING after successfully calling this action) and any error message.
    */
  var assetStatus: AssetStatus = js.native
}

object CreateAssetResponse {
  @scala.inline
  def apply(assetArn: ARN, assetId: ID, assetStatus: AssetStatus): CreateAssetResponse = {
    val __obj = js.Dynamic.literal(assetArn = assetArn.asInstanceOf[js.Any], assetId = assetId.asInstanceOf[js.Any], assetStatus = assetStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssetResponse]
  }
}

