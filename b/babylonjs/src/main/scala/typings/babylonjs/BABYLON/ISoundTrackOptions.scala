package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISoundTrackOptions extends StObject {
  
  /**
    * Define if the sound track is the main sound track of the scene
    */
  var mainTrack: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The volume the sound track should take during creation
    */
  var volume: js.UndefOr[Double] = js.undefined
}
object ISoundTrackOptions {
  
  inline def apply(): ISoundTrackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISoundTrackOptions]
  }
  
  extension [Self <: ISoundTrackOptions](x: Self) {
    
    inline def setMainTrack(value: Boolean): Self = StObject.set(x, "mainTrack", value.asInstanceOf[js.Any])
    
    inline def setMainTrackUndefined: Self = StObject.set(x, "mainTrack", js.undefined)
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
