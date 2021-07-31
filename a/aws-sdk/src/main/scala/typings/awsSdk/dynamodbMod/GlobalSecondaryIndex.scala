package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalSecondaryIndex extends StObject {
  
  /**
    * The name of the global secondary index. The name must be unique among all other indexes on this table.
    */
  var IndexName: typings.awsSdk.dynamodbMod.IndexName
  
  /**
    * The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
    */
  var KeySchema: typings.awsSdk.dynamodbMod.KeySchema
  
  /**
    * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
    */
  var Projection: typings.awsSdk.dynamodbMod.Projection
  
  /**
    * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Service, Account, and Table Quotas in the Amazon DynamoDB Developer Guide.
    */
  var ProvisionedThroughput: js.UndefOr[typings.awsSdk.dynamodbMod.ProvisionedThroughput] = js.undefined
}
object GlobalSecondaryIndex {
  
  @scala.inline
  def apply(IndexName: IndexName, KeySchema: KeySchema, Projection: Projection): GlobalSecondaryIndex = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], Projection = Projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalSecondaryIndex]
  }
  
  @scala.inline
  implicit class GlobalSecondaryIndexMutableBuilder[Self <: GlobalSecondaryIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
    
    @scala.inline
    def setProjection(value: Projection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
  }
}
