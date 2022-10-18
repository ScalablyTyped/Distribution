package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  **/
trait InternalAbstractMeshDataInfo extends StObject {
  
  var _actAsRegularMesh: Boolean
  
  var _applyFog: Boolean
  
  var _bakedVertexAnimationManager: Nullable[IBakedVertexAnimationManager]
  
  var _collisionRetryCount: Double
  
  var _computeBonesUsingShaders: Boolean
  
  var _currentLOD: Nullable[AbstractMesh]
  
  var _currentLODIsUpToDate: Boolean
  
  var _enableDistantPicking: Boolean
  
  var _facetData: FacetDataStorage
  
  var _hasVertexAlpha: Boolean
  
  var _isActive: Boolean
  
  var _isActiveIntermediate: Boolean
  
  var _layerMask: Double
  
  var _material: Nullable[Material]
  
  var _materialForRenderPass: js.Array[js.UndefOr[Material]]
  
  var _meshCollisionData: MeshCollisionData
  
  var _morphTargetManager: Nullable[MorphTargetManager]
  
  var _numBoneInfluencers: Double
  
  var _onlyForInstances: Boolean
  
  var _onlyForInstancesIntermediate: Boolean
  
  var _pointerOverDisableMeshTesting: Boolean
  
  var _positions: Nullable[js.Array[Vector3]]
  
  var _receiveShadows: Boolean
  
  var _renderingGroupId: Double
  
  var _skeleton: Nullable[Skeleton]
  
  var _useVertexColors: Boolean
  
  var _visibility: Double
}
object InternalAbstractMeshDataInfo {
  
  inline def apply(
    _actAsRegularMesh: Boolean,
    _applyFog: Boolean,
    _collisionRetryCount: Double,
    _computeBonesUsingShaders: Boolean,
    _currentLODIsUpToDate: Boolean,
    _enableDistantPicking: Boolean,
    _facetData: FacetDataStorage,
    _hasVertexAlpha: Boolean,
    _isActive: Boolean,
    _isActiveIntermediate: Boolean,
    _layerMask: Double,
    _materialForRenderPass: js.Array[js.UndefOr[Material]],
    _meshCollisionData: MeshCollisionData,
    _numBoneInfluencers: Double,
    _onlyForInstances: Boolean,
    _onlyForInstancesIntermediate: Boolean,
    _pointerOverDisableMeshTesting: Boolean,
    _receiveShadows: Boolean,
    _renderingGroupId: Double,
    _useVertexColors: Boolean,
    _visibility: Double
  ): InternalAbstractMeshDataInfo = {
    val __obj = js.Dynamic.literal(_actAsRegularMesh = _actAsRegularMesh.asInstanceOf[js.Any], _applyFog = _applyFog.asInstanceOf[js.Any], _collisionRetryCount = _collisionRetryCount.asInstanceOf[js.Any], _computeBonesUsingShaders = _computeBonesUsingShaders.asInstanceOf[js.Any], _currentLODIsUpToDate = _currentLODIsUpToDate.asInstanceOf[js.Any], _enableDistantPicking = _enableDistantPicking.asInstanceOf[js.Any], _facetData = _facetData.asInstanceOf[js.Any], _hasVertexAlpha = _hasVertexAlpha.asInstanceOf[js.Any], _isActive = _isActive.asInstanceOf[js.Any], _isActiveIntermediate = _isActiveIntermediate.asInstanceOf[js.Any], _layerMask = _layerMask.asInstanceOf[js.Any], _materialForRenderPass = _materialForRenderPass.asInstanceOf[js.Any], _meshCollisionData = _meshCollisionData.asInstanceOf[js.Any], _numBoneInfluencers = _numBoneInfluencers.asInstanceOf[js.Any], _onlyForInstances = _onlyForInstances.asInstanceOf[js.Any], _onlyForInstancesIntermediate = _onlyForInstancesIntermediate.asInstanceOf[js.Any], _pointerOverDisableMeshTesting = _pointerOverDisableMeshTesting.asInstanceOf[js.Any], _receiveShadows = _receiveShadows.asInstanceOf[js.Any], _renderingGroupId = _renderingGroupId.asInstanceOf[js.Any], _useVertexColors = _useVertexColors.asInstanceOf[js.Any], _visibility = _visibility.asInstanceOf[js.Any], _bakedVertexAnimationManager = null, _currentLOD = null, _material = null, _morphTargetManager = null, _positions = null, _skeleton = null)
    __obj.asInstanceOf[InternalAbstractMeshDataInfo]
  }
  
  extension [Self <: InternalAbstractMeshDataInfo](x: Self) {
    
    inline def set_actAsRegularMesh(value: Boolean): Self = StObject.set(x, "_actAsRegularMesh", value.asInstanceOf[js.Any])
    
    inline def set_applyFog(value: Boolean): Self = StObject.set(x, "_applyFog", value.asInstanceOf[js.Any])
    
