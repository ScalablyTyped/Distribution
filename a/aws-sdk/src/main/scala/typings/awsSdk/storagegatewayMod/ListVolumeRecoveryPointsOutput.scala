package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVolumeRecoveryPointsOutput extends StObject {
  
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.undefined
  
  /**
    * An array of VolumeRecoveryPointInfo objects.
    */
  var VolumeRecoveryPointInfos: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeRecoveryPointInfos] = js.undefined
}
object ListVolumeRecoveryPointsOutput {
  
  inline def apply(): ListVolumeRecoveryPointsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVolumeRecoveryPointsOutput]
  }
  
  extension [Self <: ListVolumeRecoveryPointsOutput](x: Self) {
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
    
    inline def setVolumeRecoveryPointInfos(value: VolumeRecoveryPointInfos): Self = StObject.set(x, "VolumeRecoveryPointInfos", value.asInstanceOf[js.Any])
    
    inline def setVolumeRecoveryPointInfosUndefined: Self = StObject.set(x, "VolumeRecoveryPointInfos", js.undefined)
    
    inline def setVolumeRecoveryPointInfosVarargs(value: VolumeRecoveryPointInfo*): Self = StObject.set(x, "VolumeRecoveryPointInfos", js.Array(value :_*))
  }
}
