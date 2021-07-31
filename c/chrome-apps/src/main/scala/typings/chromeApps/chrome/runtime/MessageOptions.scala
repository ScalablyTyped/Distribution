package typings.chromeApps.chrome.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageOptions extends StObject {
  
  /** Whether the TLS channel ID will be passed into onMessageExternal for processes that are listening for the connection event. */
  var includeTlsChannelId: js.UndefOr[Boolean] = js.undefined
}
object MessageOptions {
  
  @scala.inline
  def apply(): MessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageOptions]
  }
  
  @scala.inline
  implicit class MessageOptionsMutableBuilder[Self <: MessageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeTlsChannelId(value: Boolean): Self = StObject.set(x, "includeTlsChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeTlsChannelIdUndefined: Self = StObject.set(x, "includeTlsChannelId", js.undefined)
  }
}
