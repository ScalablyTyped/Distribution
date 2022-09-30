package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoundingBoxRenderer
  extends StObject
     with ISceneComponent {
  
  /* private */ var _buildUniformLayout: Any
  
  /* private */ var _colorShader: Any
  
  /* private */ var _colorShaderForOcclusionQuery: Any
  
  /* private */ var _createIndexBuffer: Any
  
  /* private */ var _createWrappersForBoundingBox: Any
  
  /* private */ var _evaluateSubMesh: Any
  
  /* private */ var _fillIndexBuffer: Any
  
  /* private */ var _fillIndexData: Any
  
  /* private */ var _indexBuffer: Any
  
  /* private */ var _preActiveMesh: Any
  
  /* private */ var _prepareResources: Any
  
  /* private */ var _renderPassIdForOcclusionQuery: Any
  
  /* private */ var _uniformBufferBack: Any
  
  /* private */ var _uniformBufferFront: Any
  
  /* private */ var _vertexBuffers: Any
  
  /**
    * Color of the bounding box lines placed behind an object
    */
  var backColor: Color3
  
  /**
    * When false, no bounding boxes will be rendered
    */
  var enabled: Boolean
  
  /**
    * Color of the bounding box lines placed in front of an object
    */
  var frontColor: Color3
  
  /**
    * Observable raised after rendering a bounding box
    */
  var onAfterBoxRenderingObservable: Observable[BoundingBox]
  
  /**
    * Observable raised before rendering a bounding box
    */
  var onBeforeBoxRenderingObservable: Observable[BoundingBox]
  
  /**
    * Observable raised after resources are created
    */
  var onResourcesReadyObservable: Observable[BoundingBoxRenderer]
  
  /**
    * Render the bounding boxes of a specific rendering group
    * @param renderingGroupId defines the rendering group to render
    */
  def render(renderingGroupId: Double): Unit
  
  /**
    * @internal
    */
  var renderList: SmartArray[BoundingBox]
  
  /**
    * In case of occlusion queries, we can render the occlusion bounding box through this method
    * @param mesh Define the mesh to render the occlusion bounding box for
    */
  def renderOcclusionBoundingBox(mesh: AbstractMesh): Unit
  
  /**
    * @internal
    */
  def reset(): Unit
  
  /**
    * Defines if the renderer should show the back lines or not
    */
  var showBackLines: Boolean
}
object BoundingBoxRenderer {
  
