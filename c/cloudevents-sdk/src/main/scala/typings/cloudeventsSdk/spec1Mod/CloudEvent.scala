package typings.cloudeventsSdk.spec1Mod

import org.scalablytyped.runtime.Instantiable1
import typings.cloudeventsSdk.cloudeventMod.CE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudEvent extends js.Object {
  
  var CloudEvent: Instantiable1[/* event */ CE, typings.cloudeventsSdk.cloudeventMod.CloudEvent] = js.native
}
object CloudEvent {
  
  @scala.inline
  def apply(CloudEvent: Instantiable1[/* event */ CE, typings.cloudeventsSdk.cloudeventMod.CloudEvent]): CloudEvent = {
    val __obj = js.Dynamic.literal(CloudEvent = CloudEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudEvent]
  }
  
  @scala.inline
  implicit class CloudEventOps[Self <: CloudEvent] (val x: Self) extends AnyVal {
    
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
    def setCloudEvent(value: Instantiable1[/* event */ CE, typings.cloudeventsSdk.cloudeventMod.CloudEvent]): Self = this.set("CloudEvent", value.asInstanceOf[js.Any])
  }
}
