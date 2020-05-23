package typings.babylonjs.soundTrackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISoundTrackOptions extends js.Object {
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
  @scala.inline
  def apply(mainTrack: js.UndefOr[Boolean] = js.undefined, volume: js.UndefOr[Double] = js.undefined): ISoundTrackOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mainTrack)) __obj.updateDynamic("mainTrack")(mainTrack.get.asInstanceOf[js.Any])
    if (!js.isUndefined(volume)) __obj.updateDynamic("volume")(volume.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISoundTrackOptions]
  }
}

