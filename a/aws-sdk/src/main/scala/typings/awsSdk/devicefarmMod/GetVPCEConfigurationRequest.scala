package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVPCEConfigurationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the VPC endpoint configuration you want to describe.
    */
  var arn: AmazonResourceName
}
object GetVPCEConfigurationRequest {
  
  inline def apply(arn: AmazonResourceName): GetVPCEConfigurationRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVPCEConfigurationRequest]
  }
  
  extension [Self <: GetVPCEConfigurationRequest](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
