package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAddressesRequest extends StObject {
  
  /**
    * The number of ADDRESS objects to return.
    */
  var MaxResults: js.UndefOr[ListLimit] = js.native
  
  /**
    * HTTP requests are stateless. To identify what object comes "next" in the list of ADDRESS objects, you have the option of specifying a value for NextToken as the starting point for your list of returned addresses.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeAddressesRequest {
  
  @scala.inline
  def apply(): DescribeAddressesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAddressesRequest]
  }
  
  @scala.inline
  implicit class DescribeAddressesRequestMutableBuilder[Self <: DescribeAddressesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: ListLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
