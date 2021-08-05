package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeScalingPoliciesOutput extends StObject {
  
  /**
    * Token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * A collection of objects containing the scaling policies matching the request.
    */
  var ScalingPolicies: js.UndefOr[ScalingPolicyList] = js.undefined
}
object DescribeScalingPoliciesOutput {
  
  inline def apply(): DescribeScalingPoliciesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScalingPoliciesOutput]
  }
  
  extension [Self <: DescribeScalingPoliciesOutput](x: Self) {
    
    inline def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setScalingPolicies(value: ScalingPolicyList): Self = StObject.set(x, "ScalingPolicies", value.asInstanceOf[js.Any])
    
    inline def setScalingPoliciesUndefined: Self = StObject.set(x, "ScalingPolicies", js.undefined)
    
    inline def setScalingPoliciesVarargs(value: ScalingPolicy*): Self = StObject.set(x, "ScalingPolicies", js.Array(value :_*))
  }
}
