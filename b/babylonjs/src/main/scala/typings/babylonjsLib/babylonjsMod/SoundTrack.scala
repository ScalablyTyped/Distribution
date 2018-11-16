package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * It could be useful to isolate your music & sounds on several tracks to better manage volume on a grouped instance of sounds.
     * It will be also used in a future release to apply effects on a specific track.
     * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#using-sound-tracks
     */
@JSImport("babylonjs", "SoundTrack")
@js.native
class SoundTrack protected ()
  extends babylonjsLib.BABYLONNs.SoundTrack {
  /**
           * Creates a new sound track.
           * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#using-sound-tracks
           * @param scene Define the scene the sound track belongs to
           * @param options
           */
  def this(scene: babylonjsLib.BABYLONNs.Scene) = this()
  /**
           * Creates a new sound track.
           * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#using-sound-tracks
           * @param scene Define the scene the sound track belongs to
           * @param options
           */
  def this(scene: babylonjsLib.BABYLONNs.Scene, options: babylonjsLib.BABYLONNs.ISoundTrackOptions) = this()
}