  inline def apply(
    _buildUniformLayout: Any,
    _colorShader: Any,
    _colorShaderForOcclusionQuery: Any,
    _createIndexBuffer: Any,
    _createWrappersForBoundingBox: Any,
    _evaluateSubMesh: Any,
    _fillIndexBuffer: Any,
    _fillIndexData: Any,
    _indexBuffer: Any,
    _preActiveMesh: Any,
    _prepareResources: Any,
    _renderPassIdForOcclusionQuery: Any,
    _uniformBufferBack: Any,
    _uniformBufferFront: Any,
    _vertexBuffers: Any,
    backColor: Color3,
    dispose: () => Unit,
    enabled: Boolean,
    frontColor: Color3,
    name: String,
    onAfterBoxRenderingObservable: Observable[BoundingBox],
    onBeforeBoxRenderingObservable: Observable[BoundingBox],
    onResourcesReadyObservable: Observable[BoundingBoxRenderer],
    rebuild: () => Unit,
    register: () => Unit,
    render: Double => Unit,
    renderList: SmartArray[BoundingBox],
    renderOcclusionBoundingBox: AbstractMesh => Unit,
    reset: () => Unit,
    scene: Scene,
    showBackLines: Boolean
  ): BoundingBoxRenderer = {
    val __obj = js.Dynamic.literal(_buildUniformLayout = _buildUniformLayout.asInstanceOf[js.Any], _colorShader = _colorShader.asInstanceOf[js.Any], _colorShaderForOcclusionQuery = _colorShaderForOcclusionQuery.asInstanceOf[js.Any], _createIndexBuffer = _createIndexBuffer.asInstanceOf[js.Any], _createWrappersForBoundingBox = _createWrappersForBoundingBox.asInstanceOf[js.Any], _evaluateSubMesh = _evaluateSubMesh.asInstanceOf[js.Any], _fillIndexBuffer = _fillIndexBuffer.asInstanceOf[js.Any], _fillIndexData = _fillIndexData.asInstanceOf[js.Any], _indexBuffer = _indexBuffer.asInstanceOf[js.Any], _preActiveMesh = _preActiveMesh.asInstanceOf[js.Any], _prepareResources = _prepareResources.asInstanceOf[js.Any], _renderPassIdForOcclusionQuery = _renderPassIdForOcclusionQuery.asInstanceOf[js.Any], _uniformBufferBack = _uniformBufferBack.asInstanceOf[js.Any], _uniformBufferFront = _uniformBufferFront.asInstanceOf[js.Any], _vertexBuffers = _vertexBuffers.asInstanceOf[js.Any], backColor = backColor.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), enabled = enabled.asInstanceOf[js.Any], frontColor = frontColor.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onAfterBoxRenderingObservable = onAfterBoxRenderingObservable.asInstanceOf[js.Any], onBeforeBoxRenderingObservable = onBeforeBoxRenderingObservable.asInstanceOf[js.Any], onResourcesReadyObservable = onResourcesReadyObservable.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), render = js.Any.fromFunction1(render), renderList = renderList.asInstanceOf[js.Any], renderOcclusionBoundingBox = js.Any.fromFunction1(renderOcclusionBoundingBox), reset = js.Any.fromFunction0(reset), scene = scene.asInstanceOf[js.Any], showBackLines = showBackLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingBoxRenderer]
  }
  
  extension [Self <: BoundingBoxRenderer](x: Self) {
    
    inline def setBackColor(value: Color3): Self = StObject.set(x, "backColor", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFrontColor(value: Color3): Self = StObject.set(x, "frontColor", value.asInstanceOf[js.Any])
    
    inline def setOnAfterBoxRenderingObservable(value: Observable[BoundingBox]): Self = StObject.set(x, "onAfterBoxRenderingObservable", value.asInstanceOf[js.Any])
    
    inline def setOnBeforeBoxRenderingObservable(value: Observable[BoundingBox]): Self = StObject.set(x, "onBeforeBoxRenderingObservable", value.asInstanceOf[js.Any])
    
    inline def setOnResourcesReadyObservable(value: Observable[BoundingBoxRenderer]): Self = StObject.set(x, "onResourcesReadyObservable", value.asInstanceOf[js.Any])
    
    inline def setRender(value: Double => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    inline def setRenderList(value: SmartArray[BoundingBox]): Self = StObject.set(x, "renderList", value.asInstanceOf[js.Any])
    
    inline def setRenderOcclusionBoundingBox(value: AbstractMesh => Unit): Self = StObject.set(x, "renderOcclusionBoundingBox", js.Any.fromFunction1(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setShowBackLines(value: Boolean): Self = StObject.set(x, "showBackLines", value.asInstanceOf[js.Any])
    
    inline def set_buildUniformLayout(value: Any): Self = StObject.set(x, "_buildUniformLayout", value.asInstanceOf[js.Any])
    
    inline def set_colorShader(value: Any): Self = StObject.set(x, "_colorShader", value.asInstanceOf[js.Any])
    
    inline def set_colorShaderForOcclusionQuery(value: Any): Self = StObject.set(x, "_colorShaderForOcclusionQuery", value.asInstanceOf[js.Any])
    
    inline def set_createIndexBuffer(value: Any): Self = StObject.set(x, "_createIndexBuffer", value.asInstanceOf[js.Any])
    
    inline def set_createWrappersForBoundingBox(value: Any): Self = StObject.set(x, "_createWrappersForBoundingBox", value.asInstanceOf[js.Any])
    
    inline def set_evaluateSubMesh(value: Any): Self = StObject.set(x, "_evaluateSubMesh", value.asInstanceOf[js.Any])
    
    inline def set_fillIndexBuffer(value: Any): Self = StObject.set(x, "_fillIndexBuffer", value.asInstanceOf[js.Any])
    
    inline def set_fillIndexData(value: Any): Self = StObject.set(x, "_fillIndexData", value.asInstanceOf[js.Any])
    
    inline def set_indexBuffer(value: Any): Self = StObject.set(x, "_indexBuffer", value.asInstanceOf[js.Any])
    
    inline def set_preActiveMesh(value: Any): Self = StObject.set(x, "_preActiveMesh", value.asInstanceOf[js.Any])
    
    inline def set_prepareResources(value: Any): Self = StObject.set(x, "_prepareResources", value.asInstanceOf[js.Any])
    
    inline def set_renderPassIdForOcclusionQuery(value: Any): Self = StObject.set(x, "_renderPassIdForOcclusionQuery", value.asInstanceOf[js.Any])
    
    inline def set_uniformBufferBack(value: Any): Self = StObject.set(x, "_uniformBufferBack", value.asInstanceOf[js.Any])
    
    inline def set_uniformBufferFront(value: Any): Self = StObject.set(x, "_uniformBufferFront", value.asInstanceOf[js.Any])
    
    inline def set_vertexBuffers(value: Any): Self = StObject.set(x, "_vertexBuffers", value.asInstanceOf[js.Any])
  }
}
