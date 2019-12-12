package typings.atAwsDashSdkClientDashDynamodbDashBrowser

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.ALL
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.SYSTEM
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.USER
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.BrowserHttpOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/types/ListBackupsInput", JSImport.Namespace)
@js.native
object typesListBackupsInputMod extends js.Object {
  @js.native
  trait ListBackupsInput extends InputTypesUnion {
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
      * <p>The backups from the table specified by <code>BackupType</code> are listed.</p> <p>Where <code>BackupType</code> can be:</p> <ul> <li> <p> <code>USER</code> - On-demand backup created by you.</p> </li> <li> <p> <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.</p> </li> <li> <p> <code>ALL</code> - All types of on-demand backups (USER and SYSTEM).</p> </li> </ul>
      */
    var BackupType: js.UndefOr[USER | SYSTEM | ALL | String] = js.native
    /**
      * <p> <code>LastEvaluatedBackupArn</code> is the ARN of the backup last evaluated when the current page of results was returned, inclusive of the current page of results. This value may be specified as the <code>ExclusiveStartBackupArn</code> of a new <code>ListBackups</code> operation in order to fetch the next page of results. </p>
      */
    var ExclusiveStartBackupArn: js.UndefOr[String] = js.native
    /**
      * <p>Maximum number of backups to return at once.</p>
      */
    var Limit: js.UndefOr[Double] = js.native
    /**
      * <p>The backups from the table specified by <code>TableName</code> are listed. </p>
      */
    var TableName: js.UndefOr[String] = js.native
    /**
      * <p>Only backups created after this time are listed. <code>TimeRangeLowerBound</code> is inclusive.</p>
      */
    var TimeRangeLowerBound: js.UndefOr[Date | String | Double] = js.native
    /**
      * <p>Only backups created before this time are listed. <code>TimeRangeUpperBound</code> is exclusive. </p>
      */
    var TimeRangeUpperBound: js.UndefOr[Date | String | Double] = js.native
  }
  
}

