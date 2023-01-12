package typings.chainsafeLibp2pGossipsub.distSrcTypesMod

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddrInfo extends StObject {
  
  var addrs: js.Array[Multiaddr_]
  
  var id: PeerId
}
object AddrInfo {
  
  inline def apply(addrs: js.Array[Multiaddr_], id: PeerId): AddrInfo = {
    val __obj = js.Dynamic.literal(addrs = addrs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddrInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddrInfo] (val x: Self) extends AnyVal {
    
    inline def setAddrs(value: js.Array[Multiaddr_]): Self = StObject.set(x, "addrs", value.asInstanceOf[js.Any])
    
    inline def setAddrsVarargs(value: Multiaddr_ *): Self = StObject.set(x, "addrs", js.Array(value*))
    
    inline def setId(value: PeerId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
