package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaSession extends StObject {
  
  var metadata: MediaMetadata | Null = js.native
  
  var playbackState: MediaSessionPlaybackState = js.native
  
  def setActionHandler(action: MediaSessionAction): Unit = js.native
  def setActionHandler(action: MediaSessionAction, handler: MediaSessionActionHandler): Unit = js.native
  
  def setPositionState(): Unit = js.native
  def setPositionState(state: MediaPositionState): Unit = js.native
}
