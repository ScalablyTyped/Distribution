package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCanariesLastRunResponse extends StObject {
  
  /**
    * An array that contains the information from the most recent run of each canary.
    */
  var CanariesLastRun: js.UndefOr[typings.awsSdk.syntheticsMod.CanariesLastRun] = js.native
  
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent DescribeCanariesLastRun operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object DescribeCanariesLastRunResponse {
  
  @scala.inline
  def apply(): DescribeCanariesLastRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCanariesLastRunResponse]
  }
  
  @scala.inline
  implicit class DescribeCanariesLastRunResponseMutableBuilder[Self <: DescribeCanariesLastRunResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanariesLastRun(value: CanariesLastRun): Self = StObject.set(x, "CanariesLastRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanariesLastRunUndefined: Self = StObject.set(x, "CanariesLastRun", js.undefined)
    
    @scala.inline
    def setCanariesLastRunVarargs(value: CanaryLastRun*): Self = StObject.set(x, "CanariesLastRun", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
