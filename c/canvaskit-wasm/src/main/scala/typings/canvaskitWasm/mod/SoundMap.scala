package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoundMap extends StObject {
  
  /**
    * Returns AudioPlayer for a certain audio layer
    * @param key string identifier, name of audio file the desired AudioPlayer manages
    */
  def getPlayer(key: String): AudioPlayer
}
object SoundMap {
  
  inline def apply(getPlayer: String => AudioPlayer): SoundMap = {
    val __obj = js.Dynamic.literal(getPlayer = js.Any.fromFunction1(getPlayer))
    __obj.asInstanceOf[SoundMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SoundMap] (val x: Self) extends AnyVal {
    
    inline def setGetPlayer(value: String => AudioPlayer): Self = StObject.set(x, "getPlayer", js.Any.fromFunction1(value))
  }
}
