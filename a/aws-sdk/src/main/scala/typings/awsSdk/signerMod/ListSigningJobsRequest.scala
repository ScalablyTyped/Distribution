package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSigningJobsRequest extends js.Object {
  
  /**
    * Specifies the maximum number of items to return in the response. Use this parameter when paginating results. If additional items exist beyond the number you specify, the nextToken element is set in the response. Use the nextToken value in a subsequent request to retrieve additional items. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * String for specifying the next set of paginated results to return. After you receive a response with truncated results, use this parameter in a subsequent request. Set it to the value of nextToken from the response that you just received.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The ID of microcontroller platform that you specified for the distribution of your code image.
    */
  var platformId: js.UndefOr[PlatformId] = js.native
  
  /**
    * The IAM principal that requested the signing job.
    */
  var requestedBy: js.UndefOr[RequestedBy] = js.native
  
  /**
    * A status value with which to filter your results.
    */
  var status: js.UndefOr[SigningStatus] = js.native
}
object ListSigningJobsRequest {
  
  @scala.inline
  def apply(): ListSigningJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSigningJobsRequest]
  }
  
  @scala.inline
  implicit class ListSigningJobsRequestOps[Self <: ListSigningJobsRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setPlatformId(value: PlatformId): Self = this.set("platformId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformId: Self = this.set("platformId", js.undefined)
    
    @scala.inline
    def setRequestedBy(value: RequestedBy): Self = this.set("requestedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedBy: Self = this.set("requestedBy", js.undefined)
    
    @scala.inline
    def setStatus(value: SigningStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
