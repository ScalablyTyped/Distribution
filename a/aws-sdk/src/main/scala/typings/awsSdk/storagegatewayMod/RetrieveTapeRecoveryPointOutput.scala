package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetrieveTapeRecoveryPointOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the virtual tape for which the recovery point was retrieved.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARN] = js.undefined
}
object RetrieveTapeRecoveryPointOutput {
  
  inline def apply(): RetrieveTapeRecoveryPointOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetrieveTapeRecoveryPointOutput]
  }
  
  extension [Self <: RetrieveTapeRecoveryPointOutput](x: Self) {
    
    inline def setTapeARN(value: TapeARN): Self = StObject.set(x, "TapeARN", value.asInstanceOf[js.Any])
    
    inline def setTapeARNUndefined: Self = StObject.set(x, "TapeARN", js.undefined)
  }
}
