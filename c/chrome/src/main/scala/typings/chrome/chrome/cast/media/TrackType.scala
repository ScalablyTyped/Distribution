package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TrackType extends js.Object

@JSGlobal("chrome.cast.media.TrackType")
@js.native
object TrackType extends js.Object {
  @js.native
  sealed trait AUDIO extends TrackType
  
  @js.native
  sealed trait TEXT extends TrackType
  
  @js.native
  sealed trait VIDEO extends TrackType
  
}

