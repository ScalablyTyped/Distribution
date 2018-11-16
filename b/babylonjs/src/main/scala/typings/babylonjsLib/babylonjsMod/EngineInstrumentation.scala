package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This class can be used to get instrumentation data from a Babylon engine
     * @see http://doc.babylonjs.com/how_to/optimizing_your_scene#engineinstrumentation
     */
@JSImport("babylonjs", "EngineInstrumentation")
@js.native
class EngineInstrumentation protected ()
  extends babylonjsLib.BABYLONNs.EngineInstrumentation {
  /**
           * Instantiates a new engine instrumentation.
           * This class can be used to get instrumentation data from a Babylon engine
           * @see http://doc.babylonjs.com/how_to/optimizing_your_scene#engineinstrumentation
           * @param engine Defines the engine to instrument
           */
  def this(/**
           * Define the instrumented engine.
           */
  engine: babylonjsLib.BABYLONNs.Engine) = this()
}

