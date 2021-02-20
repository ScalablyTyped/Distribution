package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAccessKeyLastUsedResponse extends StObject {
  
  /**
    * Contains information about the last time the access key was used.
    */
  var AccessKeyLastUsed: js.UndefOr[typings.awsSdk.iamMod.AccessKeyLastUsed] = js.native
  
  /**
    * The name of the AWS IAM user that owns this access key. 
    */
  var UserName: js.UndefOr[existingUserNameType] = js.native
}
object GetAccessKeyLastUsedResponse {
  
  @scala.inline
  def apply(): GetAccessKeyLastUsedResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessKeyLastUsedResponse]
  }
  
  @scala.inline
  implicit class GetAccessKeyLastUsedResponseMutableBuilder[Self <: GetAccessKeyLastUsedResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessKeyLastUsed(value: AccessKeyLastUsed): Self = StObject.set(x, "AccessKeyLastUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyLastUsedUndefined: Self = StObject.set(x, "AccessKeyLastUsed", js.undefined)
    
    @scala.inline
    def setUserName(value: existingUserNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
