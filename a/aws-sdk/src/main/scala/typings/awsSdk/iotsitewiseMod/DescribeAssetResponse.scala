package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAssetResponse extends StObject {
  
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
  implicit class DescribeAssetResponseMutableBuilder[Self <: DescribeAssetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetArn(value: ARN): Self = StObject.set(x, "assetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetCreationDate(value: Timestamp): Self = StObject.set(x, "assetCreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetHierarchies(value: AssetHierarchies): Self = StObject.set(x, "assetHierarchies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetHierarchiesVarargs(value: AssetHierarchy*): Self = StObject.set(x, "assetHierarchies", js.Array(value :_*))
    
    @scala.inline
    def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetLastUpdateDate(value: Timestamp): Self = StObject.set(x, "assetLastUpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetModelId(value: ID): Self = StObject.set(x, "assetModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetName(value: Name): Self = StObject.set(x, "assetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetProperties(value: AssetProperties): Self = StObject.set(x, "assetProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetPropertiesVarargs(value: AssetProperty*): Self = StObject.set(x, "assetProperties", js.Array(value :_*))
    
    @scala.inline
    def setAssetStatus(value: AssetStatus): Self = StObject.set(x, "assetStatus", value.asInstanceOf[js.Any])
  }
}
