package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLogStreamRequest extends StObject {
  
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
  
  /**
    * The name of the log stream.
    */
  var logStreamName: LogStreamName
}
object DeleteLogStreamRequest {
  
  @scala.inline
  def apply(logGroupName: LogGroupName, logStreamName: LogStreamName): DeleteLogStreamRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any], logStreamName = logStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLogStreamRequest]
  }
  
  @scala.inline
  implicit class DeleteLogStreamRequestMutableBuilder[Self <: DeleteLogStreamRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogStreamName(value: LogStreamName): Self = StObject.set(x, "logStreamName", value.asInstanceOf[js.Any])
  }
}
