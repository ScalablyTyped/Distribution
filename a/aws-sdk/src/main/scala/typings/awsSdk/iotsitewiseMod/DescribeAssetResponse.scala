package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssetResponse extends js.Object {
  /**
    * The ARN of the asset, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId} 
    */
  var assetArn: ARN = js.native
  /**
    * The date the asset was created, in Unix epoch time.
    */
  var assetCreationDate: Timestamp = js.native
  /**
    * A list of asset hierarchies that each contain a hierarchyId. A hierarchy specifies allowed parent/child asset relationships.
    */
  var assetHierarchies: AssetHierarchies = js.native
  /**
    * The ID of the asset.
    */
  var assetId: ID = js.native
  /**
    * The date the asset was last updated, in Unix epoch time.
    */
  var assetLastUpdateDate: Timestamp = js.native
  /**
    * The ID of the asset model that was used to create the asset.
    */
  var assetModelId: ID = js.native
  /**
    * The name of the asset.
    */
  var assetName: Name = js.native
  /**
    * The list of asset properties for the asset.
    */
  var assetProperties: AssetProperties = js.native
  /**
    * The current status of the asset, which contains a state and any error message.
    */
  var assetStatus: AssetStatus = js.native
}

object DescribeAssetResponse {
  @scala.inline
  def apply(
    assetArn: ARN,
    assetCreationDate: Timestamp,
    assetHierarchies: AssetHierarchies,
    assetId: ID,
    assetLastUpdateDate: Timestamp,
    assetModelId: ID,
    assetName: Name,
    assetProperties: AssetProperties,
    assetStatus: AssetStatus
  ): DescribeAssetResponse = {
    val __obj = js.Dynamic.literal(assetArn = assetArn.asInstanceOf[js.Any], assetCreationDate = assetCreationDate.asInstanceOf[js.Any], assetHierarchies = assetHierarchies.asInstanceOf[js.Any], assetId = assetId.asInstanceOf[js.Any], assetLastUpdateDate = assetLastUpdateDate.asInstanceOf[js.Any], assetModelId = assetModelId.asInstanceOf[js.Any], assetName = assetName.asInstanceOf[js.Any], assetProperties = assetProperties.asInstanceOf[js.Any], assetStatus = assetStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssetResponse]
  }
}

