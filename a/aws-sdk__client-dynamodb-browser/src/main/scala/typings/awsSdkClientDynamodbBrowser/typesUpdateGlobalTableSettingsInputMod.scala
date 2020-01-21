package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsUpdateMod.AutoScalingSettingsUpdate
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.BrowserHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/types/UpdateGlobalTableSettingsInput", JSImport.Namespace)
@js.native
object typesUpdateGlobalTableSettingsInputMod extends js.Object {
  @js.native
  trait UpdateGlobalTableSettingsInput extends InputTypesUnion {
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
      * <p>Represents the settings of a global secondary index for a global table that will be modified.</p>
      */
    var GlobalTableGlobalSecondaryIndexSettingsUpdate: js.UndefOr[
        (js.Array[
          typings.awsSdkClientDynamodbBrowser.typesGlobalTableGlobalSecondaryIndexSettingsUpdateMod.GlobalTableGlobalSecondaryIndexSettingsUpdate
        ]) | (Iterable[
          typings.awsSdkClientDynamodbBrowser.typesGlobalTableGlobalSecondaryIndexSettingsUpdateMod.GlobalTableGlobalSecondaryIndexSettingsUpdate
        ])
      ] = js.native
    /**
      * <p>The name of the global table</p>
      */
    var GlobalTableName: String = js.native
    /**
      * <p>AutoScaling settings for managing provisioned write capacity for the global table.</p>
      */
    var GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
    /**
      * <p>The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException.</code> </p>
      */
    var GlobalTableProvisionedWriteCapacityUnits: js.UndefOr[Double] = js.native
    /**
      * <p>Represents the settings for a global table in a region that will be modified.</p>
      */
    var ReplicaSettingsUpdate: js.UndefOr[
        (js.Array[
          typings.awsSdkClientDynamodbBrowser.typesReplicaSettingsUpdateMod.ReplicaSettingsUpdate
        ]) | (Iterable[
          typings.awsSdkClientDynamodbBrowser.typesReplicaSettingsUpdateMod.ReplicaSettingsUpdate
        ])
      ] = js.native
  }
  
}

