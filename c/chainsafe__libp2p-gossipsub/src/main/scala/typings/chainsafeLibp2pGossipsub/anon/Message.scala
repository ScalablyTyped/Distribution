package typings.chainsafeLibp2pGossipsub.anon

import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.IMessage
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.PeerIdStr
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  var message: IMessage
  
  var originatingPeers: Set[PeerIdStr]
}
object Message {
  
  inline def apply(message: IMessage, originatingPeers: Set[PeerIdStr]): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], originatingPeers = originatingPeers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setMessage(value: IMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOriginatingPeers(value: Set[PeerIdStr]): Self = StObject.set(x, "originatingPeers", value.asInstanceOf[js.Any])
  }
}
