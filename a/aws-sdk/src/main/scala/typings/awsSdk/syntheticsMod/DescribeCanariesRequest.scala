package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCanariesRequest extends StObject {
  
  /**
    * Specify this parameter to limit how many canaries are returned each time you use the DescribeCanaries operation. If you omit this parameter, the default of 100 is used.
    */
  var MaxResults: js.UndefOr[MaxCanaryResults] = js.undefined
  
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object DescribeCanariesRequest {
  
  @scala.inline
  def apply(): DescribeCanariesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCanariesRequest]
  }
  
  @scala.inline
  implicit class DescribeCanariesRequestMutableBuilder[Self <: DescribeCanariesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxCanaryResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
