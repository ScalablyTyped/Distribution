package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateTableInputMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreAttributeDefinitionMod._AttributeDefinition
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreGlobalSecondaryIndexUpdateMod._GlobalSecondaryIndexUpdate
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreProvisionedThroughputMod._ProvisionedThroughput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreSSESpecificationMod._SSESpecification
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreStreamSpecificationMod._StreamSpecification
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.NodeHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTableInput extends InputTypesUnion {
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
  var $httpOptions: js.UndefOr[NodeHttpOptions] = js.undefined
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.undefined
  /**
    * <p>An array of attributes that describe the key schema for the table and indexes. If you are adding a new global secondary index to the table, <code>AttributeDefinitions</code> must include the key element(s) of the new index.</p>
    */
  var AttributeDefinitions: js.UndefOr[js.Array[_AttributeDefinition] | Iterable[_AttributeDefinition]] = js.undefined
  /**
    * <p>An array of one or more global secondary indexes for the table. For each index in the array, you can request one action:</p> <ul> <li> <p> <code>Create</code> - add a new global secondary index to the table.</p> </li> <li> <p> <code>Update</code> - modify the provisioned throughput settings of an existing global secondary index.</p> </li> <li> <p> <code>Delete</code> - remove a global secondary index from the table.</p> </li> </ul> <p>For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html">Managing Global Secondary Indexes</a> in the <i>Amazon DynamoDB Developer Guide</i>. </p>
    */
  var GlobalSecondaryIndexUpdates: js.UndefOr[js.Array[_GlobalSecondaryIndexUpdate] | Iterable[_GlobalSecondaryIndexUpdate]] = js.undefined
  /**
    * <p>The new provisioned throughput settings for the specified table or index.</p>
    */
  var ProvisionedThroughput: js.UndefOr[_ProvisionedThroughput] = js.undefined
  /**
    * <p>The new server-side encryption settings for the specified table.</p>
    */
  var SSESpecification: js.UndefOr[_SSESpecification] = js.undefined
  /**
    * <p>Represents the DynamoDB Streams configuration for the table.</p> <note> <p>You will receive a <code>ResourceInUseException</code> if you attempt to enable a stream on a table that already has a stream, or if you attempt to disable a stream on a table which does not have a stream.</p> </note>
    */
  var StreamSpecification: js.UndefOr[_StreamSpecification] = js.undefined
  /**
    * <p>The name of the table to be updated.</p>
    */
  var TableName: String
}

object UpdateTableInput {
  @scala.inline
  def apply(
    TableName: String,
    $abortSignal: AbortSignal = null,
    $httpOptions: NodeHttpOptions = null,
    $maxRetries: Int | Double = null,
    AttributeDefinitions: js.Array[_AttributeDefinition] | Iterable[_AttributeDefinition] = null,
    GlobalSecondaryIndexUpdates: js.Array[_GlobalSecondaryIndexUpdate] | Iterable[_GlobalSecondaryIndexUpdate] = null,
    ProvisionedThroughput: _ProvisionedThroughput = null,
    SSESpecification: _SSESpecification = null,
    StreamSpecification: _StreamSpecification = null
  ): UpdateTableInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if (AttributeDefinitions != null) __obj.updateDynamic("AttributeDefinitions")(AttributeDefinitions.asInstanceOf[js.Any])
    if (GlobalSecondaryIndexUpdates != null) __obj.updateDynamic("GlobalSecondaryIndexUpdates")(GlobalSecondaryIndexUpdates.asInstanceOf[js.Any])
    if (ProvisionedThroughput != null) __obj.updateDynamic("ProvisionedThroughput")(ProvisionedThroughput.asInstanceOf[js.Any])
    if (SSESpecification != null) __obj.updateDynamic("SSESpecification")(SSESpecification.asInstanceOf[js.Any])
    if (StreamSpecification != null) __obj.updateDynamic("StreamSpecification")(StreamSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableInput]
  }
}

