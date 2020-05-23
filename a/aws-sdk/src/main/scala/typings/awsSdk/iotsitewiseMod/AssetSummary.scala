package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetSummary extends js.Object {
  /**
    * The ARN of the asset, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId} 
    */
  var arn: ARN = js.native
  /**
    * The ID of the asset model used to create this asset.
    */
  var assetModelId: ID = js.native
  /**
    * The date the asset was created, in Unix epoch time.
    */
  var creationDate: Timestamp = js.native
  /**
    * A list of asset hierarchies that each contain a hierarchyId. A hierarchy specifies allowed parent/child asset relationships.
    */
  var hierarchies: AssetHierarchies = js.native
  /**
    * The ID of the asset.
    */
  var id: ID = js.native
  /**
    * The date the asset was last updated, in Unix epoch time.
    */
  var lastUpdateDate: Timestamp = js.native
  /**
    * The name of the asset.
    */
  var name: Name = js.native
  /**
    * The current status of the asset.
    */
  var status: AssetStatus = js.native
}

object AssetSummary {
  @scala.inline
  def apply(
    arn: ARN,
    assetModelId: ID,
    creationDate: Timestamp,
    hierarchies: AssetHierarchies,
    id: ID,
    lastUpdateDate: Timestamp,
    name: Name,
    status: AssetStatus
  ): AssetSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], assetModelId = assetModelId.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], hierarchies = hierarchies.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdateDate = lastUpdateDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetSummary]
  }
}

