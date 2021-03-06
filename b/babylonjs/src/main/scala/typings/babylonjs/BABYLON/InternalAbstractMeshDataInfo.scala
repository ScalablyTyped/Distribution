package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @hidden
  **/
@js.native
trait InternalAbstractMeshDataInfo extends StObject {
  
  var _actAsRegularMesh: Boolean = js.native
  
  var _applyFog: Boolean = js.native
  
  var _computeBonesUsingShaders: Boolean = js.native
  
  var _currentLOD: Nullable[AbstractMesh] = js.native
  
  var _currentLODIsUpToDate: Boolean = js.native
  
  var _facetData: FacetDataStorage = js.native
  
  var _hasVertexAlpha: Boolean = js.native
  
  var _isActive: Boolean = js.native
  
  var _isActiveIntermediate: Boolean = js.native
  
  var _layerMask: Double = js.native
  
  var _numBoneInfluencers: Double = js.native
  
  var _onlyForInstances: Boolean = js.native
  
  var _onlyForInstancesIntermediate: Boolean = js.native
  
  var _receiveShadows: Boolean = js.native
  
  var _skeleton: Nullable[Skeleton] = js.native
  
  var _useVertexColors: Boolean = js.native
  
  var _visibility: Double = js.native
}
object InternalAbstractMeshDataInfo {
  
  @scala.inline
  def apply(
    _actAsRegularMesh: Boolean,
    _applyFog: Boolean,
    _computeBonesUsingShaders: Boolean,
    _currentLODIsUpToDate: Boolean,
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
    _visibility: Double
  ): InternalAbstractMeshDataInfo = {
    val __obj = js.Dynamic.literal(_actAsRegularMesh = _actAsRegularMesh.asInstanceOf[js.Any], _applyFog = _applyFog.asInstanceOf[js.Any], _computeBonesUsingShaders = _computeBonesUsingShaders.asInstanceOf[js.Any], _currentLODIsUpToDate = _currentLODIsUpToDate.asInstanceOf[js.Any], _facetData = _facetData.asInstanceOf[js.Any], _hasVertexAlpha = _hasVertexAlpha.asInstanceOf[js.Any], _isActive = _isActive.asInstanceOf[js.Any], _isActiveIntermediate = _isActiveIntermediate.asInstanceOf[js.Any], _layerMask = _layerMask.asInstanceOf[js.Any], _numBoneInfluencers = _numBoneInfluencers.asInstanceOf[js.Any], _onlyForInstances = _onlyForInstances.asInstanceOf[js.Any], _onlyForInstancesIntermediate = _onlyForInstancesIntermediate.asInstanceOf[js.Any], _receiveShadows = _receiveShadows.asInstanceOf[js.Any], _useVertexColors = _useVertexColors.asInstanceOf[js.Any], _visibility = _visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalAbstractMeshDataInfo]
  }
  
  @scala.inline
  implicit class InternalAbstractMeshDataInfoMutableBuilder[Self <: InternalAbstractMeshDataInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_actAsRegularMesh(value: Boolean): Self = StObject.set(x, "_actAsRegularMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_applyFog(value: Boolean): Self = StObject.set(x, "_applyFog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_computeBonesUsingShaders(value: Boolean): Self = StObject.set(x, "_computeBonesUsingShaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_currentLOD(value: Nullable[AbstractMesh]): Self = StObject.set(x, "_currentLOD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_currentLODIsUpToDate(value: Boolean): Self = StObject.set(x, "_currentLODIsUpToDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_currentLODNull: Self = StObject.set(x, "_currentLOD", null)
    
    @scala.inline
    def set_facetData(value: FacetDataStorage): Self = StObject.set(x, "_facetData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_hasVertexAlpha(value: Boolean): Self = StObject.set(x, "_hasVertexAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_isActive(value: Boolean): Self = StObject.set(x, "_isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_isActiveIntermediate(value: Boolean): Self = StObject.set(x, "_isActiveIntermediate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_layerMask(value: Double): Self = StObject.set(x, "_layerMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_numBoneInfluencers(value: Double): Self = StObject.set(x, "_numBoneInfluencers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onlyForInstances(value: Boolean): Self = StObject.set(x, "_onlyForInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onlyForInstancesIntermediate(value: Boolean): Self = StObject.set(x, "_onlyForInstancesIntermediate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_receiveShadows(value: Boolean): Self = StObject.set(x, "_receiveShadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_skeleton(value: Nullable[Skeleton]): Self = StObject.set(x, "_skeleton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_skeletonNull: Self = StObject.set(x, "_skeleton", null)
    
    @scala.inline
    def set_useVertexColors(value: Boolean): Self = StObject.set(x, "_useVertexColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_visibility(value: Double): Self = StObject.set(x, "_visibility", value.asInstanceOf[js.Any])
  }
}
