package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAccountResponse extends StObject {
  
  /**
    * A structure that contains details about the request to create an account. This response structure might not be fully populated when you first receive it because account creation is an asynchronous process. You can pass the returned CreateAccountStatus ID as a parameter to DescribeCreateAccountStatus to get status about the progress of the request at later times. You can also check the AWS CloudTrail log for the CreateAccountResult event. For more information, see Monitoring the Activity in Your Organization in the AWS Organizations User Guide.
    */
  var CreateAccountStatus: js.UndefOr[typings.awsSdk.organizationsMod.CreateAccountStatus] = js.native
}
object CreateAccountResponse {
  
  @scala.inline
  def apply(): CreateAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAccountResponse]
  }
  
  @scala.inline
  implicit class CreateAccountResponseMutableBuilder[Self <: CreateAccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateAccountStatus(value: CreateAccountStatus): Self = StObject.set(x, "CreateAccountStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateAccountStatusUndefined: Self = StObject.set(x, "CreateAccountStatus", js.undefined)
  }
}
