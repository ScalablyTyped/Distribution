package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAssetModelResponse extends js.Object {
  /**
    * The ARN of the asset model, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:asset-model/${AssetModelId} 
    */
  var assetModelArn: ARN = js.native
  /**
    * The ID of the asset model. You can use this ID when you call other AWS IoT SiteWise APIs.
    */
  var assetModelId: ID = js.native
  /**
    * The status of the asset model, which contains a state (CREATING after successfully calling this operation) and any error message.
    */
  var assetModelStatus: AssetModelStatus = js.native
}

object CreateAssetModelResponse {
  @scala.inline
  def apply(assetModelArn: ARN, assetModelId: ID, assetModelStatus: AssetModelStatus): CreateAssetModelResponse = {
    val __obj = js.Dynamic.literal(assetModelArn = assetModelArn.asInstanceOf[js.Any], assetModelId = assetModelId.asInstanceOf[js.Any], assetModelStatus = assetModelStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssetModelResponse]
  }
  @scala.inline
  implicit class CreateAssetModelResponseOps[Self <: CreateAssetModelResponse] (val x: Self) extends AnyVal {
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
    def setAssetModelArn(value: ARN): Self = this.set("assetModelArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssetModelId(value: ID): Self = this.set("assetModelId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssetModelStatus(value: AssetModelStatus): Self = this.set("assetModelStatus", value.asInstanceOf[js.Any])
  }
  
}

