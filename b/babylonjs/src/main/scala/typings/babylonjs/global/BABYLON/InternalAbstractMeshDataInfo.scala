package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IBakedVertexAnimationManager
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  **/
@JSGlobal("BABYLON._InternalAbstractMeshDataInfo")
@js.native
open class InternalAbstractMeshDataInfo ()
  extends StObject
     with typings.babylonjs.BABYLON.InternalAbstractMeshDataInfo {
  
  /* CompleteClass */
  var _actAsRegularMesh: Boolean = js.native
  
  /* CompleteClass */
  var _applyFog: Boolean = js.native
  
  /* CompleteClass */
  var _bakedVertexAnimationManager: Nullable[IBakedVertexAnimationManager] = js.native
  
  /* CompleteClass */
  var _collisionRetryCount: Double = js.native
  
  /* CompleteClass */
  var _computeBonesUsingShaders: Boolean = js.native
  
  /* CompleteClass */
  var _currentLOD: Nullable[typings.babylonjs.BABYLON.AbstractMesh] = js.native
  
  /* CompleteClass */
  var _currentLODIsUpToDate: Boolean = js.native
  
  /* CompleteClass */
  var _enableDistantPicking: Boolean = js.native
  
  /* CompleteClass */
  var _facetData: typings.babylonjs.BABYLON.FacetDataStorage = js.native
  
  /* CompleteClass */
  var _hasVertexAlpha: Boolean = js.native
  
  /* CompleteClass */
  var _isActive: Boolean = js.native
  
  /* CompleteClass */
  var _isActiveIntermediate: Boolean = js.native
  
  /* CompleteClass */
  var _layerMask: Double = js.native
  
  /* CompleteClass */
  var _material: Nullable[typings.babylonjs.BABYLON.Material] = js.native
  
  /* CompleteClass */
  var _materialForRenderPass: js.Array[js.UndefOr[typings.babylonjs.BABYLON.Material]] = js.native
  
  /* CompleteClass */
  var _meshCollisionData: typings.babylonjs.BABYLON.MeshCollisionData = js.native
  
  /* CompleteClass */
  var _morphTargetManager: Nullable[typings.babylonjs.BABYLON.MorphTargetManager] = js.native
  
  /* CompleteClass */
  var _numBoneInfluencers: Double = js.native
  
  /* CompleteClass */
  var _onlyForInstances: Boolean = js.native
  
  /* CompleteClass */
  var _onlyForInstancesIntermediate: Boolean = js.native
  
  /* CompleteClass */
  var _pointerOverDisableMeshTesting: Boolean = js.native
  
  /* CompleteClass */
  var _positions: Nullable[js.Array[typings.babylonjs.BABYLON.Vector3]] = js.native
  
  /* CompleteClass */
  var _receiveShadows: Boolean = js.native
  
  /* CompleteClass */
  var _renderingGroupId: Double = js.native
  
  /* CompleteClass */
  var _skeleton: Nullable[typings.babylonjs.BABYLON.Skeleton] = js.native
  
  /* CompleteClass */
  var _useVertexColors: Boolean = js.native
  
  /* CompleteClass */
  var _visibility: Double = js.native
}
