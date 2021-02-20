package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUserProfileRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the user.
    */
  var userArn: UserArn = js.native
}
object DescribeUserProfileRequest {
  
  @scala.inline
  def apply(userArn: UserArn): DescribeUserProfileRequest = {
    val __obj = js.Dynamic.literal(userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserProfileRequest]
  }
  
  @scala.inline
  implicit class DescribeUserProfileRequestMutableBuilder[Self <: DescribeUserProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserArn(value: UserArn): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
  }
}
