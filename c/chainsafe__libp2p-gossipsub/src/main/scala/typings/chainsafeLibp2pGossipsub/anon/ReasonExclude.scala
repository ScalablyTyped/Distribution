package typings.chainsafeLibp2pGossipsub.anon

import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReasonObj
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReasonExclude
  extends StObject
     with RejectReasonObj {
  
  var reason: Exclude[RejectReason, typings.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason.Error]
}
object ReasonExclude {
  
  inline def apply(reason: Exclude[RejectReason, typings.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason.Error]): ReasonExclude = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReasonExclude]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReasonExclude] (val x: Self) extends AnyVal {
    
    inline def setReason(value: Exclude[RejectReason, typings.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason.Error]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
