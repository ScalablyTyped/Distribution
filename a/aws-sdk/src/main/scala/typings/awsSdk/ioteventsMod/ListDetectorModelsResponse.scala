package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDetectorModelsResponse extends js.Object {
  
  /**
    * Summary information about the detector models.
    */
  var detectorModelSummaries: js.UndefOr[DetectorModelSummaries] = js.native
  
  /**
    * A token to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListDetectorModelsResponse {
  
  @scala.inline
  def apply(): ListDetectorModelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDetectorModelsResponse]
  }
  
  @scala.inline
  implicit class ListDetectorModelsResponseOps[Self <: ListDetectorModelsResponse] (val x: Self) extends AnyVal {
    
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
    def setDetectorModelSummariesVarargs(value: DetectorModelSummary*): Self = this.set("detectorModelSummaries", js.Array(value :_*))
    
    @scala.inline
    def setDetectorModelSummaries(value: DetectorModelSummaries): Self = this.set("detectorModelSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectorModelSummaries: Self = this.set("detectorModelSummaries", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
