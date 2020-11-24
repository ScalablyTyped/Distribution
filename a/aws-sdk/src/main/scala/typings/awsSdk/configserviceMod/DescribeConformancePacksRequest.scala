package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConformancePacksRequest extends js.Object {
  
  /**
    * Comma-separated list of conformance pack names for which you want details. If you do not specify any names, AWS Config returns details for all your conformance packs. 
    */
  var ConformancePackNames: js.UndefOr[ConformancePackNamesList] = js.native
  
  /**
    * The maximum number of conformance packs returned on each page.
    */
  var Limit: js.UndefOr[PageSizeLimit] = js.native
  
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
}
object DescribeConformancePacksRequest {
  
  @scala.inline
  def apply(): DescribeConformancePacksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConformancePacksRequest]
  }
  
  @scala.inline
  implicit class DescribeConformancePacksRequestOps[Self <: DescribeConformancePacksRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConformancePackNamesVarargs(value: ConformancePackName*): Self = this.set("ConformancePackNames", js.Array(value :_*))
    
    @scala.inline
    def setConformancePackNames(value: ConformancePackNamesList): Self = this.set("ConformancePackNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConformancePackNames: Self = this.set("ConformancePackNames", js.undefined)
    
    @scala.inline
    def setLimit(value: PageSizeLimit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
