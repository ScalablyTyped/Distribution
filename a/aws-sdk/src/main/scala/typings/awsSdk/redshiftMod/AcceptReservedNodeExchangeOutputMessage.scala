package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptReservedNodeExchangeOutputMessage extends StObject {
  
  /**
    * 
    */
  var ExchangedReservedNode: js.UndefOr[ReservedNode] = js.native
}
object AcceptReservedNodeExchangeOutputMessage {
  
  @scala.inline
  def apply(): AcceptReservedNodeExchangeOutputMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptReservedNodeExchangeOutputMessage]
  }
  
  @scala.inline
  implicit class AcceptReservedNodeExchangeOutputMessageMutableBuilder[Self <: AcceptReservedNodeExchangeOutputMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExchangedReservedNode(value: ReservedNode): Self = StObject.set(x, "ExchangedReservedNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchangedReservedNodeUndefined: Self = StObject.set(x, "ExchangedReservedNode", js.undefined)
  }
}
