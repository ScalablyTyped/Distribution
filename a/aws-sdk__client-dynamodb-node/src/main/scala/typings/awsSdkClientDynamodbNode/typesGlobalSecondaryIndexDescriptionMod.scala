package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ACTIVE
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.CREATING
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DELETING
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.UPDATING
import typings.awsSdkClientDynamodbNode.typesKeySchemaElementMod.KeySchemaElement
import typings.awsSdkClientDynamodbNode.typesKeySchemaElementMod.UnmarshalledKeySchemaElement
import typings.awsSdkClientDynamodbNode.typesProjectionMod.Projection
import typings.awsSdkClientDynamodbNode.typesProjectionMod.UnmarshalledProjection
import typings.awsSdkClientDynamodbNode.typesProvisionedThroughputDescriptionMod.ProvisionedThroughputDescription
import typings.awsSdkClientDynamodbNode.typesProvisionedThroughputDescriptionMod.UnmarshalledProvisionedThroughputDescription
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGlobalSecondaryIndexDescriptionMod {
  
  trait GlobalSecondaryIndexDescription extends StObject {
    
    /**
      * <p>Indicates whether the index is currently backfilling. <i>Backfilling</i> is the process of reading items from the table and determining whether they can be added to the index. (Not all items will qualify: For example, a partition key cannot have any duplicate values.) If an item can be added to the index, DynamoDB will do so. After all items have been processed, the backfilling operation is complete and <code>Backfilling</code> is false.</p> <note> <p>For indexes that were created during a <code>CreateTable</code> operation, the <code>Backfilling</code> attribute does not appear in the <code>DescribeTable</code> output.</p> </note>
      */
    var Backfilling: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>The Amazon Resource Name (ARN) that uniquely identifies the index.</p>
      */
    var IndexArn: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The name of the global secondary index.</p>
      */
    var IndexName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The total size of the specified index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.</p>
      */
    var IndexSizeBytes: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The current state of the global secondary index:</p> <ul> <li> <p> <code>CREATING</code> - The index is being created.</p> </li> <li> <p> <code>UPDATING</code> - The index is being updated.</p> </li> <li> <p> <code>DELETING</code> - The index is being deleted.</p> </li> <li> <p> <code>ACTIVE</code> - The index is ready for use.</p> </li> </ul>
      */
    var IndexStatus: js.UndefOr[CREATING | UPDATING | DELETING | ACTIVE | String] = js.undefined
    
    /**
      * <p>The number of items in the specified index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.</p>
      */
    var ItemCount: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note>
      */
    var KeySchema: js.UndefOr[js.Array[KeySchemaElement] | Iterable[KeySchemaElement]] = js.undefined
    
    /**
      * <p>Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. </p>
      */
    var Projection: js.UndefOr[typings.awsSdkClientDynamodbNode.typesProjectionMod.Projection] = js.undefined
    
    /**
      * <p>Represents the provisioned throughput settings for the specified global secondary index.</p> <p>For current minimum and maximum provisioned throughput values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var ProvisionedThroughput: js.UndefOr[ProvisionedThroughputDescription] = js.undefined
  }
  object GlobalSecondaryIndexDescription {
    
    @scala.inline
    def apply(): GlobalSecondaryIndexDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalSecondaryIndexDescription]
    }
    
    @scala.inline
    implicit class GlobalSecondaryIndexDescriptionMutableBuilder[Self <: GlobalSecondaryIndexDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackfilling(value: Boolean): Self = StObject.set(x, "Backfilling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackfillingUndefined: Self = StObject.set(x, "Backfilling", js.undefined)
      
      @scala.inline
      def setIndexArn(value: String): Self = StObject.set(x, "IndexArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexArnUndefined: Self = StObject.set(x, "IndexArn", js.undefined)
      
      @scala.inline
      def setIndexName(value: String): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
      @scala.inline
      def setIndexSizeBytes(value: Double): Self = StObject.set(x, "IndexSizeBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexSizeBytesUndefined: Self = StObject.set(x, "IndexSizeBytes", js.undefined)
      
      @scala.inline
      def setIndexStatus(value: CREATING | UPDATING | DELETING | ACTIVE | String): Self = StObject.set(x, "IndexStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexStatusUndefined: Self = StObject.set(x, "IndexStatus", js.undefined)
      
      @scala.inline
      def setItemCount(value: Double): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
      
      @scala.inline
      def setKeySchema(value: js.Array[KeySchemaElement] | Iterable[KeySchemaElement]): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
      
      @scala.inline
      def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
      
      @scala.inline
      def setProjection(value: Projection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "Projection", js.undefined)
      
      @scala.inline
      def setProvisionedThroughput(value: ProvisionedThroughputDescription): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
    }
  }
  
  trait UnmarshalledGlobalSecondaryIndexDescription
    extends StObject
       with GlobalSecondaryIndexDescription {
    
    /**
      * <p>The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note>
      */
    @JSName("KeySchema")
    var KeySchema_UnmarshalledGlobalSecondaryIndexDescription: js.UndefOr[js.Array[UnmarshalledKeySchemaElement]] = js.undefined
    
    /**
      * <p>Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. </p>
      */
    @JSName("Projection")
    var Projection_UnmarshalledGlobalSecondaryIndexDescription: js.UndefOr[UnmarshalledProjection] = js.undefined
    
    /**
      * <p>Represents the provisioned throughput settings for the specified global secondary index.</p> <p>For current minimum and maximum provisioned throughput values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    @JSName("ProvisionedThroughput")
    var ProvisionedThroughput_UnmarshalledGlobalSecondaryIndexDescription: js.UndefOr[UnmarshalledProvisionedThroughputDescription] = js.undefined
  }
  object UnmarshalledGlobalSecondaryIndexDescription {
    
    @scala.inline
    def apply(): UnmarshalledGlobalSecondaryIndexDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledGlobalSecondaryIndexDescription]
    }
    
    @scala.inline
    implicit class UnmarshalledGlobalSecondaryIndexDescriptionMutableBuilder[Self <: UnmarshalledGlobalSecondaryIndexDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeySchema(value: js.Array[UnmarshalledKeySchemaElement]): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
      
      @scala.inline
      def setKeySchemaVarargs(value: UnmarshalledKeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
      
      @scala.inline
      def setProjection(value: UnmarshalledProjection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "Projection", js.undefined)
      
      @scala.inline
      def setProvisionedThroughput(value: UnmarshalledProvisionedThroughputDescription): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
    }
  }
}
