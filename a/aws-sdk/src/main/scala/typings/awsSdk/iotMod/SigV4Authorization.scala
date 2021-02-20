package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SigV4Authorization extends StObject {
  
  /**
    * The ARN of the signing role.
    */
  var roleArn: AwsArn = js.native
  
  /**
    * The service name to use while signing with Sig V4.
    */
  var serviceName: ServiceName = js.native
  
  /**
    * The signing region.
    */
  var signingRegion: SigningRegion = js.native
}
object SigV4Authorization {
  
  @scala.inline
  def apply(roleArn: AwsArn, serviceName: ServiceName, signingRegion: SigningRegion): SigV4Authorization = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], signingRegion = signingRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigV4Authorization]
  }
  
  @scala.inline
  implicit class SigV4AuthorizationMutableBuilder[Self <: SigV4Authorization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceName(value: ServiceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningRegion(value: SigningRegion): Self = StObject.set(x, "signingRegion", value.asInstanceOf[js.Any])
  }
}
