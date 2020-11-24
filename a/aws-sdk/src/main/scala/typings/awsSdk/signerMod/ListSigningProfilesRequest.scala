package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSigningProfilesRequest extends js.Object {
  
  /**
    * Designates whether to include profiles with the status of CANCELED.
    */
  var includeCanceled: js.UndefOr[bool] = js.native
  
  /**
    * The maximum number of profiles to be returned.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * Value for specifying the next set of paginated results to return. After you receive a response with truncated results, use this parameter in a subsequent request. Set it to the value of nextToken from the response that you just received.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListSigningProfilesRequest {
  
  @scala.inline
  def apply(): ListSigningProfilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSigningProfilesRequest]
  }
  
  @scala.inline
  implicit class ListSigningProfilesRequestOps[Self <: ListSigningProfilesRequest] (val x: Self) extends AnyVal {
    
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
    def setIncludeCanceled(value: bool): Self = this.set("includeCanceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeCanceled: Self = this.set("includeCanceled", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
