package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDedicatedIpsResponse extends js.Object {
  
  /**
    * A list of dedicated IP addresses that are associated with your AWS account.
    */
  var DedicatedIps: js.UndefOr[DedicatedIpList] = js.native
  
  /**
    * A token that indicates that there are additional dedicated IP addresses to list. To view additional addresses, issue another request to GetDedicatedIps, passing this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesv2Mod.NextToken] = js.native
}
object GetDedicatedIpsResponse {
  
  @scala.inline
  def apply(): GetDedicatedIpsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDedicatedIpsResponse]
  }
  
  @scala.inline
  implicit class GetDedicatedIpsResponseOps[Self <: GetDedicatedIpsResponse] (val x: Self) extends AnyVal {
    
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
    def setDedicatedIpsVarargs(value: DedicatedIp*): Self = this.set("DedicatedIps", js.Array(value :_*))
    
    @scala.inline
    def setDedicatedIps(value: DedicatedIpList): Self = this.set("DedicatedIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDedicatedIps: Self = this.set("DedicatedIps", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
