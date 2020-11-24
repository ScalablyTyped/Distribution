package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDomainsResult extends js.Object {
  
  /**
    * An array of key-value pairs containing information about each of the domain entries in the user's account.
    */
  var domains: js.UndefOr[DomainList] = js.native
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetDomains request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GetDomainsResult {
  
  @scala.inline
  def apply(): GetDomainsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDomainsResult]
  }
  
  @scala.inline
  implicit class GetDomainsResultOps[Self <: GetDomainsResult] (val x: Self) extends AnyVal {
    
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
    def setDomainsVarargs(value: Domain*): Self = this.set("domains", js.Array(value :_*))
    
    @scala.inline
    def setDomains(value: DomainList): Self = this.set("domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomains: Self = this.set("domains", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
