package typings.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CognitoStreams extends StObject {
  
  /**
    * The ARN of the role Amazon Cognito can assume in order to publish to the stream. This role must grant access to Amazon Cognito (cognito-sync) to invoke PutRecord on your Cognito stream.
    */
  var RoleArn: js.UndefOr[AssumeRoleArn] = js.native
  
  /**
    * The name of the Cognito stream to receive updates. This stream must be in the developers account and in the same region as the identity pool.
    */
  var StreamName: js.UndefOr[typings.awsSdk.cognitosyncMod.StreamName] = js.native
  
  /**
    * Status of the Cognito streams. Valid values are: ENABLED - Streaming of updates to identity pool is enabled. DISABLED - Streaming of updates to identity pool is disabled. Bulk publish will also fail if StreamingStatus is DISABLED.
    */
  var StreamingStatus: js.UndefOr[typings.awsSdk.cognitosyncMod.StreamingStatus] = js.native
}
object CognitoStreams {
  
  @scala.inline
  def apply(): CognitoStreams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CognitoStreams]
  }
  
  @scala.inline
  implicit class CognitoStreamsMutableBuilder[Self <: CognitoStreams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoleArn(value: AssumeRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
    
    @scala.inline
    def setStreamingStatus(value: StreamingStatus): Self = StObject.set(x, "StreamingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingStatusUndefined: Self = StObject.set(x, "StreamingStatus", js.undefined)
  }
}
