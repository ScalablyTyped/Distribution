package typings.babylonjs.audioIndexMod

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.soundTrackMod.ISoundTrackOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Audio/index", "SoundTrack")
@js.native
class SoundTrack protected ()
  extends typings.babylonjs.soundTrackMod.SoundTrack {
  /**
    * Creates a new sound track.
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#using-sound-tracks
    * @param scene Define the scene the sound track belongs to
    * @param options
    */
  def this(scene: Scene) = this()
  def this(scene: Scene, options: ISoundTrackOptions) = this()
}

