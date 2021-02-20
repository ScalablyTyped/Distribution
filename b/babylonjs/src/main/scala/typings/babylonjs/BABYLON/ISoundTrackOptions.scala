package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISoundTrackOptions extends StObject {
  
  /**
    * Define if the sound track is the main sound track of the scene
    */
  var mainTrack: js.UndefOr[Boolean] = js.native
  
  /**
    * The volume the sound track should take during creation
    */
  var volume: js.UndefOr[Double] = js.native
}
object ISoundTrackOptions {
  
  @scala.inline
  def apply(): ISoundTrackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISoundTrackOptions]
  }
  
  @scala.inline
  implicit class ISoundTrackOptionsMutableBuilder[Self <: ISoundTrackOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMainTrack(value: Boolean): Self = StObject.set(x, "mainTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainTrackUndefined: Self = StObject.set(x, "mainTrack", js.undefined)
    
    @scala.inline
    def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
