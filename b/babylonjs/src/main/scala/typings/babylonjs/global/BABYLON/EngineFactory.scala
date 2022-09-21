package typings.babylonjs.global.BABYLON

import typings.babylonjs.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.EngineFactory")
@js.native
open class EngineFactory ()
  extends StObject
     with typings.babylonjs.BABYLON.EngineFactory
/* static members */
object EngineFactory {
  
  @JSGlobal("BABYLON.EngineFactory")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an engine based on the capabilities of the underlying hardware
    * @param canvas Defines the canvas to use to display the result
    * @param options Defines the options passed to the engine to create the context dependencies
    * @returns a promise that resolves with the created engine
    */
  inline def CreateAsync(canvas: HTMLCanvasElement, options: Any): js.Promise[typings.babylonjs.BABYLON.Engine] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(canvas.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.Engine]]
}
