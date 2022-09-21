package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.typesMod.Nullable
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineViewsMod {
  
  @JSImport("babylonjs/Engines/Extensions/engine.views", "EngineView")
  @js.native
  open class EngineView () extends StObject {
    
    /** Defines an optional camera used to render the view (will use active camera else) */
    var camera: js.UndefOr[Camera] = js.native
    
    /** Indicates if the destination view canvas should be cleared before copying the parent canvas. Can help if the scene clear color has alpha < 1 */
    var clearBeforeCopy: js.UndefOr[Boolean] = js.native
    
    /** Defines a custom function to handle canvas size changes. (the canvas to render into is provided to the callback) */
    var customResize: js.UndefOr[js.Function1[/* canvas */ HTMLCanvasElement, Unit]] = js.native
    
    /** Indicates if the view is enabled (true by default) */
    var enabled: Boolean = js.native
    
    /**
      * A randomly generated unique id
      */
    val id: String = js.native
    
    /** Defines the canvas where to render the view */
    var target: HTMLCanvasElement = js.native
  }
  
  /* augmented module */
  object babylonjsEnginesEngineAugmentingMod {
    
    @js.native
    trait Engine extends StObject {
      
      /** @hidden */
      var _inputElement: Nullable[HTMLElement] = js.native
      
      /**
        * Observable to handle when a change to inputElement occurs
        * @hidden
        */
      var _onEngineViewChanged: js.UndefOr[js.Function0[Unit]] = js.native
      
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
        * Will be triggered after the view rendered
        */
      val onAfterViewRenderObservable: Observable[EngineView] = js.native
      
      /**
        * Will be triggered before the view renders
        */
      val onBeforeViewRenderObservable: Observable[EngineView] = js.native
      
      /**
        * Register a new child canvas
        * @param canvas defines the canvas to register
        * @param camera defines an optional camera to use with this canvas (it will overwrite the scene.camera for this view)
        * @param clearBeforeCopy Indicates if the destination view canvas should be cleared before copying the parent canvas. Can help if the scene clear color has alpha < 1
        * @returns the associated view
        */
      def registerView(canvas: HTMLCanvasElement): EngineView = js.native
      def registerView(canvas: HTMLCanvasElement, camera: Unit, clearBeforeCopy: Boolean): EngineView = js.native
      def registerView(canvas: HTMLCanvasElement, camera: Camera): EngineView = js.native
      def registerView(canvas: HTMLCanvasElement, camera: Camera, clearBeforeCopy: Boolean): EngineView = js.native
      
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
