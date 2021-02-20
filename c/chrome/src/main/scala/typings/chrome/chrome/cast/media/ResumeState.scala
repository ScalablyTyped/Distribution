package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResumeState extends StObject
@JSGlobal("chrome.cast.media.ResumeState")
@js.native
object ResumeState extends StObject {
  
  @js.native
  sealed trait PLAYBACK_PAUSE extends ResumeState
  
  @js.native
  sealed trait PLAYBACK_START extends ResumeState
}
