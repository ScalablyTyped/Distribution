package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/types/RestoreTableToPointInTimeInput", JSImport.Namespace)
@js.native
object typesRestoreTableToPointInTimeInputMod extends js.Object {
  @js.native
  trait RestoreTableToPointInTimeInput extends InputTypesUnion {
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
    var $httpOptions: js.UndefOr[NodeHttpOptions] = js.native
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    /**
      * <p>Time in the past to restore the table to.</p>
      */
    var RestoreDateTime: js.UndefOr[Date | String | Double] = js.native
    /**
      * <p>Name of the source table that is being restored.</p>
      */
    var SourceTableName: String = js.native
    /**
      * <p>The name of the new table to which it must be restored to.</p>
      */
    var TargetTableName: String = js.native
    /**
      * <p>Restore the table to the latest possible time. <code>LatestRestorableDateTime</code> is typically 5 minutes before the current time. </p>
      */
    var UseLatestRestorableTime: js.UndefOr[Boolean] = js.native
  }
  
}

