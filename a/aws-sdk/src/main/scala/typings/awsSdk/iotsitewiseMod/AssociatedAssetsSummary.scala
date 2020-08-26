package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociatedAssetsSummary extends js.Object {
  /**
    * The ARN of the asset, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:asset/${AssetId} 
    */
  var arn: ARN = js.native
  /**
    * The ID of the asset model used to create the asset.
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

object AssociatedAssetsSummary {
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
  ): AssociatedAssetsSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], assetModelId = assetModelId.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], hierarchies = hierarchies.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdateDate = lastUpdateDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatedAssetsSummary]
  }
  @scala.inline
  implicit class AssociatedAssetsSummaryOps[Self <: AssociatedAssetsSummary] (val x: Self) extends AnyVal {
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
    def setArn(value: ARN): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssetModelId(value: ID): Self = this.set("assetModelId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreationDate(value: Timestamp): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setHierarchiesVarargs(value: AssetHierarchy*): Self = this.set("hierarchies", js.Array(value :_*))
    @scala.inline
    def setHierarchies(value: AssetHierarchies): Self = this.set("hierarchies", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: ID): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastUpdateDate(value: Timestamp): Self = this.set("lastUpdateDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: AssetStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

