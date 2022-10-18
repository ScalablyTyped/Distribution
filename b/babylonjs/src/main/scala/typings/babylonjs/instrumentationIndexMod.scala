package typings.babylonjs

import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instrumentationIndexMod {
  
  @JSImport("babylonjs/Instrumentation/index", "EngineInstrumentation")
  @js.native
  open class EngineInstrumentation protected ()
    extends typings.babylonjs.instrumentationEngineInstrumentationMod.EngineInstrumentation {
    /**
      * Instantiates a new engine instrumentation.
      * This class can be used to get instrumentation data from a Babylon engine
      * @see https://doc.babylonjs.com/how_to/optimizing_your_scene#engineinstrumentation
      * @param engine Defines the engine to instrument
      */
    def this(/**
      * Define the instrumented engine.
      */
    engine: Engine) = this()
  }
  
  @JSImport("babylonjs/Instrumentation/index", "SceneInstrumentation")
  @js.native
  open class SceneInstrumentation protected ()
    extends typings.babylonjs.instrumentationSceneInstrumentationMod.SceneInstrumentation {
    /**
      * Instantiates a new scene instrumentation.
      * This class can be used to get instrumentation data from a Babylon engine
      * @see https://doc.babylonjs.com/how_to/optimizing_your_scene#sceneinstrumentation
      * @param scene Defines the scene to instrument
      */
    def this(/**
      * Defines the scene to instrument
      */
    scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Instrumentation/index", "_TimeToken")
  @js.native
  open class TimeToken ()
    extends typings.babylonjs.instrumentationTimeTokenMod.TimeToken
}
