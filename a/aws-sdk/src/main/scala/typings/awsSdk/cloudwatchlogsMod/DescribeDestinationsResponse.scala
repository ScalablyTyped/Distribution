package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDestinationsResponse extends StObject {
  
  /**
    * The destinations.
    */
  var destinations: js.UndefOr[Destinations] = js.native
  
  var nextToken: js.UndefOr[NextToken] = js.native
}
object DescribeDestinationsResponse {
  
  @scala.inline
  def apply(): DescribeDestinationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDestinationsResponse]
  }
  
  @scala.inline
  implicit class DescribeDestinationsResponseMutableBuilder[Self <: DescribeDestinationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinations(value: Destinations): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationsUndefined: Self = StObject.set(x, "destinations", js.undefined)
    
    @scala.inline
    def setDestinationsVarargs(value: Destination*): Self = StObject.set(x, "destinations", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
