package typings.babylonjs.mod

import typings.babylonjs.soundTrackMod.ISoundTrackOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "SoundTrack")
@js.native
class SoundTrack protected ()
  extends typings.babylonjs.legacyMod.SoundTrack {
  /**
    * Creates a new sound track.
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#using-sound-tracks
    * @param scene Define the scene the sound track belongs to
    * @param options
    */
  def this(scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(scene: typings.babylonjs.sceneMod.Scene, options: ISoundTrackOptions) = this()
}

