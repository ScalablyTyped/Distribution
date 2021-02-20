package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IotEventsAction extends StObject {
  
  /**
    * The name of the AWS IoT Events input where the data is sent.
    */
  var inputName: InputName = js.native
  
  /**
    * You can configure the action payload when you send a message to an AWS IoT Events input.
    */
  var payload: js.UndefOr[Payload] = js.native
}
object IotEventsAction {
  
  @scala.inline
  def apply(inputName: InputName): IotEventsAction = {
    val __obj = js.Dynamic.literal(inputName = inputName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotEventsAction]
  }
  
  @scala.inline
  implicit class IotEventsActionMutableBuilder[Self <: IotEventsAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputName(value: InputName): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
