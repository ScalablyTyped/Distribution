package typings.babylonjs

import typings.babylonjs.meshMod.InstancesBatch
import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.subMeshMod.SubMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outlineRendererMod {
  
  @JSImport("babylonjs/Rendering/outlineRenderer", "OutlineRenderer")
  @js.native
  class OutlineRenderer protected () extends ISceneComponent {
    /**
      * Instantiates a new outline renderer. (There could be only one per scene).
      * @param scene Defines the scene it belongs to
      */
    def this(scene: Scene) = this()
    
    var _afterRenderingMesh: js.Any = js.native
    
    var _beforeRenderingMesh: js.Any = js.native
    
    var _cachedDefines: js.Any = js.native
    
    var _effect: js.Any = js.native
    
    var _engine: js.Any = js.native
    
    var _savedDepthWrite: js.Any = js.native
    
    /**
      * Returns whether or not the outline renderer is ready for a given submesh.
      * All the dependencies e.g. submeshes, texture, effect... mus be ready
      * @param subMesh Defines the submesh to check readyness for
      * @param useInstances Defines wheter wee are trying to render instances or not
      * @returns true if ready otherwise false
      */
    def isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
    
    /**
      * Renders the outline in the canvas.
      * @param subMesh Defines the sumesh to render
      * @param batch Defines the batch of meshes in case of instances
      * @param useOverlay Defines if the rendering is for the overlay or the outline
      */
    def render(subMesh: SubMesh, batch: InstancesBatch): Unit = js.native
    def render(subMesh: SubMesh, batch: InstancesBatch, useOverlay: Boolean): Unit = js.native
    
    /**
      * Defines a zOffset to prevent zFighting between the overlay and the mesh.
      */
    var zOffset: Double = js.native
  }
  /* static members */
  object OutlineRenderer {
    
    @JSImport("babylonjs/Rendering/outlineRenderer", "OutlineRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Stencil value used to avoid outline being seen within the mesh when the mesh is transparent
      */
    @JSImport("babylonjs/Rendering/outlineRenderer", "OutlineRenderer._StencilReference")
    @js.native
    def _StencilReference: js.Any = js.native
    @scala.inline
    def _StencilReference_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_StencilReference")(x.asInstanceOf[js.Any])
  }
  
  /* augmented module */
  object babylonjsMeshesAbstractMeshAugmentingMod {
    
    @js.native
    trait AbstractMesh extends StObject {
      
      /** @hidden (Backing field) */
      var _renderOutline: Boolean = js.native
      
      /** @hidden (Backing field) */
      var _renderOverlay: Boolean = js.native
      
      /**
        * Gets or sets a boolean indicating if the outline must be rendered as well
        * @see https://www.babylonjs-playground.com/#10WJ5S#3
        */
      var renderOutline: Boolean = js.native
      
      /**
        * Gets or sets a boolean indicating if the overlay must be rendered as well
        * @see https://www.babylonjs-playground.com/#10WJ5S#2
        */
      var renderOverlay: Boolean = js.native
    }
    object AbstractMesh {
      
      @scala.inline
      def apply(_renderOutline: Boolean, _renderOverlay: Boolean, renderOutline: Boolean, renderOverlay: Boolean): AbstractMesh = {
        val __obj = js.Dynamic.literal(_renderOutline = _renderOutline.asInstanceOf[js.Any], _renderOverlay = _renderOverlay.asInstanceOf[js.Any], renderOutline = renderOutline.asInstanceOf[js.Any], renderOverlay = renderOverlay.asInstanceOf[js.Any])
        __obj.asInstanceOf[AbstractMesh]
      }
      
      @scala.inline
      implicit class AbstractMeshMutableBuilder[Self <: AbstractMesh] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRenderOutline(value: Boolean): Self = StObject.set(x, "renderOutline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenderOverlay(value: Boolean): Self = StObject.set(x, "renderOverlay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_renderOutline(value: Boolean): Self = StObject.set(x, "_renderOutline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_renderOverlay(value: Boolean): Self = StObject.set(x, "_renderOverlay", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /** @hidden */
      var _outlineRenderer: OutlineRenderer = js.native
      
      /**
        * Gets the outline renderer associated with the scene
        * @returns a OutlineRenderer
        */
      def getOutlineRenderer(): OutlineRenderer = js.native
    }
    object Scene {
      
      @scala.inline
      def apply(_outlineRenderer: OutlineRenderer, getOutlineRenderer: () => OutlineRenderer): typings.babylonjs.outlineRendererMod.babylonjsSceneAugmentingMod.Scene = {
        val __obj = js.Dynamic.literal(_outlineRenderer = _outlineRenderer.asInstanceOf[js.Any], getOutlineRenderer = js.Any.fromFunction0(getOutlineRenderer))
        __obj.asInstanceOf[typings.babylonjs.outlineRendererMod.babylonjsSceneAugmentingMod.Scene]
      }
      
      @scala.inline
      implicit class SceneMutableBuilder[Self <: typings.babylonjs.outlineRendererMod.babylonjsSceneAugmentingMod.Scene] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetOutlineRenderer(value: () => OutlineRenderer): Self = StObject.set(x, "getOutlineRenderer", js.Any.fromFunction0(value))
        
        @scala.inline
        def set_outlineRenderer(value: OutlineRenderer): Self = StObject.set(x, "_outlineRenderer", value.asInstanceOf[js.Any])
      }
    }
  }
}
