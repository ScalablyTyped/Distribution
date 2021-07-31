package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingInfo extends StObject {
  
  var BrokerLogs: typings.awsSdk.kafkaMod.BrokerLogs
}
object LoggingInfo {
  
  @scala.inline
  def apply(BrokerLogs: BrokerLogs): LoggingInfo = {
    val __obj = js.Dynamic.literal(BrokerLogs = BrokerLogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingInfo]
  }
  
  @scala.inline
  implicit class LoggingInfoMutableBuilder[Self <: LoggingInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrokerLogs(value: BrokerLogs): Self = StObject.set(x, "BrokerLogs", value.asInstanceOf[js.Any])
  }
}
