package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.typesMod.Nullable
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineViewsMod {
  
  @JSImport("babylonjs/Engines/Extensions/engine.views", "EngineView")
  @js.native
  class EngineView () extends StObject {
    
    /** Defines an optional camera used to render the view (will use active camera else) */
    var camera: js.UndefOr[Camera] = js.native
    
    /** Defines the canvas where to render the view */
    var target: HTMLCanvasElement = js.native
  }
  
  /* augmented module */
  object babylonjsEnginesEngineAugmentingMod {
    
    @js.native
    trait Engine extends StObject {
      
      /**
        * Gets the current engine view
        * @see https://doc.babylonjs.com/how_to/multi_canvases
        */
      var activeView: Nullable[EngineView] = js.native
      
      /**
        * Gets or sets the  HTML element to use for attaching events
        */
      var inputElement: Nullable[HTMLElement] = js.native
      
      /**
        * Register a new child canvas
        * @param canvas defines the canvas to register
        * @param camera defines an optional camera to use with this canvas (it will overwrite the scene.camera for this view)
        * @returns the associated view
        */
      def registerView(canvas: HTMLCanvasElement): EngineView = js.native
      def registerView(canvas: HTMLCanvasElement, camera: Camera): EngineView = js.native
      
      /**
        * Remove a registered child canvas
        * @param canvas defines the canvas to remove
        * @returns the current engine
        */
      def unRegisterView(canvas: HTMLCanvasElement): Engine = js.native
      
      /** Gets or sets the list of views */
      var views: js.Array[EngineView] = js.native
    }
  }
}
