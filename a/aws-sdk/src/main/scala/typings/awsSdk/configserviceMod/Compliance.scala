package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compliance extends StObject {
  
  /**
    * The number of Amazon Web Services resources or Config rules that cause a result of NON_COMPLIANT, up to a maximum number.
    */
  var ComplianceContributorCount: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceContributorCount] = js.undefined
  
  /**
    * Indicates whether an Amazon Web Services resource or Config rule is compliant. A resource is compliant if it complies with all of the Config rules that evaluate it. A resource is noncompliant if it does not comply with one or more of these rules. A rule is compliant if all of the resources that the rule evaluates comply with it. A rule is noncompliant if any of these resources do not comply. Config returns the INSUFFICIENT_DATA value when no evaluation results are available for the Amazon Web Services resource or Config rule. For the Compliance data type, Config supports only COMPLIANT, NON_COMPLIANT, and INSUFFICIENT_DATA values. Config does not support the NOT_APPLICABLE value for the Compliance data type.
    */
  var ComplianceType: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceType] = js.undefined
}
object Compliance {
  
  inline def apply(): Compliance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compliance]
  }
  
  extension [Self <: Compliance](x: Self) {
    
    inline def setComplianceContributorCount(value: ComplianceContributorCount): Self = StObject.set(x, "ComplianceContributorCount", value.asInstanceOf[js.Any])
    
    inline def setComplianceContributorCountUndefined: Self = StObject.set(x, "ComplianceContributorCount", js.undefined)
    
    inline def setComplianceType(value: ComplianceType): Self = StObject.set(x, "ComplianceType", value.asInstanceOf[js.Any])
    
    inline def setComplianceTypeUndefined: Self = StObject.set(x, "ComplianceType", js.undefined)
  }
}
