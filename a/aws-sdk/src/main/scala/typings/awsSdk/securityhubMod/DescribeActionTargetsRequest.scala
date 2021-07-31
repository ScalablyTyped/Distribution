package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeActionTargetsRequest extends StObject {
  
  /**
    * A list of custom action target ARNs for the custom action targets to retrieve.
    */
  var ActionTargetArns: js.UndefOr[ArnList] = js.undefined
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.securityhubMod.MaxResults] = js.undefined
  
  /**
    * The token that is required for pagination. On your first call to the DescribeActionTargets operation, set the value of this parameter to NULL. For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value returned from the previous response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.undefined
}
object DescribeActionTargetsRequest {
  
  @scala.inline
  def apply(): DescribeActionTargetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeActionTargetsRequest]
  }
  
  @scala.inline
  implicit class DescribeActionTargetsRequestMutableBuilder[Self <: DescribeActionTargetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionTargetArns(value: ArnList): Self = StObject.set(x, "ActionTargetArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionTargetArnsUndefined: Self = StObject.set(x, "ActionTargetArns", js.undefined)
    
    @scala.inline
    def setActionTargetArnsVarargs(value: NonEmptyString*): Self = StObject.set(x, "ActionTargetArns", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
