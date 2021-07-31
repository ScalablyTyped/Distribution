package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalSecondaryIndexDescription extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the index.
    */
  var IndexArn: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the name of the local secondary index.
    */
  var IndexName: js.UndefOr[typings.awsSdk.dynamodbMod.IndexName] = js.undefined
  
  /**
    * The total size of the specified index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
    */
  var IndexSizeBytes: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of items in the specified index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
    */
  var ItemCount: js.UndefOr[Long] = js.undefined
  
  /**
    * The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and key types:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
    */
  var KeySchema: js.UndefOr[typings.awsSdk.dynamodbMod.KeySchema] = js.undefined
  
  /**
    * Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. 
    */
  var Projection: js.UndefOr[typings.awsSdk.dynamodbMod.Projection] = js.undefined
}
object LocalSecondaryIndexDescription {
  
  @scala.inline
  def apply(): LocalSecondaryIndexDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalSecondaryIndexDescription]
  }
  
  @scala.inline
  implicit class LocalSecondaryIndexDescriptionMutableBuilder[Self <: LocalSecondaryIndexDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexArn(value: String): Self = StObject.set(x, "IndexArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexArnUndefined: Self = StObject.set(x, "IndexArn", js.undefined)
    
    @scala.inline
    def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    @scala.inline
    def setIndexSizeBytes(value: Long): Self = StObject.set(x, "IndexSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexSizeBytesUndefined: Self = StObject.set(x, "IndexSizeBytes", js.undefined)
    
    @scala.inline
    def setItemCount(value: Long): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
    
    @scala.inline
    def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
    
    @scala.inline
    def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
    
    @scala.inline
    def setProjection(value: Projection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "Projection", js.undefined)
  }
}
