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
  
  @scala.inline
  def apply(): VPC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VPC]
  }
  
  @scala.inline
  implicit class VPCMutableBuilder[Self <: VPC] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVPCId(value: VPCId): Self = StObject.set(x, "VPCId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVPCIdUndefined: Self = StObject.set(x, "VPCId", js.undefined)
    
    @scala.inline
    def setVPCRegion(value: VPCRegion): Self = StObject.set(x, "VPCRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVPCRegionUndefined: Self = StObject.set(x, "VPCRegion", js.undefined)
  }
}
