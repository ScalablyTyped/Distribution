package typings.dashjs.mod

import typings.dashjs.dashjsStrings.manifestLoaded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestLoadedEvent
  extends StObject
     with Event {
  
  var data: js.Object
  
  @JSName("type")
  var type_ManifestLoadedEvent: manifestLoaded
}
object ManifestLoadedEvent {
  
  inline def apply(data: js.Object): ManifestLoadedEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("manifestLoaded")
    __obj.asInstanceOf[ManifestLoadedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManifestLoadedEvent] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setType(value: manifestLoaded): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
