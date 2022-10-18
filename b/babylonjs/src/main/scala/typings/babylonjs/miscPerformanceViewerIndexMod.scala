package typings.babylonjs

import typings.babylonjs.miscPerformanceViewerPerformanceViewerCollectionStrategiesMod.PerfStrategyInitialization
import typings.babylonjs.miscPerformanceViewerPerformanceViewerCollectorMod.IPerformanceViewerStrategyParameter
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscPerformanceViewerIndexMod {
  
  @JSImport("babylonjs/Misc/PerformanceViewer/index", "DynamicFloat32Array")
  @js.native
  open class DynamicFloat32Array protected ()
    extends typings.babylonjs.miscPerformanceViewerDynamicFloat32ArrayMod.DynamicFloat32Array {
    /**
      * Creates a new DynamicFloat32Array with the desired item capacity.
      * @param itemCapacity The initial item capacity you would like to set for the array.
      */
    def this(itemCapacity: Double) = this()
  }
  
  @JSImport("babylonjs/Misc/PerformanceViewer/index", "PerfCollectionStrategy")
  @js.native
  open class PerfCollectionStrategy ()
    extends typings.babylonjs.miscPerformanceViewerPerformanceViewerCollectionStrategiesMod.PerfCollectionStrategy
  /* static members */
  object PerfCollectionStrategy {
    
    @JSImport("babylonjs/Misc/PerformanceViewer/index", "PerfCollectionStrategy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the initializer for the strategy used for collection of absolute fps metrics.
      * @returns the initializer for the absolute fps strategy
      */
    inline def AbsoluteFpsStrategy(): PerfStrategyInitialization = ^.asInstanceOf[js.Dynamic].applyDynamic("AbsoluteFpsStrategy")().asInstanceOf[PerfStrategyInitialization]
    
    /**
      * Gets the initializer for the strategy used for collection of active bones metrics.
      * @returns the initializer for the active bones strategy
      */
    inline def ActiveBonesStrategy(): PerfStrategyInitialization = ^.asInstanceOf[js.Dynamic].applyDynamic("ActiveBonesStrategy")().asInstanceOf[PerfStrategyInitialization]
    
    /**
      * Gets the initializer for the strategy used for collection of active faces metrics.
      * @returns the initializer for the active faces strategy
      */
    inline def ActiveFacesStrategy(): PerfStrategyInitialization = ^.asInstanceOf[js.Dynamic].applyDynamic("ActiveFacesStrategy")().asInstanceOf[PerfStrategyInitialization]
    
    /**
      * Gets the initializer for the strategy used for collection of active indices metrics.
      * @returns the initializer for the active indices strategy
      */
    inline def ActiveIndicesStrategy(): PerfStrategyInitialization = ^.asInstanceOf[js.Dynamic].applyDynamic("ActiveIndicesStrategy")().asInstanceOf[PerfStrategyInitialization]
    
    /**
      * Gets the initializer for the strategy used for collection of active meshes metrics.
      * @returns the initializer for the active meshes strategy
      */
    inline def ActiveMeshesStrategy(): PerfStrategyInitialization = ^.asInstanceOf[js.Dynamic].applyDynamic("ActiveMeshesStrategy")().asInstanceOf[PerfStrategyInitialization]
    
    /**
      * Gets the initializer for the strategy used for collection of active particles metrics.
      * @returns the initializer for the active particles strategy
      */
    inline def ActiveParticlesStrategy(): PerfStrategyInitialization = ^.asInstanceOf[js.Dynamic].applyDynamic("ActiveParticlesStrategy")().asInstanceOf[PerfStrategyInitialization]
    
    /**
      * Gets the initializer for the strategy used for collection of animations time metrics.
      * @returns the initializer for the animations time strategy
      */
    inline def AnimationsStrategy(): PerfStrategyInitialization = ^.asInstanceOf[js.Dynamic].applyDynamic("AnimationsStrategy")().asInstanceOf[PerfStrategyInitialization]
    
    /**
      * Gets the initializer for the strategy used for collection of cpu utilization metrics.
      * Needs the experimental compute pressure API.
      * @returns the initializer for the cpu utilization strategy
      */
    inline def CpuStrategy(): PerfStrategyInitialization = ^.asInstanceOf[js.Dynamic].applyDynamic("CpuStrategy")().asInstanceOf[PerfStrategyInitialization]
    
    /**
      * Gets the initializer for the strategy used for collection of draw calls metrics.
      * @returns the initializer for the draw calls strategy
      */
    inline def DrawCallsStrategy(): PerfStrategyInitialization = ^.asInstanceOf[js.Dynamic].applyDynamic("DrawCallsStrategy")().asInstanceOf[PerfStrategyInitialization]
    
    /**
      * Gets the initializer for the strategy used for collection of fps metrics
      * @returns the initializer for the fps strategy
      */
    inline def FpsStrategy(): PerfStrategyInitialization = ^.asInstanceOf[js.Dynamic].applyDynamic("FpsStrategy")().asInstanceOf[PerfStrategyInitialization]
    
    /**
      * Gets the initializer for the strategy used for collection of total frame time metrics.
      * @returns the initializer for the total frame time strategy
      */
    inline def FrameTotalStrategy(): PerfStrategyInitialization = ^.asInstanceOf[js.Dynamic].applyDynamic("FrameTotalStrategy")().asInstanceOf[PerfStrategyInitialization]
    
    /**
      * Gets the initializer for the strategy used for collection of gpu frame time metrics.
      * @returns the initializer for the gpu frame time strategy
      */
    inline def GpuFrameTimeStrategy(): PerfStrategyInitialization = ^.asInstanceOf[js.Dynamic].applyDynamic("GpuFrameTimeStrategy")().asInstanceOf[PerfStrategyInitialization]
    
    /**
      * Gets the initializer for the strategy used for collection of inter-frame time metrics.
      * @returns the initializer for the inter-frame time strategy
      */
    inline def InterFrameStrategy(): PerfStrategyInitialization = ^.asInstanceOf[js.Dynamic].applyDynamic("InterFrameStrategy")().asInstanceOf[PerfStrategyInitialization]
    
    /**
      * Gets the initializer for the strategy used for collection of meshes selection time metrics.
      * @returns the initializer for the meshes selection time strategy
      */
    inline def MeshesSelectionStrategy(): PerfStrategyInitialization = ^.asInstanceOf[js.Dynamic].applyDynamic("MeshesSelectionStrategy")().asInstanceOf[PerfStrategyInitialization]
    
    /**
      * Gets the initializer for the strategy used for collection of particles time metrics.
      * @returns the initializer for the particles time strategy
      */
    inline def ParticlesStrategy(): PerfStrategyInitialization = ^.asInstanceOf[js.Dynamic].applyDynamic("ParticlesStrategy")().asInstanceOf[PerfStrategyInitialization]
    
    /**
      * Gets the initializer for the strategy used for collection of physics time metrics.
      * @returns the initializer for the physics time strategy
      */
    inline def PhysicsStrategy(): PerfStrategyInitialization = ^.asInstanceOf[js.Dynamic].applyDynamic("PhysicsStrategy")().asInstanceOf[PerfStrategyInitialization]
    
    /**
      * Gets the initializer for the strategy used for collection of render time metrics.
      * @returns the initializer for the render time strategy
      */
    inline def RenderStrategy(): PerfStrategyInitialization = ^.asInstanceOf[js.Dynamic].applyDynamic("RenderStrategy")().asInstanceOf[PerfStrategyInitialization]
    
    /**
      * Gets the initializer for the strategy used for collection of render targets time metrics.
      * @returns the initializer for the render targets time strategy
      */
    inline def RenderTargetsStrategy(): PerfStrategyInitialization = ^.asInstanceOf[js.Dynamic].applyDynamic("RenderTargetsStrategy")().asInstanceOf[PerfStrategyInitialization]
    
    /**
      * Gets the initializer for the strategy used for collection of sprites time metrics.
      * @returns the initializer for the sprites time strategy
      */
    inline def SpritesStrategy(): PerfStrategyInitialization = ^.asInstanceOf[js.Dynamic].applyDynamic("SpritesStrategy")().asInstanceOf[PerfStrategyInitialization]
    
    /**
      * Gets the initializer for the strategy used for collection of total lights metrics.
      * @returns the initializer for the total lights strategy
      */
    inline def TotalLightsStrategy(): PerfStrategyInitialization = ^.asInstanceOf[js.Dynamic].applyDynamic("TotalLightsStrategy")().asInstanceOf[PerfStrategyInitialization]
    
    /**
      * Gets the initializer for the strategy used for collection of total materials metrics.
      * @returns the initializer for the total materials strategy
      */
    inline def TotalMaterialsStrategy(): PerfStrategyInitialization = ^.asInstanceOf[js.Dynamic].applyDynamic("TotalMaterialsStrategy")().asInstanceOf[PerfStrategyInitialization]
    
    /**
      * Gets the initializer for the strategy used for collection of total meshes metrics.
      * @returns the initializer for the total meshes strategy
      */
    inline def TotalMeshesStrategy(): PerfStrategyInitialization = ^.asInstanceOf[js.Dynamic].applyDynamic("TotalMeshesStrategy")().asInstanceOf[PerfStrategyInitialization]
    
    /**
      * Gets the initializer for the strategy used for collection of total textures metrics.
      * @returns the initializer for the total textures strategy
      */
    inline def TotalTexturesStrategy(): PerfStrategyInitialization = ^.asInstanceOf[js.Dynamic].applyDynamic("TotalTexturesStrategy")().asInstanceOf[PerfStrategyInitialization]
    
    /**
      * Gets the initializer for the strategy used for collection of total vertices metrics.
      * @returns the initializer for the total vertices strategy
      */
    inline def TotalVerticesStrategy(): PerfStrategyInitialization = ^.asInstanceOf[js.Dynamic].applyDynamic("TotalVerticesStrategy")().asInstanceOf[PerfStrategyInitialization]
  }
  
  @JSImport("babylonjs/Misc/PerformanceViewer/index", "PerformanceViewerCollector")
  @js.native
  open class PerformanceViewerCollector protected ()
    extends typings.babylonjs.miscPerformanceViewerPerformanceViewerCollectorMod.PerformanceViewerCollector {
    /**
      * Handles the creation of a performance viewer collector.
      * @param _scene the scene to collect on.
      * @param _enabledStrategyCallbacks the list of data to collect with callbacks for initialization purposes.
      */
    def this(_scene: Scene) = this()
    def this(_scene: Scene, _enabledStrategyCallbacks: js.Array[IPerformanceViewerStrategyParameter]) = this()
  }
}
