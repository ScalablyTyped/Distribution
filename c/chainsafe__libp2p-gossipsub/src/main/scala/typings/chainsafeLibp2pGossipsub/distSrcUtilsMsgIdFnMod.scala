package typings.chainsafeLibp2pGossipsub

import typings.libp2pInterfacePubsub.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsMsgIdFnMod {
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/utils/msgIdFn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def msgIdFnStrictNoSign(msg: Message): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("msgIdFnStrictNoSign")(msg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  inline def msgIdFnStrictSign(msg: Message): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("msgIdFnStrictSign")(msg.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
