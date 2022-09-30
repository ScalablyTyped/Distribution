package typings.babylonjs

import typings.babylonjs.prePassRenderTargetMod.PrePassRenderTarget
import typings.babylonjs.prePassRendererMod.PrePassRenderer
import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prePassRendererSceneComponentMod {
  
  @JSImport("babylonjs/Rendering/prePassRendererSceneComponent", "PrePassRendererSceneComponent")
  @js.native
  open class PrePassRendererSceneComponent protected ()
    extends StObject
       with ISceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    /* private */ var _afterCameraDraw: Any = js.native
    
    /* private */ var _afterRenderTargetDraw: Any = js.native
    
    /* private */ var _afterRenderingMeshStage: Any = js.native
    
    /* private */ var _beforeCameraDraw: Any = js.native
    
    /* private */ var _beforeClearStage: Any = js.native
    
    /* private */ var _beforeRenderTargetClearStage: Any = js.native
    
    /* private */ var _beforeRenderTargetDraw: Any = js.native
    
    /* private */ var _beforeRenderingMeshStage: Any = js.native
    
    /**
      * Disposes the component and the associated ressources.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * The name of the component. Each component must have a unique name.
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Rebuilds the elements related to this component in case of
      * context lost for instance.
      */
    /* CompleteClass */
    override def rebuild(): Unit = js.native
    
    /**
      * Register the component to one instance of a scene.
      */
    /* CompleteClass */
    override def register(): Unit = js.native
    
    /**
      * The scene the component belongs to.
      */
    /* CompleteClass */
    var scene: Scene = js.native
  }
  
  /* augmented module */
  object babylonjsAbstractSceneAugmentingMod {
    
    trait AbstractScene extends StObject {
      
      /** @internal (Backing field) */
      var _prePassRenderer: Nullable[PrePassRenderer]
      
      /**
        * Disables the prepass associated with the scene
        */
      def disablePrePassRenderer(): Unit
      
      /**
        * Enables the prepass and associates it with the scene
        * @returns the PrePassRenderer
        */
      def enablePrePassRenderer(): Nullable[PrePassRenderer]
      
      /**
        * Gets or Sets the current prepass renderer associated to the scene.
        */
      var prePassRenderer: Nullable[PrePassRenderer]
    }
    object AbstractScene {
      
      inline def apply(disablePrePassRenderer: () => Unit, enablePrePassRenderer: () => Nullable[PrePassRenderer]): AbstractScene = {
        val __obj = js.Dynamic.literal(disablePrePassRenderer = js.Any.fromFunction0(disablePrePassRenderer), enablePrePassRenderer = js.Any.fromFunction0(enablePrePassRenderer), _prePassRenderer = null, prePassRenderer = null)
        __obj.asInstanceOf[AbstractScene]
      }
      
      extension [Self <: AbstractScene](x: Self) {
        
        inline def setDisablePrePassRenderer(value: () => Unit): Self = StObject.set(x, "disablePrePassRenderer", js.Any.fromFunction0(value))
        
        inline def setEnablePrePassRenderer(value: () => Nullable[PrePassRenderer]): Self = StObject.set(x, "enablePrePassRenderer", js.Any.fromFunction0(value))
        
        inline def setPrePassRenderer(value: Nullable[PrePassRenderer]): Self = StObject.set(x, "prePassRenderer", value.asInstanceOf[js.Any])
        
        inline def setPrePassRendererNull: Self = StObject.set(x, "prePassRenderer", null)
        
        inline def set_prePassRenderer(value: Nullable[PrePassRenderer]): Self = StObject.set(x, "_prePassRenderer", value.asInstanceOf[js.Any])
        
        inline def set_prePassRendererNull: Self = StObject.set(x, "_prePassRenderer", null)
      }
    }
  }
  
  /* augmented module */
  object babylonjsMaterialsTexturesRenderTargetTextureAugmentingMod {
    
    trait RenderTargetTexture extends StObject {
      
      /** @internal */
      var _prePassRenderTarget: Nullable[PrePassRenderTarget]
    }
    object RenderTargetTexture {
      
      inline def apply(): RenderTargetTexture = {
        val __obj = js.Dynamic.literal(_prePassRenderTarget = null)
        __obj.asInstanceOf[RenderTargetTexture]
      }
      
      extension [Self <: RenderTargetTexture](x: Self) {
        
        inline def set_prePassRenderTarget(value: Nullable[PrePassRenderTarget]): Self = StObject.set(x, "_prePassRenderTarget", value.asInstanceOf[js.Any])
        
        inline def set_prePassRenderTargetNull: Self = StObject.set(x, "_prePassRenderTarget", null)
      }
    }
  }
}
