package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsDynamoDbTableGlobalSecondaryIndex extends js.Object {
  
  /**
    * Whether the index is currently backfilling.
    */
  var Backfilling: js.UndefOr[Boolean] = js.native
  
  /**
    * The ARN of the index.
    */
  var IndexArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the index.
    */
  var IndexName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The total size in bytes of the index.
    */
  var IndexSizeBytes: js.UndefOr[SizeBytes] = js.native
  
  /**
    * The current status of the index.
    */
  var IndexStatus: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The number of items in the index.
    */
  var ItemCount: js.UndefOr[Integer] = js.native
  
  /**
    * The key schema for the index.
    */
  var KeySchema: js.UndefOr[AwsDynamoDbTableKeySchemaList] = js.native
  
  /**
    * Attributes that are copied from the table into an index.
    */
  var Projection: js.UndefOr[AwsDynamoDbTableProjection] = js.native
  
  /**
    * Information about the provisioned throughput settings for the indexes.
    */
  var ProvisionedThroughput: js.UndefOr[AwsDynamoDbTableProvisionedThroughput] = js.native
}
object AwsDynamoDbTableGlobalSecondaryIndex {
  
  @scala.inline
  def apply(): AwsDynamoDbTableGlobalSecondaryIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableGlobalSecondaryIndex]
  }
  
  @scala.inline
  implicit class AwsDynamoDbTableGlobalSecondaryIndexOps[Self <: AwsDynamoDbTableGlobalSecondaryIndex] (val x: Self) extends AnyVal {
    
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
    def setBackfilling(value: Boolean): Self = this.set("Backfilling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackfilling: Self = this.set("Backfilling", js.undefined)
    
    @scala.inline
    def setIndexArn(value: NonEmptyString): Self = this.set("IndexArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexArn: Self = this.set("IndexArn", js.undefined)
    
    @scala.inline
    def setIndexName(value: NonEmptyString): Self = this.set("IndexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexName: Self = this.set("IndexName", js.undefined)
    
    @scala.inline
    def setIndexSizeBytes(value: SizeBytes): Self = this.set("IndexSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexSizeBytes: Self = this.set("IndexSizeBytes", js.undefined)
    
    @scala.inline
    def setIndexStatus(value: NonEmptyString): Self = this.set("IndexStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexStatus: Self = this.set("IndexStatus", js.undefined)
    
    @scala.inline
    def setItemCount(value: Integer): Self = this.set("ItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemCount: Self = this.set("ItemCount", js.undefined)
    
    @scala.inline
    def setKeySchemaVarargs(value: AwsDynamoDbTableKeySchema*): Self = this.set("KeySchema", js.Array(value :_*))
    
    @scala.inline
    def setKeySchema(value: AwsDynamoDbTableKeySchemaList): Self = this.set("KeySchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeySchema: Self = this.set("KeySchema", js.undefined)
    
    @scala.inline
    def setProjection(value: AwsDynamoDbTableProjection): Self = this.set("Projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("Projection", js.undefined)
    
    @scala.inline
    def setProvisionedThroughput(value: AwsDynamoDbTableProvisionedThroughput): Self = this.set("ProvisionedThroughput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedThroughput: Self = this.set("ProvisionedThroughput", js.undefined)
  }
}
