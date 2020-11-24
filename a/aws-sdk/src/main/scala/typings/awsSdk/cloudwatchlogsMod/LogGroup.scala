package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogGroup extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the log group.
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    * The creation time of the log group, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the CMK to use when encrypting log data.
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.native
  
  /**
    * The name of the log group.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.native
  
  /**
    * The number of metric filters.
    */
  var metricFilterCount: js.UndefOr[FilterCount] = js.native
  
  var retentionInDays: js.UndefOr[Days] = js.native
  
  /**
    * The number of bytes stored.
    */
  var storedBytes: js.UndefOr[StoredBytes] = js.native
}
object LogGroup {
  
  @scala.inline
  def apply(): LogGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogGroup]
  }
  
  @scala.inline
  implicit class LogGroupOps[Self <: LogGroup] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = this.set("logGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogGroupName: Self = this.set("logGroupName", js.undefined)
    
    @scala.inline
    def setMetricFilterCount(value: FilterCount): Self = this.set("metricFilterCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricFilterCount: Self = this.set("metricFilterCount", js.undefined)
    
    @scala.inline
    def setRetentionInDays(value: Days): Self = this.set("retentionInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionInDays: Self = this.set("retentionInDays", js.undefined)
    
    @scala.inline
    def setStoredBytes(value: StoredBytes): Self = this.set("storedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoredBytes: Self = this.set("storedBytes", js.undefined)
  }
}
