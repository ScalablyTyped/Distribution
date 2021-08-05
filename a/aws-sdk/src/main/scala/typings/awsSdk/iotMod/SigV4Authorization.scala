package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SigV4Authorization extends StObject {
  
  /**
    * The ARN of the signing role.
    */
  var roleArn: AwsArn
  
  /**
    * The service name to use while signing with Sig V4.
    */
  var serviceName: ServiceName
  
  /**
    * The signing region.
    */
  var signingRegion: SigningRegion
}
object SigV4Authorization {
  
  inline def apply(roleArn: AwsArn, serviceName: ServiceName, signingRegion: SigningRegion): SigV4Authorization = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], signingRegion = signingRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigV4Authorization]
  }
  
  extension [Self <: SigV4Authorization](x: Self) {
    
    inline def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: ServiceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setSigningRegion(value: SigningRegion): Self = StObject.set(x, "signingRegion", value.asInstanceOf[js.Any])
  }
}
