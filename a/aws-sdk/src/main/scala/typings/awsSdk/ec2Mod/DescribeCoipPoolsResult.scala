package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCoipPoolsResult extends StObject {
  
  /**
    * Information about the address pools.
    */
  var CoipPools: js.UndefOr[CoipPoolSet] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeCoipPoolsResult {
  
  @scala.inline
  def apply(): DescribeCoipPoolsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCoipPoolsResult]
  }
  
  @scala.inline
  implicit class DescribeCoipPoolsResultMutableBuilder[Self <: DescribeCoipPoolsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoipPools(value: CoipPoolSet): Self = StObject.set(x, "CoipPools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoipPoolsUndefined: Self = StObject.set(x, "CoipPools", js.undefined)
    
    @scala.inline
    def setCoipPoolsVarargs(value: CoipPool*): Self = StObject.set(x, "CoipPools", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
