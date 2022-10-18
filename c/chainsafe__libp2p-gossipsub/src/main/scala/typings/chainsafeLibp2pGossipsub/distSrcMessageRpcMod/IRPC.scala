package typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod

import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.IControlMessage
import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.IMessage
import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.ISubOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRPC extends StObject {
  
  /** RPC control */
  var control: js.UndefOr[IControlMessage | Null] = js.undefined
  
  /** RPC messages */
  var messages: js.UndefOr[js.Array[IMessage] | Null] = js.undefined
  
  /** RPC subscriptions */
  var subscriptions: js.UndefOr[js.Array[ISubOpts] | Null] = js.undefined
}
object IRPC {
  
  inline def apply(): IRPC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRPC]
  }
  
  extension [Self <: IRPC](x: Self) {
    
    inline def setControl(value: IControlMessage): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setControlNull: Self = StObject.set(x, "control", null)
    
    inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    inline def setMessages(value: js.Array[IMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesNull: Self = StObject.set(x, "messages", null)
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: IMessage*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setSubscriptions(value: js.Array[ISubOpts]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionsNull: Self = StObject.set(x, "subscriptions", null)
    
    inline def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
    
    inline def setSubscriptionsVarargs(value: ISubOpts*): Self = StObject.set(x, "subscriptions", js.Array(value*))
  }
}
