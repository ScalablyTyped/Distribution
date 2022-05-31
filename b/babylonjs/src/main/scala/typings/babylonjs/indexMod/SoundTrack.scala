package typings.babylonjs.indexMod

import typings.babylonjs.soundTrackMod.ISoundTrackOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "SoundTrack")
@js.native
class SoundTrack protected ()
  extends typings.babylonjs.audioIndexMod.SoundTrack {
  /**
    * Creates a new sound track.
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#using-sound-tracks
    * @param scene Define the scene the sound track belongs to
    * @param options
    */
  def this(scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(scene: typings.babylonjs.sceneMod.Scene, options: ISoundTrackOptions) = this()
}
