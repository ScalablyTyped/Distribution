package typings.babylonjs.soundMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISoundOptions extends js.Object {
  /**
    * Does the sound autoplay once loaded.
    */
  var autoplay: js.UndefOr[Boolean] = js.undefined
  /**
    * Define the distance attenuation model the sound will follow.
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
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
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
    */
  var refDistance: js.UndefOr[Double] = js.undefined
  /**
    * Define the roll off factor of spatial sounds.
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
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
  @scala.inline
  def apply(
    autoplay: js.UndefOr[Boolean] = js.undefined,
    distanceModel: String = null,
    length: Int | Double = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    maxDistance: Int | Double = null,
    offset: Int | Double = null,
    playbackRate: Int | Double = null,
    refDistance: Int | Double = null,
    rolloffFactor: Int | Double = null,
    skipCodecCheck: js.UndefOr[Boolean] = js.undefined,
    spatialSound: js.UndefOr[Boolean] = js.undefined,
    streaming: js.UndefOr[Boolean] = js.undefined,
    useCustomAttenuation: js.UndefOr[Boolean] = js.undefined,
    volume: Int | Double = null
  ): ISoundOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (distanceModel != null) __obj.updateDynamic("distanceModel")(distanceModel.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (maxDistance != null) __obj.updateDynamic("maxDistance")(maxDistance.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (playbackRate != null) __obj.updateDynamic("playbackRate")(playbackRate.asInstanceOf[js.Any])
    if (refDistance != null) __obj.updateDynamic("refDistance")(refDistance.asInstanceOf[js.Any])
    if (rolloffFactor != null) __obj.updateDynamic("rolloffFactor")(rolloffFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(skipCodecCheck)) __obj.updateDynamic("skipCodecCheck")(skipCodecCheck.asInstanceOf[js.Any])
    if (!js.isUndefined(spatialSound)) __obj.updateDynamic("spatialSound")(spatialSound.asInstanceOf[js.Any])
    if (!js.isUndefined(streaming)) __obj.updateDynamic("streaming")(streaming.asInstanceOf[js.Any])
    if (!js.isUndefined(useCustomAttenuation)) __obj.updateDynamic("useCustomAttenuation")(useCustomAttenuation.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISoundOptions]
  }
}

