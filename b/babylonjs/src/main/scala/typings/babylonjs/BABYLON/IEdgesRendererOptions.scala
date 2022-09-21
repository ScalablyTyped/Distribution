package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
