package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.typesKeySchemaElementMod.KeySchemaElement
import typings.awsSdkClientDynamodbNode.typesKeySchemaElementMod.UnmarshalledKeySchemaElement
import typings.awsSdkClientDynamodbNode.typesProjectionMod.Projection
import typings.awsSdkClientDynamodbNode.typesProjectionMod.UnmarshalledProjection
import typings.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.ProvisionedThroughput
import typings.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.UnmarshalledProvisionedThroughput
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateGlobalSecondaryIndexActionMod {
  
  @js.native
  trait CreateGlobalSecondaryIndexAction extends StObject {
    
    /**
      * <p>The name of the global secondary index to be created.</p>
      */
    var IndexName: String = js.native
    
    /**
      * <p>The key schema for the global secondary index.</p>
      */
    var KeySchema: js.Array[KeySchemaElement] | Iterable[KeySchemaElement] = js.native
    
    /**
      * <p>Represents attributes that are copied (projected) from the table into an index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.</p>
      */
    var Projection: typings.awsSdkClientDynamodbNode.typesProjectionMod.Projection = js.native
    
    /**
      * <p>Represents the provisioned throughput settings for the specified global secondary index.</p> <p>For current minimum and maximum provisioned throughput values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var ProvisionedThroughput: typings.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.ProvisionedThroughput = js.native
  }
  object CreateGlobalSecondaryIndexAction {
    
    @scala.inline
    def apply(
      IndexName: String,
      KeySchema: js.Array[KeySchemaElement] | Iterable[KeySchemaElement],
      Projection: Projection,
      ProvisionedThroughput: ProvisionedThroughput
    ): CreateGlobalSecondaryIndexAction = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], Projection = Projection.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateGlobalSecondaryIndexAction]
    }
    
    @scala.inline
    implicit class CreateGlobalSecondaryIndexActionMutableBuilder[Self <: CreateGlobalSecondaryIndexAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexName(value: String): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySchema(value: js.Array[KeySchemaElement] | Iterable[KeySchemaElement]): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
      
      @scala.inline
      def setProjection(value: Projection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnmarshalledCreateGlobalSecondaryIndexAction extends CreateGlobalSecondaryIndexAction {
    
    /**
      * <p>The key schema for the global secondary index.</p>
      */
    @JSName("KeySchema")
    var KeySchema_UnmarshalledCreateGlobalSecondaryIndexAction: js.Array[UnmarshalledKeySchemaElement] = js.native
    
    /**
      * <p>Represents attributes that are copied (projected) from the table into an index. These are in addition to the primary key attributes and index key attributes, which are automatically projected.</p>
      */
    @JSName("Projection")
    var Projection_UnmarshalledCreateGlobalSecondaryIndexAction: UnmarshalledProjection = js.native
    
    /**
      * <p>Represents the provisioned throughput settings for the specified global secondary index.</p> <p>For current minimum and maximum provisioned throughput values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    @JSName("ProvisionedThroughput")
    var ProvisionedThroughput_UnmarshalledCreateGlobalSecondaryIndexAction: UnmarshalledProvisionedThroughput = js.native
  }
  object UnmarshalledCreateGlobalSecondaryIndexAction {
    
    @scala.inline
    def apply(
      IndexName: String,
      KeySchema: js.Array[UnmarshalledKeySchemaElement],
      Projection: UnmarshalledProjection,
      ProvisionedThroughput: UnmarshalledProvisionedThroughput
    ): UnmarshalledCreateGlobalSecondaryIndexAction = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], Projection = Projection.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledCreateGlobalSecondaryIndexAction]
    }
    
    @scala.inline
    implicit class UnmarshalledCreateGlobalSecondaryIndexActionMutableBuilder[Self <: UnmarshalledCreateGlobalSecondaryIndexAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeySchema(value: js.Array[UnmarshalledKeySchemaElement]): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySchemaVarargs(value: UnmarshalledKeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
      
      @scala.inline
      def setProjection(value: UnmarshalledProjection): Self = StObject.set(x, "Projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughput(value: UnmarshalledProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    }
  }
}
