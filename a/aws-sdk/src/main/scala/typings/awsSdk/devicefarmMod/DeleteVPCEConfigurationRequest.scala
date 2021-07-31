package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVPCEConfigurationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the VPC endpoint configuration you want to delete.
    */
  var arn: AmazonResourceName
}
object DeleteVPCEConfigurationRequest {
  
  @scala.inline
  def apply(arn: AmazonResourceName): DeleteVPCEConfigurationRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVPCEConfigurationRequest]
  }
  
  @scala.inline
  implicit class DeleteVPCEConfigurationRequestMutableBuilder[Self <: DeleteVPCEConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
