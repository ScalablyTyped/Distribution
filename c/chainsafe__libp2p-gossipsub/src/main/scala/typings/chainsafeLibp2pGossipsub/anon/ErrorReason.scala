package typings.chainsafeLibp2pGossipsub.anon

import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReasonObj
import typings.chainsafeLibp2pGossipsub.distSrcTypesMod.ValidateError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorReason
  extends StObject
     with RejectReasonObj {
  
  var error: ValidateError
  
  var reason: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason.Error
}
object ErrorReason {
  
  inline def apply(error: ValidateError, reason: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason.Error): ErrorReason = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorReason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorReason] (val x: Self) extends AnyVal {
    
    inline def setError(value: ValidateError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setReason(value: typings.chainsafeLibp2pGossipsub.distSrcTypesMod.RejectReason.Error): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
