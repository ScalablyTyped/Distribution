package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object audioInterfacesIsoundoptionsMod {
  
  trait ISoundOptions extends StObject {
    
    /**
      * Does the sound autoplay once loaded.
      */
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Define the distance attenuation model the sound will follow.
      * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
      */
    var distanceModel: js.UndefOr[String] = js.undefined
    
    /**
      * Defines an optional length (in seconds) inside the sound file
      */
    var length: js.UndefOr[Double] = js.undefined
    
    /**
      * Does the sound loop after it finishes playing once.
      */
    var loop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum distance to hear that sound
      */
    var maxDistance: js.UndefOr[Double] = js.undefined
    
    /**
      * Defines an optional offset (in seconds) inside the sound file
      */
    var offset: js.UndefOr[Double] = js.undefined
    
    /**
      * Defines the playback speed (1 by default)
      */
    var playbackRate: js.UndefOr[Double] = js.undefined
    
    /**
      * Define the reference distance the sound should be heard perfectly.
      * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
      */
    var refDistance: js.UndefOr[Double] = js.undefined
    
    /**
      * Define the roll off factor of spatial sounds.
      * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
      */
    var rolloffFactor: js.UndefOr[Double] = js.undefined
    
    /**
      * If true, URLs will not be required to state the audio file codec to use.
      */
    var skipCodecCheck: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Is it a spatial sound?
      */
    var spatialSound: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines if the sound is from a streaming source
      */
    var streaming: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Uses user defined attenuation function
      */
    var useCustomAttenuation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sound's volume
      */
    var volume: js.UndefOr[Double] = js.undefined
  }
  object ISoundOptions {
    
    inline def apply(): ISoundOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISoundOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISoundOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setDistanceModel(value: String): Self = StObject.set(x, "distanceModel", value.asInstanceOf[js.Any])
      
      inline def setDistanceModelUndefined: Self = StObject.set(x, "distanceModel", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
      
      inline def setMaxDistanceUndefined: Self = StObject.set(x, "maxDistance", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
      
      inline def setPlaybackRateUndefined: Self = StObject.set(x, "playbackRate", js.undefined)
      
      inline def setRefDistance(value: Double): Self = StObject.set(x, "refDistance", value.asInstanceOf[js.Any])
      
      inline def setRefDistanceUndefined: Self = StObject.set(x, "refDistance", js.undefined)
      
      inline def setRolloffFactor(value: Double): Self = StObject.set(x, "rolloffFactor", value.asInstanceOf[js.Any])
      
      inline def setRolloffFactorUndefined: Self = StObject.set(x, "rolloffFactor", js.undefined)
      
      inline def setSkipCodecCheck(value: Boolean): Self = StObject.set(x, "skipCodecCheck", value.asInstanceOf[js.Any])
      
      inline def setSkipCodecCheckUndefined: Self = StObject.set(x, "skipCodecCheck", js.undefined)
      
      inline def setSpatialSound(value: Boolean): Self = StObject.set(x, "spatialSound", value.asInstanceOf[js.Any])
      
      inline def setSpatialSoundUndefined: Self = StObject.set(x, "spatialSound", js.undefined)
      
      inline def setStreaming(value: Boolean): Self = StObject.set(x, "streaming", value.asInstanceOf[js.Any])
      
      inline def setStreamingUndefined: Self = StObject.set(x, "streaming", js.undefined)
      
      inline def setUseCustomAttenuation(value: Boolean): Self = StObject.set(x, "useCustomAttenuation", value.asInstanceOf[js.Any])
      
      inline def setUseCustomAttenuationUndefined: Self = StObject.set(x, "useCustomAttenuation", js.undefined)
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    }
  }
}
