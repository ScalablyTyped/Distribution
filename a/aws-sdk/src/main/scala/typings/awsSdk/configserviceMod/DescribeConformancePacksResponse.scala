package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConformancePacksResponse extends StObject {
  
  /**
    * Returns a list of ConformancePackDetail objects.
    */
  var ConformancePackDetails: js.UndefOr[ConformancePackDetailList] = js.native
  
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
}
object DescribeConformancePacksResponse {
  
  @scala.inline
  def apply(): DescribeConformancePacksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConformancePacksResponse]
  }
  
  @scala.inline
  implicit class DescribeConformancePacksResponseMutableBuilder[Self <: DescribeConformancePacksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConformancePackDetails(value: ConformancePackDetailList): Self = StObject.set(x, "ConformancePackDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConformancePackDetailsUndefined: Self = StObject.set(x, "ConformancePackDetails", js.undefined)
    
    @scala.inline
    def setConformancePackDetailsVarargs(value: ConformancePackDetail*): Self = StObject.set(x, "ConformancePackDetails", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
