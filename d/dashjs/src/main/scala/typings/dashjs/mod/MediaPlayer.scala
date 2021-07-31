package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MediaPlayer {
  
  @scala.inline
  def apply(): MediaPlayerFactory = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[MediaPlayerFactory]
  
  @JSImport("dashjs", "MediaPlayer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dashjs", "MediaPlayer.errors")
  @js.native
  val errors: MediaPlayerErrors = js.native
  
  @JSImport("dashjs", "MediaPlayer.events")
  @js.native
  val events: MediaPlayerEvents = js.native
}
