package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTerminologiesRequest extends js.Object {
  
  /**
    * The maximum number of custom terminologies returned per list request.
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.native
  
  /**
    * If the result of the request to ListTerminologies was truncated, include the NextToken to fetch the next group of custom terminologies. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.translateMod.NextToken] = js.native
}
object ListTerminologiesRequest {
  
  @scala.inline
  def apply(): ListTerminologiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTerminologiesRequest]
  }
  
  @scala.inline
  implicit class ListTerminologiesRequestOps[Self <: ListTerminologiesRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: MaxResultsInteger): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
