package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.bufferMod.VertexBuffer
import typings.babylonjs.dataBufferMod.DataBuffer
import typings.babylonjs.drawWrapperMod.DrawWrapper
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.shaderMaterialMod.ShaderMaterial
import typings.babylonjs.smartArrayMod.SmartArray
import typings.babylonjs.typesMod.Immutable
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object edgesRendererMod {
  
  @JSImport("babylonjs/Rendering/edgesRenderer", "EdgesRenderer")
  @js.native
  open class EdgesRenderer protected ()
    extends StObject
       with IEdgesRenderer {
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
    def this(source: AbstractMesh, epsilon: Double, checkVerticesInsteadOfIndices: Boolean) = this()
    def this(source: AbstractMesh, epsilon: Unit, checkVerticesInsteadOfIndices: Boolean) = this()
    def this(
      source: AbstractMesh,
      epsilon: Double,
      checkVerticesInsteadOfIndices: Boolean,
      generateEdgesLines: Boolean
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: Double,
      checkVerticesInsteadOfIndices: Unit,
      generateEdgesLines: Boolean
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: Unit,
      checkVerticesInsteadOfIndices: Boolean,
      generateEdgesLines: Boolean
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: Unit,
      checkVerticesInsteadOfIndices: Unit,
      generateEdgesLines: Boolean
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: Double,
      checkVerticesInsteadOfIndices: Boolean,
      generateEdgesLines: Boolean,
      options: IEdgesRendererOptions
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: Double,
      checkVerticesInsteadOfIndices: Boolean,
      generateEdgesLines: Unit,
      options: IEdgesRendererOptions
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: Double,
      checkVerticesInsteadOfIndices: Unit,
      generateEdgesLines: Boolean,
      options: IEdgesRendererOptions
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: Double,
      checkVerticesInsteadOfIndices: Unit,
      generateEdgesLines: Unit,
      options: IEdgesRendererOptions
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: Unit,
      checkVerticesInsteadOfIndices: Boolean,
      generateEdgesLines: Boolean,
      options: IEdgesRendererOptions
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: Unit,
      checkVerticesInsteadOfIndices: Boolean,
      generateEdgesLines: Unit,
      options: IEdgesRendererOptions
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: Unit,
      checkVerticesInsteadOfIndices: Unit,
      generateEdgesLines: Boolean,
      options: IEdgesRendererOptions
    ) = this()
    def this(
      source: AbstractMesh,
      epsilon: Unit,
      checkVerticesInsteadOfIndices: Unit,
      generateEdgesLines: Unit,
      options: IEdgesRendererOptions
    ) = this()
    
    /* protected */ var _buffers: StringDictionary[Nullable[VertexBuffer]] = js.native
    
    /* protected */ var _buffersForInstances: StringDictionary[Nullable[VertexBuffer]] = js.native
    
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
    
    /* protected */ var _checkVerticesInsteadOfIndices: Boolean = js.native
    
    /* protected */ var _drawWrapper: js.UndefOr[DrawWrapper] = js.native
    
    /* protected */ var _epsilon: Double = js.native
    
    /**
      * Generates lines edges from adjacencjes
      * @private
      */
    def _generateEdgesLines(): Unit = js.native
    
    /* private */ var _generateEdgesLinesAlternate: Any = js.native
    
    /* protected */ var _ib: DataBuffer = js.native
    
    /* protected */ var _indicesCount: Double = js.native
    
    /* protected */ var _lineShader: ShaderMaterial = js.native
    
    /* protected */ var _linesIndices: js.Array[Double] = js.native
    
    /* protected */ var _linesNormals: js.Array[Double] = js.native
    
    /* protected */ var _linesPositions: js.Array[Double] = js.native
    
    /* private */ var _meshDisposeObserver: Any = js.native
    
    /* private */ var _meshRebuildObserver: Any = js.native
    
    /* protected */ var _options: Nullable[IEdgesRendererOptions] = js.native
    
    /* protected */ def _prepareRessources(): Unit = js.native
    
    /* protected */ def _processEdgeForAdjacencies(pa: Double, pb: Double, p0: Double, p1: Double, p2: Double): Double = js.native
    
    /* protected */ def _processEdgeForAdjacenciesWithVertices(pa: Vector3, pb: Vector3, p0: Vector3, p1: Vector3, p2: Vector3): Double = js.native
    
    /** @hidden */
    def _rebuild(): Unit = js.native
    
    /* protected */ var _source: AbstractMesh = js.native
    
    /**
      * See https://playground.babylonjs.com/#R3JR6V#1 for a visual display of the algorithm
      * @param edgePoints
      * @param indexTriangle
      * @param indices
      * @param remapVertexIndices
      */
    /* private */ var _tessellateTriangle: Any = js.native
    
    /**
      * push line into the position, normal and index buffer
      * @param p0
      * @param p1
      * @param offset
      * @protected
      */
    /* protected */ def createLine(p0: Vector3, p1: Vector3, offset: Double): Unit = js.native
    
    /**
      * List of instances to render in case the source mesh has instances
      */
    /* CompleteClass */
    var customInstances: SmartArray[Matrix] = js.native
    
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Define the size of the edges with an orthographic camera
      */
    var edgesWidthScalerForOrthographic: Double = js.native
    
    /**
      * Define the size of the edges with a perspective camera
      */
    var edgesWidthScalerForPerspective: Double = js.native
    
    /**
      * Gets or sets a boolean indicating if the edgesRenderer is active
      */
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
    /**
      * Checks whether or not the edges renderer is ready to render.
      * @returns true if ready, otherwise false.
      */
    /* CompleteClass */
    override def isReady(): Boolean = js.native
    
    /**
      * Gets or sets the shader used to draw the lines
      */
    def lineShader: ShaderMaterial = js.native
    def lineShader_=(shader: ShaderMaterial): Unit = js.native
    
    /** Gets the indices generated by the edge renderer */
    def linesIndices: Immutable[js.Array[Double]] = js.native
    
    /** Gets the normals generated by the edge renderer */
    def linesNormals: Immutable[js.Array[Double]] = js.native
    
    /** Gets the vertices generated by the edge renderer */
    def linesPositions: Immutable[js.Array[Double]] = js.native
    
    /**
      * Renders the edges of the attached mesh,
      */
    /* CompleteClass */
    override def render(): Unit = js.native
  }
  /* static members */
  object EdgesRenderer {
    
    @JSImport("babylonjs/Rendering/edgesRenderer", "EdgesRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Rendering/edgesRenderer", "EdgesRenderer._GetShader")
    @js.native
    def _GetShader: Any = js.native
    inline def _GetShader_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetShader")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Rendering/edgesRenderer", "LineEdgesRenderer")
  @js.native
  open class LineEdgesRenderer protected () extends EdgesRenderer {
    /**
      * This constructor turns off auto generating edges line in Edges Renderer to make it here.
      * @param  source LineMesh used to generate edges
      * @param  epsilon not important (specified angle for edge detection)
      * @param  checkVerticesInsteadOfIndices not important for LineMesh
      */
    def this(source: AbstractMesh) = this()
    def this(source: AbstractMesh, epsilon: Double) = this()
    def this(source: AbstractMesh, epsilon: Double, checkVerticesInsteadOfIndices: Boolean) = this()
    def this(source: AbstractMesh, epsilon: Unit, checkVerticesInsteadOfIndices: Boolean) = this()
  }
  
  trait IEdgesRenderer
    extends StObject
       with IDisposable {
    
    /**
      * List of instances to render in case the source mesh has instances
      */
    var customInstances: SmartArray[Matrix]
    
    /**
      * Gets or sets a boolean indicating if the edgesRenderer is active
      */
    var isEnabled: Boolean
    
    /**
      * Checks whether or not the edges renderer is ready to render.
      * @returns true if ready, otherwise false.
      */
    def isReady(): Boolean
    
    /**
      * Renders the edges of the attached mesh,
      */
    def render(): Unit
  }
  object IEdgesRenderer {
    
    inline def apply(
      customInstances: SmartArray[Matrix],
      dispose: () => Unit,
      isEnabled: Boolean,
      isReady: () => Boolean,
      render: () => Unit
    ): IEdgesRenderer = {
      val __obj = js.Dynamic.literal(customInstances = customInstances.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), isEnabled = isEnabled.asInstanceOf[js.Any], isReady = js.Any.fromFunction0(isReady), render = js.Any.fromFunction0(render))
      __obj.asInstanceOf[IEdgesRenderer]
    }
    
    extension [Self <: IEdgesRenderer](x: Self) {
      
      inline def setCustomInstances(value: SmartArray[Matrix]): Self = StObject.set(x, "customInstances", value.asInstanceOf[js.Any])
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsReady(value: () => Boolean): Self = StObject.set(x, "isReady", js.Any.fromFunction0(value))
      
      inline def setRender(value: () => Unit): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    }
  }
  
  trait IEdgesRendererOptions extends StObject {
    
    /**
      * Gets or sets a boolean indicating that tessellation should be applied before finding the edges. You may need to activate this option if your geometry is a bit
      * unusual, like having a vertex of a triangle in-between two vertices of an edge of another triangle. It happens often when using CSG to construct meshes.
      * This option is used only if useAlternateEdgeFinder = true
      */
    var applyTessellation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The limit under which 3 vertices are considered to be aligned. 3 vertices PQR are considered aligned if distance(PQ) + distance(QR) - distance(PR) < epsilonVertexAligned
      * The default value is 1e-6
      * This option is used only if useAlternateEdgeFinder = true
      */
    var epsilonVertexAligned: js.UndefOr[Double] = js.undefined
    
    /**
      * During edges processing, the vertices are merged if they are close enough: epsilonVertexMerge is the limit within which vertices are considered to be equal.
      * The default value is 1e-6
      * This option is used only if useAlternateEdgeFinder = true
      */
    var epsilonVertexMerge: js.UndefOr[Double] = js.undefined
    
    /**
      * Gets or sets a boolean indicating that degenerated triangles should not be processed.
      * Degenerated triangles are triangles that have 2 or 3 vertices with the same coordinates
      */
    var removeDegeneratedTriangles: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Gets or sets a boolean indicating that the alternate edge finder algorithm must be used
      * If not defined, the default value is true
      */
    var useAlternateEdgeFinder: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Gets or sets a boolean indicating that the vertex merger fast processing must be used.
      * If not defined, the default value is true.
      * You should normally leave it undefined (or set it to true), except if you see some artifacts in the edges rendering (can happen with complex geometries)
      * This option is used only if useAlternateEdgeFinder = true
      */
    var useFastVertexMerger: js.UndefOr[Boolean] = js.undefined
  }
  object IEdgesRendererOptions {
    
    inline def apply(): IEdgesRendererOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEdgesRendererOptions]
    }
    
    extension [Self <: IEdgesRendererOptions](x: Self) {
      
      inline def setApplyTessellation(value: Boolean): Self = StObject.set(x, "applyTessellation", value.asInstanceOf[js.Any])
      
      inline def setApplyTessellationUndefined: Self = StObject.set(x, "applyTessellation", js.undefined)
      
      inline def setEpsilonVertexAligned(value: Double): Self = StObject.set(x, "epsilonVertexAligned", value.asInstanceOf[js.Any])
      
      inline def setEpsilonVertexAlignedUndefined: Self = StObject.set(x, "epsilonVertexAligned", js.undefined)
      
      inline def setEpsilonVertexMerge(value: Double): Self = StObject.set(x, "epsilonVertexMerge", value.asInstanceOf[js.Any])
      
      inline def setEpsilonVertexMergeUndefined: Self = StObject.set(x, "epsilonVertexMerge", js.undefined)
      
      inline def setRemoveDegeneratedTriangles(value: Boolean): Self = StObject.set(x, "removeDegeneratedTriangles", value.asInstanceOf[js.Any])
      
      inline def setRemoveDegeneratedTrianglesUndefined: Self = StObject.set(x, "removeDegeneratedTriangles", js.undefined)
      
      inline def setUseAlternateEdgeFinder(value: Boolean): Self = StObject.set(x, "useAlternateEdgeFinder", value.asInstanceOf[js.Any])
      
      inline def setUseAlternateEdgeFinderUndefined: Self = StObject.set(x, "useAlternateEdgeFinder", js.undefined)
      
      inline def setUseFastVertexMerger(value: Boolean): Self = StObject.set(x, "useFastVertexMerger", value.asInstanceOf[js.Any])
      
      inline def setUseFastVertexMergerUndefined: Self = StObject.set(x, "useFastVertexMerger", js.undefined)
    }
  }
  
  /* augmented module */
  object babylonjsMeshesAbstractMeshAugmentingMod {
    
    trait AbstractMesh extends StObject {
      
      /**
        * Gets the edgesRenderer associated with the mesh
        */
      var edgesRenderer: Nullable[EdgesRenderer]
    }
    object AbstractMesh {
      
      inline def apply(): typings.babylonjs.edgesRendererMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh = {
        val __obj = js.Dynamic.literal(edgesRenderer = null)
        __obj.asInstanceOf[typings.babylonjs.edgesRendererMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh]
      }
      
      extension [Self <: typings.babylonjs.edgesRendererMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh](x: Self) {
        
        inline def setEdgesRenderer(value: Nullable[EdgesRenderer]): Self = StObject.set(x, "edgesRenderer", value.asInstanceOf[js.Any])
        
        inline def setEdgesRendererNull: Self = StObject.set(x, "edgesRenderer", null)
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
      def enableEdgesRendering(epsilon: Double): InstancedLinesMesh = js.native
      def enableEdgesRendering(epsilon: Double, checkVerticesInsteadOfIndices: Boolean): InstancedLinesMesh = js.native
      def enableEdgesRendering(epsilon: Unit, checkVerticesInsteadOfIndices: Boolean): InstancedLinesMesh = js.native
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
      def enableEdgesRendering(epsilon: Double): AbstractMesh = js.native
      def enableEdgesRendering(epsilon: Double, checkVerticesInsteadOfIndices: Boolean): AbstractMesh = js.native
      def enableEdgesRendering(epsilon: Unit, checkVerticesInsteadOfIndices: Boolean): AbstractMesh = js.native
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    trait Scene extends StObject {
      
      /** @hidden */
      var _edgeRenderLineShader: Nullable[ShaderMaterial]
    }
    object Scene {
      
      inline def apply(): Scene = {
        val __obj = js.Dynamic.literal(_edgeRenderLineShader = null)
        __obj.asInstanceOf[Scene]
      }
      
      extension [Self <: Scene](x: Self) {
        
        inline def set_edgeRenderLineShader(value: Nullable[ShaderMaterial]): Self = StObject.set(x, "_edgeRenderLineShader", value.asInstanceOf[js.Any])
        
        inline def set_edgeRenderLineShaderNull: Self = StObject.set(x, "_edgeRenderLineShader", null)
      }
    }
  }
}
