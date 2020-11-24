package typings.awsSdkClientDynamodbNode.typesRestoreSummaryMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreSummary extends js.Object {
  
  /**
    * <p>Point in time or source backup time.</p>
    */
  var RestoreDateTime: Date | String | Double = js.native
  
  /**
    * <p>Indicates if a restore is in progress or not.</p>
    */
  var RestoreInProgress: Boolean = js.native
  
  /**
    * <p>ARN of the backup from which the table was restored.</p>
    */
  var SourceBackupArn: js.UndefOr[String] = js.native
  
  /**
    * <p>ARN of the source table of the backup that is being restored.</p>
    */
  var SourceTableArn: js.UndefOr[String] = js.native
}
object RestoreSummary {
  
  @scala.inline
  def apply(RestoreDateTime: Date | String | Double, RestoreInProgress: Boolean): RestoreSummary = {
    val __obj = js.Dynamic.literal(RestoreDateTime = RestoreDateTime.asInstanceOf[js.Any], RestoreInProgress = RestoreInProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreSummary]
  }
  
  @scala.inline
  implicit class RestoreSummaryOps[Self <: RestoreSummary] (val x: Self) extends AnyVal {
    
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
    def setRestoreDateTime(value: Date | String | Double): Self = this.set("RestoreDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreInProgress(value: Boolean): Self = this.set("RestoreInProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBackupArn(value: String): Self = this.set("SourceBackupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceBackupArn: Self = this.set("SourceBackupArn", js.undefined)
    
    @scala.inline
    def setSourceTableArn(value: String): Self = this.set("SourceTableArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceTableArn: Self = this.set("SourceTableArn", js.undefined)
  }
}
