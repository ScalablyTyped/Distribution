package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCapacityProvidersResponse extends StObject {
  
  /**
    * The list of capacity providers.
    */
  var capacityProviders: js.UndefOr[CapacityProviders] = js.native
  
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.native
  
  /**
    * The nextToken value to include in a future DescribeCapacityProviders request. When the results of a DescribeCapacityProviders request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object DescribeCapacityProvidersResponse {
  
  @scala.inline
  def apply(): DescribeCapacityProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCapacityProvidersResponse]
  }
  
  @scala.inline
  implicit class DescribeCapacityProvidersResponseMutableBuilder[Self <: DescribeCapacityProvidersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityProviders(value: CapacityProviders): Self = StObject.set(x, "capacityProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityProvidersUndefined: Self = StObject.set(x, "capacityProviders", js.undefined)
    
    @scala.inline
    def setCapacityProvidersVarargs(value: CapacityProvider*): Self = StObject.set(x, "capacityProviders", js.Array(value :_*))
    
    @scala.inline
    def setFailures(value: Failures): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    @scala.inline
    def setFailuresVarargs(value: Failure*): Self = StObject.set(x, "failures", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
