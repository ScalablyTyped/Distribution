package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealthCheckConfig extends StObject {
  
  /**
    * Indicates whether health checking is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The approximate amount of time, in seconds, between health checks of an individual target. The range is 5–300 seconds. The default is 30 seconds.
    */
  var healthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined
  
  /**
    * The amount of time, in seconds, to wait before reporting a target as unhealthy. The range is 1–120 seconds. The default is 5 seconds.
    */
  var healthCheckTimeoutSeconds: js.UndefOr[HealthCheckTimeoutSeconds] = js.undefined
  
  /**
    * The number of consecutive successful health checks required before considering an unhealthy target healthy. The range is 2–10. The default is 5.
    */
  var healthyThresholdCount: js.UndefOr[HealthyThresholdCount] = js.undefined
  
  /**
    * The codes to use when checking for a successful response from a target. These are called Success codes in the console.
    */
  var matcher: js.UndefOr[Matcher] = js.undefined
  
  /**
    * The destination for health checks on the targets. If the protocol version is HTTP/1.1 or HTTP/2, specify a valid URI (for example, /path?query). The default path is /. Health checks are not supported if the protocol version is gRPC, however, you can choose HTTP/1.1 or HTTP/2 and specify a valid URI.
    */
  var path: js.UndefOr[HealthCheckPath] = js.undefined
  
  /**
    * The port used when performing health checks on targets. The default setting is the port that a target receives traffic on.
    */
  var port: js.UndefOr[HealthCheckPort] = js.undefined
  
  /**
    * The protocol used when performing health checks on targets. The possible protocols are HTTP and HTTPS. The default is HTTP.
    */
  var protocol: js.UndefOr[TargetGroupProtocol] = js.undefined
  
  /**
    * The protocol version used when performing health checks on targets. The possible protocol versions are HTTP1 and HTTP2.
    */
  var protocolVersion: js.UndefOr[HealthCheckProtocolVersion] = js.undefined
  
  /**
    * The number of consecutive failed health checks required before considering a target unhealthy. The range is 2–10. The default is 2.
    */
  var unhealthyThresholdCount: js.UndefOr[UnhealthyThresholdCount] = js.undefined
}
object HealthCheckConfig {
  
  inline def apply(): HealthCheckConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthCheckConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HealthCheckConfig] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHealthCheckIntervalSeconds(value: HealthCheckIntervalSeconds): Self = StObject.set(x, "healthCheckIntervalSeconds", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckIntervalSecondsUndefined: Self = StObject.set(x, "healthCheckIntervalSeconds", js.undefined)
    
    inline def setHealthCheckTimeoutSeconds(value: HealthCheckTimeoutSeconds): Self = StObject.set(x, "healthCheckTimeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckTimeoutSecondsUndefined: Self = StObject.set(x, "healthCheckTimeoutSeconds", js.undefined)
    
    inline def setHealthyThresholdCount(value: HealthyThresholdCount): Self = StObject.set(x, "healthyThresholdCount", value.asInstanceOf[js.Any])
    
    inline def setHealthyThresholdCountUndefined: Self = StObject.set(x, "healthyThresholdCount", js.undefined)
    
    inline def setMatcher(value: Matcher): Self = StObject.set(x, "matcher", value.asInstanceOf[js.Any])
    
    inline def setMatcherUndefined: Self = StObject.set(x, "matcher", js.undefined)
    
    inline def setPath(value: HealthCheckPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPort(value: HealthCheckPort): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocol(value: TargetGroupProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setProtocolVersion(value: HealthCheckProtocolVersion): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
    
    inline def setProtocolVersionUndefined: Self = StObject.set(x, "protocolVersion", js.undefined)
    
    inline def setUnhealthyThresholdCount(value: UnhealthyThresholdCount): Self = StObject.set(x, "unhealthyThresholdCount", value.asInstanceOf[js.Any])
    
    inline def setUnhealthyThresholdCountUndefined: Self = StObject.set(x, "unhealthyThresholdCount", js.undefined)
  }
}
