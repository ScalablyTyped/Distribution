package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSubnetsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about one or more subnets.
    */
  var Subnets: js.UndefOr[SubnetList] = js.undefined
}
object DescribeSubnetsResult {
  
  @scala.inline
  def apply(): DescribeSubnetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSubnetsResult]
  }
  
  @scala.inline
  implicit class DescribeSubnetsResultMutableBuilder[Self <: DescribeSubnetsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSubnets(value: SubnetList): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetsUndefined: Self = StObject.set(x, "Subnets", js.undefined)
    
    @scala.inline
    def setSubnetsVarargs(value: Subnet*): Self = StObject.set(x, "Subnets", js.Array(value :_*))
  }
}
