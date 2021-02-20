package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelRetrievalInput extends StObject {
  
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the virtual tape you want to cancel retrieval for.
    */
  var TapeARN: typings.awsSdk.storagegatewayMod.TapeARN = js.native
}
object CancelRetrievalInput {
  
  @scala.inline
  def apply(GatewayARN: GatewayARN, TapeARN: TapeARN): CancelRetrievalInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], TapeARN = TapeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelRetrievalInput]
  }
  
  @scala.inline
  implicit class CancelRetrievalInputMutableBuilder[Self <: CancelRetrievalInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeARN(value: TapeARN): Self = StObject.set(x, "TapeARN", value.asInstanceOf[js.Any])
  }
}
