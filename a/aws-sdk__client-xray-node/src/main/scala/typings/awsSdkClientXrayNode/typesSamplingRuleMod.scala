package typings.awsSdkClientXrayNode

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSamplingRuleMod {
  
  @js.native
  trait SamplingRule extends StObject {
    
    /**
      * <p>Matches attributes derived from the request.</p>
      */
    var Attributes: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
    
    /**
      * <p>The percentage of matching requests to instrument, after the reservoir is exhausted.</p>
      */
    var FixedRate: Double = js.native
    
    /**
      * <p>Matches the HTTP method of a request.</p>
      */
    var HTTPMethod: String = js.native
    
    /**
      * <p>Matches the hostname from a request URL.</p>
      */
    var Host: String = js.native
    
    /**
      * <p>The priority of the sampling rule.</p>
      */
    var Priority: Double = js.native
    
    /**
      * <p>A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.</p>
      */
    var ReservoirSize: Double = js.native
    
    /**
      * <p>Matches the ARN of the AWS resource on which the service runs.</p>
      */
    var ResourceARN: String = js.native
    
    /**
      * <p>The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.</p>
      */
    var RuleARN: js.UndefOr[String] = js.native
    
    /**
      * <p>The name of the sampling rule. Specify a rule by either name or ARN, but not both.</p>
      */
    var RuleName: js.UndefOr[String] = js.native
    
    /**
      * <p>Matches the <code>name</code> that the service uses to identify itself in segments.</p>
      */
    var ServiceName: String = js.native
    
    /**
      * <p>Matches the <code>origin</code> that the service uses to identify its type in segments.</p>
      */
    var ServiceType: String = js.native
    
    /**
      * <p>Matches the path from a request URL.</p>
      */
    var URLPath: String = js.native
    
    /**
      * <p>The version of the sampling rule format (<code>1</code>).</p>
      */
    var Version: Double = js.native
  }
  object SamplingRule {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class SamplingRuleMutableBuilder[Self <: SamplingRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      @scala.inline
      def setFixedRate(value: Double): Self = StObject.set(x, "FixedRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHTTPMethod(value: String): Self = StObject.set(x, "HTTPMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservoirSize(value: Double): Self = StObject.set(x, "ReservoirSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceARN(value: String): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleARN(value: String): Self = StObject.set(x, "RuleARN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleARNUndefined: Self = StObject.set(x, "RuleARN", js.undefined)
      
      @scala.inline
      def setRuleName(value: String): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleNameUndefined: Self = StObject.set(x, "RuleName", js.undefined)
      
      @scala.inline
      def setServiceName(value: String): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceType(value: String): Self = StObject.set(x, "ServiceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setURLPath(value: String): Self = StObject.set(x, "URLPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnmarshalledSamplingRule extends SamplingRule {
    
    /**
      * <p>Matches attributes derived from the request.</p>
      */
    @JSName("Attributes")
    var Attributes_UnmarshalledSamplingRule: js.UndefOr[StringDictionary[String]] = js.native
  }
  object UnmarshalledSamplingRule {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class UnmarshalledSamplingRuleMutableBuilder[Self <: UnmarshalledSamplingRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    }
  }
}
