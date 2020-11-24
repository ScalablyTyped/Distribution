package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStaticIpsResult extends js.Object {
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetStaticIps request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * An array of key-value pairs containing information about your get static IPs request.
    */
  var staticIps: js.UndefOr[StaticIpList] = js.native
}
object GetStaticIpsResult {
  
  @scala.inline
  def apply(): GetStaticIpsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStaticIpsResult]
  }
  
  @scala.inline
  implicit class GetStaticIpsResultOps[Self <: GetStaticIpsResult] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setStaticIpsVarargs(value: StaticIp*): Self = this.set("staticIps", js.Array(value :_*))
    
    @scala.inline
    def setStaticIps(value: StaticIpList): Self = this.set("staticIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticIps: Self = this.set("staticIps", js.undefined)
  }
}
