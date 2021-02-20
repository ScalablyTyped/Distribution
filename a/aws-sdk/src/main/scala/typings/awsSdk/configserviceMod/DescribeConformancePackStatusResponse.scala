package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConformancePackStatusResponse extends StObject {
  
  /**
    * A list of ConformancePackStatusDetail objects.
    */
  var ConformancePackStatusDetails: js.UndefOr[ConformancePackStatusDetailsList] = js.native
  
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
}
object DescribeConformancePackStatusResponse {
  
  @scala.inline
  def apply(): DescribeConformancePackStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConformancePackStatusResponse]
  }
  
  @scala.inline
  implicit class DescribeConformancePackStatusResponseMutableBuilder[Self <: DescribeConformancePackStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConformancePackStatusDetails(value: ConformancePackStatusDetailsList): Self = StObject.set(x, "ConformancePackStatusDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConformancePackStatusDetailsUndefined: Self = StObject.set(x, "ConformancePackStatusDetails", js.undefined)
    
    @scala.inline
    def setConformancePackStatusDetailsVarargs(value: ConformancePackStatusDetail*): Self = StObject.set(x, "ConformancePackStatusDetails", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
