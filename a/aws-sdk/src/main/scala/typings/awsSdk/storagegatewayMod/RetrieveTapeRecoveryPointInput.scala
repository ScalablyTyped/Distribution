package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetrieveTapeRecoveryPointInput extends StObject {
  
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN
  
  /**
    * The Amazon Resource Name (ARN) of the virtual tape for which you want to retrieve the recovery point.
    */
  var TapeARN: typings.awsSdk.storagegatewayMod.TapeARN
}
object RetrieveTapeRecoveryPointInput {
  
  inline def apply(GatewayARN: GatewayARN, TapeARN: TapeARN): RetrieveTapeRecoveryPointInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], TapeARN = TapeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveTapeRecoveryPointInput]
  }
  
  extension [Self <: RetrieveTapeRecoveryPointInput](x: Self) {
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setTapeARN(value: TapeARN): Self = StObject.set(x, "TapeARN", value.asInstanceOf[js.Any])
  }
}
