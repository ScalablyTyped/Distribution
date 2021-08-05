package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeComplianceByResourceResponse extends StObject {
  
  /**
    * Indicates whether the specified AWS resource complies with all of the AWS Config rules that evaluate it.
    */
  var ComplianceByResources: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceByResources] = js.undefined
  
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.undefined
}
object DescribeComplianceByResourceResponse {
  
  inline def apply(): DescribeComplianceByResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComplianceByResourceResponse]
  }
  
  extension [Self <: DescribeComplianceByResourceResponse](x: Self) {
    
    inline def setComplianceByResources(value: ComplianceByResources): Self = StObject.set(x, "ComplianceByResources", value.asInstanceOf[js.Any])
    
    inline def setComplianceByResourcesUndefined: Self = StObject.set(x, "ComplianceByResources", js.undefined)
    
    inline def setComplianceByResourcesVarargs(value: ComplianceByResource*): Self = StObject.set(x, "ComplianceByResources", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
