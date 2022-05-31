package typings.babylonjs

import typings.babylonjs.meshMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshSimplificationMod {
  
  @JSImport("babylonjs/Meshes/meshSimplification", "QuadraticErrorSimplification")
  @js.native
  class QuadraticErrorSimplification protected ()
    extends StObject
       with ISimplifier {
    /**
      * Creates a new QuadraticErrorSimplification
      * @param _mesh defines the target mesh
      */
    def this(_mesh: Mesh) = this()
    
    /* private */ var _mesh: js.Any = js.native
    
    /* private */ var _reconstructedMesh: js.Any = js.native
    
    /** Gets or sets the aggressiveness of the simplifier */
    var aggressiveness: Double = js.native
    
    /** Gets or sets the espilon to use for bounding box computation */
    var boundingBoxEpsilon: Double = js.native
    
    /* private */ var calculateError: js.Any = js.native
    
    /** Gets or sets the number of allowed iterations for decimation */
    var decimationIterations: Double = js.native
    
    /* private */ var identifyBorder: js.Any = js.native
    
    /* private */ var init: js.Any = js.native
    
    /* private */ var initDecimatedMesh: js.Any = js.native
    
    /* private */ var initWithMesh: js.Any = js.native
    
    /* private */ var isFlipped: js.Any = js.native
    
    /* private */ var reconstructMesh: js.Any = js.native
    
    /* private */ var references: js.Any = js.native
    
    /* private */ var runDecimation: js.Any = js.native
    
    /** Gets or sets the number pf sync interations */
    var syncIterations: Double = js.native
    
    /* private */ var triangles: js.Any = js.native
    
    /* private */ var updateMesh: js.Any = js.native
    
    /* private */ var updateTriangles: js.Any = js.native
    
    /* private */ var vertexError: js.Any = js.native
    
    /* private */ var vertices: js.Any = js.native
  }
  
  @JSImport("babylonjs/Meshes/meshSimplification", "SimplificationQueue")
  @js.native
  /**
    * Creates a new queue
    */
  class SimplificationQueue () extends StObject {
    
    /* private */ var _simplificationArray: js.Any = js.native
    
    /**
      * Adds a new simplification task
      * @param task defines a task to add
      */
    def addTask(task: ISimplificationTask): Unit = js.native
    
    /**
      * Execute next task
      */
    def executeNext(): Unit = js.native
    
    /* private */ var getSimplifier: js.Any = js.native
    
    /**
      * Execute a simplification task
      * @param task defines the task to run
      */
    def runSimplification(task: ISimplificationTask): Unit = js.native
    
    /**
      * Gets a boolean indicating that the process is still running
      */
    var running: Boolean = js.native
  }
  
  @JSImport("babylonjs/Meshes/meshSimplification", "SimplificationSettings")
  @js.native
  class SimplificationSettings protected ()
    extends StObject
       with ISimplificationSettings {
    /**
      * Creates a SimplificationSettings
      * @param quality expected quality
      * @param distance distance when this optimized version should be used
      * @param optimizeMesh already optimized mesh
      */
    def this(
      /** expected quality */
    quality: Double,
      /** distance when this optimized version should be used */
    distance: Double
    ) = this()
    def this(
      /** expected quality */
    quality: Double,
      /** distance when this optimized version should be used */
    distance: Double,
      /** already optimized mesh  */
    optimizeMesh: Boolean
    ) = this()
    
    /**
      * Gets or sets the distance when this optimized version should be used
      */
    /* CompleteClass */
    var distance: Double = js.native
    
    /**
      * Gets or sets the expected quality
      */
    /* CompleteClass */
    var quality: Double = js.native
  }
  
  @js.native
  sealed trait SimplificationType extends StObject
  @JSImport("babylonjs/Meshes/meshSimplification", "SimplificationType")
  @js.native
  object SimplificationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SimplificationType & Double] = js.native
    
    /** Quadratic error decimation */
    @js.native
    sealed trait QUADRATIC
      extends StObject
         with SimplificationType
    /* 0 */ val QUADRATIC: typings.babylonjs.meshSimplificationMod.SimplificationType.QUADRATIC & Double = js.native
  }
  
  trait ISimplificationSettings extends StObject {
    
    /**
      * Gets or sets the distance when this optimized version should be used
      */
    var distance: Double
    
    /**
      * Gets an already optimized mesh
      */
    var optimizeMesh: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Gets or sets the expected quality
      */
    var quality: Double
  }
  object ISimplificationSettings {
    
    inline def apply(distance: Double, quality: Double): ISimplificationSettings = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISimplificationSettings]
    }
    
    extension [Self <: ISimplificationSettings](x: Self) {
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setOptimizeMesh(value: Boolean): Self = StObject.set(x, "optimizeMesh", value.asInstanceOf[js.Any])
      
      inline def setOptimizeMeshUndefined: Self = StObject.set(x, "optimizeMesh", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISimplificationTask extends StObject {
    
    /**
      * Mesh to simplify
      */
    var mesh: Mesh
    
    /**
      * Defines if parallel processing can be used
      */
    var parallelProcessing: Boolean
    
    /**
      * Array of settings
      */
    var settings: js.Array[ISimplificationSettings]
    
    /**
      * Simplification type
      */
    var simplificationType: SimplificationType
    
    /**
      * Callback called on success
      */
    var successCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ISimplificationTask {
    
    inline def apply(
      mesh: Mesh,
      parallelProcessing: Boolean,
      settings: js.Array[ISimplificationSettings],
      simplificationType: SimplificationType
    ): ISimplificationTask = {
      val __obj = js.Dynamic.literal(mesh = mesh.asInstanceOf[js.Any], parallelProcessing = parallelProcessing.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], simplificationType = simplificationType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISimplificationTask]
    }
    
    extension [Self <: ISimplificationTask](x: Self) {
      
      inline def setMesh(value: Mesh): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
      
      inline def setParallelProcessing(value: Boolean): Self = StObject.set(x, "parallelProcessing", value.asInstanceOf[js.Any])
      
      inline def setSettings(value: js.Array[ISimplificationSettings]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsVarargs(value: ISimplificationSettings*): Self = StObject.set(x, "settings", js.Array(value :_*))
      
      inline def setSimplificationType(value: SimplificationType): Self = StObject.set(x, "simplificationType", value.asInstanceOf[js.Any])
      
      inline def setSuccessCallback(value: () => Unit): Self = StObject.set(x, "successCallback", js.Any.fromFunction0(value))
      
      inline def setSuccessCallbackUndefined: Self = StObject.set(x, "successCallback", js.undefined)
    }
  }
  
  @js.native
  trait ISimplifier extends StObject {
    
    /**
      * Simplification of a given mesh according to the given settings.
      * Since this requires computation, it is assumed that the function runs async.
      * @param settings The settings of the simplification, including quality and distance
      * @param successCallback A callback that will be called after the mesh was simplified.
      * @param errorCallback in case of an error, this callback will be called. optional.
      */
    def simplify(
      settings: ISimplificationSettings,
      successCallback: js.Function1[/* simplifiedMeshes */ Mesh, Unit]
    ): Unit = js.native
    def simplify(
      settings: ISimplificationSettings,
      successCallback: js.Function1[/* simplifiedMeshes */ Mesh, Unit],
      errorCallback: js.Function0[Unit]
    ): Unit = js.native
  }
}
