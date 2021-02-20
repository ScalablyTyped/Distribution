package typings.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushSync extends StObject {
  
  /**
    * List of SNS platform application ARNs that could be used by clients.
    */
  var ApplicationArns: js.UndefOr[ApplicationArnList] = js.native
  
  /**
    * A role configured to allow Cognito to call SNS on behalf of the developer.
    */
  var RoleArn: js.UndefOr[AssumeRoleArn] = js.native
}
object PushSync {
  
  @scala.inline
  def apply(): PushSync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushSync]
  }
  
  @scala.inline
  implicit class PushSyncMutableBuilder[Self <: PushSync] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationArns(value: ApplicationArnList): Self = StObject.set(x, "ApplicationArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationArnsUndefined: Self = StObject.set(x, "ApplicationArns", js.undefined)
    
    @scala.inline
    def setApplicationArnsVarargs(value: ApplicationArn*): Self = StObject.set(x, "ApplicationArns", js.Array(value :_*))
    
    @scala.inline
    def setRoleArn(value: AssumeRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
