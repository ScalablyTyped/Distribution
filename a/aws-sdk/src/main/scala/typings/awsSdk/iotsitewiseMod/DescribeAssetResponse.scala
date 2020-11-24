package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class DescribeAssetResponseOps[Self <: DescribeAssetResponse] (val x: Self) extends AnyVal {
    
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
    def setAssetCreationDate(value: Timestamp): Self = this.set("assetCreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetHierarchiesVarargs(value: AssetHierarchy*): Self = this.set("assetHierarchies", js.Array(value :_*))
    
    @scala.inline
    def setAssetHierarchies(value: AssetHierarchies): Self = this.set("assetHierarchies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetId(value: ID): Self = this.set("assetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetLastUpdateDate(value: Timestamp): Self = this.set("assetLastUpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetModelId(value: ID): Self = this.set("assetModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetName(value: Name): Self = this.set("assetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetPropertiesVarargs(value: AssetProperty*): Self = this.set("assetProperties", js.Array(value :_*))
    
    @scala.inline
    def setAssetProperties(value: AssetProperties): Self = this.set("assetProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetStatus(value: AssetStatus): Self = this.set("assetStatus", value.asInstanceOf[js.Any])
  }
}
