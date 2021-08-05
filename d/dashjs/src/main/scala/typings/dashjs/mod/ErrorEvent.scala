package typings.dashjs.mod

import typings.dashjs.anon.Cc
import typings.dashjs.anon.Code
import typings.dashjs.anon.Id
import typings.dashjs.dashjsStrings.capability
import typings.dashjs.dashjsStrings.key_message
import typings.dashjs.dashjsStrings.key_session
import typings.dashjs.dashjsStrings.mediasource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.dashjs.mod.GenericErrorEvent
  - typings.dashjs.mod.DownloadErrorEvent
  - typings.dashjs.mod.ManifestErrorEvent
  - typings.dashjs.mod.TimedTextErrorEvent
  - typings.dashjs.mod.MediaPlayerErrorEvent
*/
trait ErrorEvent extends StObject
object ErrorEvent {
  
  inline def DownloadErrorEvent(event: Id): typings.dashjs.mod.DownloadErrorEvent = {
    val __obj = js.Dynamic.literal(error = "download", event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[typings.dashjs.mod.DownloadErrorEvent]
  }
  
  inline def GenericErrorEvent(error: capability | mediasource | key_session | key_message, event: String): typings.dashjs.mod.GenericErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[typings.dashjs.mod.GenericErrorEvent]
  }
  
  inline def ManifestErrorEvent(event: typings.dashjs.anon.Event): typings.dashjs.mod.ManifestErrorEvent = {
    val __obj = js.Dynamic.literal(error = "manifestError", event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[typings.dashjs.mod.ManifestErrorEvent]
  }
  
  inline def MediaPlayerErrorEvent(error: Code): typings.dashjs.mod.MediaPlayerErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[typings.dashjs.mod.MediaPlayerErrorEvent]
  }
  
  inline def TimedTextErrorEvent(event: Cc): typings.dashjs.mod.TimedTextErrorEvent = {
    val __obj = js.Dynamic.literal(error = "cc", event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[typings.dashjs.mod.TimedTextErrorEvent]
  }
}
