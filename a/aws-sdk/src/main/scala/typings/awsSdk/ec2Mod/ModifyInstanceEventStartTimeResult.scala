package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyInstanceEventStartTimeResult extends StObject {
  
  var Event: js.UndefOr[InstanceStatusEvent] = js.undefined
}
object ModifyInstanceEventStartTimeResult {
  
  @scala.inline
  def apply(): ModifyInstanceEventStartTimeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyInstanceEventStartTimeResult]
  }
  
  @scala.inline
  implicit class ModifyInstanceEventStartTimeResultMutableBuilder[Self <: ModifyInstanceEventStartTimeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: InstanceStatusEvent): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "Event", js.undefined)
  }
}
