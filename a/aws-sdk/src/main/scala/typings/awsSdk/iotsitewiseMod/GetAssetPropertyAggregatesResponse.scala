package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAssetPropertyAggregatesResponse extends js.Object {
  
  /**
    * The requested aggregated values.
    */
  var aggregatedValues: AggregatedValues = js.native
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object GetAssetPropertyAggregatesResponse {
  
  @scala.inline
  def apply(aggregatedValues: AggregatedValues): GetAssetPropertyAggregatesResponse = {
    val __obj = js.Dynamic.literal(aggregatedValues = aggregatedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssetPropertyAggregatesResponse]
  }
  
  @scala.inline
  implicit class GetAssetPropertyAggregatesResponseOps[Self <: GetAssetPropertyAggregatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAggregatedValuesVarargs(value: AggregatedValue*): Self = this.set("aggregatedValues", js.Array(value :_*))
    
    @scala.inline
    def setAggregatedValues(value: AggregatedValues): Self = this.set("aggregatedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
