package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SamplingRule extends StObject {
  
  /**
    * Matches attributes derived from the request.
    */
  var Attributes: js.UndefOr[AttributeMap] = js.native
  
  /**
    * The percentage of matching requests to instrument, after the reservoir is exhausted.
    */
  var FixedRate: typings.awsSdk.xrayMod.FixedRate = js.native
  
  /**
    * Matches the HTTP method of a request.
    */
  var HTTPMethod: typings.awsSdk.xrayMod.HTTPMethod = js.native
  
  /**
    * Matches the hostname from a request URL.
    */
  var Host: typings.awsSdk.xrayMod.Host = js.native
  
  /**
    * The priority of the sampling rule.
    */
  var Priority: typings.awsSdk.xrayMod.Priority = js.native
  
  /**
    * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
    */
  var ReservoirSize: typings.awsSdk.xrayMod.ReservoirSize = js.native
  
  /**
    * Matches the ARN of the AWS resource on which the service runs.
    */
  var ResourceARN: typings.awsSdk.xrayMod.ResourceARN = js.native
  
  /**
    * The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
    */
  var RuleARN: js.UndefOr[String] = js.native
  
  /**
    * The name of the sampling rule. Specify a rule by either name or ARN, but not both.
    */
  var RuleName: js.UndefOr[typings.awsSdk.xrayMod.RuleName] = js.native
  
  /**
    * Matches the name that the service uses to identify itself in segments.
    */
  var ServiceName: typings.awsSdk.xrayMod.ServiceName = js.native
  
  /**
    * Matches the origin that the service uses to identify its type in segments.
    */
  var ServiceType: typings.awsSdk.xrayMod.ServiceType = js.native
  
  /**
    * Matches the path from a request URL.
    */
  var URLPath: typings.awsSdk.xrayMod.URLPath = js.native
  
  /**
    * The version of the sampling rule format (1).
    */
  var Version: typings.awsSdk.xrayMod.Version = js.native
}
object SamplingRule {
  
  @scala.inline
  def apply(
    FixedRate: FixedRate,
    HTTPMethod: HTTPMethod,
    Host: Host,
    Priority: Priority,
    ReservoirSize: ReservoirSize,
    ResourceARN: ResourceARN,
    ServiceName: ServiceName,
    ServiceType: ServiceType,
    URLPath: URLPath,
    Version: Version
  ): SamplingRule = {
    val __obj = js.Dynamic.literal(FixedRate = FixedRate.asInstanceOf[js.Any], HTTPMethod = HTTPMethod.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], ReservoirSize = ReservoirSize.asInstanceOf[js.Any], ResourceARN = ResourceARN.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], ServiceType = ServiceType.asInstanceOf[js.Any], URLPath = URLPath.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingRule]
  }
  
  @scala.inline
  implicit class SamplingRuleMutableBuilder[Self <: SamplingRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: AttributeMap): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setFixedRate(value: FixedRate): Self = StObject.set(x, "FixedRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTTPMethod(value: HTTPMethod): Self = StObject.set(x, "HTTPMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: Host): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Priority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservoirSize(value: ReservoirSize): Self = StObject.set(x, "ReservoirSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleARN(value: String): Self = StObject.set(x, "RuleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleARNUndefined: Self = StObject.set(x, "RuleARN", js.undefined)
    
    @scala.inline
    def setRuleName(value: RuleName): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleNameUndefined: Self = StObject.set(x, "RuleName", js.undefined)
    
    @scala.inline
    def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceType(value: ServiceType): Self = StObject.set(x, "ServiceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURLPath(value: URLPath): Self = StObject.set(x, "URLPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
