package typings.chainsafeLibp2pGossipsub.anon

import typings.chainsafeLibp2pGossipsub.distSrcMetricsMod.IHaveIgnoreReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReasonIHaveIgnoreReason extends StObject {
  
  var reason: IHaveIgnoreReason
}
object ReasonIHaveIgnoreReason {
  
  inline def apply(reason: IHaveIgnoreReason): ReasonIHaveIgnoreReason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReasonIHaveIgnoreReason]
  }
  
  extension [Self <: ReasonIHaveIgnoreReason](x: Self) {
    
    inline def setReason(value: IHaveIgnoreReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
