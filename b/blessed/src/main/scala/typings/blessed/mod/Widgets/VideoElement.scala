package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("blessed", "Widgets.VideoElement")
@js.native
class VideoElement () extends BoxElement {
  def this(options: VideoOptions) = this()
  
  @JSName("options")
  var options_VideoElement: VideoOptions = js.native
  
  /**
    * The terminal element running mplayer or mpv.
    */
  var tty: js.Any = js.native
}
