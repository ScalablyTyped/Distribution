package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchTransitGatewayMulticastGroupsResult extends js.Object {
  
  /**
    * Information about the transit gateway multicast group.
    */
  var MulticastGroups: js.UndefOr[TransitGatewayMulticastGroupList] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object SearchTransitGatewayMulticastGroupsResult {
  
  @scala.inline
  def apply(): SearchTransitGatewayMulticastGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchTransitGatewayMulticastGroupsResult]
  }
  
  @scala.inline
  implicit class SearchTransitGatewayMulticastGroupsResultOps[Self <: SearchTransitGatewayMulticastGroupsResult] (val x: Self) extends AnyVal {
    
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
    def setMulticastGroupsVarargs(value: TransitGatewayMulticastGroup*): Self = this.set("MulticastGroups", js.Array(value :_*))
    
    @scala.inline
    def setMulticastGroups(value: TransitGatewayMulticastGroupList): Self = this.set("MulticastGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMulticastGroups: Self = this.set("MulticastGroups", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
