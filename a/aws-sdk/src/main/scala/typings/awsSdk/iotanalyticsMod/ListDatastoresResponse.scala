package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDatastoresResponse extends js.Object {
  
  /**
    * A list of DatastoreSummary objects.
    */
  var datastoreSummaries: js.UndefOr[DatastoreSummaries] = js.native
  
  /**
    * The token to retrieve the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListDatastoresResponse {
  
  @scala.inline
  def apply(): ListDatastoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatastoresResponse]
  }
  
  @scala.inline
  implicit class ListDatastoresResponseOps[Self <: ListDatastoresResponse] (val x: Self) extends AnyVal {
    
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
    def setDatastoreSummariesVarargs(value: DatastoreSummary*): Self = this.set("datastoreSummaries", js.Array(value :_*))
    
    @scala.inline
    def setDatastoreSummaries(value: DatastoreSummaries): Self = this.set("datastoreSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatastoreSummaries: Self = this.set("datastoreSummaries", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
