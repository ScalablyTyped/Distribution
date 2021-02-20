package typings.babylonjs

import typings.babylonjs.prePassRendererMod.PrePassRenderer
import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prePassRendererSceneComponentMod {
  
  @JSImport("babylonjs/Rendering/prePassRendererSceneComponent", "PrePassRendererSceneComponent")
  @js.native
  class PrePassRendererSceneComponent protected () extends ISceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    var _afterCameraDraw: js.Any = js.native
    
    var _afterRenderingMeshStage: js.Any = js.native
    
    var _beforeCameraDraw: js.Any = js.native
    
    var _beforeClearStage: js.Any = js.native
    
    var _beforeRenderingMeshStage: js.Any = js.native
  }
  
  /* augmented module */
  object babylonjsAbstractSceneAugmentingMod {
    
    @js.native
    trait AbstractScene extends StObject {
      
      /** @hidden (Backing field) */
      var _prePassRenderer: Nullable[PrePassRenderer] = js.native
      
      /**
        * Disables the prepass associated with the scene
        */
      def disablePrePassRenderer(): Unit = js.native
      
      /**
        * Enables the prepass and associates it with the scene
        * @returns the PrePassRenderer
        */
      def enablePrePassRenderer(): Nullable[PrePassRenderer] = js.native
      
      /**
        * Gets or Sets the current prepass renderer associated to the scene.
        */
      var prePassRenderer: Nullable[PrePassRenderer] = js.native
    }
    object AbstractScene {
      
      @scala.inline
      def apply(disablePrePassRenderer: () => Unit, enablePrePassRenderer: () => Nullable[PrePassRenderer]): AbstractScene = {
        val __obj = js.Dynamic.literal(disablePrePassRenderer = js.Any.fromFunction0(disablePrePassRenderer), enablePrePassRenderer = js.Any.fromFunction0(enablePrePassRenderer))
        __obj.asInstanceOf[AbstractScene]
      }
      
      @scala.inline
      implicit class AbstractSceneMutableBuilder[Self <: AbstractScene] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDisablePrePassRenderer(value: () => Unit): Self = StObject.set(x, "disablePrePassRenderer", js.Any.fromFunction0(value))
        
        @scala.inline
        def setEnablePrePassRenderer(value: () => Nullable[PrePassRenderer]): Self = StObject.set(x, "enablePrePassRenderer", js.Any.fromFunction0(value))
        
        @scala.inline
        def setPrePassRenderer(value: Nullable[PrePassRenderer]): Self = StObject.set(x, "prePassRenderer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrePassRendererNull: Self = StObject.set(x, "prePassRenderer", null)
        
        @scala.inline
        def set_prePassRenderer(value: Nullable[PrePassRenderer]): Self = StObject.set(x, "_prePassRenderer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_prePassRendererNull: Self = StObject.set(x, "_prePassRenderer", null)
      }
    }
  }
}
