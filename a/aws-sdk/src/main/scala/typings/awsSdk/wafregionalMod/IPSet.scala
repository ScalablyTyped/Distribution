package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPSet extends StObject {
  
  /**
    * The IP address type (IPV4 or IPV6) and the IP address range (in CIDR notation) that web requests originate from. If the WebACL is associated with a CloudFront distribution and the viewer did not use an HTTP proxy or a load balancer to send the request, this is the value of the c-ip field in the CloudFront access logs.
    */
  var IPSetDescriptors: typings.awsSdk.wafregionalMod.IPSetDescriptors
  
  /**
    * The IPSetId for an IPSet. You use IPSetId to get information about an IPSet (see GetIPSet), update an IPSet (see UpdateIPSet), insert an IPSet into a Rule or delete one from a Rule (see UpdateRule), and delete an IPSet from AWS WAF (see DeleteIPSet).  IPSetId is returned by CreateIPSet and by ListIPSets.
    */
  var IPSetId: ResourceId
  
  /**
    * A friendly name or description of the IPSet. You can't change the name of an IPSet after you create it.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
}
object IPSet {
  
  @scala.inline
  def apply(IPSetDescriptors: IPSetDescriptors, IPSetId: ResourceId): IPSet = {
    val __obj = js.Dynamic.literal(IPSetDescriptors = IPSetDescriptors.asInstanceOf[js.Any], IPSetId = IPSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPSet]
  }
  
  @scala.inline
  implicit class IPSetMutableBuilder[Self <: IPSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIPSetDescriptors(value: IPSetDescriptors): Self = StObject.set(x, "IPSetDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPSetDescriptorsVarargs(value: IPSetDescriptor*): Self = StObject.set(x, "IPSetDescriptors", js.Array(value :_*))
    
    @scala.inline
    def setIPSetId(value: ResourceId): Self = StObject.set(x, "IPSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
