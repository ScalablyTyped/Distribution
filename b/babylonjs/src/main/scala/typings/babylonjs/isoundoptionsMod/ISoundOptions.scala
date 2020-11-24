package typings.babylonjs.isoundoptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISoundOptions extends js.Object {
  
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
  implicit class ISoundOptionsOps[Self <: ISoundOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    
    @scala.inline
    def setDistanceModel(value: String): Self = this.set("distanceModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceModel: Self = this.set("distanceModel", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setMaxDistance(value: Double): Self = this.set("maxDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDistance: Self = this.set("maxDistance", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPlaybackRate(value: Double): Self = this.set("playbackRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaybackRate: Self = this.set("playbackRate", js.undefined)
    
    @scala.inline
    def setRefDistance(value: Double): Self = this.set("refDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefDistance: Self = this.set("refDistance", js.undefined)
    
    @scala.inline
    def setRolloffFactor(value: Double): Self = this.set("rolloffFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRolloffFactor: Self = this.set("rolloffFactor", js.undefined)
    
    @scala.inline
    def setSkipCodecCheck(value: Boolean): Self = this.set("skipCodecCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipCodecCheck: Self = this.set("skipCodecCheck", js.undefined)
    
    @scala.inline
    def setSpatialSound(value: Boolean): Self = this.set("spatialSound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpatialSound: Self = this.set("spatialSound", js.undefined)
    
    @scala.inline
    def setStreaming(value: Boolean): Self = this.set("streaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreaming: Self = this.set("streaming", js.undefined)
    
    @scala.inline
    def setUseCustomAttenuation(value: Boolean): Self = this.set("useCustomAttenuation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCustomAttenuation: Self = this.set("useCustomAttenuation", js.undefined)
    
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
  }
}
