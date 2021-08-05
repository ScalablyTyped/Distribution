package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableVpcClassicLinkDnsSupportRequest extends StObject {
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[typings.awsSdk.ec2Mod.VpcId] = js.undefined
}
object EnableVpcClassicLinkDnsSupportRequest {
  
  inline def apply(): EnableVpcClassicLinkDnsSupportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableVpcClassicLinkDnsSupportRequest]
  }
  
  extension [Self <: EnableVpcClassicLinkDnsSupportRequest](x: Self) {
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
