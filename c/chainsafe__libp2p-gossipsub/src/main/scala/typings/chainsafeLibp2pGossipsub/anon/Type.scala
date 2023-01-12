package typings.chainsafeLibp2pGossipsub.anon

import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.PublishConfig
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.PublishConfigType.Anonymous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type
  extends StObject
     with PublishConfig {
  
  var `type`: Anonymous
}
object Type {
  
  inline def apply(`type`: Anonymous): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    inline def setType(value: Anonymous): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
