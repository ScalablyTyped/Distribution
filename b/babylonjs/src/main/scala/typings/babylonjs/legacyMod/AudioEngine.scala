package typings.babylonjs.legacyMod

import typings.babylonjs.typesMod.Nullable
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "AudioEngine")
@js.native
/**
  * Instantiates a new audio engine.
  *
  * There should be only one per page as some browsers restrict the number
  * of audio contexts you can create.
  * @param hostElement defines the host element where to display the mute icon if necessary
  */
class AudioEngine ()
  extends typings.babylonjs.indexMod.AudioEngine {
  def this(hostElement: Nullable[HTMLElement]) = this()
}
