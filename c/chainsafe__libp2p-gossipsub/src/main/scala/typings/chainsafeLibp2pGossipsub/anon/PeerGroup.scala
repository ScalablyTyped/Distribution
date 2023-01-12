package typings.chainsafeLibp2pGossipsub.anon

import typings.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubStrings.direct
import typings.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubStrings.fanout
import typings.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubStrings.floodsub
import typings.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubStrings.mesh
import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.TopicLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerGroup extends StObject {
  
  var peerGroup: /* keyof @chainsafe/libp2p-gossipsub.@chainsafe/libp2p-gossipsub/dist/src/metrics.ToSendGroupCount */ direct | floodsub | mesh | fanout
  
  var topic: TopicLabel
}
object PeerGroup {
  
  inline def apply(
    peerGroup: /* keyof @chainsafe/libp2p-gossipsub.@chainsafe/libp2p-gossipsub/dist/src/metrics.ToSendGroupCount */ direct | floodsub | mesh | fanout,
    topic: TopicLabel
  ): PeerGroup = {
    val __obj = js.Dynamic.literal(peerGroup = peerGroup.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PeerGroup] (val x: Self) extends AnyVal {
    
    inline def setPeerGroup(
      value: /* keyof @chainsafe/libp2p-gossipsub.@chainsafe/libp2p-gossipsub/dist/src/metrics.ToSendGroupCount */ direct | floodsub | mesh | fanout
    ): Self = StObject.set(x, "peerGroup", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: TopicLabel): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
