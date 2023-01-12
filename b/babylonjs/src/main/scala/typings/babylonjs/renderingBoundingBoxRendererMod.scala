package typings.babylonjs

import typings.babylonjs.cullingBoundingBoxMod.BoundingBox
import typings.babylonjs.mathsMathDotcolorMod.Color3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.miscSmartArrayMod.SmartArray
import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderingBoundingBoxRendererMod {
  
  @JSImport("babylonjs/Rendering/boundingBoxRenderer", "BoundingBoxRenderer")
  @js.native
  open class BoundingBoxRenderer protected ()
    extends StObject
       with ISceneComponent {
    /**
      * Instantiates a new bounding box renderer in a scene.
      * @param scene the scene the  renderer renders in
      */
    def this(scene: Scene) = this()
    
    /* private */ var _buildUniformLayout: Any = js.native
    
    /* private */ var _colorShader: Any = js.native
    
    /* private */ var _colorShaderForOcclusionQuery: Any = js.native
    
    /* private */ var _createIndexBuffer: Any = js.native
    
    /* private */ var _createWrappersForBoundingBox: Any = js.native
    
    /* private */ var _evaluateSubMesh: Any = js.native
    
    /* private */ var _fillIndexBuffer: Any = js.native
    
    /* private */ var _fillIndexData: Any = js.native
    
    /* private */ var _indexBuffer: Any = js.native
    
    /* private */ var _preActiveMesh: Any = js.native
    
    /* private */ var _prepareResources: Any = js.native
    
    /* private */ var _renderPassIdForOcclusionQuery: Any = js.native
    
    /* private */ var _uniformBufferBack: Any = js.native
    
    /* private */ var _uniformBufferFront: Any = js.native
    
    /* private */ var _vertexBuffers: Any = js.native
    
    /**
      * Color of the bounding box lines placed behind an object
      */
    var backColor: Color3 = js.native
    
    /**
      * Disposes the component and the associated ressources.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * When false, no bounding boxes will be rendered
      */
    var enabled: Boolean = js.native
    
    /**
      * Color of the bounding box lines placed in front of an object
      */
    var frontColor: Color3 = js.native
    
    /**
      * The name of the component. Each component must have a unique name.
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Observable raised after rendering a bounding box
      */
    var onAfterBoxRenderingObservable: Observable[BoundingBox] = js.native
    
    /**
      * Observable raised before rendering a bounding box
      */
    var onBeforeBoxRenderingObservable: Observable[BoundingBox] = js.native
    
    /**
      * Observable raised after resources are created
      */
    var onResourcesReadyObservable: Observable[BoundingBoxRenderer] = js.native
    
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
      * Render the bounding boxes of a specific rendering group
      * @param renderingGroupId defines the rendering group to render
      */
    def render(renderingGroupId: Double): Unit = js.native
    
    /**
      * @internal
      */
    var renderList: SmartArray[BoundingBox] = js.native
    
    /**
      * In case of occlusion queries, we can render the occlusion bounding box through this method
      * @param mesh Define the mesh to render the occlusion bounding box for
      */
    def renderOcclusionBoundingBox(mesh: AbstractMesh): Unit = js.native
    
    /**
      * @internal
      */
    def reset(): Unit = js.native
    
    /**
      * The scene the component belongs to.
      */
    /* CompleteClass */
    var scene: Scene = js.native
    
    /**
      * Defines if the renderer should show the back lines or not
      */
    var showBackLines: Boolean = js.native
  }
  
  /* augmented module */
  object babylonjsMeshesAbstractMeshAugmentingMod {
    
    trait AbstractMesh extends StObject {
      
      /** @internal (Backing field) */
      var _showBoundingBox: Boolean
      
      /**
        * Gets or sets a boolean indicating if the bounding box must be rendered as well (false by default)
        */
      var showBoundingBox: Boolean
    }
    object AbstractMesh {
      
      inline def apply(_showBoundingBox: Boolean, showBoundingBox: Boolean): typings.babylonjs.renderingBoundingBoxRendererMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh = {
        val __obj = js.Dynamic.literal(_showBoundingBox = _showBoundingBox.asInstanceOf[js.Any], showBoundingBox = showBoundingBox.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.babylonjs.renderingBoundingBoxRendererMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.babylonjs.renderingBoundingBoxRendererMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh] (val x: Self) extends AnyVal {
        
        inline def setShowBoundingBox(value: Boolean): Self = StObject.set(x, "showBoundingBox", value.asInstanceOf[js.Any])
        
        inline def set_showBoundingBox(value: Boolean): Self = StObject.set(x, "_showBoundingBox", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    trait Scene extends StObject {
      
      /** @internal (Backing field) */
      var _boundingBoxRenderer: BoundingBoxRenderer
      
      /** @internal (Backing field) */
      var _forceShowBoundingBoxes: Boolean
      
      /**
        * Gets or sets a boolean indicating if all bounding boxes must be rendered
        */
      var forceShowBoundingBoxes: Boolean
      
      /**
        * Gets the bounding box renderer associated with the scene
        * @returns a BoundingBoxRenderer
        */
      def getBoundingBoxRenderer(): BoundingBoxRenderer
    }
    object Scene {
      
      inline def apply(
        _boundingBoxRenderer: BoundingBoxRenderer,
        _forceShowBoundingBoxes: Boolean,
        forceShowBoundingBoxes: Boolean,
        getBoundingBoxRenderer: () => BoundingBoxRenderer
      ): typings.babylonjs.renderingBoundingBoxRendererMod.babylonjsSceneAugmentingMod.Scene = {
        val __obj = js.Dynamic.literal(_boundingBoxRenderer = _boundingBoxRenderer.asInstanceOf[js.Any], _forceShowBoundingBoxes = _forceShowBoundingBoxes.asInstanceOf[js.Any], forceShowBoundingBoxes = forceShowBoundingBoxes.asInstanceOf[js.Any], getBoundingBoxRenderer = js.Any.fromFunction0(getBoundingBoxRenderer))
        __obj.asInstanceOf[typings.babylonjs.renderingBoundingBoxRendererMod.babylonjsSceneAugmentingMod.Scene]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.babylonjs.renderingBoundingBoxRendererMod.babylonjsSceneAugmentingMod.Scene] (val x: Self) extends AnyVal {
        
        inline def setForceShowBoundingBoxes(value: Boolean): Self = StObject.set(x, "forceShowBoundingBoxes", value.asInstanceOf[js.Any])
        
        inline def setGetBoundingBoxRenderer(value: () => BoundingBoxRenderer): Self = StObject.set(x, "getBoundingBoxRenderer", js.Any.fromFunction0(value))
        
        inline def set_boundingBoxRenderer(value: BoundingBoxRenderer): Self = StObject.set(x, "_boundingBoxRenderer", value.asInstanceOf[js.Any])
        
        inline def set_forceShowBoundingBoxes(value: Boolean): Self = StObject.set(x, "_forceShowBoundingBoxes", value.asInstanceOf[js.Any])
      }
    }
  }
}
