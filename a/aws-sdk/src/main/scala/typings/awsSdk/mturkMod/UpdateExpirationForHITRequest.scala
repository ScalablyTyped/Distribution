package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateExpirationForHITRequest extends StObject {
  
  /**
    *  The date and time at which you want the HIT to expire 
    */
  var ExpireAt: Timestamp
  
  /**
    *  The HIT to update. 
    */
  var HITId: EntityId
}
object UpdateExpirationForHITRequest {
  
  inline def apply(ExpireAt: Timestamp, HITId: EntityId): UpdateExpirationForHITRequest = {
    val __obj = js.Dynamic.literal(ExpireAt = ExpireAt.asInstanceOf[js.Any], HITId = HITId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateExpirationForHITRequest]
  }
  
  extension [Self <: UpdateExpirationForHITRequest](x: Self) {
    
    inline def setExpireAt(value: Timestamp): Self = StObject.set(x, "ExpireAt", value.asInstanceOf[js.Any])
    
    inline def setHITId(value: EntityId): Self = StObject.set(x, "HITId", value.asInstanceOf[js.Any])
  }
}
