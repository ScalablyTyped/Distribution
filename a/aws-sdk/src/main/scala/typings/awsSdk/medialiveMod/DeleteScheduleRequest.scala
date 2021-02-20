package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteScheduleRequest extends StObject {
  
  /**
    * Id of the channel whose schedule is being deleted.
    */
  var ChannelId: string = js.native
}
object DeleteScheduleRequest {
  
  @scala.inline
  def apply(ChannelId: string): DeleteScheduleRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScheduleRequest]
  }
  
  @scala.inline
  implicit class DeleteScheduleRequestMutableBuilder[Self <: DeleteScheduleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: string): Self = StObject.set(x, "ChannelId", value.asInstanceOf[js.Any])
  }
}
