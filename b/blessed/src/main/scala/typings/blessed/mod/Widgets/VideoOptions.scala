package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoOptions
  extends StObject
     with BoxOptions {
  
  /**
    * Video to play.
    */
  var file: String
  
  /**
    * Start time in seconds.
    */
  var start: Double
}
object VideoOptions {
  
  inline def apply(file: String, start: Double): VideoOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoOptions]
  }
  
  extension [Self <: VideoOptions](x: Self) {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
