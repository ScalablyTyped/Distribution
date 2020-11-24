package typings.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDetectorsResponse extends js.Object {
  
  /**
    * A list of summary information about the detectors (instances).
    */
  var detectorSummaries: js.UndefOr[DetectorSummaries] = js.native
  
  /**
    * A token to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListDetectorsResponse {
  
  @scala.inline
  def apply(): ListDetectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDetectorsResponse]
  }
  
  @scala.inline
  implicit class ListDetectorsResponseOps[Self <: ListDetectorsResponse] (val x: Self) extends AnyVal {
    
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
    def setDetectorSummariesVarargs(value: DetectorSummary*): Self = this.set("detectorSummaries", js.Array(value :_*))
    
    @scala.inline
    def setDetectorSummaries(value: DetectorSummaries): Self = this.set("detectorSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectorSummaries: Self = this.set("detectorSummaries", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
