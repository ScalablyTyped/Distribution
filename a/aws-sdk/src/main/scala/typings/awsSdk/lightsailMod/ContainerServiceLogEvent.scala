package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerServiceLogEvent extends StObject {
  
  /**
    * The timestamp when the container service log event was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.undefined
  
  /**
    * The message of the container service log event.
    */
  var message: js.UndefOr[String] = js.undefined
}
object ContainerServiceLogEvent {
  
  inline def apply(): ContainerServiceLogEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerServiceLogEvent]
  }
  
  extension [Self <: ContainerServiceLogEvent](x: Self) {
    
    inline def setCreatedAt(value: IsoDate): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
