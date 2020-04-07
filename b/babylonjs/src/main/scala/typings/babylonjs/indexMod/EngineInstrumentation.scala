package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "EngineInstrumentation")
@js.native
class EngineInstrumentation protected ()
  extends typings.babylonjs.instrumentationIndexMod.EngineInstrumentation {
  /**
    * Instantiates a new engine instrumentation.
    * This class can be used to get instrumentation data from a Babylon engine
    * @see http://doc.babylonjs.com/how_to/optimizing_your_scene#engineinstrumentation
    * @param engine Defines the engine to instrument
    */
  def this(/**
    * Define the instrumented engine.
    */
  engine: typings.babylonjs.engineMod.Engine) = this()
}

