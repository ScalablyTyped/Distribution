package typings.babylonjs.enginesIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsMeshesAbstractMeshAugmentingMod {
  
  trait AbstractMesh extends StObject {
    
    /**
      * Backing filed
      * @internal
      */
    var __occlusionDataStorage: typings.babylonjs.engineQueryMod.OcclusionDataStorage
    
    /**
      * Access property
      * @internal
      */
    var _occlusionDataStorage: typings.babylonjs.engineQueryMod.OcclusionDataStorage
    
    /**
      * Flag to force rendering the mesh even if occluded
      * @see https://doc.babylonjs.com/features/occlusionquery
      */
    var forceRenderingWhenOccluded: Boolean
    
    /**
      * Gets or sets whether the mesh is occluded or not, it is used also to set the initial state of the mesh to be occluded or not
      * @see https://doc.babylonjs.com/features/occlusionquery
      */
    var isOccluded: Boolean
    
    /**
      * Flag to check the progress status of the query
      * @see https://doc.babylonjs.com/features/occlusionquery
      */
    var isOcclusionQueryInProgress: Boolean
    
    /**
      * This property determines the type of occlusion query algorithm to run in WebGl, you can use:
      * * AbstractMesh.OCCLUSION_ALGORITHM_TYPE_ACCURATE which is mapped to GL_ANY_SAMPLES_PASSED.
      * * AbstractMesh.OCCLUSION_ALGORITHM_TYPE_CONSERVATIVE (Default Value) which is mapped to GL_ANY_SAMPLES_PASSED_CONSERVATIVE which is a false positive algorithm that is faster than GL_ANY_SAMPLES_PASSED but less accurate.
      * @see https://doc.babylonjs.com/features/occlusionquery
      */
    var occlusionQueryAlgorithmType: Double
    
    /**
      * This number indicates the number of allowed retries before stop the occlusion query, this is useful if the occlusion query is taking long time before to the query result is retrieved, the query result indicates if the object is visible within the scene or not and based on that Babylon.Js engine decides to show or hide the object.
      * The default value is -1 which means don't break the query and wait till the result
      * @see https://doc.babylonjs.com/features/occlusionquery
      */
    var occlusionRetryCount: Double
    
    /**
      * This property is responsible for starting the occlusion query within the Mesh or not, this property is also used to determine what should happen when the occlusionRetryCount is reached. It has supports 3 values:
      * * OCCLUSION_TYPE_NONE (Default Value): this option means no occlusion query within the Mesh.
      * * OCCLUSION_TYPE_OPTIMISTIC: this option is means use occlusion query and if occlusionRetryCount is reached and the query is broken show the mesh.
      * * OCCLUSION_TYPE_STRICT: this option is means use occlusion query and if occlusionRetryCount is reached and the query is broken restore the last state of the mesh occlusion if the mesh was visible then show the mesh if was hidden then hide don't show.
      * @see https://doc.babylonjs.com/features/occlusionquery
      */
    var occlusionType: Double
  }
  object AbstractMesh {
    
    inline def apply(
      __occlusionDataStorage: typings.babylonjs.engineQueryMod.OcclusionDataStorage,
      _occlusionDataStorage: typings.babylonjs.engineQueryMod.OcclusionDataStorage,
      forceRenderingWhenOccluded: Boolean,
      isOccluded: Boolean,
      isOcclusionQueryInProgress: Boolean,
      occlusionQueryAlgorithmType: Double,
      occlusionRetryCount: Double,
      occlusionType: Double
    ): AbstractMesh = {
      val __obj = js.Dynamic.literal(__occlusionDataStorage = __occlusionDataStorage.asInstanceOf[js.Any], _occlusionDataStorage = _occlusionDataStorage.asInstanceOf[js.Any], forceRenderingWhenOccluded = forceRenderingWhenOccluded.asInstanceOf[js.Any], isOccluded = isOccluded.asInstanceOf[js.Any], isOcclusionQueryInProgress = isOcclusionQueryInProgress.asInstanceOf[js.Any], occlusionQueryAlgorithmType = occlusionQueryAlgorithmType.asInstanceOf[js.Any], occlusionRetryCount = occlusionRetryCount.asInstanceOf[js.Any], occlusionType = occlusionType.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbstractMesh]
    }
    
    extension [Self <: AbstractMesh](x: Self) {
      
      inline def setForceRenderingWhenOccluded(value: Boolean): Self = StObject.set(x, "forceRenderingWhenOccluded", value.asInstanceOf[js.Any])
      
      inline def setIsOccluded(value: Boolean): Self = StObject.set(x, "isOccluded", value.asInstanceOf[js.Any])
      
      inline def setIsOcclusionQueryInProgress(value: Boolean): Self = StObject.set(x, "isOcclusionQueryInProgress", value.asInstanceOf[js.Any])
      
      inline def setOcclusionQueryAlgorithmType(value: Double): Self = StObject.set(x, "occlusionQueryAlgorithmType", value.asInstanceOf[js.Any])
      
      inline def setOcclusionRetryCount(value: Double): Self = StObject.set(x, "occlusionRetryCount", value.asInstanceOf[js.Any])
      
      inline def setOcclusionType(value: Double): Self = StObject.set(x, "occlusionType", value.asInstanceOf[js.Any])
      
      inline def set__occlusionDataStorage(value: typings.babylonjs.engineQueryMod.OcclusionDataStorage): Self = StObject.set(x, "__occlusionDataStorage", value.asInstanceOf[js.Any])
      
      inline def set_occlusionDataStorage(value: typings.babylonjs.engineQueryMod.OcclusionDataStorage): Self = StObject.set(x, "_occlusionDataStorage", value.asInstanceOf[js.Any])
    }
  }
}
