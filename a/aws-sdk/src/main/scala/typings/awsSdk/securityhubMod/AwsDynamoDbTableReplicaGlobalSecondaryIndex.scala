package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsDynamoDbTableReplicaGlobalSecondaryIndex extends StObject {
  
  /**
    * The name of the index.
    */
  var IndexName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Replica-specific configuration for the provisioned throughput for the index.
    */
  var ProvisionedThroughputOverride: js.UndefOr[AwsDynamoDbTableProvisionedThroughputOverride] = js.undefined
}
object AwsDynamoDbTableReplicaGlobalSecondaryIndex {
  
  @scala.inline
  def apply(): AwsDynamoDbTableReplicaGlobalSecondaryIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableReplicaGlobalSecondaryIndex]
  }
  
  @scala.inline
  implicit class AwsDynamoDbTableReplicaGlobalSecondaryIndexMutableBuilder[Self <: AwsDynamoDbTableReplicaGlobalSecondaryIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexName(value: NonEmptyString): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    @scala.inline
    def setProvisionedThroughputOverride(value: AwsDynamoDbTableProvisionedThroughputOverride): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
  }
}
