package typings.awsSdkClientXrayNode

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSamplingRuleMod {
  
  trait SamplingRule extends StObject {
    
    /**
      * <p>Matches attributes derived from the request.</p>
      */
    var Attributes: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.undefined
    
    /**
      * <p>The percentage of matching requests to instrument, after the reservoir is exhausted.</p>
      */
    var FixedRate: Double
    
    /**
      * <p>Matches the HTTP method of a request.</p>
      */
    var HTTPMethod: String
    
    /**
      * <p>Matches the hostname from a request URL.</p>
      */
    var Host: String
    
    /**
      * <p>The priority of the sampling rule.</p>
      */
    var Priority: Double
    
    /**
      * <p>A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.</p>
      */
    var ReservoirSize: Double
    
    /**
      * <p>Matches the ARN of the AWS resource on which the service runs.</p>
      */
    var ResourceARN: String
    
    /**
      * <p>The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.</p>
      */
    var RuleARN: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The name of the sampling rule. Specify a rule by either name or ARN, but not both.</p>
      */
    var RuleName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Matches the <code>name</code> that the service uses to identify itself in segments.</p>
      */
    var ServiceName: String
    
    /**
      * <p>Matches the <code>origin</code> that the service uses to identify its type in segments.</p>
      */
    var ServiceType: String
    
    /**
      * <p>Matches the path from a request URL.</p>
      */
    var URLPath: String
    
    /**
      * <p>The version of the sampling rule format (<code>1</code>).</p>
      */
    var Version: Double
  }
  object SamplingRule {
    
    inline def apply(
      FixedRate: Double,
      HTTPMethod: String,
      Host: String,
      Priority: Double,
      ReservoirSize: Double,
      ResourceARN: String,
      ServiceName: String,
      ServiceType: String,
      URLPath: String,
      Version: Double
    ): SamplingRule = {
      val __obj = js.Dynamic.literal(FixedRate = FixedRate.asInstanceOf[js.Any], HTTPMethod = HTTPMethod.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], ReservoirSize = ReservoirSize.asInstanceOf[js.Any], ResourceARN = ResourceARN.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], ServiceType = ServiceType.asInstanceOf[js.Any], URLPath = URLPath.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
      __obj.asInstanceOf[SamplingRule]
    }
    
    extension [Self <: SamplingRule](x: Self) {
      
      inline def setAttributes(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      inline def setFixedRate(value: Double): Self = StObject.set(x, "FixedRate", value.asInstanceOf[js.Any])
      
      inline def setHTTPMethod(value: String): Self = StObject.set(x, "HTTPMethod", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
      
      inline def setReservoirSize(value: Double): Self = StObject.set(x, "ReservoirSize", value.asInstanceOf[js.Any])
      
      inline def setResourceARN(value: String): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
      
      inline def setRuleARN(value: String): Self = StObject.set(x, "RuleARN", value.asInstanceOf[js.Any])
      
      inline def setRuleARNUndefined: Self = StObject.set(x, "RuleARN", js.undefined)
      
      inline def setRuleName(value: String): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
      
      inline def setRuleNameUndefined: Self = StObject.set(x, "RuleName", js.undefined)
      
      inline def setServiceName(value: String): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
      
      inline def setServiceType(value: String): Self = StObject.set(x, "ServiceType", value.asInstanceOf[js.Any])
      
      inline def setURLPath(value: String): Self = StObject.set(x, "URLPath", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledSamplingRule
    extends StObject
       with SamplingRule {
    
    /**
      * <p>Matches attributes derived from the request.</p>
      */
    @JSName("Attributes")
    var Attributes_UnmarshalledSamplingRule: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object UnmarshalledSamplingRule {
    
    inline def apply(
      FixedRate: Double,
      HTTPMethod: String,
      Host: String,
      Priority: Double,
      ReservoirSize: Double,
      ResourceARN: String,
      ServiceName: String,
      ServiceType: String,
      URLPath: String,
      Version: Double
    ): UnmarshalledSamplingRule = {
      val __obj = js.Dynamic.literal(FixedRate = FixedRate.asInstanceOf[js.Any], HTTPMethod = HTTPMethod.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], ReservoirSize = ReservoirSize.asInstanceOf[js.Any], ResourceARN = ResourceARN.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], ServiceType = ServiceType.asInstanceOf[js.Any], URLPath = URLPath.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledSamplingRule]
    }
    
    extension [Self <: UnmarshalledSamplingRule](x: Self) {
      
      inline def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    }
  }
}
