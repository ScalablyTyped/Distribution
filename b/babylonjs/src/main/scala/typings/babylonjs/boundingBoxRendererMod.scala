package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.boundingBoxMod.BoundingBox
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.smartArrayMod.SmartArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boundingBoxRendererMod {
  
  @JSImport("babylonjs/Rendering/boundingBoxRenderer", "BoundingBoxRenderer")
  @js.native
  class BoundingBoxRenderer protected () extends ISceneComponent {
    /**
      * Instantiates a new bounding box renderer in a scene.
      * @param scene the scene the  renderer renders in
      */
    def this(scene: Scene) = this()
    
    var _colorShader: js.Any = js.native
    
    var _createIndexBuffer: js.Any = js.native
    
    var _evaluateSubMesh: js.Any = js.native
    
    var _fillIndexBuffer: js.Any = js.native
    
    var _fillIndexData: js.Any = js.native
    
    var _indexBuffer: js.Any = js.native
    
    var _preActiveMesh: js.Any = js.native
    
    var _prepareResources: js.Any = js.native
    
    var _vertexBuffers: js.Any = js.native
    
    /**
      * Color of the bounding box lines placed behind an object
      */
    var backColor: Color3 = js.native
    
    /**
      * When false, no bounding boxes will be rendered
      */
    var enabled: Boolean = js.native
    
    /**
      * Color of the bounding box lines placed in front of an object
      */
    var frontColor: Color3 = js.native
    
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
      * Render the bounding boxes of a specific rendering group
      * @param renderingGroupId defines the rendering group to render
      */
    def render(renderingGroupId: Double): Unit = js.native
    
    /**
      * @hidden
      */
    var renderList: SmartArray[BoundingBox] = js.native
    
    /**
      * In case of occlusion queries, we can render the occlusion bounding box through this method
      * @param mesh Define the mesh to render the occlusion bounding box for
      */
    def renderOcclusionBoundingBox(mesh: AbstractMesh): Unit = js.native
    
    /**
      * @hidden
      */
    def reset(): Unit = js.native
    
    /**
      * Defines if the renderer should show the back lines or not
      */
    var showBackLines: Boolean = js.native
  }
  
  /* augmented module */
  object babylonjsMeshesAbstractMeshAugmentingMod {
    
    @js.native
    trait AbstractMesh extends StObject {
      
      /** @hidden (Backing field) */
      var _showBoundingBox: Boolean = js.native
      
      /**
        * Gets or sets a boolean indicating if the bounding box must be rendered as well (false by default)
        */
      var showBoundingBox: Boolean = js.native
    }
    object AbstractMesh {
      
      @scala.inline
      def apply(_showBoundingBox: Boolean, showBoundingBox: Boolean): typings.babylonjs.boundingBoxRendererMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh = {
        val __obj = js.Dynamic.literal(_showBoundingBox = _showBoundingBox.asInstanceOf[js.Any], showBoundingBox = showBoundingBox.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.babylonjs.boundingBoxRendererMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh]
      }
      
      @scala.inline
      implicit class AbstractMeshMutableBuilder[Self <: typings.babylonjs.boundingBoxRendererMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setShowBoundingBox(value: Boolean): Self = StObject.set(x, "showBoundingBox", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_showBoundingBox(value: Boolean): Self = StObject.set(x, "_showBoundingBox", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /** @hidden (Backing field) */
      var _boundingBoxRenderer: BoundingBoxRenderer = js.native
      
      /** @hidden (Backing field) */
      var _forceShowBoundingBoxes: Boolean = js.native
      
      /**
        * Gets or sets a boolean indicating if all bounding boxes must be rendered
        */
      var forceShowBoundingBoxes: Boolean = js.native
      
      /**
        * Gets the bounding box renderer associated with the scene
        * @returns a BoundingBoxRenderer
        */
      def getBoundingBoxRenderer(): BoundingBoxRenderer = js.native
    }
    object Scene {
      
      @scala.inline
      def apply(
        _boundingBoxRenderer: BoundingBoxRenderer,
        _forceShowBoundingBoxes: Boolean,
        forceShowBoundingBoxes: Boolean,
        getBoundingBoxRenderer: () => BoundingBoxRenderer
      ): typings.babylonjs.boundingBoxRendererMod.babylonjsSceneAugmentingMod.Scene = {
        val __obj = js.Dynamic.literal(_boundingBoxRenderer = _boundingBoxRenderer.asInstanceOf[js.Any], _forceShowBoundingBoxes = _forceShowBoundingBoxes.asInstanceOf[js.Any], forceShowBoundingBoxes = forceShowBoundingBoxes.asInstanceOf[js.Any], getBoundingBoxRenderer = js.Any.fromFunction0(getBoundingBoxRenderer))
        __obj.asInstanceOf[typings.babylonjs.boundingBoxRendererMod.babylonjsSceneAugmentingMod.Scene]
      }
      
      @scala.inline
      implicit class SceneMutableBuilder[Self <: typings.babylonjs.boundingBoxRendererMod.babylonjsSceneAugmentingMod.Scene] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setForceShowBoundingBoxes(value: Boolean): Self = StObject.set(x, "forceShowBoundingBoxes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGetBoundingBoxRenderer(value: () => BoundingBoxRenderer): Self = StObject.set(x, "getBoundingBoxRenderer", js.Any.fromFunction0(value))
        
        @scala.inline
        def set_boundingBoxRenderer(value: BoundingBoxRenderer): Self = StObject.set(x, "_boundingBoxRenderer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_forceShowBoundingBoxes(value: Boolean): Self = StObject.set(x, "_forceShowBoundingBoxes", value.asInstanceOf[js.Any])
      }
    }
  }
}
