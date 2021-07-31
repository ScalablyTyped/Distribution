package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVolumeRecoveryPointsInput extends StObject {
  
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN
}
object ListVolumeRecoveryPointsInput {
  
  @scala.inline
  def apply(GatewayARN: GatewayARN): ListVolumeRecoveryPointsInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVolumeRecoveryPointsInput]
  }
  
  @scala.inline
  implicit class ListVolumeRecoveryPointsInputMutableBuilder[Self <: ListVolumeRecoveryPointsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}
