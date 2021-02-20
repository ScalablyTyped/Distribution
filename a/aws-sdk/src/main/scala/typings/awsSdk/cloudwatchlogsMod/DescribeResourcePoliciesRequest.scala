package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeResourcePoliciesRequest extends StObject {
  
  /**
    * The maximum number of resource policies to be displayed with one call of this API.
    */
  var limit: js.UndefOr[DescribeLimit] = js.native
  
  var nextToken: js.UndefOr[NextToken] = js.native
}
object DescribeResourcePoliciesRequest {
  
  @scala.inline
  def apply(): DescribeResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeResourcePoliciesRequest]
  }
  
  @scala.inline
  implicit class DescribeResourcePoliciesRequestMutableBuilder[Self <: DescribeResourcePoliciesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: DescribeLimit): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
