package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.ISoundTrackOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SoundTrack")
@js.native
class SoundTrack protected ()
  extends typings.babylonjs.BABYLON.SoundTrack {
  /**
    * Creates a new sound track.
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#using-sound-tracks
    * @param scene Define the scene the sound track belongs to
    * @param options
    */
  def this(scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(scene: typings.babylonjs.BABYLON.Scene, options: ISoundTrackOptions) = this()
}
