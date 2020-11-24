package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPSet extends js.Object {
  
  /**
    * The IP address type (IPV4 or IPV6) and the IP address range (in CIDR notation) that web requests originate from. If the WebACL is associated with a CloudFront distribution and the viewer did not use an HTTP proxy or a load balancer to send the request, this is the value of the c-ip field in the CloudFront access logs.
    */
  var IPSetDescriptors: typings.awsSdk.wafregionalMod.IPSetDescriptors = js.native
  
  /**
    * The IPSetId for an IPSet. You use IPSetId to get information about an IPSet (see GetIPSet), update an IPSet (see UpdateIPSet), insert an IPSet into a Rule or delete one from a Rule (see UpdateRule), and delete an IPSet from AWS WAF (see DeleteIPSet).  IPSetId is returned by CreateIPSet and by ListIPSets.
    */
  var IPSetId: ResourceId = js.native
  
  /**
    * A friendly name or description of the IPSet. You can't change the name of an IPSet after you create it.
    */
  var Name: js.UndefOr[ResourceName] = js.native
}
object IPSet {
  
  @scala.inline
  def apply(IPSetDescriptors: IPSetDescriptors, IPSetId: ResourceId): IPSet = {
    val __obj = js.Dynamic.literal(IPSetDescriptors = IPSetDescriptors.asInstanceOf[js.Any], IPSetId = IPSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPSet]
  }
  
  @scala.inline
  implicit class IPSetOps[Self <: IPSet] (val x: Self) extends AnyVal {
    
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
    def setIPSetDescriptorsVarargs(value: IPSetDescriptor*): Self = this.set("IPSetDescriptors", js.Array(value :_*))
    
    @scala.inline
    def setIPSetDescriptors(value: IPSetDescriptors): Self = this.set("IPSetDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPSetId(value: ResourceId): Self = this.set("IPSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
