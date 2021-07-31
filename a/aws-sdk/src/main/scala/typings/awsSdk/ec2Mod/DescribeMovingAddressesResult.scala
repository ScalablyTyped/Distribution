package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMovingAddressesResult extends StObject {
  
  /**
    * The status for each Elastic IP address.
    */
  var MovingAddressStatuses: js.UndefOr[MovingAddressStatusSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeMovingAddressesResult {
  
  @scala.inline
  def apply(): DescribeMovingAddressesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMovingAddressesResult]
  }
  
  @scala.inline
  implicit class DescribeMovingAddressesResultMutableBuilder[Self <: DescribeMovingAddressesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMovingAddressStatuses(value: MovingAddressStatusSet): Self = StObject.set(x, "MovingAddressStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovingAddressStatusesUndefined: Self = StObject.set(x, "MovingAddressStatuses", js.undefined)
    
    @scala.inline
    def setMovingAddressStatusesVarargs(value: MovingAddressStatus*): Self = StObject.set(x, "MovingAddressStatuses", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
