package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrokerLogs extends js.Object {
  
  var CloudWatchLogs: js.UndefOr[typings.awsSdk.kafkaMod.CloudWatchLogs] = js.native
  
  var Firehose: js.UndefOr[typings.awsSdk.kafkaMod.Firehose] = js.native
  
  var S3: js.UndefOr[typings.awsSdk.kafkaMod.S3] = js.native
}
object BrokerLogs {
  
  @scala.inline
  def apply(): BrokerLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerLogs]
  }
  
  @scala.inline
  implicit class BrokerLogsOps[Self <: BrokerLogs] (val x: Self) extends AnyVal {
    
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
    def setCloudWatchLogs(value: CloudWatchLogs): Self = this.set("CloudWatchLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchLogs: Self = this.set("CloudWatchLogs", js.undefined)
    
    @scala.inline
    def setFirehose(value: Firehose): Self = this.set("Firehose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirehose: Self = this.set("Firehose", js.undefined)
    
    @scala.inline
    def setS3(value: S3): Self = this.set("S3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3: Self = this.set("S3", js.undefined)
  }
}
