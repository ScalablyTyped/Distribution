package typings.chainsafeLibp2pGossipsub.anon

import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.PublishConfig
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.PublishConfigType.Signing
import typings.libp2pInterfaceKeys.mod.PrivateKey
import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Author
  extends StObject
     with PublishConfig {
  
  var author: PeerId
  
  var key: js.typedarray.Uint8Array
  
  var privateKey: PrivateKey
  
  var `type`: Signing
}
object Author {
  
  inline def apply(author: PeerId, key: js.typedarray.Uint8Array, privateKey: PrivateKey, `type`: Signing): Author = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Author]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Author] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: PeerId): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPrivateKey(value: PrivateKey): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setType(value: Signing): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
