package typings.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteHsmRequest extends StObject {
  
  /**
    * The identifier (ID) of the cluster that contains the HSM that you are deleting.
    */
  var ClusterId: typings.awsSdk.cloudhsmv2Mod.ClusterId
  
  /**
    * The identifier (ID) of the elastic network interface (ENI) of the HSM that you are deleting.
    */
  var EniId: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.EniId] = js.undefined
  
  /**
    * The IP address of the elastic network interface (ENI) of the HSM that you are deleting.
    */
  var EniIp: js.UndefOr[IpAddress] = js.undefined
  
  /**
    * The identifier (ID) of the HSM that you are deleting.
    */
  var HsmId: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.HsmId] = js.undefined
}
object DeleteHsmRequest {
  
  inline def apply(ClusterId: ClusterId): DeleteHsmRequest = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHsmRequest]
  }
  
  extension [Self <: DeleteHsmRequest](x: Self) {
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setEniId(value: EniId): Self = StObject.set(x, "EniId", value.asInstanceOf[js.Any])
    
    inline def setEniIdUndefined: Self = StObject.set(x, "EniId", js.undefined)
    
    inline def setEniIp(value: IpAddress): Self = StObject.set(x, "EniIp", value.asInstanceOf[js.Any])
    
    inline def setEniIpUndefined: Self = StObject.set(x, "EniIp", js.undefined)
    
    inline def setHsmId(value: HsmId): Self = StObject.set(x, "HsmId", value.asInstanceOf[js.Any])
    
    inline def setHsmIdUndefined: Self = StObject.set(x, "HsmId", js.undefined)
  }
}
