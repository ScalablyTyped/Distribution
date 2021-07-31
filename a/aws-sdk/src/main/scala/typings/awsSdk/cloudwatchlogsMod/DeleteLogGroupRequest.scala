package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLogGroupRequest extends StObject {
  
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
}
object DeleteLogGroupRequest {
  
  @scala.inline
  def apply(logGroupName: LogGroupName): DeleteLogGroupRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLogGroupRequest]
  }
  
  @scala.inline
  implicit class DeleteLogGroupRequestMutableBuilder[Self <: DeleteLogGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
  }
}
