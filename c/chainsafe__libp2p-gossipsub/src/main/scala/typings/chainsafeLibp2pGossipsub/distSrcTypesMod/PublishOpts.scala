package typings.chainsafeLibp2pGossipsub.distSrcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishOpts extends StObject {
  
  var allowPublishToZeroPeers: js.UndefOr[Boolean] = js.undefined
  
  var ignoreDuplicatePublishError: js.UndefOr[Boolean] = js.undefined
}
object PublishOpts {
  
  inline def apply(): PublishOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublishOpts] (val x: Self) extends AnyVal {
    
    inline def setAllowPublishToZeroPeers(value: Boolean): Self = StObject.set(x, "allowPublishToZeroPeers", value.asInstanceOf[js.Any])
    
    inline def setAllowPublishToZeroPeersUndefined: Self = StObject.set(x, "allowPublishToZeroPeers", js.undefined)
    
    inline def setIgnoreDuplicatePublishError(value: Boolean): Self = StObject.set(x, "ignoreDuplicatePublishError", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDuplicatePublishErrorUndefined: Self = StObject.set(x, "ignoreDuplicatePublishError", js.undefined)
  }
}
