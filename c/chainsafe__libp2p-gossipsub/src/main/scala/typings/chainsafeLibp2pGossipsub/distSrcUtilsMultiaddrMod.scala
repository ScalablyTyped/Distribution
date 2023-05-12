package typings.chainsafeLibp2pGossipsub

import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsMultiaddrMod {
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/utils/multiaddr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def multiaddrToIPStr(multiaddr: Multiaddr_): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("multiaddrToIPStr")(multiaddr.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
