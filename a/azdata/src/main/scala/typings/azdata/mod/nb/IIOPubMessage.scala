package typings.azdata.mod.nb

import typings.azdata.azdataStrings.iopub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIOPubMessage extends IMessage {
  
  var channel: iopub = js.native
}
object IIOPubMessage {
  
  @scala.inline
  def apply(
    channel: iopub,
    content: js.Any,
    header: IHeader,
    parent_header: IHeader | js.Object,
    `type`: Channel
  ): IIOPubMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIOPubMessage]
  }
  
  @scala.inline
  implicit class IIOPubMessageMutableBuilder[Self <: IIOPubMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: iopub): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}
