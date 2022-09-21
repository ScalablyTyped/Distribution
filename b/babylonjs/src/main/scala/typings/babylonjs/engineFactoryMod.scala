package typings.babylonjs

import typings.babylonjs.engineMod.Engine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineFactoryMod {
  
  @JSImport("babylonjs/Engines/engineFactory", "EngineFactory")
  @js.native
  open class EngineFactory () extends StObject
  /* static members */
  object EngineFactory {
    
    @JSImport("babylonjs/Engines/engineFactory", "EngineFactory")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an engine based on the capabilities of the underlying hardware
      * @param canvas Defines the canvas to use to display the result
      * @param options Defines the options passed to the engine to create the context dependencies
      * @returns a promise that resolves with the created engine
      */
    inline def CreateAsync(canvas: HTMLCanvasElement, options: Any): js.Promise[Engine] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(canvas.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Engine]]
  }
}
