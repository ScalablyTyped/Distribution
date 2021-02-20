package typings.dashjs.mod

import typings.dashjs.dashjsStrings.manifestLoaded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManifestLoadedEvent extends Event {
  
  var data: js.Object = js.native
  
  @JSName("type")
  var type_ManifestLoadedEvent: manifestLoaded = js.native
}
object ManifestLoadedEvent {
  
  @scala.inline
  def apply(data: js.Object, `type`: manifestLoaded): ManifestLoadedEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestLoadedEvent]
  }
  
  @scala.inline
  implicit class ManifestLoadedEventMutableBuilder[Self <: ManifestLoadedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: manifestLoaded): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
