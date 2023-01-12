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
  
  inline def apply(content: Any, `type`: Channel): IShellMessage = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShellMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IShellMessage] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: shell): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}
