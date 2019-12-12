package typings.atAwsDashSdkClientDashDynamodbDashBrowser

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreAttributeDefinitionMod._AttributeDefinition
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreGlobalSecondaryIndexUpdateMod._GlobalSecondaryIndexUpdate
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreProvisionedThroughputMod._ProvisionedThroughput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreSSESpecificationMod._SSESpecification
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreStreamSpecificationMod._StreamSpecification
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.BrowserHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/types/UpdateTableInput", JSImport.Namespace)
@js.native
object typesUpdateTableInputMod extends js.Object {
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
    var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.native
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    /**
      * <p>An array of attributes that describe the key schema for the table and indexes. If you are adding a new global secondary index to the table, <code>AttributeDefinitions</code> must include the key element(s) of the new index.</p>
      */
    var AttributeDefinitions: js.UndefOr[js.Array[_AttributeDefinition] | Iterable[_AttributeDefinition]] = js.native
    /**
      * <p>An array of one or more global secondary indexes for the table. For each index in the array, you can request one action:</p> <ul> <li> <p> <code>Create</code> - add a new global secondary index to the table.</p> </li> <li> <p> <code>Update</code> - modify the provisioned throughput settings of an existing global secondary index.</p> </li> <li> <p> <code>Delete</code> - remove a global secondary index from the table.</p> </li> </ul> <p>For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.OnlineOps.html">Managing Global Secondary Indexes</a> in the <i>Amazon DynamoDB Developer Guide</i>. </p>
      */
    var GlobalSecondaryIndexUpdates: js.UndefOr[js.Array[_GlobalSecondaryIndexUpdate] | Iterable[_GlobalSecondaryIndexUpdate]] = js.native
    /**
      * <p>The new provisioned throughput settings for the specified table or index.</p>
      */
    var ProvisionedThroughput: js.UndefOr[_ProvisionedThroughput] = js.native
    /**
      * <p>The new server-side encryption settings for the specified table.</p>
      */
    var SSESpecification: js.UndefOr[_SSESpecification] = js.native
    /**
      * <p>Represents the DynamoDB Streams configuration for the table.</p> <note> <p>You will receive a <code>ResourceInUseException</code> if you attempt to enable a stream on a table that already has a stream, or if you attempt to disable a stream on a table which does not have a stream.</p> </note>
      */
    var StreamSpecification: js.UndefOr[_StreamSpecification] = js.native
    /**
      * <p>The name of the table to be updated.</p>
      */
    var TableName: String = js.native
  }
  
}

