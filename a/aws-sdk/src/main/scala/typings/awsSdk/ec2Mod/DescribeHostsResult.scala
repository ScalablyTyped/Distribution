package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeHostsResult extends js.Object {
  
  /**
    * Information about the Dedicated Hosts.
    */
  var Hosts: js.UndefOr[HostList] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeHostsResult {
  
  @scala.inline
  def apply(): DescribeHostsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHostsResult]
  }
  
  @scala.inline
  implicit class DescribeHostsResultOps[Self <: DescribeHostsResult] (val x: Self) extends AnyVal {
    
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
    def setHostsVarargs(value: Host*): Self = this.set("Hosts", js.Array(value :_*))
    
    @scala.inline
    def setHosts(value: HostList): Self = this.set("Hosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHosts: Self = this.set("Hosts", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
