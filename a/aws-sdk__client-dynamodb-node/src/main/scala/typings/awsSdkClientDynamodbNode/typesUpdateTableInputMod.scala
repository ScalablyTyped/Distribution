package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.typesAttributeDefinitionMod.AttributeDefinition
import typings.awsSdkClientDynamodbNode.typesGlobalSecondaryIndexUpdateMod.GlobalSecondaryIndexUpdate
import typings.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.ProvisionedThroughput
import typings.awsSdkClientDynamodbNode.typesSsespecificationMod.SSESpecification
import typings.awsSdkClientDynamodbNode.typesStreamSpecificationMod.StreamSpecification
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateTableInputMod {
  
  trait UpdateTableInput
    extends StObject
       with InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ] = js.undefined
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>An array of attributes that describe the key schema for the table and indexes. If you are adding a new global secondary index to the table, <code>AttributeDefinitions</code> must include the key element(s) of the new index.</p>
      */
    var AttributeDefinitions: js.UndefOr[js.Array[AttributeDefinition] | Iterable[AttributeDefinition]] = js.undefined
    
    /**
      * <p>An array of one or more global secondary indexes for the table. For each index in the array, you can request one action:</p> <ul> <li> <p> <code>Create</code> - add a new global secondary index to the table.</p> </li> <li> <p> <code>Update</code> - modify the provisioned throughput settings of an existing global secondary index.</p> </li> <li> <p> <code>Delete</code> - remove a global secondary index from the table.</p> </li> </ul> <p>For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html">Managing Global Secondary Indexes</a> in the <i>Amazon DynamoDB Developer Guide</i>. </p>
      */
    var GlobalSecondaryIndexUpdates: js.UndefOr[js.Array[GlobalSecondaryIndexUpdate] | Iterable[GlobalSecondaryIndexUpdate]] = js.undefined
    
    /**
      * <p>The new provisioned throughput settings for the specified table or index.</p>
      */
    var ProvisionedThroughput: js.UndefOr[
        typings.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.ProvisionedThroughput
      ] = js.undefined
    
    /**
      * <p>The new server-side encryption settings for the specified table.</p>
      */
    var SSESpecification: js.UndefOr[typings.awsSdkClientDynamodbNode.typesSsespecificationMod.SSESpecification] = js.undefined
    
    /**
      * <p>Represents the DynamoDB Streams configuration for the table.</p> <note> <p>You will receive a <code>ResourceInUseException</code> if you attempt to enable a stream on a table that already has a stream, or if you attempt to disable a stream on a table which does not have a stream.</p> </note>
      */
    var StreamSpecification: js.UndefOr[typings.awsSdkClientDynamodbNode.typesStreamSpecificationMod.StreamSpecification] = js.undefined
    
    /**
      * <p>The name of the table to be updated.</p>
      */
    var TableName: String
  }
  object UpdateTableInput {
    
    @scala.inline
    def apply(TableName: String): UpdateTableInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateTableInput]
    }
    
    @scala.inline
    implicit class UpdateTableInputMutableBuilder[Self <: UpdateTableInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      @scala.inline
      def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      @scala.inline
      def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      @scala.inline
      def setAttributeDefinitions(value: js.Array[AttributeDefinition] | Iterable[AttributeDefinition]): Self = StObject.set(x, "AttributeDefinitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeDefinitionsUndefined: Self = StObject.set(x, "AttributeDefinitions", js.undefined)
      
      @scala.inline
      def setAttributeDefinitionsVarargs(value: AttributeDefinition*): Self = StObject.set(x, "AttributeDefinitions", js.Array(value :_*))
      
      @scala.inline
      def setGlobalSecondaryIndexUpdates(value: js.Array[GlobalSecondaryIndexUpdate] | Iterable[GlobalSecondaryIndexUpdate]): Self = StObject.set(x, "GlobalSecondaryIndexUpdates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSecondaryIndexUpdatesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexUpdates", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexUpdatesVarargs(value: GlobalSecondaryIndexUpdate*): Self = StObject.set(x, "GlobalSecondaryIndexUpdates", js.Array(value :_*))
      
      @scala.inline
      def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
      
      @scala.inline
      def setSSESpecification(value: SSESpecification): Self = StObject.set(x, "SSESpecification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSESpecificationUndefined: Self = StObject.set(x, "SSESpecification", js.undefined)
      
      @scala.inline
      def setStreamSpecification(value: StreamSpecification): Self = StObject.set(x, "StreamSpecification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamSpecificationUndefined: Self = StObject.set(x, "StreamSpecification", js.undefined)
      
      @scala.inline
      def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
}
