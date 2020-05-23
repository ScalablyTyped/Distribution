package typings.babylonjs.abstractMeshMod

import typings.babylonjs.skeletonMod.Skeleton
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @hidden
  **/
trait InternalAbstractMeshDataInfo extends js.Object {
  var _actAsRegularMesh: Boolean
  var _applyFog: Boolean
  var _computeBonesUsingShaders: Boolean
  var _facetData: FacetDataStorage
  var _hasVertexAlpha: Boolean
  var _isActive: Boolean
  var _isActiveIntermediate: Boolean
  var _layerMask: Double
  var _numBoneInfluencers: Double
  var _onlyForInstances: Boolean
  var _onlyForInstancesIntermediate: Boolean
  var _receiveShadows: Boolean
  var _skeleton: Nullable[Skeleton]
  var _useVertexColors: Boolean
  var _visibility: Double
}

object InternalAbstractMeshDataInfo {
  @scala.inline
  def apply(
    _actAsRegularMesh: Boolean,
    _applyFog: Boolean,
    _computeBonesUsingShaders: Boolean,
    _facetData: FacetDataStorage,
    _hasVertexAlpha: Boolean,
    _isActive: Boolean,
    _isActiveIntermediate: Boolean,
    _layerMask: Double,
    _numBoneInfluencers: Double,
    _onlyForInstances: Boolean,
    _onlyForInstancesIntermediate: Boolean,
    _receiveShadows: Boolean,
    _useVertexColors: Boolean,
    _visibility: Double,
    _skeleton: Nullable[Skeleton] = null
  ): InternalAbstractMeshDataInfo = {
    val __obj = js.Dynamic.literal(_actAsRegularMesh = _actAsRegularMesh.asInstanceOf[js.Any], _applyFog = _applyFog.asInstanceOf[js.Any], _computeBonesUsingShaders = _computeBonesUsingShaders.asInstanceOf[js.Any], _facetData = _facetData.asInstanceOf[js.Any], _hasVertexAlpha = _hasVertexAlpha.asInstanceOf[js.Any], _isActive = _isActive.asInstanceOf[js.Any], _isActiveIntermediate = _isActiveIntermediate.asInstanceOf[js.Any], _layerMask = _layerMask.asInstanceOf[js.Any], _numBoneInfluencers = _numBoneInfluencers.asInstanceOf[js.Any], _onlyForInstances = _onlyForInstances.asInstanceOf[js.Any], _onlyForInstancesIntermediate = _onlyForInstancesIntermediate.asInstanceOf[js.Any], _receiveShadows = _receiveShadows.asInstanceOf[js.Any], _useVertexColors = _useVertexColors.asInstanceOf[js.Any], _visibility = _visibility.asInstanceOf[js.Any], _skeleton = _skeleton.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalAbstractMeshDataInfo]
  }
}

