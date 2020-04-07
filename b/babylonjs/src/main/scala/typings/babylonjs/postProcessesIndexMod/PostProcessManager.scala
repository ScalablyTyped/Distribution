package typings.babylonjs.postProcessesIndexMod

import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/PostProcesses/index", "PostProcessManager")
@js.native
class PostProcessManager protected ()
  extends typings.babylonjs.postProcessManagerMod.PostProcessManager {
  /**
    * Creates a new instance PostProcess
    * @param scene The scene that the post process is associated with.
    */
  def this(scene: Scene) = this()
}

