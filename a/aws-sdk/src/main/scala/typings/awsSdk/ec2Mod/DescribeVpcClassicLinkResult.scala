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
  
  inline def apply(): DescribeVpcClassicLinkResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcClassicLinkResult]
  }
  
  extension [Self <: DescribeVpcClassicLinkResult](x: Self) {
    
    inline def setVpcs(value: VpcClassicLinkList): Self = StObject.set(x, "Vpcs", value.asInstanceOf[js.Any])
    
    inline def setVpcsUndefined: Self = StObject.set(x, "Vpcs", js.undefined)
    
    inline def setVpcsVarargs(value: VpcClassicLink*): Self = StObject.set(x, "Vpcs", js.Array(value*))
  }
}
