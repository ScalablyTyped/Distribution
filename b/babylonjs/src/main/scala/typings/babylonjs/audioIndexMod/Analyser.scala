package typings.babylonjs.audioIndexMod

import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Audio/index", "Analyser")
@js.native
class Analyser protected ()
  extends typings.babylonjs.analyserMod.Analyser {
  /**
    * Creates a new analyser
    * @param scene defines hosting scene
    */
  def this(scene: Scene) = this()
}

