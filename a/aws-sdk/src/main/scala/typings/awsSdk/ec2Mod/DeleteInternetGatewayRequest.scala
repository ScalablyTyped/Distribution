package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInternetGatewayRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the internet gateway.
    */
  var InternetGatewayId: typings.awsSdk.ec2Mod.InternetGatewayId
}
object DeleteInternetGatewayRequest {
  
  @scala.inline
  def apply(InternetGatewayId: InternetGatewayId): DeleteInternetGatewayRequest = {
    val __obj = js.Dynamic.literal(InternetGatewayId = InternetGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInternetGatewayRequest]
  }
  
  @scala.inline
  implicit class DeleteInternetGatewayRequestMutableBuilder[Self <: DeleteInternetGatewayRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setInternetGatewayId(value: InternetGatewayId): Self = StObject.set(x, "InternetGatewayId", value.asInstanceOf[js.Any])
  }
}
