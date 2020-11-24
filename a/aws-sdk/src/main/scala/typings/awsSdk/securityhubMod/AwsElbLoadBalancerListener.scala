package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsElbLoadBalancerListener extends js.Object {
  
  /**
    * The port on which the instance is listening.
    */
  var InstancePort: js.UndefOr[Integer] = js.native
  
  /**
    * The protocol to use to route traffic to instances. Valid values: HTTP | HTTPS | TCP | SSL 
    */
  var InstanceProtocol: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The port on which the load balancer is listening. On EC2-VPC, you can specify any port from the range 1-65535. On EC2-Classic, you can specify any port from the following list: 25, 80, 443, 465, 587, 1024-65535.
    */
  var LoadBalancerPort: js.UndefOr[Integer] = js.native
  
  /**
    * The load balancer transport protocol to use for routing. Valid values: HTTP | HTTPS | TCP | SSL 
    */
  var Protocol: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The ARN of the server certificate.
    */
  var SslCertificateId: js.UndefOr[NonEmptyString] = js.native
}
object AwsElbLoadBalancerListener {
  
  @scala.inline
  def apply(): AwsElbLoadBalancerListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerListener]
  }
  
  @scala.inline
  implicit class AwsElbLoadBalancerListenerOps[Self <: AwsElbLoadBalancerListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInstancePort(value: Integer): Self = this.set("InstancePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstancePort: Self = this.set("InstancePort", js.undefined)
    
    @scala.inline
    def setInstanceProtocol(value: NonEmptyString): Self = this.set("InstanceProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceProtocol: Self = this.set("InstanceProtocol", js.undefined)
    
    @scala.inline
    def setLoadBalancerPort(value: Integer): Self = this.set("LoadBalancerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancerPort: Self = this.set("LoadBalancerPort", js.undefined)
    
    @scala.inline
    def setProtocol(value: NonEmptyString): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("Protocol", js.undefined)
    
    @scala.inline
    def setSslCertificateId(value: NonEmptyString): Self = this.set("SslCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslCertificateId: Self = this.set("SslCertificateId", js.undefined)
  }
}
