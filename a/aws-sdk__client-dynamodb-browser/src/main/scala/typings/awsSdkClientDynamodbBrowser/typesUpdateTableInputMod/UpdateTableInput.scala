package typings.awsSdkClientDynamodbBrowser.typesUpdateTableInputMod

import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesAttributeDefinitionMod.AttributeDefinition
import typings.awsSdkClientDynamodbBrowser.typesGlobalSecondaryIndexUpdateMod.GlobalSecondaryIndexUpdate
import typings.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod.ProvisionedThroughput
import typings.awsSdkClientDynamodbBrowser.typesSsespecificationMod.SSESpecification
import typings.awsSdkClientDynamodbBrowser.typesStreamSpecificationMod.StreamSpecification
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTableInput extends InputTypesUnion {
  
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.native
  
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
  ] = js.native
  
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.native
  
  /**
    * <p>An array of attributes that describe the key schema for the table and indexes. If you are adding a new global secondary index to the table, <code>AttributeDefinitions</code> must include the key element(s) of the new index.</p>
    */
  var AttributeDefinitions: js.UndefOr[js.Array[AttributeDefinition] | Iterable[AttributeDefinition]] = js.native
  
  /**
    * <p>An array of one or more global secondary indexes for the table. For each index in the array, you can request one action:</p> <ul> <li> <p> <code>Create</code> - add a new global secondary index to the table.</p> </li> <li> <p> <code>Update</code> - modify the provisioned throughput settings of an existing global secondary index.</p> </li> <li> <p> <code>Delete</code> - remove a global secondary index from the table.</p> </li> </ul> <p>For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html">Managing Global Secondary Indexes</a> in the <i>Amazon DynamoDB Developer Guide</i>. </p>
    */
  var GlobalSecondaryIndexUpdates: js.UndefOr[js.Array[GlobalSecondaryIndexUpdate] | Iterable[GlobalSecondaryIndexUpdate]] = js.native
  
  /**
    * <p>The new provisioned throughput settings for the specified table or index.</p>
    */
  var ProvisionedThroughput: js.UndefOr[
    typings.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod.ProvisionedThroughput
  ] = js.native
  
  /**
    * <p>The new server-side encryption settings for the specified table.</p>
    */
  var SSESpecification: js.UndefOr[typings.awsSdkClientDynamodbBrowser.typesSsespecificationMod.SSESpecification] = js.native
  
  /**
    * <p>Represents the DynamoDB Streams configuration for the table.</p> <note> <p>You will receive a <code>ResourceInUseException</code> if you attempt to enable a stream on a table that already has a stream, or if you attempt to disable a stream on a table which does not have a stream.</p> </note>
    */
  var StreamSpecification: js.UndefOr[
    typings.awsSdkClientDynamodbBrowser.typesStreamSpecificationMod.StreamSpecification
  ] = js.native
  
  /**
    * <p>The name of the table to be updated.</p>
    */
  var TableName: String = js.native
}
object UpdateTableInput {
  
  @scala.inline
  def apply(TableName: String): UpdateTableInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableInput]
  }
  
  @scala.inline
  implicit class UpdateTableInputOps[Self <: UpdateTableInput] (val x: Self) extends AnyVal {
    
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
    def setTableName(value: String): Self = this.set("TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$abortSignal(value: AbortSignal): Self = this.set("$abortSignal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$abortSignal: Self = this.set("$abortSignal", js.undefined)
    
    @scala.inline
    def set$httpOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
    ): Self = this.set("$httpOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$httpOptions: Self = this.set("$httpOptions", js.undefined)
    
    @scala.inline
    def set$maxRetries(value: Double): Self = this.set("$maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$maxRetries: Self = this.set("$maxRetries", js.undefined)
    
    @scala.inline
    def setAttributeDefinitionsVarargs(value: AttributeDefinition*): Self = this.set("AttributeDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setAttributeDefinitions(value: js.Array[AttributeDefinition] | Iterable[AttributeDefinition]): Self = this.set("AttributeDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeDefinitions: Self = this.set("AttributeDefinitions", js.undefined)
    
    @scala.inline
    def setGlobalSecondaryIndexUpdatesVarargs(value: GlobalSecondaryIndexUpdate*): Self = this.set("GlobalSecondaryIndexUpdates", js.Array(value :_*))
    
    @scala.inline
    def setGlobalSecondaryIndexUpdates(value: js.Array[GlobalSecondaryIndexUpdate] | Iterable[GlobalSecondaryIndexUpdate]): Self = this.set("GlobalSecondaryIndexUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalSecondaryIndexUpdates: Self = this.set("GlobalSecondaryIndexUpdates", js.undefined)
    
    @scala.inline
    def setProvisionedThroughput(value: ProvisionedThroughput): Self = this.set("ProvisionedThroughput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedThroughput: Self = this.set("ProvisionedThroughput", js.undefined)
    
    @scala.inline
    def setSSESpecification(value: SSESpecification): Self = this.set("SSESpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSSESpecification: Self = this.set("SSESpecification", js.undefined)
    
    @scala.inline
    def setStreamSpecification(value: StreamSpecification): Self = this.set("StreamSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamSpecification: Self = this.set("StreamSpecification", js.undefined)
  }
}
