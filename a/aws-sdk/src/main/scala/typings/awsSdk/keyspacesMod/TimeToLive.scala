package typings.awsSdk.keyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeToLive extends StObject {
  
  /**
    * Shows how to enable custom Time to Live (TTL) settings for the specified table.
    */
  var status: TimeToLiveStatus
}
object TimeToLive {
  
  inline def apply(status: TimeToLiveStatus): TimeToLive = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeToLive]
  }
  
  extension [Self <: TimeToLive](x: Self) {
    
    inline def setStatus(value: TimeToLiveStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
