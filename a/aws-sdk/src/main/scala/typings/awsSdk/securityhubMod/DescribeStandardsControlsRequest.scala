package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStandardsControlsRequest extends StObject {
  
  /**
    * The maximum number of security standard controls to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.securityhubMod.MaxResults] = js.native
  
  /**
    * The token that is required for pagination. On your first call to the DescribeStandardsControls operation, set the value of this parameter to NULL. For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value returned from the previous response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
  
  /**
    * The ARN of a resource that represents your subscription to a supported standard.
    */
  var StandardsSubscriptionArn: NonEmptyString = js.native
}
object DescribeStandardsControlsRequest {
  
  @scala.inline
  def apply(StandardsSubscriptionArn: NonEmptyString): DescribeStandardsControlsRequest = {
    val __obj = js.Dynamic.literal(StandardsSubscriptionArn = StandardsSubscriptionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStandardsControlsRequest]
  }
  
  @scala.inline
  implicit class DescribeStandardsControlsRequestMutableBuilder[Self <: DescribeStandardsControlsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStandardsSubscriptionArn(value: NonEmptyString): Self = StObject.set(x, "StandardsSubscriptionArn", value.asInstanceOf[js.Any])
  }
}
