package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcClassicLinkResult extends StObject {
  
  /**
    * The ClassicLink status of one or more VPCs.
    */
  var Vpcs: js.UndefOr[VpcClassicLinkList] = js.undefined
}
object DescribeVpcClassicLinkResult {
  
  @scala.inline
  def apply(): DescribeVpcClassicLinkResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcClassicLinkResult]
  }
  
  @scala.inline
  implicit class DescribeVpcClassicLinkResultMutableBuilder[Self <: DescribeVpcClassicLinkResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpcs(value: VpcClassicLinkList): Self = StObject.set(x, "Vpcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcsUndefined: Self = StObject.set(x, "Vpcs", js.undefined)
    
    @scala.inline
    def setVpcsVarargs(value: VpcClassicLink*): Self = StObject.set(x, "Vpcs", js.Array(value :_*))
  }
}
