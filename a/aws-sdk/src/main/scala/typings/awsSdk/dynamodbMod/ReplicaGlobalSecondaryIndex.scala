package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicaGlobalSecondaryIndex extends StObject {
  
  /**
    * The name of the global secondary index.
    */
  var IndexName: typings.awsSdk.dynamodbMod.IndexName = js.native
  
  /**
    * Replica table GSI-specific provisioned throughput. If not specified, uses the source table GSI's read capacity settings.
    */
  var ProvisionedThroughputOverride: js.UndefOr[typings.awsSdk.dynamodbMod.ProvisionedThroughputOverride] = js.native
}
object ReplicaGlobalSecondaryIndex {
  
  @scala.inline
  def apply(IndexName: IndexName): ReplicaGlobalSecondaryIndex = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaGlobalSecondaryIndex]
  }
  
  @scala.inline
  implicit class ReplicaGlobalSecondaryIndexMutableBuilder[Self <: ReplicaGlobalSecondaryIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedThroughputOverride(value: ProvisionedThroughputOverride): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
  }
}
