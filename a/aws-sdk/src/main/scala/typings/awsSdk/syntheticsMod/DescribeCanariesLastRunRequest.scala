package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCanariesLastRunRequest extends StObject {
  
  /**
    * Specify this parameter to limit how many runs are returned each time you use the DescribeLastRun operation. If you omit this parameter, the default of 100 is used.
    */
  var MaxResults: js.UndefOr[MaxSize100] = js.native
  
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent DescribeCanaries operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object DescribeCanariesLastRunRequest {
  
  @scala.inline
  def apply(): DescribeCanariesLastRunRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCanariesLastRunRequest]
  }
  
  @scala.inline
  implicit class DescribeCanariesLastRunRequestMutableBuilder[Self <: DescribeCanariesLastRunRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxSize100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
