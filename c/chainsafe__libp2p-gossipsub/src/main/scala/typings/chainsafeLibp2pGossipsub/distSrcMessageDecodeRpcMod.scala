package typings.chainsafeLibp2pGossipsub

import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.IRPC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMessageDecodeRpcMod {
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/message/decodeRpc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeRpc(bytes: js.typedarray.Uint8Array, opts: DecodeRPCLimits): IRPC = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeRpc")(bytes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IRPC]
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/message/decodeRpc", "defaultDecodeRpcLimits")
  @js.native
  val defaultDecodeRpcLimits: DecodeRPCLimits = js.native
  
  trait DecodeRPCLimits extends StObject {
    
    var maxControlMessages: Double
    
    var maxIhaveMessageIDs: Double
    
    var maxIwantMessageIDs: Double
    
    var maxMessages: Double
    
    var maxPeerInfos: Double
    
    var maxSubscriptions: Double
  }
  object DecodeRPCLimits {
    
    inline def apply(
      maxControlMessages: Double,
      maxIhaveMessageIDs: Double,
      maxIwantMessageIDs: Double,
      maxMessages: Double,
      maxPeerInfos: Double,
      maxSubscriptions: Double
    ): DecodeRPCLimits = {
      val __obj = js.Dynamic.literal(maxControlMessages = maxControlMessages.asInstanceOf[js.Any], maxIhaveMessageIDs = maxIhaveMessageIDs.asInstanceOf[js.Any], maxIwantMessageIDs = maxIwantMessageIDs.asInstanceOf[js.Any], maxMessages = maxMessages.asInstanceOf[js.Any], maxPeerInfos = maxPeerInfos.asInstanceOf[js.Any], maxSubscriptions = maxSubscriptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodeRPCLimits]
    }
    
    extension [Self <: DecodeRPCLimits](x: Self) {
      
      inline def setMaxControlMessages(value: Double): Self = StObject.set(x, "maxControlMessages", value.asInstanceOf[js.Any])
      
      inline def setMaxIhaveMessageIDs(value: Double): Self = StObject.set(x, "maxIhaveMessageIDs", value.asInstanceOf[js.Any])
      
      inline def setMaxIwantMessageIDs(value: Double): Self = StObject.set(x, "maxIwantMessageIDs", value.asInstanceOf[js.Any])
      
      inline def setMaxMessages(value: Double): Self = StObject.set(x, "maxMessages", value.asInstanceOf[js.Any])
      
      inline def setMaxPeerInfos(value: Double): Self = StObject.set(x, "maxPeerInfos", value.asInstanceOf[js.Any])
      
      inline def setMaxSubscriptions(value: Double): Self = StObject.set(x, "maxSubscriptions", value.asInstanceOf[js.Any])
    }
  }
}
