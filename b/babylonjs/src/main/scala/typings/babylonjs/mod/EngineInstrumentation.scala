package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "EngineInstrumentation")
@js.native
class EngineInstrumentation protected ()
  extends typings.babylonjs.legacyMod.EngineInstrumentation {
  /**
    * Instantiates a new engine instrumentation.
    * This class can be used to get instrumentation data from a Babylon engine
    * @see https://doc.babylonjs.com/how_to/optimizing_your_scene#engineinstrumentation
    * @param engine Defines the engine to instrument
    */
  def this(/**
    * Define the instrumented engine.
    */
  engine: typings.babylonjs.engineMod.Engine) = this()
}
