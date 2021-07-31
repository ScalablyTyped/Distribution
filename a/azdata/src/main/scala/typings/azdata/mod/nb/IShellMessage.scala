package typings.azdata.mod.nb

import typings.azdata.azdataStrings.shell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShellMessage
  extends StObject
     with IMessage {
  
  var channel: shell
}
object IShellMessage {
  
  @scala.inline
  def apply(content: js.Any, header: IHeader, parent_header: IHeader | js.Object, `type`: Channel): IShellMessage = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShellMessage]
  }
  
  @scala.inline
  implicit class IShellMessageMutableBuilder[Self <: IShellMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: shell): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}
