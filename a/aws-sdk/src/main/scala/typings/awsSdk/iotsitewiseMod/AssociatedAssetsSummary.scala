package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociatedAssetsSummary extends StObject {
  
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
  implicit class AssociatedAssetsSummaryMutableBuilder[Self <: AssociatedAssetsSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetModelId(value: ID): Self = StObject.set(x, "assetModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: Timestamp): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchies(value: AssetHierarchies): Self = StObject.set(x, "hierarchies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchiesVarargs(value: AssetHierarchy*): Self = StObject.set(x, "hierarchies", js.Array(value :_*))
    
    @scala.inline
    def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateDate(value: Timestamp): Self = StObject.set(x, "lastUpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: AssetStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
