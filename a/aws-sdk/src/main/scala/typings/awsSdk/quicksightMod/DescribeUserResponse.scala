package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserResponse extends StObject {
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  
  /**
    * The user name.
    */
  var User: js.UndefOr[typings.awsSdk.quicksightMod.User] = js.undefined
}
object DescribeUserResponse {
  
  @scala.inline
  def apply(): DescribeUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserResponse]
  }
  
  @scala.inline
  implicit class DescribeUserResponseMutableBuilder[Self <: DescribeUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
