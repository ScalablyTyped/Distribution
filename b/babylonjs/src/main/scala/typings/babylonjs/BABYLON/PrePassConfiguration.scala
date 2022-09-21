package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrePassConfiguration extends StObject {
  
  /* private */ var _lastUpdateFrameId: Any
  
  /**
    * Binds the material data.
    * @param effect defines the effect to update
    * @param scene defines the scene the material belongs to.
    * @param mesh The mesh
    * @param world World matrix of this mesh
    * @param isFrozen Is the material frozen
    */
  def bindForSubMesh(effect: Effect, scene: Scene, mesh: Mesh, world: Matrix, isFrozen: Boolean): Unit
  
  /**
    * Current view projection matrix
    * Used for computing velocity
    */
  var currentViewProjection: Matrix
  
  /**
    * Previous bones of meshes carrying this material
    * Used for computing velocity
    */
  var previousBones: NumberDictionary[js.typedarray.Float32Array]
  
  /**
    * Previous view project matrix
    * Used for computing velocity
    */
  var previousViewProjection: Matrix
  
  /**
    * Previous world matrices of meshes carrying this material
    * Used for computing velocity
    */
  var previousWorldMatrices: NumberDictionary[Matrix]
}
object PrePassConfiguration {
  
  inline def apply(
    _lastUpdateFrameId: Any,
    bindForSubMesh: (Effect, Scene, Mesh, Matrix, Boolean) => Unit,
    currentViewProjection: Matrix,
    previousBones: NumberDictionary[js.typedarray.Float32Array],
    previousViewProjection: Matrix,
    previousWorldMatrices: NumberDictionary[Matrix]
  ): PrePassConfiguration = {
    val __obj = js.Dynamic.literal(_lastUpdateFrameId = _lastUpdateFrameId.asInstanceOf[js.Any], bindForSubMesh = js.Any.fromFunction5(bindForSubMesh), currentViewProjection = currentViewProjection.asInstanceOf[js.Any], previousBones = previousBones.asInstanceOf[js.Any], previousViewProjection = previousViewProjection.asInstanceOf[js.Any], previousWorldMatrices = previousWorldMatrices.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrePassConfiguration]
  }
  
  extension [Self <: PrePassConfiguration](x: Self) {
    
    inline def setBindForSubMesh(value: (Effect, Scene, Mesh, Matrix, Boolean) => Unit): Self = StObject.set(x, "bindForSubMesh", js.Any.fromFunction5(value))
    
    inline def setCurrentViewProjection(value: Matrix): Self = StObject.set(x, "currentViewProjection", value.asInstanceOf[js.Any])
    
    inline def setPreviousBones(value: NumberDictionary[js.typedarray.Float32Array]): Self = StObject.set(x, "previousBones", value.asInstanceOf[js.Any])
    
    inline def setPreviousViewProjection(value: Matrix): Self = StObject.set(x, "previousViewProjection", value.asInstanceOf[js.Any])
    
    inline def setPreviousWorldMatrices(value: NumberDictionary[Matrix]): Self = StObject.set(x, "previousWorldMatrices", value.asInstanceOf[js.Any])
    
    inline def set_lastUpdateFrameId(value: Any): Self = StObject.set(x, "_lastUpdateFrameId", value.asInstanceOf[js.Any])
  }
}
