package typings.babylonjs.mod

import typings.babylonjs.audioSoundTrackMod.ISoundTrackOptions
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "SoundTrack")
@js.native
/**
  * Creates a new sound track.
  * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#using-sound-tracks
  * @param scene Define the scene the sound track belongs to
  * @param options
  */
open class SoundTrack ()
  extends typings.babylonjs.legacyLegacyMod.SoundTrack {
  def this(scene: Nullable[typings.babylonjs.sceneMod.Scene]) = this()
  def this(scene: Unit, options: ISoundTrackOptions) = this()
  def this(scene: Nullable[typings.babylonjs.sceneMod.Scene], options: ISoundTrackOptions) = this()
}
