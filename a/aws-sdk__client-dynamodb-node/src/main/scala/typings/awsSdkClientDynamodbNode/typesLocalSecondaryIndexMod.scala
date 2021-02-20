package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.typesKeySchemaElementMod.KeySchemaElement
import typings.awsSdkClientDynamodbNode.typesKeySchemaElementMod.UnmarshalledKeySchemaElement
import typings.awsSdkClientDynamodbNode.typesProjectionMod.Projection
import typings.awsSdkClientDynamodbNode.typesProjectionMod.UnmarshalledProjection
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLocalSecondaryIndexMod {
  
  @js.native
  trait LocalSecondaryIndex extends StObject {
    
    /**
      * <p>The name of the local secondary index. The name must be unique among all other indexes on this table.</p>
      */
    var IndexName: String = js.native
    
    /**
      * <p>The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and key types:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note>
      */
    var KeySchema: js.Array[KeySchemaElement] | Iterable[KeySchemaElement] = js.native
    
    /**
      * <p>Represents attributes that are copied (projected) from the table into the local secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. </p>
      */
    var Projection: typings.awsSdkClientDynamodbNode.typesProjectionMod.Projection = js.native
  }
  object LocalSecondaryIndex {
    
    @scala.inline
    def apply(
      IndexName: String,
      KeySchema: js.Array[KeySchemaElement] | Iterable[KeySchemaElement],
      Projection: Projection
    ): LocalSecondaryIndex = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], Projection = Projection.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalSecondaryIndex]
    }
    
    @scala.inline
    implicit class LocalSecondaryIndexMutableBuilder[Self <: LocalSecondaryIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexName(value: String): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySchema(value: js.Array[KeySchemaElement] | Iterable[KeySchemaElement]): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
      
      @scala.inline
      def setProjection(value: Projection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnmarshalledLocalSecondaryIndex extends LocalSecondaryIndex {
    
    /**
      * <p>The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and key types:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note>
      */
    @JSName("KeySchema")
    var KeySchema_UnmarshalledLocalSecondaryIndex: js.Array[UnmarshalledKeySchemaElement] = js.native
    
    /**
      * <p>Represents attributes that are copied (projected) from the table into the local secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. </p>
      */
    @JSName("Projection")
    var Projection_UnmarshalledLocalSecondaryIndex: UnmarshalledProjection = js.native
  }
  object UnmarshalledLocalSecondaryIndex {
    
    @scala.inline
    def apply(
      IndexName: String,
      KeySchema: js.Array[UnmarshalledKeySchemaElement],
      Projection: UnmarshalledProjection
    ): UnmarshalledLocalSecondaryIndex = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], Projection = Projection.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledLocalSecondaryIndex]
    }
    
    @scala.inline
    implicit class UnmarshalledLocalSecondaryIndexMutableBuilder[Self <: UnmarshalledLocalSecondaryIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeySchema(value: js.Array[UnmarshalledKeySchemaElement]): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySchemaVarargs(value: UnmarshalledKeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
      
      @scala.inline
      def setProjection(value: UnmarshalledProjection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
    }
  }
}
