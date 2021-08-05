package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElbLoadBalancerListener extends StObject {
  
  /**
    * The port on which the instance is listening.
    */
  var InstancePort: js.UndefOr[Integer] = js.undefined
  
  /**
    * The protocol to use to route traffic to instances. Valid values: HTTP | HTTPS | TCP | SSL 
    */
  var InstanceProtocol: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The port on which the load balancer is listening. On EC2-VPC, you can specify any port from the range 1-65535. On EC2-Classic, you can specify any port from the following list: 25, 80, 443, 465, 587, 1024-65535.
    */
  var LoadBalancerPort: js.UndefOr[Integer] = js.undefined
  
  /**
    * The load balancer transport protocol to use for routing. Valid values: HTTP | HTTPS | TCP | SSL 
    */
  var Protocol: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN of the server certificate.
    */
  var SslCertificateId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsElbLoadBalancerListener {
  
  inline def apply(): AwsElbLoadBalancerListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerListener]
  }
  
  extension [Self <: AwsElbLoadBalancerListener](x: Self) {
    
    inline def setInstancePort(value: Integer): Self = StObject.set(x, "InstancePort", value.asInstanceOf[js.Any])
    
    inline def setInstancePortUndefined: Self = StObject.set(x, "InstancePort", js.undefined)
    
    inline def setInstanceProtocol(value: NonEmptyString): Self = StObject.set(x, "InstanceProtocol", value.asInstanceOf[js.Any])
    
    inline def setInstanceProtocolUndefined: Self = StObject.set(x, "InstanceProtocol", js.undefined)
    
    inline def setLoadBalancerPort(value: Integer): Self = StObject.set(x, "LoadBalancerPort", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerPortUndefined: Self = StObject.set(x, "LoadBalancerPort", js.undefined)
    
    inline def setProtocol(value: NonEmptyString): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setSslCertificateId(value: NonEmptyString): Self = StObject.set(x, "SslCertificateId", value.asInstanceOf[js.Any])
    
    inline def setSslCertificateIdUndefined: Self = StObject.set(x, "SslCertificateId", js.undefined)
  }
}
