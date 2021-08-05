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
  
  inline def apply(): DescribeMovingAddressesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMovingAddressesResult]
  }
  
  extension [Self <: DescribeMovingAddressesResult](x: Self) {
    
    inline def setMovingAddressStatuses(value: MovingAddressStatusSet): Self = StObject.set(x, "MovingAddressStatuses", value.asInstanceOf[js.Any])
    
    inline def setMovingAddressStatusesUndefined: Self = StObject.set(x, "MovingAddressStatuses", js.undefined)
    
    inline def setMovingAddressStatusesVarargs(value: MovingAddressStatus*): Self = StObject.set(x, "MovingAddressStatuses", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
