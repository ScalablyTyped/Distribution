package typings.chrome.chrome.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MutedInfo extends StObject {
  
  /**
    * Optional.
    * The ID of the extension that changed the muted state. Not set if an extension was not the reason the muted state last changed.
    */
  var extensionId: js.UndefOr[String] = js.native
  
  /** Whether the tab is prevented from playing sound (but hasn't necessarily recently produced sound). Equivalent to whether the muted audio indicator is showing. */
  var muted: Boolean = js.native
  
  /**
    * Optional.
    * The reason the tab was muted or unmuted. Not set if the tab's mute state has never been changed.
    * "user": A user input action has set/overridden the muted state.
    * "capture": Tab capture started, forcing a muted state change.
    * "extension": An extension, identified by the extensionId field, set the muted state.
    */
  var reason: js.UndefOr[String] = js.native
}
object MutedInfo {
  
  @scala.inline
  def apply(muted: Boolean): MutedInfo = {
    val __obj = js.Dynamic.literal(muted = muted.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutedInfo]
  }
  
  @scala.inline
  implicit class MutedInfoMutableBuilder[Self <: MutedInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtensionId(value: String): Self = StObject.set(x, "extensionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionIdUndefined: Self = StObject.set(x, "extensionId", js.undefined)
    
    @scala.inline
    def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
