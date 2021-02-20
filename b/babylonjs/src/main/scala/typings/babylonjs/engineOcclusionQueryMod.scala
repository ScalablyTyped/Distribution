package typings.babylonjs

import typings.babylonjs.timeTokenMod.TimeToken
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.typesMod.int
import typings.std.WebGLQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineOcclusionQueryMod {
  
  @JSImport("babylonjs/Engines/Extensions/engine.occlusionQuery", "_OcclusionDataStorage")
  @js.native
  class OcclusionDataStorage () extends StObject {
    
    /** @hidden */
    var isOccluded: Boolean = js.native
    
    /** @hidden */
    var isOcclusionQueryInProgress: Boolean = js.native
    
    /** @hidden */
    var occlusionInternalRetryCounter: Double = js.native
    
    /** @hidden */
    var occlusionQueryAlgorithmType: Double = js.native
    
    /** @hidden */
    var occlusionRetryCount: Double = js.native
    
    /** @hidden */
    var occlusionType: Double = js.native
  }
  
  /* augmented module */
  object babylonjsEnginesEngineAugmentingMod {
    
    @js.native
    trait Engine extends StObject {
      
      /** @hidden */
      def _createTimeQuery(): WebGLQuery = js.native
      
      /** @hidden */
      var _currentNonTimestampToken: Nullable[TimeToken] = js.native
      
      /** @hidden */
      def _deleteTimeQuery(query: WebGLQuery): Unit = js.native
      
      /** @hidden */
      def _getGlAlgorithmType(algorithmType: Double): Double = js.native
      
      /** @hidden */
      def _getTimeQueryAvailability(query: WebGLQuery): js.Any = js.native
      
      /** @hidden */
      def _getTimeQueryResult(query: WebGLQuery): js.Any = js.native
      
      /**
        * Initiates an occlusion query
        * @param algorithmType defines the algorithm to use
        * @param query defines the query to use
        * @returns the current engine
        * @see https://doc.babylonjs.com/features/occlusionquery
        */
      def beginOcclusionQuery(algorithmType: Double, query: WebGLQuery): Engine = js.native
      
      /**
        * Create a new webGL query (you must be sure that queries are supported by checking getCaps() function)
        * @return the new query
        */
      def createQuery(): WebGLQuery = js.native
      
      /**
        * Delete and release a webGL query
        * @param query defines the query to delete
        * @return the current engine
        */
      def deleteQuery(query: WebGLQuery): Engine = js.native
      
      /**
        * Ends an occlusion query
        * @see https://doc.babylonjs.com/features/occlusionquery
        * @param algorithmType defines the algorithm to use
        * @returns the current engine
        */
      def endOcclusionQuery(algorithmType: Double): Engine = js.native
      
      /**
        * Ends a time query
        * @param token defines the token used to measure the time span
        * @returns the time spent (in ns)
        */
      def endTimeQuery(token: TimeToken): int = js.native
      
      /**
        * Gets the value of a given query
        * @param query defines the query to check
        * @returns the value of the query
        */
      def getQueryResult(query: WebGLQuery): Double = js.native
      
      /**
        * Check if a given query has resolved and got its value
        * @param query defines the query to check
        * @returns true if the query got its value
        */
      def isQueryResultAvailable(query: WebGLQuery): Boolean = js.native
      
      /**
        * Starts a time query (used to measure time spent by the GPU on a specific frame)
        * Please note that only one query can be issued at a time
        * @returns a time token used to track the time span
        */
      def startTimeQuery(): Nullable[TimeToken] = js.native
    }
    object Engine {
      
      @scala.inline
      def apply(
        _createTimeQuery: () => WebGLQuery,
        _deleteTimeQuery: WebGLQuery => Unit,
        _getGlAlgorithmType: Double => Double,
        _getTimeQueryAvailability: WebGLQuery => js.Any,
        _getTimeQueryResult: WebGLQuery => js.Any,
        beginOcclusionQuery: (Double, WebGLQuery) => Engine,
        createQuery: () => WebGLQuery,
        deleteQuery: WebGLQuery => Engine,
        endOcclusionQuery: Double => Engine,
        endTimeQuery: TimeToken => int,
        getQueryResult: WebGLQuery => Double,
        isQueryResultAvailable: WebGLQuery => Boolean,
        startTimeQuery: () => Nullable[TimeToken]
      ): Engine = {
        val __obj = js.Dynamic.literal(_createTimeQuery = js.Any.fromFunction0(_createTimeQuery), _deleteTimeQuery = js.Any.fromFunction1(_deleteTimeQuery), _getGlAlgorithmType = js.Any.fromFunction1(_getGlAlgorithmType), _getTimeQueryAvailability = js.Any.fromFunction1(_getTimeQueryAvailability), _getTimeQueryResult = js.Any.fromFunction1(_getTimeQueryResult), beginOcclusionQuery = js.Any.fromFunction2(beginOcclusionQuery), createQuery = js.Any.fromFunction0(createQuery), deleteQuery = js.Any.fromFunction1(deleteQuery), endOcclusionQuery = js.Any.fromFunction1(endOcclusionQuery), endTimeQuery = js.Any.fromFunction1(endTimeQuery), getQueryResult = js.Any.fromFunction1(getQueryResult), isQueryResultAvailable = js.Any.fromFunction1(isQueryResultAvailable), startTimeQuery = js.Any.fromFunction0(startTimeQuery))
        __obj.asInstanceOf[Engine]
      }
      
      @scala.inline
      implicit class EngineMutableBuilder[Self <: Engine] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBeginOcclusionQuery(value: (Double, WebGLQuery) => Engine): Self = StObject.set(x, "beginOcclusionQuery", js.Any.fromFunction2(value))
        
        @scala.inline
        def setCreateQuery(value: () => WebGLQuery): Self = StObject.set(x, "createQuery", js.Any.fromFunction0(value))
        
        @scala.inline
        def setDeleteQuery(value: WebGLQuery => Engine): Self = StObject.set(x, "deleteQuery", js.Any.fromFunction1(value))
        
        @scala.inline
        def setEndOcclusionQuery(value: Double => Engine): Self = StObject.set(x, "endOcclusionQuery", js.Any.fromFunction1(value))
        
        @scala.inline
        def setEndTimeQuery(value: TimeToken => int): Self = StObject.set(x, "endTimeQuery", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetQueryResult(value: WebGLQuery => Double): Self = StObject.set(x, "getQueryResult", js.Any.fromFunction1(value))
        
        @scala.inline
        def setIsQueryResultAvailable(value: WebGLQuery => Boolean): Self = StObject.set(x, "isQueryResultAvailable", js.Any.fromFunction1(value))
        
        @scala.inline
        def setStartTimeQuery(value: () => Nullable[TimeToken]): Self = StObject.set(x, "startTimeQuery", js.Any.fromFunction0(value))
        
        @scala.inline
        def set_createTimeQuery(value: () => WebGLQuery): Self = StObject.set(x, "_createTimeQuery", js.Any.fromFunction0(value))
        
        @scala.inline
        def set_currentNonTimestampToken(value: Nullable[TimeToken]): Self = StObject.set(x, "_currentNonTimestampToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_currentNonTimestampTokenNull: Self = StObject.set(x, "_currentNonTimestampToken", null)
        
        @scala.inline
        def set_deleteTimeQuery(value: WebGLQuery => Unit): Self = StObject.set(x, "_deleteTimeQuery", js.Any.fromFunction1(value))
        
        @scala.inline
        def set_getGlAlgorithmType(value: Double => Double): Self = StObject.set(x, "_getGlAlgorithmType", js.Any.fromFunction1(value))
        
        @scala.inline
        def set_getTimeQueryAvailability(value: WebGLQuery => js.Any): Self = StObject.set(x, "_getTimeQueryAvailability", js.Any.fromFunction1(value))
        
        @scala.inline
        def set_getTimeQueryResult(value: WebGLQuery => js.Any): Self = StObject.set(x, "_getTimeQueryResult", js.Any.fromFunction1(value))
      }
    }
  }
  
  /* augmented module */
  object babylonjsMeshesAbstractMeshAugmentingMod {
    
    @js.native
    trait AbstractMesh extends StObject {
      
      /**
        * Backing filed
        * @hidden
        */
      var __occlusionDataStorage: OcclusionDataStorage = js.native
      
      /**
        * Access property
        * @hidden
        */
      var _occlusionDataStorage: OcclusionDataStorage = js.native
      
      /**
        * Gets or sets whether the mesh is occluded or not, it is used also to set the intial state of the mesh to be occluded or not
        * @see https://doc.babylonjs.com/features/occlusionquery
        */
      var isOccluded: Boolean = js.native
      
      /**
        * Flag to check the progress status of the query
        * @see https://doc.babylonjs.com/features/occlusionquery
        */
      var isOcclusionQueryInProgress: Boolean = js.native
      
      /**
        * This property determines the type of occlusion query algorithm to run in WebGl, you can use:
        * * AbstractMesh.OCCLUSION_ALGORITHM_TYPE_ACCURATE which is mapped to GL_ANY_SAMPLES_PASSED.
        * * AbstractMesh.OCCLUSION_ALGORITHM_TYPE_CONSERVATIVE (Default Value) which is mapped to GL_ANY_SAMPLES_PASSED_CONSERVATIVE which is a false positive algorithm that is faster than GL_ANY_SAMPLES_PASSED but less accurate.
        * @see https://doc.babylonjs.com/features/occlusionquery
        */
      var occlusionQueryAlgorithmType: Double = js.native
      
      /**
        * This number indicates the number of allowed retries before stop the occlusion query, this is useful if the occlusion query is taking long time before to the query result is retireved, the query result indicates if the object is visible within the scene or not and based on that Babylon.Js engine decideds to show or hide the object.
        * The default value is -1 which means don't break the query and wait till the result
        * @see https://doc.babylonjs.com/features/occlusionquery
        */
      var occlusionRetryCount: Double = js.native
      
      /**
        * This property is responsible for starting the occlusion query within the Mesh or not, this property is also used to determine what should happen when the occlusionRetryCount is reached. It has supports 3 values:
        * * OCCLUSION_TYPE_NONE (Default Value): this option means no occlusion query whith the Mesh.
        * * OCCLUSION_TYPE_OPTIMISTIC: this option is means use occlusion query and if occlusionRetryCount is reached and the query is broken show the mesh.
        * * OCCLUSION_TYPE_STRICT: this option is means use occlusion query and if occlusionRetryCount is reached and the query is broken restore the last state of the mesh occlusion if the mesh was visible then show the mesh if was hidden then hide don't show.
        * @see https://doc.babylonjs.com/features/occlusionquery
        */
      var occlusionType: Double = js.native
    }
    object AbstractMesh {
      
      @scala.inline
      def apply(
        __occlusionDataStorage: OcclusionDataStorage,
        _occlusionDataStorage: OcclusionDataStorage,
        isOccluded: Boolean,
        isOcclusionQueryInProgress: Boolean,
        occlusionQueryAlgorithmType: Double,
        occlusionRetryCount: Double,
        occlusionType: Double
      ): AbstractMesh = {
        val __obj = js.Dynamic.literal(__occlusionDataStorage = __occlusionDataStorage.asInstanceOf[js.Any], _occlusionDataStorage = _occlusionDataStorage.asInstanceOf[js.Any], isOccluded = isOccluded.asInstanceOf[js.Any], isOcclusionQueryInProgress = isOcclusionQueryInProgress.asInstanceOf[js.Any], occlusionQueryAlgorithmType = occlusionQueryAlgorithmType.asInstanceOf[js.Any], occlusionRetryCount = occlusionRetryCount.asInstanceOf[js.Any], occlusionType = occlusionType.asInstanceOf[js.Any])
        __obj.asInstanceOf[AbstractMesh]
      }
      
      @scala.inline
      implicit class AbstractMeshMutableBuilder[Self <: AbstractMesh] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIsOccluded(value: Boolean): Self = StObject.set(x, "isOccluded", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsOcclusionQueryInProgress(value: Boolean): Self = StObject.set(x, "isOcclusionQueryInProgress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOcclusionQueryAlgorithmType(value: Double): Self = StObject.set(x, "occlusionQueryAlgorithmType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOcclusionRetryCount(value: Double): Self = StObject.set(x, "occlusionRetryCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOcclusionType(value: Double): Self = StObject.set(x, "occlusionType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set__occlusionDataStorage(value: OcclusionDataStorage): Self = StObject.set(x, "__occlusionDataStorage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_occlusionDataStorage(value: OcclusionDataStorage): Self = StObject.set(x, "_occlusionDataStorage", value.asInstanceOf[js.Any])
      }
    }
  }
}
