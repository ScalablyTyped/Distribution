package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VPC extends StObject {
  
  var VPCId: js.UndefOr[typings.awsSdk.route53Mod.VPCId] = js.undefined
  
  /**
    * (Private hosted zones only) The region that an Amazon VPC was created in.
    */
  var VPCRegion: js.UndefOr[typings.awsSdk.route53Mod.VPCRegion] = js.undefined
}
object VPC {
  
  inline def apply(): VPC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VPC]
  }
  
  extension [Self <: VPC](x: Self) {
    
    inline def setVPCId(value: VPCId): Self = StObject.set(x, "VPCId", value.asInstanceOf[js.Any])
    
    inline def setVPCIdUndefined: Self = StObject.set(x, "VPCId", js.undefined)
    
    inline def setVPCRegion(value: VPCRegion): Self = StObject.set(x, "VPCRegion", value.asInstanceOf[js.Any])
    
    inline def setVPCRegionUndefined: Self = StObject.set(x, "VPCRegion", js.undefined)
  }
}
