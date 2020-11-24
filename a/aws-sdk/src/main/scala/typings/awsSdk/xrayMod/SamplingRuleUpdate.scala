package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SamplingRuleUpdate extends js.Object {
  
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
  implicit class SamplingRuleUpdateOps[Self <: SamplingRuleUpdate] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: AttributeMap): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    
    @scala.inline
    def setFixedRate(value: NullableDouble): Self = this.set("FixedRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedRate: Self = this.set("FixedRate", js.undefined)
    
    @scala.inline
    def setHTTPMethod(value: HTTPMethod): Self = this.set("HTTPMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHTTPMethod: Self = this.set("HTTPMethod", js.undefined)
    
    @scala.inline
    def setHost(value: Host): Self = this.set("Host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("Host", js.undefined)
    
    @scala.inline
    def setPriority(value: NullableInteger): Self = this.set("Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("Priority", js.undefined)
    
    @scala.inline
    def setReservoirSize(value: NullableInteger): Self = this.set("ReservoirSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservoirSize: Self = this.set("ReservoirSize", js.undefined)
    
    @scala.inline
    def setResourceARN(value: ResourceARN): Self = this.set("ResourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceARN: Self = this.set("ResourceARN", js.undefined)
    
    @scala.inline
    def setRuleARN(value: String): Self = this.set("RuleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleARN: Self = this.set("RuleARN", js.undefined)
    
    @scala.inline
    def setRuleName(value: RuleName): Self = this.set("RuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleName: Self = this.set("RuleName", js.undefined)
    
    @scala.inline
    def setServiceName(value: ServiceName): Self = this.set("ServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceName: Self = this.set("ServiceName", js.undefined)
    
    @scala.inline
    def setServiceType(value: ServiceType): Self = this.set("ServiceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceType: Self = this.set("ServiceType", js.undefined)
    
    @scala.inline
    def setURLPath(value: URLPath): Self = this.set("URLPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteURLPath: Self = this.set("URLPath", js.undefined)
  }
}
