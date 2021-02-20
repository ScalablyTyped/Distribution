package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlayerState extends StObject
@JSGlobal("chrome.cast.media.PlayerState")
@js.native
object PlayerState extends StObject {
  
  @js.native
  sealed trait BUFFERING extends PlayerState
  
  @js.native
  sealed trait IDLE extends PlayerState
  
  @js.native
  sealed trait PAUSED extends PlayerState
  
  @js.native
  sealed trait PLAYING extends PlayerState
}
