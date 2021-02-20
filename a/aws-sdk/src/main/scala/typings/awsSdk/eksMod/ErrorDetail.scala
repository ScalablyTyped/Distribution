package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorDetail extends StObject {
  
  /**
    * A brief description of the error.     SubnetNotFound: We couldn't find one of the subnets associated with the cluster.    SecurityGroupNotFound: We couldn't find one of the security groups associated with the cluster.    EniLimitReached: You have reached the elastic network interface limit for your account.    IpNotAvailable: A subnet associated with the cluster doesn't have any free IP addresses.    AccessDenied: You don't have permissions to perform the specified operation.    OperationNotPermitted: The service role associated with the cluster doesn't have the required access permissions for Amazon EKS.    VpcIdNotFound: We couldn't find the VPC associated with the cluster.  
    */
  var errorCode: js.UndefOr[ErrorCode] = js.native
  
  /**
    * A more complete description of the error.
    */
  var errorMessage: js.UndefOr[String] = js.native
  
  /**
    * An optional field that contains the resource IDs associated with the error.
    */
  var resourceIds: js.UndefOr[StringList] = js.native
}
object ErrorDetail {
  
  @scala.inline
  def apply(): ErrorDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorDetail]
  }
  
  @scala.inline
  implicit class ErrorDetailMutableBuilder[Self <: ErrorDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setResourceIds(value: StringList): Self = StObject.set(x, "resourceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdsUndefined: Self = StObject.set(x, "resourceIds", js.undefined)
    
    @scala.inline
    def setResourceIdsVarargs(value: String*): Self = StObject.set(x, "resourceIds", js.Array(value :_*))
  }
}
