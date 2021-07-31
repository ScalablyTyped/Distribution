package typings.awsSdkClientXrayNode

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSamplingRuleUpdateMod {
  
  trait SamplingRuleUpdate extends StObject {
    
    /**
      * <p>Matches attributes derived from the request.</p>
      */
    var Attributes: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.undefined
    
    /**
      * <p>The percentage of matching requests to instrument, after the reservoir is exhausted.</p>
      */
    var FixedRate: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Matches the HTTP method of a request.</p>
      */
    var HTTPMethod: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Matches the hostname from a request URL.</p>
      */
    var Host: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The priority of the sampling rule.</p>
      */
    var Priority: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.</p>
      */
    var ReservoirSize: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Matches the ARN of the AWS resource on which the service runs.</p>
      */
    var ResourceARN: js.UndefOr[String] = js.undefined
    
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
    var ServiceName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Matches the <code>origin</code> that the service uses to identify its type in segments.</p>
      */
    var ServiceType: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Matches the path from a request URL.</p>
      */
    var URLPath: js.UndefOr[String] = js.undefined
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
      def setAttributes(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      @scala.inline
      def setFixedRate(value: Double): Self = StObject.set(x, "FixedRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedRateUndefined: Self = StObject.set(x, "FixedRate", js.undefined)
      
      @scala.inline
      def setHTTPMethod(value: String): Self = StObject.set(x, "HTTPMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHTTPMethodUndefined: Self = StObject.set(x, "HTTPMethod", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "Host", js.undefined)
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
      
      @scala.inline
      def setReservoirSize(value: Double): Self = StObject.set(x, "ReservoirSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservoirSizeUndefined: Self = StObject.set(x, "ReservoirSize", js.undefined)
      
      @scala.inline
      def setResourceARN(value: String): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
      
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
      def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
      
      @scala.inline
      def setServiceType(value: String): Self = StObject.set(x, "ServiceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceTypeUndefined: Self = StObject.set(x, "ServiceType", js.undefined)
      
      @scala.inline
      def setURLPath(value: String): Self = StObject.set(x, "URLPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setURLPathUndefined: Self = StObject.set(x, "URLPath", js.undefined)
    }
  }
  
  trait UnmarshalledSamplingRuleUpdate
    extends StObject
       with SamplingRuleUpdate {
    
    /**
      * <p>Matches attributes derived from the request.</p>
      */
    @JSName("Attributes")
    var Attributes_UnmarshalledSamplingRuleUpdate: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object UnmarshalledSamplingRuleUpdate {
    
    @scala.inline
    def apply(): UnmarshalledSamplingRuleUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSamplingRuleUpdate]
    }
    
    @scala.inline
    implicit class UnmarshalledSamplingRuleUpdateMutableBuilder[Self <: UnmarshalledSamplingRuleUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    }
  }
}
