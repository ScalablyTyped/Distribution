package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrokerLogs extends StObject {
  
  var CloudWatchLogs: js.UndefOr[typings.awsSdk.kafkaMod.CloudWatchLogs] = js.undefined
  
  var Firehose: js.UndefOr[typings.awsSdk.kafkaMod.Firehose] = js.undefined
  
  var S3: js.UndefOr[typings.awsSdk.kafkaMod.S3] = js.undefined
}
object BrokerLogs {
  
  @scala.inline
  def apply(): BrokerLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerLogs]
  }
  
  @scala.inline
  implicit class BrokerLogsMutableBuilder[Self <: BrokerLogs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchLogs(value: CloudWatchLogs): Self = StObject.set(x, "CloudWatchLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLogsUndefined: Self = StObject.set(x, "CloudWatchLogs", js.undefined)
    
    @scala.inline
    def setFirehose(value: Firehose): Self = StObject.set(x, "Firehose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirehoseUndefined: Self = StObject.set(x, "Firehose", js.undefined)
    
    @scala.inline
    def setS3(value: S3): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Undefined: Self = StObject.set(x, "S3", js.undefined)
  }
}
