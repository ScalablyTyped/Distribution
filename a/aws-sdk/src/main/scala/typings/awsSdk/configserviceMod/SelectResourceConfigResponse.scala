package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectResourceConfigResponse extends js.Object {
  
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
  
  /**
    * Returns the QueryInfo object.
    */
  var QueryInfo: js.UndefOr[typings.awsSdk.configserviceMod.QueryInfo] = js.native
  
  /**
    * Returns the results for the SQL query.
    */
  var Results: js.UndefOr[typings.awsSdk.configserviceMod.Results] = js.native
}
object SelectResourceConfigResponse {
  
  @scala.inline
  def apply(): SelectResourceConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectResourceConfigResponse]
  }
  
  @scala.inline
  implicit class SelectResourceConfigResponseOps[Self <: SelectResourceConfigResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setQueryInfo(value: QueryInfo): Self = this.set("QueryInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryInfo: Self = this.set("QueryInfo", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: String*): Self = this.set("Results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: Results): Self = this.set("Results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("Results", js.undefined)
  }
}
