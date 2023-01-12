package typings.babylonjs

import typings.babylonjs.instrumentationTimeTokenMod.TimeToken
import typings.babylonjs.miscObservableMod.Observer
import typings.babylonjs.miscPerfCounterMod.PerfCounter
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.typesMod.int
import typings.std.WebGLQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesExtensionsEngineDotqueryMod {
  
  @JSImport("babylonjs/Engines/Extensions/engine.query", "_OcclusionDataStorage")
  @js.native
  open class OcclusionDataStorage () extends StObject {
    
    /** @internal */
    var forceRenderingWhenOccluded: Boolean = js.native
    
    /** @internal */
    var isOccluded: Boolean = js.native
    
    /** @internal */
    var isOcclusionQueryInProgress: Boolean = js.native
    
    /** @internal */
    var occlusionInternalRetryCounter: Double = js.native
    
    /** @internal */
    var occlusionQueryAlgorithmType: Double = js.native
    
    /** @internal */
    var occlusionRetryCount: Double = js.native
    
    /** @internal */
    var occlusionType: Double = js.native
  }
  
  type OcclusionQuery = WebGLQuery | Double
  
  /* augmented module */
  object babylonjsEnginesEngineAugmentingMod {
    
    trait Engine extends StObject {
      
      /** @internal */
      var _captureGPUFrameTime: Boolean
      
      /** @internal */
      def _createTimeQuery(): WebGLQuery
      
      /** @internal */
      var _currentNonTimestampToken: Nullable[TimeToken]
      
      /** @internal */
      def _deleteTimeQuery(query: WebGLQuery): Unit
      
      /** @internal */
      def _getGlAlgorithmType(algorithmType: Double): Double
      
      /** @internal */
      def _getTimeQueryAvailability(query: WebGLQuery): Any
      
      /** @internal */
      def _getTimeQueryResult(query: WebGLQuery): Any
      
      /** @internal */
      var _gpuFrameTime: PerfCounter
      
      /** @internal */
      var _gpuFrameTimeToken: Nullable[TimeToken]
      
      /** @internal */
      var _onBeginFrameObserver: Nullable[Observer[Engine]]
      
      /** @internal */
      var _onEndFrameObserver: Nullable[Observer[Engine]]
      
      /**
        * Initiates an occlusion query
        * @param algorithmType defines the algorithm to use
        * @param query defines the query to use
        * @returns the current engine
        * @see https://doc.babylonjs.com/features/occlusionquery
        */
      def beginOcclusionQuery(algorithmType: Double, query: OcclusionQuery): Boolean
      
      /**
        * Enable or disable the GPU frame time capture
        * @param value True to enable, false to disable
        */
      def captureGPUFrameTime(value: Boolean): Unit
      
      /**
        * Create a new webGL query (you must be sure that queries are supported by checking getCaps() function)
        * @returns the new query
        */
      def createQuery(): OcclusionQuery
      
      /**
        * Delete and release a webGL query
        * @param query defines the query to delete
        * @returns the current engine
        */
      def deleteQuery(query: OcclusionQuery): Engine
      
      /**
        * Ends an occlusion query
        * @see https://doc.babylonjs.com/features/occlusionquery
        * @param algorithmType defines the algorithm to use
        * @returns the current engine
        */
      def endOcclusionQuery(algorithmType: Double): Engine
      
      /**
        * Ends a time query
        * @param token defines the token used to measure the time span
        * @returns the time spent (in ns)
        */
      def endTimeQuery(token: TimeToken): int
      
      /**
        * Get the performance counter associated with the frame time computation
        * @returns the perf counter
        */
      def getGPUFrameTimeCounter(): PerfCounter
      
      /**
        * Gets the value of a given query
        * @param query defines the query to check
        * @returns the value of the query
        */
      def getQueryResult(query: OcclusionQuery): Double
      
      /**
        * Check if a given query has resolved and got its value
        * @param query defines the query to check
        * @returns true if the query got its value
        */
      def isQueryResultAvailable(query: OcclusionQuery): Boolean
      
      /**
        * Starts a time query (used to measure time spent by the GPU on a specific frame)
        * Please note that only one query can be issued at a time
        * @returns a time token used to track the time span
        */
      def startTimeQuery(): Nullable[TimeToken]
    }
    object Engine {
      
      inline def apply(
        _captureGPUFrameTime: Boolean,
        _createTimeQuery: () => WebGLQuery,
        _deleteTimeQuery: WebGLQuery => Unit,
        _getGlAlgorithmType: Double => Double,
        _getTimeQueryAvailability: WebGLQuery => Any,
        _getTimeQueryResult: WebGLQuery => Any,
        _gpuFrameTime: PerfCounter,
        beginOcclusionQuery: (Double, OcclusionQuery) => Boolean,
        captureGPUFrameTime: Boolean => Unit,
        createQuery: () => OcclusionQuery,
        deleteQuery: OcclusionQuery => Engine,
        endOcclusionQuery: Double => Engine,
        endTimeQuery: TimeToken => int,
        getGPUFrameTimeCounter: () => PerfCounter,
        getQueryResult: OcclusionQuery => Double,
        isQueryResultAvailable: OcclusionQuery => Boolean,
        startTimeQuery: () => Nullable[TimeToken]
      ): Engine = {
        val __obj = js.Dynamic.literal(_captureGPUFrameTime = _captureGPUFrameTime.asInstanceOf[js.Any], _createTimeQuery = js.Any.fromFunction0(_createTimeQuery), _deleteTimeQuery = js.Any.fromFunction1(_deleteTimeQuery), _getGlAlgorithmType = js.Any.fromFunction1(_getGlAlgorithmType), _getTimeQueryAvailability = js.Any.fromFunction1(_getTimeQueryAvailability), _getTimeQueryResult = js.Any.fromFunction1(_getTimeQueryResult), _gpuFrameTime = _gpuFrameTime.asInstanceOf[js.Any], beginOcclusionQuery = js.Any.fromFunction2(beginOcclusionQuery), captureGPUFrameTime = js.Any.fromFunction1(captureGPUFrameTime), createQuery = js.Any.fromFunction0(createQuery), deleteQuery = js.Any.fromFunction1(deleteQuery), endOcclusionQuery = js.Any.fromFunction1(endOcclusionQuery), endTimeQuery = js.Any.fromFunction1(endTimeQuery), getGPUFrameTimeCounter = js.Any.fromFunction0(getGPUFrameTimeCounter), getQueryResult = js.Any.fromFunction1(getQueryResult), isQueryResultAvailable = js.Any.fromFunction1(isQueryResultAvailable), startTimeQuery = js.Any.fromFunction0(startTimeQuery), _currentNonTimestampToken = null, _gpuFrameTimeToken = null, _onBeginFrameObserver = null, _onEndFrameObserver = null)
        __obj.asInstanceOf[Engine]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Engine] (val x: Self) extends AnyVal {
        
        inline def setBeginOcclusionQuery(value: (Double, OcclusionQuery) => Boolean): Self = StObject.set(x, "beginOcclusionQuery", js.Any.fromFunction2(value))
        
        inline def setCaptureGPUFrameTime(value: Boolean => Unit): Self = StObject.set(x, "captureGPUFrameTime", js.Any.fromFunction1(value))
        
        inline def setCreateQuery(value: () => OcclusionQuery): Self = StObject.set(x, "createQuery", js.Any.fromFunction0(value))
        
        inline def setDeleteQuery(value: OcclusionQuery => Engine): Self = StObject.set(x, "deleteQuery", js.Any.fromFunction1(value))
        
        inline def setEndOcclusionQuery(value: Double => Engine): Self = StObject.set(x, "endOcclusionQuery", js.Any.fromFunction1(value))
        
        inline def setEndTimeQuery(value: TimeToken => int): Self = StObject.set(x, "endTimeQuery", js.Any.fromFunction1(value))
        
        inline def setGetGPUFrameTimeCounter(value: () => PerfCounter): Self = StObject.set(x, "getGPUFrameTimeCounter", js.Any.fromFunction0(value))
        
        inline def setGetQueryResult(value: OcclusionQuery => Double): Self = StObject.set(x, "getQueryResult", js.Any.fromFunction1(value))
        
        inline def setIsQueryResultAvailable(value: OcclusionQuery => Boolean): Self = StObject.set(x, "isQueryResultAvailable", js.Any.fromFunction1(value))
        
        inline def setStartTimeQuery(value: () => Nullable[TimeToken]): Self = StObject.set(x, "startTimeQuery", js.Any.fromFunction0(value))
        
        inline def set_captureGPUFrameTime(value: Boolean): Self = StObject.set(x, "_captureGPUFrameTime", value.asInstanceOf[js.Any])
        
        inline def set_createTimeQuery(value: () => WebGLQuery): Self = StObject.set(x, "_createTimeQuery", js.Any.fromFunction0(value))
        
        inline def set_currentNonTimestampToken(value: Nullable[TimeToken]): Self = StObject.set(x, "_currentNonTimestampToken", value.asInstanceOf[js.Any])
        
        inline def set_currentNonTimestampTokenNull: Self = StObject.set(x, "_currentNonTimestampToken", null)
        
        inline def set_deleteTimeQuery(value: WebGLQuery => Unit): Self = StObject.set(x, "_deleteTimeQuery", js.Any.fromFunction1(value))
        
        inline def set_getGlAlgorithmType(value: Double => Double): Self = StObject.set(x, "_getGlAlgorithmType", js.Any.fromFunction1(value))
        
        inline def set_getTimeQueryAvailability(value: WebGLQuery => Any): Self = StObject.set(x, "_getTimeQueryAvailability", js.Any.fromFunction1(value))
        
        inline def set_getTimeQueryResult(value: WebGLQuery => Any): Self = StObject.set(x, "_getTimeQueryResult", js.Any.fromFunction1(value))
        
        inline def set_gpuFrameTime(value: PerfCounter): Self = StObject.set(x, "_gpuFrameTime", value.asInstanceOf[js.Any])
        
        inline def set_gpuFrameTimeToken(value: Nullable[TimeToken]): Self = StObject.set(x, "_gpuFrameTimeToken", value.asInstanceOf[js.Any])
        
        inline def set_gpuFrameTimeTokenNull: Self = StObject.set(x, "_gpuFrameTimeToken", null)
        
        inline def set_onBeginFrameObserver(value: Nullable[Observer[Engine]]): Self = StObject.set(x, "_onBeginFrameObserver", value.asInstanceOf[js.Any])
        
        inline def set_onBeginFrameObserverNull: Self = StObject.set(x, "_onBeginFrameObserver", null)
        
        inline def set_onEndFrameObserver(value: Nullable[Observer[Engine]]): Self = StObject.set(x, "_onEndFrameObserver", value.asInstanceOf[js.Any])
        
        inline def set_onEndFrameObserverNull: Self = StObject.set(x, "_onEndFrameObserver", null)
      }
    }
  }
  
  /* augmented module */
  object babylonjsMeshesAbstractMeshAugmentingMod {
    
    trait AbstractMesh extends StObject {
      
      /**
        * Backing filed
        * @internal
        */
      var __occlusionDataStorage: OcclusionDataStorage
      
      /**
        * Access property
        * @internal
        */
      var _occlusionDataStorage: OcclusionDataStorage
      
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
        __occlusionDataStorage: OcclusionDataStorage,
        _occlusionDataStorage: OcclusionDataStorage,
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AbstractMesh] (val x: Self) extends AnyVal {
        
        inline def setForceRenderingWhenOccluded(value: Boolean): Self = StObject.set(x, "forceRenderingWhenOccluded", value.asInstanceOf[js.Any])
        
        inline def setIsOccluded(value: Boolean): Self = StObject.set(x, "isOccluded", value.asInstanceOf[js.Any])
        
        inline def setIsOcclusionQueryInProgress(value: Boolean): Self = StObject.set(x, "isOcclusionQueryInProgress", value.asInstanceOf[js.Any])
        
        inline def setOcclusionQueryAlgorithmType(value: Double): Self = StObject.set(x, "occlusionQueryAlgorithmType", value.asInstanceOf[js.Any])
        
        inline def setOcclusionRetryCount(value: Double): Self = StObject.set(x, "occlusionRetryCount", value.asInstanceOf[js.Any])
        
        inline def setOcclusionType(value: Double): Self = StObject.set(x, "occlusionType", value.asInstanceOf[js.Any])
        
        inline def set__occlusionDataStorage(value: OcclusionDataStorage): Self = StObject.set(x, "__occlusionDataStorage", value.asInstanceOf[js.Any])
        
        inline def set_occlusionDataStorage(value: OcclusionDataStorage): Self = StObject.set(x, "_occlusionDataStorage", value.asInstanceOf[js.Any])
      }
    }
  }
}
