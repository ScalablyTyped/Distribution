package typings.babylonjs.boundingBoxRendererMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.boundingBoxMod.BoundingBox
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.smartArrayMod.SmartArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
