package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BoundingBoxRenderer")
@js.native
open class BoundingBoxRenderer protected ()
  extends StObject
     with typings.babylonjs.BABYLON.BoundingBoxRenderer {
  /**
    * Instantiates a new bounding box renderer in a scene.
    * @param scene the scene the  renderer renders in
    */
  def this(scene: typings.babylonjs.BABYLON.Scene) = this()
  
  /* private */ /* CompleteClass */
  var _buildUniformLayout: Any = js.native
  
  /* private */ /* CompleteClass */
  var _colorShader: Any = js.native
  
  /* private */ /* CompleteClass */
  var _colorShaderForOcclusionQuery: Any = js.native
  
  /* private */ /* CompleteClass */
  var _createIndexBuffer: Any = js.native
  
  /* private */ /* CompleteClass */
  var _createWrappersForBoundingBox: Any = js.native
  
  /* private */ /* CompleteClass */
  var _evaluateSubMesh: Any = js.native
  
  /* private */ /* CompleteClass */
  var _fillIndexBuffer: Any = js.native
  
  /* private */ /* CompleteClass */
  var _fillIndexData: Any = js.native
  
  /* private */ /* CompleteClass */
  var _indexBuffer: Any = js.native
  
  /* private */ /* CompleteClass */
  var _preActiveMesh: Any = js.native
  
  /* private */ /* CompleteClass */
  var _prepareResources: Any = js.native
  
  /* private */ /* CompleteClass */
  var _renderPassIdForOcclusionQuery: Any = js.native
  
  /* private */ /* CompleteClass */
  var _uniformBufferBack: Any = js.native
  
  /* private */ /* CompleteClass */
  var _uniformBufferFront: Any = js.native
  
  /* private */ /* CompleteClass */
  var _vertexBuffers: Any = js.native
  
  /**
    * Color of the bounding box lines placed behind an object
    */
  /* CompleteClass */
  var backColor: typings.babylonjs.BABYLON.Color3 = js.native
  
  /**
    * Disposes the component and the associated ressources.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * When false, no bounding boxes will be rendered
    */
  /* CompleteClass */
  var enabled: Boolean = js.native
  
  /**
    * Color of the bounding box lines placed in front of an object
    */
  /* CompleteClass */
  var frontColor: typings.babylonjs.BABYLON.Color3 = js.native
  
  /**
    * The name of the component. Each component must have a unique name.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Observable raised after rendering a bounding box
    */
  /* CompleteClass */
  var onAfterBoxRenderingObservable: typings.babylonjs.BABYLON.Observable[typings.babylonjs.BABYLON.BoundingBox] = js.native
  
  /**
    * Observable raised before rendering a bounding box
    */
  /* CompleteClass */
  var onBeforeBoxRenderingObservable: typings.babylonjs.BABYLON.Observable[typings.babylonjs.BABYLON.BoundingBox] = js.native
  
  /**
    * Observable raised after resources are created
    */
  /* CompleteClass */
  var onResourcesReadyObservable: typings.babylonjs.BABYLON.Observable[typings.babylonjs.BABYLON.BoundingBoxRenderer] = js.native
  
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
  /* CompleteClass */
  override def render(renderingGroupId: Double): Unit = js.native
  
  /**
    * @hidden
    */
  /* CompleteClass */
  var renderList: typings.babylonjs.BABYLON.SmartArray[typings.babylonjs.BABYLON.BoundingBox] = js.native
  
  /**
    * In case of occlusion queries, we can render the occlusion bounding box through this method
    * @param mesh Define the mesh to render the occlusion bounding box for
    */
  /* CompleteClass */
  override def renderOcclusionBoundingBox(mesh: typings.babylonjs.BABYLON.AbstractMesh): Unit = js.native
  
  /**
    * @hidden
    */
  /* CompleteClass */
  override def reset(): Unit = js.native
  
  /**
    * The scene the component belongs to.
    */
  /* CompleteClass */
  var scene: typings.babylonjs.BABYLON.Scene = js.native
  
  /**
    * Defines if the renderer should show the back lines or not
    */
  /* CompleteClass */
  var showBackLines: Boolean = js.native
}
