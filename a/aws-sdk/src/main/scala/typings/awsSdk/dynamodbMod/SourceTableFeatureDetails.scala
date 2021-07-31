package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceTableFeatureDetails extends StObject {
  
  /**
    * Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema, Projection, and ProvisionedThroughput for the GSIs on the table at the time of backup. 
    */
  var GlobalSecondaryIndexes: js.UndefOr[typings.awsSdk.dynamodbMod.GlobalSecondaryIndexes] = js.undefined
  
  /**
    * Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and Projection for the LSIs on the table at the time of backup. 
    */
  var LocalSecondaryIndexes: js.UndefOr[typings.awsSdk.dynamodbMod.LocalSecondaryIndexes] = js.undefined
  
  /**
    * The description of the server-side encryption status on the table when the backup was created.
    */
  var SSEDescription: js.UndefOr[typings.awsSdk.dynamodbMod.SSEDescription] = js.undefined
  
  /**
    * Stream settings on the table when the backup was created.
    */
  var StreamDescription: js.UndefOr[StreamSpecification] = js.undefined
  
  /**
    * Time to Live settings on the table when the backup was created.
    */
  var TimeToLiveDescription: js.UndefOr[typings.awsSdk.dynamodbMod.TimeToLiveDescription] = js.undefined
}
object SourceTableFeatureDetails {
  
  @scala.inline
  def apply(): SourceTableFeatureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceTableFeatureDetails]
  }
  
  @scala.inline
  implicit class SourceTableFeatureDetailsMutableBuilder[Self <: SourceTableFeatureDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalSecondaryIndexes(value: GlobalSecondaryIndexes): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
    
    @scala.inline
    def setGlobalSecondaryIndexesVarargs(value: GlobalSecondaryIndexInfo*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value :_*))
    
    @scala.inline
    def setLocalSecondaryIndexes(value: LocalSecondaryIndexes): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
    
    @scala.inline
    def setLocalSecondaryIndexesVarargs(value: LocalSecondaryIndexInfo*): Self = StObject.set(x, "LocalSecondaryIndexes", js.Array(value :_*))
    
    @scala.inline
    def setSSEDescription(value: SSEDescription): Self = StObject.set(x, "SSEDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSEDescriptionUndefined: Self = StObject.set(x, "SSEDescription", js.undefined)
    
    @scala.inline
    def setStreamDescription(value: StreamSpecification): Self = StObject.set(x, "StreamDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamDescriptionUndefined: Self = StObject.set(x, "StreamDescription", js.undefined)
    
    @scala.inline
    def setTimeToLiveDescription(value: TimeToLiveDescription): Self = StObject.set(x, "TimeToLiveDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeToLiveDescriptionUndefined: Self = StObject.set(x, "TimeToLiveDescription", js.undefined)
  }
}
