package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISoundOptions extends StObject {
  
  /**
    * Does the sound autoplay once loaded.
    */
  var autoplay: js.UndefOr[Boolean] = js.native
  
  /**
    * Define the distance attenuation model the sound will follow.
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
    */
  var distanceModel: js.UndefOr[String] = js.native
  
  /**
    * Defines an optional length (in seconds) inside the sound file
    */
  var length: js.UndefOr[Double] = js.native
  
  /**
    * Does the sound loop after it finishes playing once.
    */
  var loop: js.UndefOr[Boolean] = js.native
  
  /**
    * Maximum distance to hear that sound
    */
  var maxDistance: js.UndefOr[Double] = js.native
  
  /**
    * Defines an optional offset (in seconds) inside the sound file
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * Defines the playback speed (1 by default)
    */
  var playbackRate: js.UndefOr[Double] = js.native
  
  /**
    * Define the reference distance the sound should be heard perfectly.
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
    */
  var refDistance: js.UndefOr[Double] = js.native
  
  /**
    * Define the roll off factor of spatial sounds.
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
    */
  var rolloffFactor: js.UndefOr[Double] = js.native
  
  /**
    * If true, URLs will not be required to state the audio file codec to use.
    */
  var skipCodecCheck: js.UndefOr[Boolean] = js.native
  
  /**
    * Is it a spatial sound?
    */
  var spatialSound: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines if the sound is from a streaming source
    */
  var streaming: js.UndefOr[Boolean] = js.native
  
  /**
    * Uses user defined attenuation function
    */
  var useCustomAttenuation: js.UndefOr[Boolean] = js.native
  
  /**
    * Sound's volume
    */
  var volume: js.UndefOr[Double] = js.native
}
object ISoundOptions {
  
  @scala.inline
  def apply(): ISoundOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISoundOptions]
  }
  
  @scala.inline
  implicit class ISoundOptionsMutableBuilder[Self <: ISoundOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    @scala.inline
    def setDistanceModel(value: String): Self = StObject.set(x, "distanceModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceModelUndefined: Self = StObject.set(x, "distanceModel", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDistanceUndefined: Self = StObject.set(x, "maxDistance", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackRateUndefined: Self = StObject.set(x, "playbackRate", js.undefined)
    
    @scala.inline
    def setRefDistance(value: Double): Self = StObject.set(x, "refDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefDistanceUndefined: Self = StObject.set(x, "refDistance", js.undefined)
    
    @scala.inline
    def setRolloffFactor(value: Double): Self = StObject.set(x, "rolloffFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolloffFactorUndefined: Self = StObject.set(x, "rolloffFactor", js.undefined)
    
    @scala.inline
    def setSkipCodecCheck(value: Boolean): Self = StObject.set(x, "skipCodecCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipCodecCheckUndefined: Self = StObject.set(x, "skipCodecCheck", js.undefined)
    
    @scala.inline
    def setSpatialSound(value: Boolean): Self = StObject.set(x, "spatialSound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialSoundUndefined: Self = StObject.set(x, "spatialSound", js.undefined)
    
    @scala.inline
    def setStreaming(value: Boolean): Self = StObject.set(x, "streaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingUndefined: Self = StObject.set(x, "streaming", js.undefined)
    
    @scala.inline
    def setUseCustomAttenuation(value: Boolean): Self = StObject.set(x, "useCustomAttenuation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCustomAttenuationUndefined: Self = StObject.set(x, "useCustomAttenuation", js.undefined)
    
    @scala.inline
    def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
