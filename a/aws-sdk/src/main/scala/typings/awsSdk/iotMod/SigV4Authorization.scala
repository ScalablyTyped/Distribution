package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SigV4Authorization extends js.Object {
  
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
  implicit class SigV4AuthorizationOps[Self <: SigV4Authorization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceName(value: ServiceName): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningRegion(value: SigningRegion): Self = this.set("signingRegion", value.asInstanceOf[js.Any])
  }
}
