package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.typesKeySchemaElementMod.KeySchemaElement
import typings.awsSdkClientDynamodbNode.typesKeySchemaElementMod.UnmarshalledKeySchemaElement
import typings.awsSdkClientDynamodbNode.typesProjectionMod.Projection
import typings.awsSdkClientDynamodbNode.typesProjectionMod.UnmarshalledProjection
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLocalSecondaryIndexInfoMod {
  
  trait LocalSecondaryIndexInfo extends StObject {
    
    /**
      * <p>Represents the name of the local secondary index.</p>
      */
    var IndexName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The complete key schema for a local secondary index, which consists of one or more pairs of attribute names and key types:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note>
      */
    var KeySchema: js.UndefOr[js.Array[KeySchemaElement] | Iterable[KeySchemaElement]] = js.undefined
    
    /**
      * <p>Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. </p>
      */
    var Projection: js.UndefOr[typings.awsSdkClientDynamodbNode.typesProjectionMod.Projection] = js.undefined
  }
  object LocalSecondaryIndexInfo {
    
    @scala.inline
    def apply(): LocalSecondaryIndexInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocalSecondaryIndexInfo]
    }
    
    @scala.inline
    implicit class LocalSecondaryIndexInfoMutableBuilder[Self <: LocalSecondaryIndexInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexName(value: String): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
      
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
    }
  }
  
  trait UnmarshalledLocalSecondaryIndexInfo
    extends StObject
       with LocalSecondaryIndexInfo {
    
    /**
      * <p>The complete key schema for a local secondary index, which consists of one or more pairs of attribute names and key types:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note>
      */
    @JSName("KeySchema")
    var KeySchema_UnmarshalledLocalSecondaryIndexInfo: js.UndefOr[js.Array[UnmarshalledKeySchemaElement]] = js.undefined
    
    /**
      * <p>Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. </p>
      */
    @JSName("Projection")
    var Projection_UnmarshalledLocalSecondaryIndexInfo: js.UndefOr[UnmarshalledProjection] = js.undefined
  }
  object UnmarshalledLocalSecondaryIndexInfo {
    
    @scala.inline
    def apply(): UnmarshalledLocalSecondaryIndexInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledLocalSecondaryIndexInfo]
    }
    
    @scala.inline
    implicit class UnmarshalledLocalSecondaryIndexInfoMutableBuilder[Self <: UnmarshalledLocalSecondaryIndexInfo] (val x: Self) extends AnyVal {
      
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
    }
  }
}
