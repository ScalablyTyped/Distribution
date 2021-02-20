package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCanariesResponse extends StObject {
  
  /**
    * Returns an array. Each item in the array contains the full information about one canary.
    */
  var Canaries: js.UndefOr[typings.awsSdk.syntheticsMod.Canaries] = js.native
  
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent DescribeCanaries operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object DescribeCanariesResponse {
  
  @scala.inline
  def apply(): DescribeCanariesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCanariesResponse]
  }
  
  @scala.inline
  implicit class DescribeCanariesResponseMutableBuilder[Self <: DescribeCanariesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanaries(value: Canaries): Self = StObject.set(x, "Canaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanariesUndefined: Self = StObject.set(x, "Canaries", js.undefined)
    
    @scala.inline
    def setCanariesVarargs(value: Canary*): Self = StObject.set(x, "Canaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
