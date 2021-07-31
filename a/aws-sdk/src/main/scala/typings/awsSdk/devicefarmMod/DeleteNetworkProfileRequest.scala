package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNetworkProfileRequest extends StObject {
  
  /**
    * The ARN of the network profile to delete.
    */
  var arn: AmazonResourceName
}
object DeleteNetworkProfileRequest {
  
  @scala.inline
  def apply(arn: AmazonResourceName): DeleteNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNetworkProfileRequest]
  }
  
  @scala.inline
  implicit class DeleteNetworkProfileRequestMutableBuilder[Self <: DeleteNetworkProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
