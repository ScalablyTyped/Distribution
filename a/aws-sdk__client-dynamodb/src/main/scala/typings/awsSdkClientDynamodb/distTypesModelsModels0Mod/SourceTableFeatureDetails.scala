package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceTableFeatureDetails extends StObject {
  
  /**
    * <p>Represents the GSI properties for the table when the backup was created. It includes
    *             the IndexName, KeySchema, Projection, and ProvisionedThroughput for the GSIs on the
    *             table at the time of backup. </p>
    */
  var GlobalSecondaryIndexes: js.UndefOr[js.Array[GlobalSecondaryIndexInfo]] = js.undefined
  
  /**
    * <p>Represents the LSI properties for the table when the backup was created. It includes
    *             the IndexName, KeySchema and Projection for the LSIs on the table at the time of backup.
    *         </p>
    */
  var LocalSecondaryIndexes: js.UndefOr[js.Array[LocalSecondaryIndexInfo]] = js.undefined
  
  /**
    * <p>The description of the server-side encryption status on the table when the backup was
    *             created.</p>
    */
  var SSEDescription: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.SSEDescription] = js.undefined
  
  /**
    * <p>Stream settings on the table when the backup was created.</p>
    */
  var StreamDescription: js.UndefOr[StreamSpecification] = js.undefined
  
  /**
    * <p>Time to Live settings on the table when the backup was created.</p>
    */
  var TimeToLiveDescription: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.TimeToLiveDescription] = js.undefined
}
object SourceTableFeatureDetails {
  
  inline def apply(): SourceTableFeatureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceTableFeatureDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceTableFeatureDetails] (val x: Self) extends AnyVal {
    
    inline def setGlobalSecondaryIndexes(value: js.Array[GlobalSecondaryIndexInfo]): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
    
    inline def setGlobalSecondaryIndexesVarargs(value: GlobalSecondaryIndexInfo*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value*))
    
    inline def setLocalSecondaryIndexes(value: js.Array[LocalSecondaryIndexInfo]): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    inline def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
    
    inline def setLocalSecondaryIndexesVarargs(value: LocalSecondaryIndexInfo*): Self = StObject.set(x, "LocalSecondaryIndexes", js.Array(value*))
    
    inline def setSSEDescription(value: SSEDescription): Self = StObject.set(x, "SSEDescription", value.asInstanceOf[js.Any])
    
    inline def setSSEDescriptionUndefined: Self = StObject.set(x, "SSEDescription", js.undefined)
    
    inline def setStreamDescription(value: StreamSpecification): Self = StObject.set(x, "StreamDescription", value.asInstanceOf[js.Any])
    
    inline def setStreamDescriptionUndefined: Self = StObject.set(x, "StreamDescription", js.undefined)
    
    inline def setTimeToLiveDescription(value: TimeToLiveDescription): Self = StObject.set(x, "TimeToLiveDescription", value.asInstanceOf[js.Any])
    
    inline def setTimeToLiveDescriptionUndefined: Self = StObject.set(x, "TimeToLiveDescription", js.undefined)
  }
}
