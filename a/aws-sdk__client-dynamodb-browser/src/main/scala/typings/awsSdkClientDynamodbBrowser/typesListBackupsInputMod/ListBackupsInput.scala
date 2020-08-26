package typings.awsSdkClientDynamodbBrowser.typesListBackupsInputMod

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ALL
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.SYSTEM
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.USER
import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.BrowserHttpOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object ListBackupsInput {
  @scala.inline
  def apply(): ListBackupsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBackupsInput]
  }
  @scala.inline
  implicit class ListBackupsInputOps[Self <: ListBackupsInput] (val x: Self) extends AnyVal {
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
    def set$abortSignal(value: AbortSignal): Self = this.set("$abortSignal", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$abortSignal: Self = this.set("$abortSignal", js.undefined)
    @scala.inline
    def set$httpOptions(value: BrowserHttpOptions): Self = this.set("$httpOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$httpOptions: Self = this.set("$httpOptions", js.undefined)
    @scala.inline
    def set$maxRetries(value: Double): Self = this.set("$maxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$maxRetries: Self = this.set("$maxRetries", js.undefined)
    @scala.inline
    def setBackupType(value: USER | SYSTEM | ALL | String): Self = this.set("BackupType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupType: Self = this.set("BackupType", js.undefined)
    @scala.inline
    def setExclusiveStartBackupArn(value: String): Self = this.set("ExclusiveStartBackupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusiveStartBackupArn: Self = this.set("ExclusiveStartBackupArn", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setTableName(value: String): Self = this.set("TableName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableName: Self = this.set("TableName", js.undefined)
    @scala.inline
    def setTimeRangeLowerBound(value: Date | String | Double): Self = this.set("TimeRangeLowerBound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeRangeLowerBound: Self = this.set("TimeRangeLowerBound", js.undefined)
    @scala.inline
    def setTimeRangeUpperBound(value: Date | String | Double): Self = this.set("TimeRangeUpperBound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeRangeUpperBound: Self = this.set("TimeRangeUpperBound", js.undefined)
  }
  
}