    inline def set_bakedVertexAnimationManager(value: Nullable[IBakedVertexAnimationManager]): Self = StObject.set(x, "_bakedVertexAnimationManager", value.asInstanceOf[js.Any])
    
    inline def set_bakedVertexAnimationManagerNull: Self = StObject.set(x, "_bakedVertexAnimationManager", null)
    
    inline def set_collisionRetryCount(value: Double): Self = StObject.set(x, "_collisionRetryCount", value.asInstanceOf[js.Any])
    
    inline def set_computeBonesUsingShaders(value: Boolean): Self = StObject.set(x, "_computeBonesUsingShaders", value.asInstanceOf[js.Any])
    
    inline def set_currentLOD(value: Nullable[AbstractMesh]): Self = StObject.set(x, "_currentLOD", value.asInstanceOf[js.Any])
    
    inline def set_currentLODIsUpToDate(value: Boolean): Self = StObject.set(x, "_currentLODIsUpToDate", value.asInstanceOf[js.Any])
    
    inline def set_currentLODNull: Self = StObject.set(x, "_currentLOD", null)
    
    inline def set_enableDistantPicking(value: Boolean): Self = StObject.set(x, "_enableDistantPicking", value.asInstanceOf[js.Any])
    
    inline def set_facetData(value: FacetDataStorage): Self = StObject.set(x, "_facetData", value.asInstanceOf[js.Any])
    
    inline def set_hasVertexAlpha(value: Boolean): Self = StObject.set(x, "_hasVertexAlpha", value.asInstanceOf[js.Any])
    
    inline def set_isActive(value: Boolean): Self = StObject.set(x, "_isActive", value.asInstanceOf[js.Any])
    
    inline def set_isActiveIntermediate(value: Boolean): Self = StObject.set(x, "_isActiveIntermediate", value.asInstanceOf[js.Any])
    
    inline def set_layerMask(value: Double): Self = StObject.set(x, "_layerMask", value.asInstanceOf[js.Any])
    
    inline def set_material(value: Nullable[Material]): Self = StObject.set(x, "_material", value.asInstanceOf[js.Any])
    
    inline def set_materialForRenderPass(value: js.Array[js.UndefOr[Material]]): Self = StObject.set(x, "_materialForRenderPass", value.asInstanceOf[js.Any])
    
    inline def set_materialForRenderPassVarargs(value: js.UndefOr[Material]*): Self = StObject.set(x, "_materialForRenderPass", js.Array(value*))
    
    inline def set_materialNull: Self = StObject.set(x, "_material", null)
    
    inline def set_meshCollisionData(value: MeshCollisionData): Self = StObject.set(x, "_meshCollisionData", value.asInstanceOf[js.Any])
    
    inline def set_morphTargetManager(value: Nullable[MorphTargetManager]): Self = StObject.set(x, "_morphTargetManager", value.asInstanceOf[js.Any])
    
    inline def set_morphTargetManagerNull: Self = StObject.set(x, "_morphTargetManager", null)
    
    inline def set_numBoneInfluencers(value: Double): Self = StObject.set(x, "_numBoneInfluencers", value.asInstanceOf[js.Any])
    
    inline def set_onlyForInstances(value: Boolean): Self = StObject.set(x, "_onlyForInstances", value.asInstanceOf[js.Any])
    
    inline def set_onlyForInstancesIntermediate(value: Boolean): Self = StObject.set(x, "_onlyForInstancesIntermediate", value.asInstanceOf[js.Any])
    
    inline def set_pointerOverDisableMeshTesting(value: Boolean): Self = StObject.set(x, "_pointerOverDisableMeshTesting", value.asInstanceOf[js.Any])
    
    inline def set_positions(value: Nullable[js.Array[Vector3]]): Self = StObject.set(x, "_positions", value.asInstanceOf[js.Any])
    
    inline def set_positionsNull: Self = StObject.set(x, "_positions", null)
    
    inline def set_positionsVarargs(value: Vector3*): Self = StObject.set(x, "_positions", js.Array(value*))
    
    inline def set_receiveShadows(value: Boolean): Self = StObject.set(x, "_receiveShadows", value.asInstanceOf[js.Any])
    
    inline def set_renderingGroupId(value: Double): Self = StObject.set(x, "_renderingGroupId", value.asInstanceOf[js.Any])
    
    inline def set_skeleton(value: Nullable[Skeleton]): Self = StObject.set(x, "_skeleton", value.asInstanceOf[js.Any])
    
    inline def set_skeletonNull: Self = StObject.set(x, "_skeleton", null)
    
    inline def set_useVertexColors(value: Boolean): Self = StObject.set(x, "_useVertexColors", value.asInstanceOf[js.Any])
    
    inline def set_visibility(value: Double): Self = StObject.set(x, "_visibility", value.asInstanceOf[js.Any])
  }
}
