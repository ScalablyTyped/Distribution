package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginRequestPolicySummary extends StObject {
  
  /**
    * The origin request policy.
    */
  var OriginRequestPolicy: typings.awsSdk.cloudfrontMod.OriginRequestPolicy
  
  /**
    * The type of origin request policy, either managed (created by AWS) or custom (created in this AWS account).
    */
  var Type: OriginRequestPolicyType
}
object OriginRequestPolicySummary {
  
  @scala.inline
  def apply(OriginRequestPolicy: OriginRequestPolicy, Type: OriginRequestPolicyType): OriginRequestPolicySummary = {
    val __obj = js.Dynamic.literal(OriginRequestPolicy = OriginRequestPolicy.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginRequestPolicySummary]
  }
  
  @scala.inline
  implicit class OriginRequestPolicySummaryMutableBuilder[Self <: OriginRequestPolicySummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginRequestPolicy(value: OriginRequestPolicy): Self = StObject.set(x, "OriginRequestPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: OriginRequestPolicyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
