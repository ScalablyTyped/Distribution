package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserProfileResult extends StObject {
  
  /**
    * The user's IAM ARN.
    */
  var IamUserArn: js.UndefOr[String] = js.native
}
object CreateUserProfileResult {
  
  @scala.inline
  def apply(): CreateUserProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUserProfileResult]
  }
  
  @scala.inline
  implicit class CreateUserProfileResultMutableBuilder[Self <: CreateUserProfileResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIamUserArn(value: String): Self = StObject.set(x, "IamUserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamUserArnUndefined: Self = StObject.set(x, "IamUserArn", js.undefined)
  }
}
