package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConformancePackStatusRequest extends StObject {
  
  /**
    * Comma-separated list of conformance pack names.
    */
  var ConformancePackNames: js.UndefOr[ConformancePackNamesList] = js.undefined
  
  /**
    * The maximum number of conformance packs status returned on each page.
    */
  var Limit: js.UndefOr[PageSizeLimit] = js.undefined
  
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.undefined
}
object DescribeConformancePackStatusRequest {
  
  @scala.inline
  def apply(): DescribeConformancePackStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConformancePackStatusRequest]
  }
  
  @scala.inline
  implicit class DescribeConformancePackStatusRequestMutableBuilder[Self <: DescribeConformancePackStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConformancePackNames(value: ConformancePackNamesList): Self = StObject.set(x, "ConformancePackNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConformancePackNamesUndefined: Self = StObject.set(x, "ConformancePackNames", js.undefined)
    
    @scala.inline
    def setConformancePackNamesVarargs(value: ConformancePackName*): Self = StObject.set(x, "ConformancePackNames", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: PageSizeLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
