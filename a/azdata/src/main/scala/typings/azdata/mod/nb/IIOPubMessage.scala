package typings.azdata.mod.nb

import typings.azdata.azdataStrings.iopub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIOPubMessage
  extends StObject
     with IMessage {
  
  var channel: iopub
}
object IIOPubMessage {
  
  inline def apply(content: Any, `type`: Channel): IIOPubMessage = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIOPubMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IIOPubMessage] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: iopub): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}
