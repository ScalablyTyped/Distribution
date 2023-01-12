package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SamplingRuleUpdate extends StObject {
  
  /**
    * Matches attributes derived from the request.
    */
  var Attributes: js.UndefOr[AttributeMap] = js.undefined
  
  /**
    * The percentage of matching requests to instrument, after the reservoir is exhausted.
    */
  var FixedRate: js.UndefOr[NullableDouble] = js.undefined
  
  /**
    * Matches the HTTP method of a request.
    */
  var HTTPMethod: js.UndefOr[typings.awsSdk.clientsXrayMod.HTTPMethod] = js.undefined
  
  /**
    * Matches the hostname from a request URL.
    */
  var Host: js.UndefOr[typings.awsSdk.clientsXrayMod.Host] = js.undefined
  
  /**
    * The priority of the sampling rule.
    */
  var Priority: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
    */
  var ReservoirSize: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * Matches the ARN of the Amazon Web Services resource on which the service runs.
    */
  var ResourceARN: js.UndefOr[typings.awsSdk.clientsXrayMod.ResourceARN] = js.undefined
  
  /**
    * The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
    */
  var RuleARN: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the sampling rule. Specify a rule by either name or ARN, but not both.
    */
  var RuleName: js.UndefOr[typings.awsSdk.clientsXrayMod.RuleName] = js.undefined
  
  /**
    * Matches the name that the service uses to identify itself in segments.
    */
  var ServiceName: js.UndefOr[typings.awsSdk.clientsXrayMod.ServiceName] = js.undefined
  
  /**
    * Matches the origin that the service uses to identify its type in segments.
    */
  var ServiceType: js.UndefOr[typings.awsSdk.clientsXrayMod.ServiceType] = js.undefined
  
  /**
    * Matches the path from a request URL.
    */
  var URLPath: js.UndefOr[typings.awsSdk.clientsXrayMod.URLPath] = js.undefined
}
object SamplingRuleUpdate {
  
  inline def apply(): SamplingRuleUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamplingRuleUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SamplingRuleUpdate] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: AttributeMap): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setFixedRate(value: NullableDouble): Self = StObject.set(x, "FixedRate", value.asInstanceOf[js.Any])
    
    inline def setFixedRateUndefined: Self = StObject.set(x, "FixedRate", js.undefined)
    
    inline def setHTTPMethod(value: HTTPMethod): Self = StObject.set(x, "HTTPMethod", value.asInstanceOf[js.Any])
    
    inline def setHTTPMethodUndefined: Self = StObject.set(x, "HTTPMethod", js.undefined)
    
    inline def setHost(value: Host): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "Host", js.undefined)
    
    inline def setPriority(value: NullableInteger): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    inline def setReservoirSize(value: NullableInteger): Self = StObject.set(x, "ReservoirSize", value.asInstanceOf[js.Any])
    
    inline def setReservoirSizeUndefined: Self = StObject.set(x, "ReservoirSize", js.undefined)
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
    
    inline def setRuleARN(value: String): Self = StObject.set(x, "RuleARN", value.asInstanceOf[js.Any])
    
    inline def setRuleARNUndefined: Self = StObject.set(x, "RuleARN", js.undefined)
    
    inline def setRuleName(value: RuleName): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
    
    inline def setRuleNameUndefined: Self = StObject.set(x, "RuleName", js.undefined)
    
    inline def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
    
    inline def setServiceType(value: ServiceType): Self = StObject.set(x, "ServiceType", value.asInstanceOf[js.Any])
    
    inline def setServiceTypeUndefined: Self = StObject.set(x, "ServiceType", js.undefined)
    
    inline def setURLPath(value: URLPath): Self = StObject.set(x, "URLPath", value.asInstanceOf[js.Any])
    
    inline def setURLPathUndefined: Self = StObject.set(x, "URLPath", js.undefined)
  }
}
