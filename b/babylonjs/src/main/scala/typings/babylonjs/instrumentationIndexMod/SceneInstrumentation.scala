package typings.babylonjs.instrumentationIndexMod

import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Instrumentation/index", "SceneInstrumentation")
@js.native
class SceneInstrumentation protected ()
  extends typings.babylonjs.sceneInstrumentationMod.SceneInstrumentation {
  /**
    * Instantiates a new scene instrumentation.
    * This class can be used to get instrumentation data from a Babylon engine
    * @see http://doc.babylonjs.com/how_to/optimizing_your_scene#sceneinstrumentation
    * @param scene Defines the scene to instrument
    */
  def this(/**
    * Defines the scene to instrument
    */
  scene: Scene) = this()
}

