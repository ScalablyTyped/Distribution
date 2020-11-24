package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGlobalNetworksResponse extends js.Object {
  
  /**
    * Information about the global networks.
    */
  var GlobalNetworks: js.UndefOr[GlobalNetworkList] = js.native
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeGlobalNetworksResponse {
  
  @scala.inline
  def apply(): DescribeGlobalNetworksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGlobalNetworksResponse]
  }
  
  @scala.inline
  implicit class DescribeGlobalNetworksResponseOps[Self <: DescribeGlobalNetworksResponse] (val x: Self) extends AnyVal {
    
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
    def setGlobalNetworksVarargs(value: GlobalNetwork*): Self = this.set("GlobalNetworks", js.Array(value :_*))
    
    @scala.inline
    def setGlobalNetworks(value: GlobalNetworkList): Self = this.set("GlobalNetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalNetworks: Self = this.set("GlobalNetworks", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
