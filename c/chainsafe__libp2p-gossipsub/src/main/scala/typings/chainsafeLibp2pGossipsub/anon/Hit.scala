package typings.chainsafeLibp2pGossipsub.anon

import typings.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubStrings.hit
import typings.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubStrings.miss
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hit extends StObject {
  
  var hit: typings.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubStrings.hit | miss
}
object Hit {
  
  inline def apply(hit: hit | miss): Hit = {
    val __obj = js.Dynamic.literal(hit = hit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hit]
  }
  
  extension [Self <: Hit](x: Self) {
    
    inline def setHit(value: hit | miss): Self = StObject.set(x, "hit", value.asInstanceOf[js.Any])
  }
}
