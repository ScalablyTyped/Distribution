package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSubscriptionsToEventBridgeMessage extends StObject {
  
  /**
    * When set to true, this operation migrates DMS subscriptions for Amazon SNS notifications no matter what your replication instance version is. If not set or set to false, this operation runs only when all your replication instances are from DMS version 3.4.6 or higher. 
    */
  var ForceMove: js.UndefOr[BooleanOptional] = js.undefined
}
object UpdateSubscriptionsToEventBridgeMessage {
  
  inline def apply(): UpdateSubscriptionsToEventBridgeMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSubscriptionsToEventBridgeMessage]
  }
  
  extension [Self <: UpdateSubscriptionsToEventBridgeMessage](x: Self) {
    
    inline def setForceMove(value: BooleanOptional): Self = StObject.set(x, "ForceMove", value.asInstanceOf[js.Any])
    
    inline def setForceMoveUndefined: Self = StObject.set(x, "ForceMove", js.undefined)
  }
}
