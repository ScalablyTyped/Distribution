package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyNotification extends StObject {
  
  /**
    * The current notification state.
    */
  var state: PropertyNotificationState
  
  /**
    * The MQTT topic to which AWS IoT SiteWise publishes property value update notifications.
    */
  var topic: PropertyNotificationTopic
}
object PropertyNotification {
  
  inline def apply(state: PropertyNotificationState, topic: PropertyNotificationTopic): PropertyNotification = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyNotification]
  }
  
  extension [Self <: PropertyNotification](x: Self) {
    
    inline def setState(value: PropertyNotificationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: PropertyNotificationTopic): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
