package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SamplingRuleUpdate extends StObject {
  
  /**
    * Matches attributes derived from the request.
    */
  var Attributes: js.UndefOr[AttributeMap] = js.native
  
  /**
    * The percentage of matching requests to instrument, after the reservoir is exhausted.
    */
  var FixedRate: js.UndefOr[NullableDouble] = js.native
  
  /**
    * Matches the HTTP method of a request.
    */
  var HTTPMethod: js.UndefOr[typings.awsSdk.xrayMod.HTTPMethod] = js.native
  
  /**
    * Matches the hostname from a request URL.
    */
  var Host: js.UndefOr[typings.awsSdk.xrayMod.Host] = js.native
  
  /**
    * The priority of the sampling rule.
    */
  var Priority: js.UndefOr[NullableInteger] = js.native
  
  /**
    * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
    */
  var ReservoirSize: js.UndefOr[NullableInteger] = js.native
  
  /**
    * Matches the ARN of the AWS resource on which the service runs.
    */
  var ResourceARN: js.UndefOr[typings.awsSdk.xrayMod.ResourceARN] = js.native
  
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
  var ServiceName: js.UndefOr[typings.awsSdk.xrayMod.ServiceName] = js.native
  
  /**
    * Matches the origin that the service uses to identify its type in segments.
    */
  var ServiceType: js.UndefOr[typings.awsSdk.xrayMod.ServiceType] = js.native
  
  /**
    * Matches the path from a request URL.
    */
  var URLPath: js.UndefOr[typings.awsSdk.xrayMod.URLPath] = js.native
}
object SamplingRuleUpdate {
  
  @scala.inline
  def apply(): SamplingRuleUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamplingRuleUpdate]
  }
  
  @scala.inline
  implicit class SamplingRuleUpdateMutableBuilder[Self <: SamplingRuleUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: AttributeMap): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setFixedRate(value: NullableDouble): Self = StObject.set(x, "FixedRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedRateUndefined: Self = StObject.set(x, "FixedRate", js.undefined)
    
    @scala.inline
    def setHTTPMethod(value: HTTPMethod): Self = StObject.set(x, "HTTPMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTTPMethodUndefined: Self = StObject.set(x, "HTTPMethod", js.undefined)
    
    @scala.inline
    def setHost(value: Host): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "Host", js.undefined)
    
    @scala.inline
    def setPriority(value: NullableInteger): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    @scala.inline
    def setReservoirSize(value: NullableInteger): Self = StObject.set(x, "ReservoirSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservoirSizeUndefined: Self = StObject.set(x, "ReservoirSize", js.undefined)
    
    @scala.inline
    def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
    
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
    def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
    
    @scala.inline
    def setServiceType(value: ServiceType): Self = StObject.set(x, "ServiceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceTypeUndefined: Self = StObject.set(x, "ServiceType", js.undefined)
    
    @scala.inline
    def setURLPath(value: URLPath): Self = StObject.set(x, "URLPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURLPathUndefined: Self = StObject.set(x, "URLPath", js.undefined)
  }
}
