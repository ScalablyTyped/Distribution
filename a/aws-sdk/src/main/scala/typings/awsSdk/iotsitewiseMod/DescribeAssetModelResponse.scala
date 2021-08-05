package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAssetModelResponse extends StObject {
  
  /**
    * The ARN of the asset model, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:asset-model/${AssetModelId} 
    */
  var assetModelArn: ARN
  
  /**
    * The date the asset model was created, in Unix epoch time.
    */
  var assetModelCreationDate: Timestamp
  
  /**
    * The asset model's description.
    */
  var assetModelDescription: Description
  
  /**
    * A list of asset model hierarchies that each contain a childAssetModelId and a hierarchyId (named id). A hierarchy specifies allowed parent/child asset relationships for an asset model.
    */
  var assetModelHierarchies: AssetModelHierarchies
  
  /**
    * The ID of the asset model.
    */
  var assetModelId: ID
  
  /**
    * The date the asset model was last updated, in Unix epoch time.
    */
  var assetModelLastUpdateDate: Timestamp
  
  /**
    * The name of the asset model.
    */
  var assetModelName: Name
  
  /**
    * The list of asset properties for the asset model.
    */
  var assetModelProperties: AssetModelProperties
  
  /**
    * The current status of the asset model, which contains a state and any error message.
    */
  var assetModelStatus: AssetModelStatus
}
object DescribeAssetModelResponse {
  
  inline def apply(
    assetModelArn: ARN,
    assetModelCreationDate: Timestamp,
    assetModelDescription: Description,
    assetModelHierarchies: AssetModelHierarchies,
    assetModelId: ID,
    assetModelLastUpdateDate: Timestamp,
    assetModelName: Name,
    assetModelProperties: AssetModelProperties,
    assetModelStatus: AssetModelStatus
  ): DescribeAssetModelResponse = {
    val __obj = js.Dynamic.literal(assetModelArn = assetModelArn.asInstanceOf[js.Any], assetModelCreationDate = assetModelCreationDate.asInstanceOf[js.Any], assetModelDescription = assetModelDescription.asInstanceOf[js.Any], assetModelHierarchies = assetModelHierarchies.asInstanceOf[js.Any], assetModelId = assetModelId.asInstanceOf[js.Any], assetModelLastUpdateDate = assetModelLastUpdateDate.asInstanceOf[js.Any], assetModelName = assetModelName.asInstanceOf[js.Any], assetModelProperties = assetModelProperties.asInstanceOf[js.Any], assetModelStatus = assetModelStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssetModelResponse]
  }
  
  extension [Self <: DescribeAssetModelResponse](x: Self) {
    
    inline def setAssetModelArn(value: ARN): Self = StObject.set(x, "assetModelArn", value.asInstanceOf[js.Any])
    
    inline def setAssetModelCreationDate(value: Timestamp): Self = StObject.set(x, "assetModelCreationDate", value.asInstanceOf[js.Any])
    
    inline def setAssetModelDescription(value: Description): Self = StObject.set(x, "assetModelDescription", value.asInstanceOf[js.Any])
    
    inline def setAssetModelHierarchies(value: AssetModelHierarchies): Self = StObject.set(x, "assetModelHierarchies", value.asInstanceOf[js.Any])
    
    inline def setAssetModelHierarchiesVarargs(value: AssetModelHierarchy*): Self = StObject.set(x, "assetModelHierarchies", js.Array(value :_*))
    
    inline def setAssetModelId(value: ID): Self = StObject.set(x, "assetModelId", value.asInstanceOf[js.Any])
    
    inline def setAssetModelLastUpdateDate(value: Timestamp): Self = StObject.set(x, "assetModelLastUpdateDate", value.asInstanceOf[js.Any])
    
    inline def setAssetModelName(value: Name): Self = StObject.set(x, "assetModelName", value.asInstanceOf[js.Any])
    
    inline def setAssetModelProperties(value: AssetModelProperties): Self = StObject.set(x, "assetModelProperties", value.asInstanceOf[js.Any])
    
    inline def setAssetModelPropertiesVarargs(value: AssetModelProperty*): Self = StObject.set(x, "assetModelProperties", js.Array(value :_*))
    
    inline def setAssetModelStatus(value: AssetModelStatus): Self = StObject.set(x, "assetModelStatus", value.asInstanceOf[js.Any])
  }
}
