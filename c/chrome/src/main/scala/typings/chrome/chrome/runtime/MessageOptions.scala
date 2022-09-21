package typings.chrome.chrome.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageOptions extends StObject {
  
  /** Whether the TLS channel ID will be passed into onMessageExternal for processes that are listening for the connection event. */
  var includeTlsChannelId: js.UndefOr[Boolean] = js.undefined
}
object MessageOptions {
  
  inline def apply(): MessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageOptions]
  }
  
  extension [Self <: MessageOptions](x: Self) {
    
    inline def setIncludeTlsChannelId(value: Boolean): Self = StObject.set(x, "includeTlsChannelId", value.asInstanceOf[js.Any])
    
    inline def setIncludeTlsChannelIdUndefined: Self = StObject.set(x, "includeTlsChannelId", js.undefined)
  }
}
