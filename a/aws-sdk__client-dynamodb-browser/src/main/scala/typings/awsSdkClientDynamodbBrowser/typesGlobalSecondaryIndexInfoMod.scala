package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.typesKeySchemaElementMod.KeySchemaElement
import typings.awsSdkClientDynamodbBrowser.typesKeySchemaElementMod.UnmarshalledKeySchemaElement
import typings.awsSdkClientDynamodbBrowser.typesProjectionMod.Projection
import typings.awsSdkClientDynamodbBrowser.typesProjectionMod.UnmarshalledProjection
import typings.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod.ProvisionedThroughput
import typings.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod.UnmarshalledProvisionedThroughput
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGlobalSecondaryIndexInfoMod {
  
  @js.native
  trait GlobalSecondaryIndexInfo extends StObject {
    
    /**
      * <p>The name of the global secondary index.</p>
      */
    var IndexName: js.UndefOr[String] = js.native
    
    /**
      * <p>The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note>
      */
    var KeySchema: js.UndefOr[js.Array[KeySchemaElement] | Iterable[KeySchemaElement]] = js.native
    
    /**
      * <p>Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. </p>
      */
    var Projection: js.UndefOr[typings.awsSdkClientDynamodbBrowser.typesProjectionMod.Projection] = js.native
    
    /**
      * <p>Represents the provisioned throughput settings for the specified global secondary index. </p>
      */
    var ProvisionedThroughput: js.UndefOr[
        typings.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod.ProvisionedThroughput
      ] = js.native
  }
  object GlobalSecondaryIndexInfo {
    
    @scala.inline
    def apply(): GlobalSecondaryIndexInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalSecondaryIndexInfo]
    }
    
    @scala.inline
    implicit class GlobalSecondaryIndexInfoMutableBuilder[Self <: GlobalSecondaryIndexInfo] (val x: Self) extends AnyVal {
      
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
      
      @scala.inline
      def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledGlobalSecondaryIndexInfo extends GlobalSecondaryIndexInfo {
    
    /**
      * <p>The complete key schema for a global secondary index, which consists of one or more pairs of attribute names and key types:</p> <ul> <li> <p> <code>HASH</code> - partition key</p> </li> <li> <p> <code>RANGE</code> - sort key</p> </li> </ul> <note> <p>The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values.</p> <p>The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.</p> </note>
      */
    @JSName("KeySchema")
    var KeySchema_UnmarshalledGlobalSecondaryIndexInfo: js.UndefOr[js.Array[UnmarshalledKeySchemaElement]] = js.native
    
    /**
      * <p>Represents attributes that are copied (projected) from the table into the global secondary index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. </p>
      */
    @JSName("Projection")
    var Projection_UnmarshalledGlobalSecondaryIndexInfo: js.UndefOr[UnmarshalledProjection] = js.native
    
    /**
      * <p>Represents the provisioned throughput settings for the specified global secondary index. </p>
      */
    @JSName("ProvisionedThroughput")
    var ProvisionedThroughput_UnmarshalledGlobalSecondaryIndexInfo: js.UndefOr[UnmarshalledProvisionedThroughput] = js.native
  }
  object UnmarshalledGlobalSecondaryIndexInfo {
    
    @scala.inline
    def apply(): UnmarshalledGlobalSecondaryIndexInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledGlobalSecondaryIndexInfo]
    }
    
    @scala.inline
    implicit class UnmarshalledGlobalSecondaryIndexInfoMutableBuilder[Self <: UnmarshalledGlobalSecondaryIndexInfo] (val x: Self) extends AnyVal {
      
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
      def setProvisionedThroughput(value: UnmarshalledProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
    }
  }
}
