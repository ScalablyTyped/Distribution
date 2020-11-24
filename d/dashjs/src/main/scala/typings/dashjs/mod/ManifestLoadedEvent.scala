package typings.dashjs.mod

import typings.dashjs.dashjsStrings.manifestLoaded
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
  implicit class ManifestLoadedEventOps[Self <: ManifestLoadedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: manifestLoaded): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
