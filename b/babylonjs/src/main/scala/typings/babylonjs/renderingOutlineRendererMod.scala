package typings.babylonjs

import typings.babylonjs.meshesMeshMod.InstancesBatch
import typings.babylonjs.meshesSubMeshMod.SubMesh
import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderingOutlineRendererMod {
  
  @JSImport("babylonjs/Rendering/outlineRenderer", "OutlineRenderer")
  @js.native
  open class OutlineRenderer protected ()
    extends StObject
       with ISceneComponent {
    /**
      * Instantiates a new outline renderer. (There could be only one per scene).
      * @param scene Defines the scene it belongs to
      */
    def this(scene: Scene) = this()
    
    /* private */ var _afterRenderingMesh: Any = js.native
    
    /* private */ var _beforeRenderingMesh: Any = js.native
    
    /* private */ var _engine: Any = js.native
    
    /* private */ var _passIdForDrawWrapper: Any = js.native
    
    /* private */ var _savedDepthWrite: Any = js.native
    
    /**
      * Disposes the component and the associated ressources.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Returns whether or not the outline renderer is ready for a given submesh.
      * All the dependencies e.g. submeshes, texture, effect... mus be ready
      * @param subMesh Defines the submesh to check readiness for
      * @param useInstances Defines whether wee are trying to render instances or not
      * @param renderPassId Render pass id to use to render the mesh
      * @returns true if ready otherwise false
      */
    def isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
    def isReady(subMesh: SubMesh, useInstances: Boolean, renderPassId: Double): Boolean = js.native
    
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
      * Renders the outline in the canvas.
      * @param subMesh Defines the sumesh to render
      * @param batch Defines the batch of meshes in case of instances
      * @param useOverlay Defines if the rendering is for the overlay or the outline
      * @param renderPassId Render pass id to use to render the mesh
      */
    def render(subMesh: SubMesh, batch: InstancesBatch): Unit = js.native
    def render(subMesh: SubMesh, batch: InstancesBatch, useOverlay: Boolean): Unit = js.native
    def render(subMesh: SubMesh, batch: InstancesBatch, useOverlay: Boolean, renderPassId: Double): Unit = js.native
    def render(subMesh: SubMesh, batch: InstancesBatch, useOverlay: Unit, renderPassId: Double): Unit = js.native
    
    /**
      * The scene the component belongs to.
      */
    /* CompleteClass */
    var scene: Scene = js.native
    
    /**
      * Defines a zOffset default Factor to prevent zFighting between the overlay and the mesh.
      */
    var zOffset: Double = js.native
    
    /**
      * Defines a zOffset default Unit to prevent zFighting between the overlay and the mesh.
      */
    var zOffsetUnits: Double = js.native
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
    def _StencilReference: Any = js.native
    inline def _StencilReference_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_StencilReference")(x.asInstanceOf[js.Any])
  }
  
  /* augmented module */
  object babylonjsMeshesAbstractMeshAugmentingMod {
    
    trait AbstractMesh extends StObject {
      
      /** @internal (Backing field) */
      var _renderOutline: Boolean
      
      /** @internal (Backing field) */
      var _renderOverlay: Boolean
      
      /**
        * Gets or sets a boolean indicating if the outline must be rendered as well
        * @see https://www.babylonjs-playground.com/#10WJ5S#3
        */
      var renderOutline: Boolean
      
      /**
        * Gets or sets a boolean indicating if the overlay must be rendered as well
        * @see https://www.babylonjs-playground.com/#10WJ5S#2
        */
      var renderOverlay: Boolean
    }
    object AbstractMesh {
      
      inline def apply(_renderOutline: Boolean, _renderOverlay: Boolean, renderOutline: Boolean, renderOverlay: Boolean): AbstractMesh = {
        val __obj = js.Dynamic.literal(_renderOutline = _renderOutline.asInstanceOf[js.Any], _renderOverlay = _renderOverlay.asInstanceOf[js.Any], renderOutline = renderOutline.asInstanceOf[js.Any], renderOverlay = renderOverlay.asInstanceOf[js.Any])
        __obj.asInstanceOf[AbstractMesh]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AbstractMesh] (val x: Self) extends AnyVal {
        
        inline def setRenderOutline(value: Boolean): Self = StObject.set(x, "renderOutline", value.asInstanceOf[js.Any])
        
        inline def setRenderOverlay(value: Boolean): Self = StObject.set(x, "renderOverlay", value.asInstanceOf[js.Any])
        
        inline def set_renderOutline(value: Boolean): Self = StObject.set(x, "_renderOutline", value.asInstanceOf[js.Any])
        
        inline def set_renderOverlay(value: Boolean): Self = StObject.set(x, "_renderOverlay", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    trait Scene extends StObject {
      
      /** @internal */
      var _outlineRenderer: OutlineRenderer
      
      /**
        * Gets the outline renderer associated with the scene
        * @returns a OutlineRenderer
        */
      def getOutlineRenderer(): OutlineRenderer
    }
    object Scene {
      
      inline def apply(_outlineRenderer: OutlineRenderer, getOutlineRenderer: () => OutlineRenderer): typings.babylonjs.renderingOutlineRendererMod.babylonjsSceneAugmentingMod.Scene = {
        val __obj = js.Dynamic.literal(_outlineRenderer = _outlineRenderer.asInstanceOf[js.Any], getOutlineRenderer = js.Any.fromFunction0(getOutlineRenderer))
        __obj.asInstanceOf[typings.babylonjs.renderingOutlineRendererMod.babylonjsSceneAugmentingMod.Scene]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.babylonjs.renderingOutlineRendererMod.babylonjsSceneAugmentingMod.Scene] (val x: Self) extends AnyVal {
        
        inline def setGetOutlineRenderer(value: () => OutlineRenderer): Self = StObject.set(x, "getOutlineRenderer", js.Any.fromFunction0(value))
        
        inline def set_outlineRenderer(value: OutlineRenderer): Self = StObject.set(x, "_outlineRenderer", value.asInstanceOf[js.Any])
      }
    }
  }
}
