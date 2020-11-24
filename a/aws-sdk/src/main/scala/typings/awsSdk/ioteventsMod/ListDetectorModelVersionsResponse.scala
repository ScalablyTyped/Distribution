package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDetectorModelVersionsResponse extends js.Object {
  
  /**
    * Summary information about the detector model versions.
    */
  var detectorModelVersionSummaries: js.UndefOr[DetectorModelVersionSummaries] = js.native
  
  /**
    * A token to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListDetectorModelVersionsResponse {
  
  @scala.inline
  def apply(): ListDetectorModelVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDetectorModelVersionsResponse]
  }
  
  @scala.inline
  implicit class ListDetectorModelVersionsResponseOps[Self <: ListDetectorModelVersionsResponse] (val x: Self) extends AnyVal {
    
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
    def setDetectorModelVersionSummariesVarargs(value: DetectorModelVersionSummary*): Self = this.set("detectorModelVersionSummaries", js.Array(value :_*))
    
    @scala.inline
    def setDetectorModelVersionSummaries(value: DetectorModelVersionSummaries): Self = this.set("detectorModelVersionSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectorModelVersionSummaries: Self = this.set("detectorModelVersionSummaries", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
