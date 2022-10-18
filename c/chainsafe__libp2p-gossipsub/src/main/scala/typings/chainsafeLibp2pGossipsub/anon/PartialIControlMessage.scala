package typings.chainsafeLibp2pGossipsub.anon

import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.IControlGraft
import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.IControlIHave
import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.IControlIWant
import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.IControlPrune
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@chainsafe/libp2p-gossipsub.@chainsafe/libp2p-gossipsub/dist/src/message/rpc.RPC.IControlMessage> */
trait PartialIControlMessage extends StObject {
  
  var graft: js.UndefOr[js.Array[IControlGraft] | Null] = js.undefined
  
  var ihave: js.UndefOr[js.Array[IControlIHave] | Null] = js.undefined
  
  var iwant: js.UndefOr[js.Array[IControlIWant] | Null] = js.undefined
  
  var prune: js.UndefOr[js.Array[IControlPrune] | Null] = js.undefined
}
object PartialIControlMessage {
  
  inline def apply(): PartialIControlMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIControlMessage]
  }
  
  extension [Self <: PartialIControlMessage](x: Self) {
    
    inline def setGraft(value: js.Array[IControlGraft]): Self = StObject.set(x, "graft", value.asInstanceOf[js.Any])
    
    inline def setGraftNull: Self = StObject.set(x, "graft", null)
    
    inline def setGraftUndefined: Self = StObject.set(x, "graft", js.undefined)
    
    inline def setGraftVarargs(value: IControlGraft*): Self = StObject.set(x, "graft", js.Array(value*))
    
    inline def setIhave(value: js.Array[IControlIHave]): Self = StObject.set(x, "ihave", value.asInstanceOf[js.Any])
    
    inline def setIhaveNull: Self = StObject.set(x, "ihave", null)
    
    inline def setIhaveUndefined: Self = StObject.set(x, "ihave", js.undefined)
    
    inline def setIhaveVarargs(value: IControlIHave*): Self = StObject.set(x, "ihave", js.Array(value*))
    
    inline def setIwant(value: js.Array[IControlIWant]): Self = StObject.set(x, "iwant", value.asInstanceOf[js.Any])
    
    inline def setIwantNull: Self = StObject.set(x, "iwant", null)
    
    inline def setIwantUndefined: Self = StObject.set(x, "iwant", js.undefined)
    
    inline def setIwantVarargs(value: IControlIWant*): Self = StObject.set(x, "iwant", js.Array(value*))
    
    inline def setPrune(value: js.Array[IControlPrune]): Self = StObject.set(x, "prune", value.asInstanceOf[js.Any])
    
    inline def setPruneNull: Self = StObject.set(x, "prune", null)
    
    inline def setPruneUndefined: Self = StObject.set(x, "prune", js.undefined)
    
    inline def setPruneVarargs(value: IControlPrune*): Self = StObject.set(x, "prune", js.Array(value*))
  }
}
