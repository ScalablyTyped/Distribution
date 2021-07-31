package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRetentionPolicyRequest extends StObject {
  
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
}
object DeleteRetentionPolicyRequest {
  
  @scala.inline
  def apply(logGroupName: LogGroupName): DeleteRetentionPolicyRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRetentionPolicyRequest]
  }
  
  @scala.inline
  implicit class DeleteRetentionPolicyRequestMutableBuilder[Self <: DeleteRetentionPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
  }
}
