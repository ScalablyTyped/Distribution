package typings.chainsafeLibp2pGossipsub

import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.PublishConfig
import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsMod {
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPublishConfigFromPeerId(signaturePolicy: /* "StrictSign" */ /* "StrictNoSign" */ String): js.Promise[PublishConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigFromPeerId")(signaturePolicy.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PublishConfig]]
  inline def getPublishConfigFromPeerId(signaturePolicy: /* "StrictSign" */ /* "StrictNoSign" */ String, peerId: PeerId): js.Promise[PublishConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigFromPeerId")(signaturePolicy.asInstanceOf[js.Any], peerId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PublishConfig]]
  
  inline def messageIdToString(msgId: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("messageIdToString")(msgId.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def shuffle[T](arr: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
