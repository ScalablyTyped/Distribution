package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRetentionPolicyRequest extends StObject {
  
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
  
  var retentionInDays: Days
}
object PutRetentionPolicyRequest {
  
  @scala.inline
  def apply(logGroupName: LogGroupName, retentionInDays: Days): PutRetentionPolicyRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any], retentionInDays = retentionInDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRetentionPolicyRequest]
  }
  
  @scala.inline
  implicit class PutRetentionPolicyRequestMutableBuilder[Self <: PutRetentionPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionInDays(value: Days): Self = StObject.set(x, "retentionInDays", value.asInstanceOf[js.Any])
  }
}
