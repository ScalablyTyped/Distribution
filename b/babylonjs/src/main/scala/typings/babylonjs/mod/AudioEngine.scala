package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "AudioEngine")
@js.native
/**
  * Instantiates a new audio engine.
  *
  * There should be only one per page as some browsers restrict the number
  * of audio contexts you can create.
  * @param hostElement defines the host element where to display the mute icon if necessary
  */
class AudioEngine ()
  extends typings.babylonjs.legacyMod.AudioEngine {
  def this(hostElement: Nullable[HTMLElement]) = this()
}

