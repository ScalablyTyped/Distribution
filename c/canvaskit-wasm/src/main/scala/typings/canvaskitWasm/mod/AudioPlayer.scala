package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioPlayer extends StObject {
  
  /**
    * Playback control callback, emitted for each corresponding Animation::seek().
    *
    * Will seek to time t (seconds) relative to the layer's timeline origin.
    * Negative t values are used to signal off state (stop playback outside layer span).
    */
  def seek(t: Double): Unit
}
object AudioPlayer {
  
  inline def apply(seek: Double => Unit): AudioPlayer = {
    val __obj = js.Dynamic.literal(seek = js.Any.fromFunction1(seek))
    __obj.asInstanceOf[AudioPlayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioPlayer] (val x: Self) extends AnyVal {
    
    inline def setSeek(value: Double => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
  }
}
