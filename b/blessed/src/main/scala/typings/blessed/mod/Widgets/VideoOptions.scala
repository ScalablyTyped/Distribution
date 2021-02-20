package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoOptions extends BoxOptions {
  
  /**
    * Video to play.
    */
  var file: String = js.native
  
  /**
    * Start time in seconds.
    */
  var start: Double = js.native
}
object VideoOptions {
  
  @scala.inline
  def apply(file: String, start: Double): VideoOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoOptions]
  }
  
  @scala.inline
  implicit class VideoOptionsMutableBuilder[Self <: VideoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
