package typings.dashjs.mod

import typings.dashjs.anon.Cc
import typings.dashjs.anon.Code
import typings.dashjs.anon.Id
import typings.dashjs.dashjsStrings.capability
import typings.dashjs.dashjsStrings.cc
import typings.dashjs.dashjsStrings.download
import typings.dashjs.dashjsStrings.error
import typings.dashjs.dashjsStrings.key_message
import typings.dashjs.dashjsStrings.key_session
import typings.dashjs.dashjsStrings.manifestError
import typings.dashjs.dashjsStrings.mediasource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.dashjs.mod.GenericErrorEvent
  - typings.dashjs.mod.DownloadErrorEvent
  - typings.dashjs.mod.ManifestErrorEvent
  - typings.dashjs.mod.TimedTextErrorEvent
  - typings.dashjs.mod.MediaPlayerErrorEvent
*/
trait ErrorEvent extends js.Object
object ErrorEvent {
  
  @scala.inline
  def ManifestErrorEvent(error: manifestError, event: typings.dashjs.anon.Event, `type`: error): ErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEvent]
  }
  
  @scala.inline
  def TimedTextErrorEvent(error: cc, event: Cc, `type`: error): ErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEvent]
  }
  
  @scala.inline
  def GenericErrorEvent(error: capability | mediasource | key_session | key_message, event: String, `type`: error): ErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEvent]
  }
  
  @scala.inline
  def DownloadErrorEvent(error: download, event: Id, `type`: error): ErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEvent]
  }
  
  @scala.inline
  def MediaPlayerErrorEvent(error: Code, `type`: error): ErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEvent]
  }
}
