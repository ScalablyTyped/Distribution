package typings.chainsafeLibp2pGossipsub

import typings.chainsafeLibp2pGossipsub.anon.PartialIControlMessage
import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.IRPC
import typings.chainsafeLibp2pGossipsub.distSrcMessageRpcMod.RPC.IMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsCreateGossipRpcMod {
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/utils/create-gossip-rpc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createGossipRpc(): IRPC = ^.asInstanceOf[js.Dynamic].applyDynamic("createGossipRpc")().asInstanceOf[IRPC]
  inline def createGossipRpc(messages: js.Array[IMessage]): IRPC = ^.asInstanceOf[js.Dynamic].applyDynamic("createGossipRpc")(messages.asInstanceOf[js.Any]).asInstanceOf[IRPC]
  inline def createGossipRpc(messages: js.Array[IMessage], control: PartialIControlMessage): IRPC = (^.asInstanceOf[js.Dynamic].applyDynamic("createGossipRpc")(messages.asInstanceOf[js.Any], control.asInstanceOf[js.Any])).asInstanceOf[IRPC]
  inline def createGossipRpc(messages: Unit, control: PartialIControlMessage): IRPC = (^.asInstanceOf[js.Dynamic].applyDynamic("createGossipRpc")(messages.asInstanceOf[js.Any], control.asInstanceOf[js.Any])).asInstanceOf[IRPC]
}
