package typings.deezerSdk.DeezerSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
  */
trait PlayerState extends StObject {
  
  val muted: Boolean
  
  val repeat: Double
  
  val shuffle: Boolean
  
  val volume: Double
}
object PlayerState {
  
  inline def apply(muted: Boolean, repeat: Double, shuffle: Boolean, volume: Double): PlayerState = {
    val __obj = js.Dynamic.literal(muted = muted.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], shuffle = shuffle.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlayerState] (val x: Self) extends AnyVal {
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setShuffle(value: Boolean): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
