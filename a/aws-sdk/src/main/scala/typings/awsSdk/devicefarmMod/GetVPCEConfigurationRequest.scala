package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVPCEConfigurationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the VPC endpoint configuration you want to describe.
    */
  var arn: AmazonResourceName = js.native
}
object GetVPCEConfigurationRequest {
  
  @scala.inline
  def apply(arn: AmazonResourceName): GetVPCEConfigurationRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVPCEConfigurationRequest]
  }
  
  @scala.inline
  implicit class GetVPCEConfigurationRequestMutableBuilder[Self <: GetVPCEConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
