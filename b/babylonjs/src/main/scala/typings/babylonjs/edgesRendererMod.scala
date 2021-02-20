package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.bufferMod.VertexBuffer
import typings.babylonjs.dataBufferMod.DataBuffer
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.shaderMaterialMod.ShaderMaterial
import typings.babylonjs.smartArrayMod.SmartArray
import typings.babylonjs.typesMod.Immutable
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object edgesRendererMod {
  
  @JSImport("babylonjs/Rendering/edgesRenderer", "EdgesRenderer")
  @js.native
  class EdgesRenderer protected () extends IEdgesRenderer {
    /**
      * Creates an instance of the EdgesRenderer. It is primarily use to display edges of a mesh.
      * Beware when you use this class with complex objects as the adjacencies computation can be really long
      * @param  source Mesh used to create edges
      * @param  epsilon sum of angles in adjacency to check for edge
      * @param  checkVerticesInsteadOfIndices bases the edges detection on vertices vs indices. Note that this parameter is not used if options.useAlternateEdgeFinder = true
      * @param  generateEdgesLines - should generate Lines or only prepare resources.
      * @param  options The options to apply when generating the edges
      */
    def this(source: AbstractMesh) = this()
    def this(source: AbstractMesh, epsilon: Double) = this()
    def this(source: AbstractMesh, epsilon: js.UndefOr[scala.Nothing], checkVerticesInsteadOfIndices: Boolean) = this()
    def this(source: AbstractMesh, epsilon: Double, checkVerticesInsteadOfIndices: Boolean) = this()
    def this(
      source: AbstractMesh,
      epsilon: js.UndefOr[scala.Nothing],
      checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
      generateEdgesLines: Boolean
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: js.UndefOr[scala.Nothing],
      checkVerticesInsteadOfIndices: Boolean,
      generateEdgesLines: Boolean
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: Double,
      checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
      generateEdgesLines: Boolean
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: Double,
      checkVerticesInsteadOfIndices: Boolean,
      generateEdgesLines: Boolean
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: js.UndefOr[scala.Nothing],
      checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
      generateEdgesLines: js.UndefOr[scala.Nothing],
      options: IEdgesRendererOptions
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: js.UndefOr[scala.Nothing],
      checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
      generateEdgesLines: Boolean,
      options: IEdgesRendererOptions
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: js.UndefOr[scala.Nothing],
      checkVerticesInsteadOfIndices: Boolean,
      generateEdgesLines: js.UndefOr[scala.Nothing],
      options: IEdgesRendererOptions
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: js.UndefOr[scala.Nothing],
      checkVerticesInsteadOfIndices: Boolean,
      generateEdgesLines: Boolean,
      options: IEdgesRendererOptions
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: Double,
      checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
      generateEdgesLines: js.UndefOr[scala.Nothing],
      options: IEdgesRendererOptions
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: Double,
      checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
      generateEdgesLines: Boolean,
      options: IEdgesRendererOptions
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: Double,
      checkVerticesInsteadOfIndices: Boolean,
      generateEdgesLines: js.UndefOr[scala.Nothing],
      options: IEdgesRendererOptions
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: Double,
      checkVerticesInsteadOfIndices: Boolean,
      generateEdgesLines: Boolean,
      options: IEdgesRendererOptions
    ) = this()
    
    var _buffers: StringDictionary[Nullable[VertexBuffer]] = js.native
    
    var _buffersForInstances: StringDictionary[Nullable[VertexBuffer]] = js.native
    
    /**
      * Checks if the pair of p0 and p1 is en edge
      * @param faceIndex
      * @param edge
      * @param faceNormals
      * @param  p0
      * @param  p1
      * @private
      */
    /* protected */ def _checkEdge(faceIndex: Double, edge: Double, faceNormals: js.Array[Vector3], p0: Vector3, p1: Vector3): Unit = js.native
    
    var _checkVerticesInsteadOfIndices: Boolean = js.native
    
    var _epsilon: Double = js.native
    
    /**
      * Generates lines edges from adjacencjes
      * @private
      */
    def _generateEdgesLines(): Unit = js.native
    
    var _generateEdgesLinesAlternate: js.Any = js.native
    
    var _ib: DataBuffer = js.native
    
    var _indicesCount: Double = js.native
    
    var _lineShader: ShaderMaterial = js.native
    
    var _linesIndices: js.Array[Double] = js.native
    
    var _linesNormals: js.Array[Double] = js.native
    
    var _linesPositions: js.Array[Double] = js.native
    
    var _meshDisposeObserver: js.Any = js.native
    
    var _meshRebuildObserver: js.Any = js.native
    
    var _options: Nullable[IEdgesRendererOptions] = js.native
    
    /* protected */ def _prepareRessources(): Unit = js.native
    
    /* protected */ def _processEdgeForAdjacencies(pa: Double, pb: Double, p0: Double, p1: Double, p2: Double): Double = js.native
    
    /* protected */ def _processEdgeForAdjacenciesWithVertices(pa: Vector3, pb: Vector3, p0: Vector3, p1: Vector3, p2: Vector3): Double = js.native
    
    /** @hidden */
    def _rebuild(): Unit = js.native
    
    var _source: AbstractMesh = js.native
    
    /**
      * See https://playground.babylonjs.com/#R3JR6V#1 for a visual display of the algorithm
      */
    var _tessellateTriangle: js.Any = js.native
    
    /**
      * push line into the position, normal and index buffer
      * @protected
      */
    /* protected */ def createLine(p0: Vector3, p1: Vector3, offset: Double): Unit = js.native
    
    /**
      * Define the size of the edges with an orthographic camera
      */
    var edgesWidthScalerForOrthographic: Double = js.native
    
    /**
      * Define the size of the edges with a perspective camera
      */
    var edgesWidthScalerForPerspective: Double = js.native
    
    /** Gets the indices generated by the edge renderer */
    def linesIndices: Immutable[js.Array[Double]] = js.native
    
    /** Gets the normals generated by the edge renderer */
    def linesNormals: Immutable[js.Array[Double]] = js.native
    
    /** Gets the vertices generated by the edge renderer */
    def linesPositions: Immutable[js.Array[Double]] = js.native
  }
  /* static members */
  object EdgesRenderer {
    
    @JSImport("babylonjs/Rendering/edgesRenderer", "EdgesRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Rendering/edgesRenderer", "EdgesRenderer.GetShader")
    @js.native
    def GetShader: js.Any = js.native
    @scala.inline
    def GetShader_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetShader")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Rendering/edgesRenderer", "LineEdgesRenderer")
  @js.native
  class LineEdgesRenderer protected () extends EdgesRenderer {
    /**
      * This constructor turns off auto generating edges line in Edges Renderer to make it here.
      * @param  source LineMesh used to generate edges
      * @param  epsilon not important (specified angle for edge detection)
      * @param  checkVerticesInsteadOfIndices not important for LineMesh
      */
    def this(source: AbstractMesh) = this()
    def this(source: AbstractMesh, epsilon: Double) = this()
    def this(source: AbstractMesh, epsilon: js.UndefOr[scala.Nothing], checkVerticesInsteadOfIndices: Boolean) = this()
    def this(source: AbstractMesh, epsilon: Double, checkVerticesInsteadOfIndices: Boolean) = this()
  }
  
  @js.native
  trait IEdgesRenderer extends IDisposable {
    
    /**
      * List of instances to render in case the source mesh has instances
      */
    var customInstances: SmartArray[Matrix] = js.native
    
    /**
      * Gets or sets a boolean indicating if the edgesRenderer is active
      */
    var isEnabled: Boolean = js.native
    
    /**
      * Checks wether or not the edges renderer is ready to render.
      * @return true if ready, otherwise false.
      */
    def isReady(): Boolean = js.native
    
    /**
      * Renders the edges of the attached mesh,
      */
    def render(): Unit = js.native
  }
  object IEdgesRenderer {
    
    @scala.inline
    def apply(
      customInstances: SmartArray[Matrix],
      dispose: () => Unit,
      isEnabled: Boolean,
      isReady: () => Boolean,
      render: () => Unit
    ): IEdgesRenderer = {
      val __obj = js.Dynamic.literal(customInstances = customInstances.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), isEnabled = isEnabled.asInstanceOf[js.Any], isReady = js.Any.fromFunction0(isReady), render = js.Any.fromFunction0(render))
      __obj.asInstanceOf[IEdgesRenderer]
    }
    
    @scala.inline
    implicit class IEdgesRendererMutableBuilder[Self <: IEdgesRenderer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomInstances(value: SmartArray[Matrix]): Self = StObject.set(x, "customInstances", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsReady(value: () => Boolean): Self = StObject.set(x, "isReady", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRender(value: () => Unit): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IEdgesRendererOptions extends StObject {
    
    /**
      * Gets or sets a boolean indicating that tessellation should be applied before finding the edges. You may need to activate this option if your geometry is a bit
      * unusual, like having a vertex of a triangle in-between two vertices of an edge of another triangle. It happens often when using CSG to construct meshes.
      * This option is used only if useAlternateEdgeFinder = true
      */
    var applyTessellation: js.UndefOr[Boolean] = js.native
    
    /**
      * The limit under which 3 vertices are considered to be aligned. 3 vertices PQR are considered aligned if distance(PQ) + distance(QR) - distance(PR) < epsilonVertexAligned
      * The default value is 1e-6
      * This option is used only if useAlternateEdgeFinder = true
      */
    var epsilonVertexAligned: js.UndefOr[Double] = js.native
    
    /**
      * During edges processing, the vertices are merged if they are close enough: epsilonVertexMerge is the limit whithin which vertices are considered to be equal.
      * The default value is 1e-6
      * This option is used only if useAlternateEdgeFinder = true
      */
    var epsilonVertexMerge: js.UndefOr[Double] = js.native
    
    /**
      * Gets or sets a boolean indicating that the alternate edge finder algorithm must be used
      * If not defined, the default value is true
      */
    var useAlternateEdgeFinder: js.UndefOr[Boolean] = js.native
    
    /**
      * Gets or sets a boolean indicating that the vertex merger fast processing must be used.
      * If not defined, the default value is true.
      * You should normally leave it undefined (or set it to true), except if you see some artifacts in the edges rendering (can happen with complex geometries)
      * This option is used only if useAlternateEdgeFinder = true
      */
    var useFastVertexMerger: js.UndefOr[Boolean] = js.native
  }
  object IEdgesRendererOptions {
    
    @scala.inline
    def apply(): IEdgesRendererOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEdgesRendererOptions]
    }
    
    @scala.inline
    implicit class IEdgesRendererOptionsMutableBuilder[Self <: IEdgesRendererOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyTessellation(value: Boolean): Self = StObject.set(x, "applyTessellation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyTessellationUndefined: Self = StObject.set(x, "applyTessellation", js.undefined)
      
      @scala.inline
      def setEpsilonVertexAligned(value: Double): Self = StObject.set(x, "epsilonVertexAligned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEpsilonVertexAlignedUndefined: Self = StObject.set(x, "epsilonVertexAligned", js.undefined)
      
      @scala.inline
      def setEpsilonVertexMerge(value: Double): Self = StObject.set(x, "epsilonVertexMerge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEpsilonVertexMergeUndefined: Self = StObject.set(x, "epsilonVertexMerge", js.undefined)
      
      @scala.inline
      def setUseAlternateEdgeFinder(value: Boolean): Self = StObject.set(x, "useAlternateEdgeFinder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseAlternateEdgeFinderUndefined: Self = StObject.set(x, "useAlternateEdgeFinder", js.undefined)
      
      @scala.inline
      def setUseFastVertexMerger(value: Boolean): Self = StObject.set(x, "useFastVertexMerger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseFastVertexMergerUndefined: Self = StObject.set(x, "useFastVertexMerger", js.undefined)
    }
  }
  
  /* augmented module */
  object babylonjsMeshesAbstractMeshAugmentingMod {
    
    @js.native
    trait AbstractMesh extends StObject {
      
      /**
        * Gets the edgesRenderer associated with the mesh
        */
      var edgesRenderer: Nullable[EdgesRenderer] = js.native
    }
    object AbstractMesh {
      
      @scala.inline
      def apply(): typings.babylonjs.edgesRendererMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.babylonjs.edgesRendererMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh]
      }
      
      @scala.inline
      implicit class AbstractMeshMutableBuilder[Self <: typings.babylonjs.edgesRendererMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEdgesRenderer(value: Nullable[EdgesRenderer]): Self = StObject.set(x, "edgesRenderer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEdgesRendererNull: Self = StObject.set(x, "edgesRenderer", null)
      }
    }
  }
  
  /* augmented module */
  object babylonjsMeshesLinesMeshAugmentingMod {
    
    @js.native
    trait InstancedLinesMesh extends StObject {
      
      /**
        * Enables the edge rendering mode on the mesh.
        * This mode makes the mesh edges visible
        * @param epsilon defines the maximal distance between two angles to detect a face
        * @param checkVerticesInsteadOfIndices indicates that we should check vertex list directly instead of faces
        * @returns the current InstancedLinesMesh
        * @see https://www.babylonjs-playground.com/#19O9TU#0
        */
      def enableEdgesRendering(): InstancedLinesMesh = js.native
      def enableEdgesRendering(epsilon: js.UndefOr[scala.Nothing], checkVerticesInsteadOfIndices: Boolean): InstancedLinesMesh = js.native
      def enableEdgesRendering(epsilon: Double): InstancedLinesMesh = js.native
      def enableEdgesRendering(epsilon: Double, checkVerticesInsteadOfIndices: Boolean): InstancedLinesMesh = js.native
    }
    
    @js.native
    trait LinesMesh extends StObject {
      
      /**
        * Enables the edge rendering mode on the mesh.
        * This mode makes the mesh edges visible
        * @param epsilon defines the maximal distance between two angles to detect a face
        * @param checkVerticesInsteadOfIndices indicates that we should check vertex list directly instead of faces
        * @returns the currentAbstractMesh
        * @see https://www.babylonjs-playground.com/#19O9TU#0
        */
      def enableEdgesRendering(): AbstractMesh = js.native
      def enableEdgesRendering(epsilon: js.UndefOr[scala.Nothing], checkVerticesInsteadOfIndices: Boolean): AbstractMesh = js.native
      def enableEdgesRendering(epsilon: Double): AbstractMesh = js.native
      def enableEdgesRendering(epsilon: Double, checkVerticesInsteadOfIndices: Boolean): AbstractMesh = js.native
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /** @hidden */
      var _edgeRenderLineShader: Nullable[ShaderMaterial] = js.native
    }
    object Scene {
      
      @scala.inline
      def apply(): Scene = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Scene]
      }
      
      @scala.inline
      implicit class SceneMutableBuilder[Self <: Scene] (val x: Self) extends AnyVal {
        
        @scala.inline
        def set_edgeRenderLineShader(value: Nullable[ShaderMaterial]): Self = StObject.set(x, "_edgeRenderLineShader", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_edgeRenderLineShaderNull: Self = StObject.set(x, "_edgeRenderLineShader", null)
      }
    }
  }
}
